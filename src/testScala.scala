import org.apache.spark.sql.SparkSession;
import org.apache.spark.SparkContext;
import org.apache.spark.SparkConf;
import org.apache.log4j.Logger;

object testScala {
  
  def main(args: Array[String]){
    
    val conf = new SparkConf().setAppName("spark conf app");
    val sc = new SparkContext(conf);
    
    val myList = List(23, 76, 1, 35, 49, 25, 30, 64);
    //println(myList);
    
  
  }
  
}