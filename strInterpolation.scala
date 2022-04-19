package main

object strInterpolation {
  def main (args:Array[String]){
 
 //Using String interpolation to print a variable
    println(" Using String interpolation to print a variable")
    val Name: String = "Hari"
    println(s"My name is = $Name")
    println("My name is = $Name")
    println(s"My name is = Name")
    
 //Using String interpolation on object properties
    
   /* case class tMobile(team : String , id: Int)
    val team = tMobile("chennai", 1)
    val team1 = tMobile("bangalore", 2)
    val team3 = tMobile("hyderabad", 3)
    println(s" team = ${team.team} , id = ${team.id}")
    println(s" team = ${team1.team} , id = ${team1.id}")*/
    
    
/* //Using String interpolation to evaluate expressions
    println("\n: Using String interpolation to evaluate expressions")
    val tickets: Int = 10
    println(s"Are we buying 10 tickets = ${tickets == 10}")*/
    
 // Using String interpolation for formatting text
    println("\n Using String interpolation for formatting text")
    val creamName: String = "vanilla flavour"
    val TasteLevel: String = "Tasty"
    println(f"$creamName%2000s $TasteLevel") 
     println(f"$creamName%10s $TasteLevel")
    println(f"$creamName%100s $TasteLevel") 
    
    
     
  // Using Raw interpolation
     println("\n Using raw interpolation")
    val Name1: String = "T-Mobile"
     println(raw"account name\t\s\f\g\e  $Name1")
  }
}