object case_classes {
 
  case class Person(name:String, age:Int)
 
 	//1. Class parameters are automatically promoted to fields
 	val per1 = new Person("vishakha", 24)     //> per1  : case_classes.Person = Person(vishakha,24)
 	println(per1.name)                        //> vishakha
 	
 	//2. Case classes have sensible toString
 	println(per1.toString)                    //> Person(vishakha,24)
 	println(per1)                             //> Person(vishakha,24)
 	
 	//3. Equals and hashcode method implemented already
 	val per2 = new Person("vishakha", 24)     //> per2  : case_classes.Person = Person(vishakha,24)
 	println(per1 == per2)                     //> true
 	
 	//4. Have companion objects already, we do not have to create it
 	val per3 = Person.apply("vishakha", 24)   //> per3  : case_classes.Person = Person(vishakha,24)
 	println(per3)                             //> Person(vishakha,24)
 	val per4 = Person("vishakha", 24)         //> per4  : case_classes.Person = Person(vishakha,24)
 	println(per3)                             //> Person(vishakha,24)
 	
 	//5. Case classes have a handy copy method
 	val per5 = per2.copy(age=45)              //> per5  : case_classes.Person = Person(vishakha,45)
 	println(per5.age)                         //> 45
 	
 	//6. Case classes are serializable
}