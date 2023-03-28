object scala_oop {

  class Person(val name:String, age:Int)                 //Constructor
  {
  val x = 20
  
  def ageDoubler = age * 2
  
  def salaryDoubler(salary: Int) = salary * 2
  
  }
  val p = new Person("vishakha", 23)              //> p  : scala_oop.Person = scala_oop$Person@5ce65a89
  println(p.name)                                 //> vishakha
  println(p.x)                                    //> 20
  
  p.ageDoubler                                    //> res0: Int = 46
  p.salaryDoubler(100000)                         //> res1: Int = 200000
}