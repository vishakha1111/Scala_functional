object functions {
  var a = 5                                       //> a  : Int = 5
  def function1(i:Int):Int ={
  return a + i
  }                                               //> function1: (i: Int)Int
  function1(5)                                    //> res0: Int = 10
  
  a = 3
  function1(4)                                    //> res1: Int = 7
}