object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    scoreMap.flatMap { case (key,seq) => seq.map(_.toLowerCase -> key)}
  }
}
