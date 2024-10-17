package basic_operations

import org.apache.log4j.{Level, Logger}

// class withot any arguments
class learning_logging;

object logging_obj{
  def main(args: Array[String]): Unit = {
    val log: Logger = Logger.getRootLogger()
    log.setLevel(Level.INFO)
    var learning_logging_obj = new learning_logging
    println("Understanding logging in scala")
    log.info("Understanding logging in scala")
    println(learning_logging_obj)
  }


}
