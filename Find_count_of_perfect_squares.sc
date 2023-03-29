import scala.io.StdIn._

object MyClass {
    
    def main(args: Array[String]){
        
        val numCustomers: Int = readInt()
        
        val billAmount: String = readLine()
        
        val billAmt: Array[Int] = billAmount.split(" ").map(_.toInt)
        
        var count = 0
        for( i <- billAmt)
        {
            val sqrt = math.sqrt(i)
            if(sqrt.ceil - sqrt == 0)
            {
                count = count + 1
            }
        }
        println(count)
        
    }
    
}