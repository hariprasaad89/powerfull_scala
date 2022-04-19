package main

object tupl {
   def main (args:Array[String]){
   // creating tuple with int and string
    // val stuff = (42, "fish")
     val things = ("a", 1, 3.5)
     println(things._1)
     println(things._2)
     println(things._3)
     
     def getUserInfo = ("Al", 42, 200.0)
     val(name, age, weight) = getUserInfo
     println(name)
      println(age)
       println(weight)
       //getUserInfo.productIterator.foreach(println)
   }
}