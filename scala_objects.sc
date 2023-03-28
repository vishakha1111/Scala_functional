object scala_objects {

	//Class like functionality , same like "static" in java
  object person{
  val N_eyes = 2
  def canFly : Boolean = false
  }
  
  //Instance level functionality
  class person(val name: String, val age: Int)
  {
  def salaryDoubler(salary: Int) = salary * 2
  }
  
  //Companions
  val per1 = new person("vishakha", 30)           //> per1  : scala_objects.person = scala_objects$person@5ce65a89
  val per2 = new person("shubham", 35);           //> per2  : scala_objects.person = scala_objects$person@2f7c7260
  println(per1 == per2)                           //> false
  per1.name                                       //> res0: String = vishakha
  per2.age                                        //> res1: Int = 35
  
  println(person.N_eyes)                          //> 2
  println(person.canFly)                          //> false
  
  val vishakha = person                           //> vishakha  : scala_objects.person.type = scala_objects$person$@7c75222b
  val avnish = person                             //> avnish  : scala_objects.person.type = scala_objects$person$@7c75222b
  
  println(vishakha == avnish)                     //> true
}