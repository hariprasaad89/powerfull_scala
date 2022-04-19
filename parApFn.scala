package main

object parApFn {
  def main (args:Array[String]){
   val ma = (a:String,b:String) => a + b
   val mail = ma(_:String,"@gmail.com")
   
   println(mail("hariprasaad35"))
   println(mail("rajeev"))

    
  }
}