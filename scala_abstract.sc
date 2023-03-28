object scala_abstract {
  
  abstract class Animal{
   def sleep =println("Animals sleep a lot")
   val creatureType: String
   def eat
   }
   
   class Dog extends Animal{
   val creatureType: String = "canine"
   def eat:Unit = println("They eat fleash")
   }
   
   val d = new Dog                                //> d  : scala_abstract.Dog = scala_abstract$Dog@5ce65a89
   d.sleep                                        //> Animals sleep a lot
   d.eat                                          //> They eat fleash
   
   //Trait
   trait Carnivore{
   
   def preferredMeal
   
   }
   
   trait ColdBlooded
   
   class Crocodile extends Animal with Carnivore with ColdBlooded {
   val creatureType: String = "canine"
   def eat:Unit = println("They eat sea food")
   def preferredMeal = println("Meat")
   }
   
   val croc = new Crocodile                       //> croc  : scala_abstract.Crocodile = scala_abstract$Crocodile$1@2f7c7260
   croc.eat                                       //> They eat sea food
   croc.preferredMeal                             //> Meat
   
   
}