object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = 
  if(dnaStrandOne.length != dnaStrandTwo.length)
    None
  else{
    var diff = 0
    for(i <- dnaStrandOne.indices){
      if(dnaStrandOne(i) != dnaStrandTwo(i))
        diff += 1
    }
    Some(diff)
  }


}
