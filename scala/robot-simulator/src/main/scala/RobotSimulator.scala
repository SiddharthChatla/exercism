enum Bearing{
  case North , South , East, West
}

object Bearing{
  
}
class Robot(val bearing : Bearing , val postions : (Int , Int))
