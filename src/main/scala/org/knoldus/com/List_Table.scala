package org.knoldus.com

object List_Table {

  def table(list: List[Int]): Unit ={
    for (element <- list) {
      println("Table of " + element)
      for (i <- 1 to 10) {
        print(element + "*" + i + "=" +(i * element) + " "+"\n")
      }
      println(" ")
    }
  }

  def main(args: Array[String]): Unit = {
    val list = List(5, 7, 6, 3, 4, 8, 7)
    table(list)
  }
}
