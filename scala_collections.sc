object scala_collections {
		//Array
  	val a = Array(1,2, 3, 4, 5)               //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  	println(a.mkString(" "))                  //> 1 2 3 4 5
  	for (i <- a)
  	println(i)                                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
  	
  	a(3) = 10
  	println(a.mkString(","))                  //> 1,2,3,10,5
  	
  	
  	//List
  	val b = List(1, 2, 3, 4, 5)               //> b  : List[Int] = List(1, 2, 3, 4, 5)
  	b.sum                                     //> res0: Int = 15
  	10 :: b                                   //> res1: List[Int] = List(10, 1, 2, 3, 4, 5)
  	
  	
  	//Tuple
  	val x = ("vishakha", 1000, true)          //> x  : (String, Int, Boolean) = (vishakha,1000,true)
  	println(x._1)                             //> vishakha
  	val y = (101, "Avnish")                   //> y  : (Int, String) = (101,Avnish)
  	val z = 101 -> "Avnish"                   //> z  : (Int, String) = (101,Avnish)


		//Range
		val rng = 1 to 10                 //> rng  : scala.collection.immutable.Range.Inclusive = Range 1 to 10
		for(i <- rng)
		println(i)                        //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10


		//Set
		val setnum = Set(1,1,3,3,2,2,2,2,7,7,3)
                                                  //> setnum  : scala.collection.immutable.Set[Int] = Set(1, 3, 2, 7)
		println(setnum)                   //> Set(1, 3, 2, 7)
		setnum.max                        //> res2: Int = 7
		setnum.min                        //> res3: Int = 1


		//Map
		val mapnum = Map(1 -> "vishakha", 2-> "Avnish")
                                                  //> mapnum  : scala.collection.immutable.Map[Int,String] = Map(1 -> vishakha, 2 
                                                  //| -> Avnish)
		mapnum.get(1)                     //> res4: Option[String] = Some(vishakha)
		

}