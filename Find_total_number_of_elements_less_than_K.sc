import scala.io.StdIn._

object MyClass {
    
    def main(args: Array[String]){
        
        val input1 = readLine()
        val inputArray1 = input1.split(" ").map(_.toInt)
        val input2 = readLine()
        val inputArray2 = input2.split(" ").map(_.toInt)
        
        val numK = inputArray1(1)
        var count = 0
        for(i <- inputArray2)
        {
            if(i < numK)
            {
            count = count + 1
            }
        }        
        println(count)            
    }
    
}