package com.knoldus.squarelist

object SquareList {

  // functions square all the value of list
  def toSquareUsingMap(list: List[Int]): List[Int] = {
    try {
      list.map(value => value * value)
    } catch {
      case _: Throwable => Nil
    }
  }

  def toSquareUsingMatches(list: List[Int]): List[Int] = {
    try {
      list match {
        case Nil => Nil
        case head :: tail => head * head :: toSquareUsingMatches(tail)
      }
    } catch {
      case _: Throwable => Nil
    }
  }
}


