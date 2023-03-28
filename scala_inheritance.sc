object scala_inheritance {
  
  class Animal{
  def eat = println("Animals eat a lot")
  }
  
  class Cat extends Animal{
  def prefferedMeal = println("milk")
  }
  
  val c = new Cat                                 //> c  : scala_inheritance.Cat = scala_inheritance$Cat@5ce65a89
  c.eat                                           //> Animals eat a lot
  c.prefferedMeal                                 //> milk
}