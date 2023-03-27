object scala_learning2 {

  def squareIt(num : Int)= num*num                //> squareIt: (num: Int)Int
  println(squareIt(4))                            //> 16
  
  def transformInt(x:Int, f:Int=>Int): Int={
  f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int
  transformInt(4, squareIt)                       //> res0: Int = 16
  transformInt(6, x=> x*x*x)                      //> res1: Int = 216
}