object scala_learning1 {
  println("hello world")                          //> hello world
	val a: Int = 5                            //> a  : Int = 5
	val b: String = "Vishakha"                //> b  : String = Vishakha
	println(a)                                //> 5
	println(b)                                //> Vishakha
	var c: String = "Jadhav"                  //> c  : String = Jadhav
	c = "Hello"
	println(c)                                //> Hello
	val piSinglePrecistion: Float=3.1415f     //> piSinglePrecistion  : Float = 3.1415
	println("Concatenated results: "+ a + b + c)
                                                  //> Concatenated results: 5VishakhaHello
  val abc = 1 > 2                                 //> abc  : Boolean = false
  val x: String = "vishakha"                      //> x  : String = vishakha
  val y: String = "vishakha"                      //> y  : String = vishakha
  val z = x == y                                  //> z  : Boolean = true
  
  for(x <- 1 to 10)
  {
  val square = x*x
  println(square)
  }                                               //> 1
                                                  //| 4
                                                  //| 9
                                                  //| 16
                                                  //| 25
                                                  //| 36
                                                  //| 49
                                                  //| 64
                                                  //| 81
                                                  //| 100
                                                  
  var i =0                                        //> i  : Int = 0
  while(i<=10)
  {
  println(i)
  i=i+1
  }                                               //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10
  
}