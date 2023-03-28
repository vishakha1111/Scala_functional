object functions {
  var a = 5                                       //> a  : Int = 5
  def function1(i:Int):Int ={
  return a + i
  }                                               //> function1: (i: Int)Int
  function1(5)                                    //> res0: Int = 10
  
  a = 3
  function1(4)                                    //> res1: Int = 7
  
  
  def factorial(input:Int): Int = {
  var result: Int = 1
  for( i<- 1 to input)
  {
  		result = result*i
  }
  result
  }                                               //> factorial: (input: Int)Int
  factorial(5)                                    //> res2: Int = 120
  
   //Anonymous function
  val b= 1 to 100                                 //> b  : scala.collection.immutable.Range.Inclusive = Range 1 to 100
  b.map((x:Int) => {2 * x})                       //> res3: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12
                                                  //| , 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50
                                                  //| , 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88
                                                  //| , 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120,
                                                  //|  122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 
                                                  //| 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 1
                                                  //| 82, 184, 186, 188, 190, 192, 194, 196, 198, 200)
       
       
  def divideF(x:Double, y:Double) = {
  	x / y}                                    //> divideF: (x: Double, y: Double)Double
  	divideF(10,2)                             //> res4: Double = 5.0
       
  //Inverse Function / Partially applied functions
  val inverse = divideF(1,_:Double)               //> inverse  : Double => Double = functions$$$Lambda$14/586617651@13969fbe
  inverse(20)                                     //> res5: Double = 0.05
  
  
  def genericSum(f:Int =>Int)(x:Int, y:Int) ={
  f(x) + f(y)
  }                                               //> genericSum: (f: Int => Int)(x: Int, y: Int)Int
  
  genericSum(x=>x*x)(2,3)                         //> res6: Int = 13
  
  
  //Function Currying
  val sumOfSquares = genericSum(x => x*x)_        //> sumOfSquares  : (Int, Int) => Int = functions$$$Lambda$17/940553268@668bc3d5
                                                  //| 
  sumOfSquares(2,3)                               //> res7: Int = 13
       
   def areaOfCircle ={val pi = 3.14; (input:Int) => pi * input * input}
                                                  //> areaOfCircle: => Int => Double
   areaOfCircle(10)                               //> res8: Double = 314.0
  
}
