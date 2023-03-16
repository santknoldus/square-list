package com.knoldus.squarelist

import org.scalatest.funsuite.AnyFunSuite

class SquareListTest extends AnyFunSuite {
  test("toSquareUsingMap should square all values in the list") {
    val inputList = List(1, 2, 3)
    val expectedList = List(1, 4, 9)
    assert(SquareList.toSquareUsingMap(inputList) == expectedList)
  }

  test("toSquareUsingMap with empty list"){
    val inputList = List()
    val expectedList = List()
    assert(SquareList.toSquareUsingMap(inputList) == expectedList)
  }

  test("toSquareUsingMatches with empty list"){
    val inputList = List()
    val expectedList = List()
    assert(SquareList.toSquareUsingMap(inputList) == expectedList)
  }

  test("toSquareUsingMatches should square all values in the list") {
    val inputList = List(1, 2, 3)
    val expectedList = List(1, 4, 9)
    assert(SquareList.toSquareUsingMatches(inputList) == expectedList)
  }
}