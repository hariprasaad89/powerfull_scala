package main

object highOrderFn {
  
  def sum (a:Int,b:Int,c:Int):Int={
    a+b+c
}
  
  def multi (a:Int,b:Int,c:Int):Int={
    a*b*c
}
 
   def min (a:Int,b:Int,c:Int):Int={
    a min b min c
}

   def combine(a:Int,b:Int,c:Int, f:(Int,Int) => Int):Int = {
     f(f(a,b),c)
   }
   
def main(args:Array[String]){ 
println(sum(1,2,4))
println(multi(1,2,4))
println(min(1,2,4))
println(combine(1,2,4,(x,y) => x + y ))
println(combine(1,2,3,_+_ ))
println(combine(1,2,3,_*_ ))
println(combine(1,2,3,_ min _ ))
println(combine(1,2,3,_ max _ ))
}
}