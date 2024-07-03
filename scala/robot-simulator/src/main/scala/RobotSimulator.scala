enum Bearing{
  case North , South , East, West
}

class Robot(val bearing : Bearing , val postions : (Int , Int))
