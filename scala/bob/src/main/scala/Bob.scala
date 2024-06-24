object Bob {
  def response(statement: String) : String =  {
    
    val stmt = statement.replaceAll("\\s","")

    if((stmt != stmt.toLowerCase()) && (stmt.toUpperCase() == stmt) && stmt.endsWith("?"))
      return "Calm down, I know what I'm doing!"

    else if(stmt != stmt.toLowerCase && stmt == stmt.toUpperCase)
      return "Whoa, chill out!"

    else if(stmt.endsWith("?"))
      return "Sure."
    
    else if(stmt.isEmpty)
      return "Fine. Be that way!"
  
    else return "Whatever."

  }
}
