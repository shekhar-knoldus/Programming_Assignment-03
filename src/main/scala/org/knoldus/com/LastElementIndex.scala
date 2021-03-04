package org.knoldus.com

object LastElementIndex {

  def lastElementIndex(list: List[Int]): Unit={
    val len = list.length-1;
    println("lst element is : "+list(len))
    println("lst element index  is : "+len)
  }

  def main(args: Array[String]): Unit = {
    val list=List(5,6,7,2,3,4,5,9,8,6)
    lastElementIndex(list)
  }
}
