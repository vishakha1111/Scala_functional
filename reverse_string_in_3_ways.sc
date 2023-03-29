import scala.io.StdIn._

object MyClass {
    
    def main(args: Array[String]){
        
       val input = readLine()    
       val output1 = input.reverse
       println(output1)
       
       val output2 = input.split(" ").map(_.reverse)
       println(output2.mkString(" "))
       
       val output3 = input.split(" ").reverse
       println(output3.mkString(" "))
       
    }
    
}