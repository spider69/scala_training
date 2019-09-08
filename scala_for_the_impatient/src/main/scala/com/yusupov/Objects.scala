package com.yusupov

object Objects extends App {

  object Account {
    private var lastNumber = 0
    private def newUniqueNumber() = {lastNumber += 1; lastNumber}
    def apply(initialBalance: Double) = new Account(Account.newUniqueNumber(), initialBalance)
  }

  class Account private (val id: Int, initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Int) {balance += amount}
  }

  abstract class UndoableAction(val description: String) {
    def undo(): Unit
    def redo(): Unit
  }

  object DoNothingAction extends UndoableAction("Do nothing") {
    override def undo(): Unit = {}
    override def redo(): Unit = {}
  }

  val account = Account(1000.0)

  object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value
    val Red, Yellow, Green = Value
  }

  import TrafficLightColor._

  def doWhat(color: TrafficLightColor): String = {
    if (color == Red) "stop"
    else if (color == Yellow) "hurry up"
    else "go"
  }
  for (value <- TrafficLightColor.values) println(s"${value.id} $value")
  println(TrafficLightColor(0))
  println(TrafficLightColor.withName("Red"))
  println(doWhat(Red))

  // tasks
  // 1.
  object Conversions {
    def inchesToCentimeters(inches: Double): Double = {
      2.54 * inches
    }

    def gallonsToLiters(gallons: Double): Double = {
      3.78541 * gallons
    }

    def milesToKilometers(miles: Double): Double = {
      miles / 0.621371
    }
  }

  // 2.
  trait UnitConversions {
    def convert(unit: Double): Double
  }

  object InchesToCentimeters extends UnitConversions {
    override def convert(unit: Double): Double = {
      2.54 * unit
    }
  }

  object GallonsToLiters extends UnitConversions {
    override def convert(unit: Double): Double = {
      3.78541 * unit
    }
  }

  object MilesToKilometers extends UnitConversions {
    override def convert(unit: Double): Double = {
      unit / 0.621371
    }
  }

  // 3.
  object Origin extends java.awt.Point {
  }

  // 4.
  class Point(val x: Int, val y: Int) {
  }

  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }

  val point = Point(2, 3)

  // 5.
  args.reverse.foreach(arg => print(arg + " "))

  // 6.
  object Suits extends Enumeration {
    type Suits = Value
    val Diamonds: Objects.Suits.Value = Value("♦")
    val Hearts: Objects.Suits.Value = Value("♥")
    val Clubs: Objects.Suits.Value = Value("♣")
    val Spades: Objects.Suits.Value = Value("♠")
  }

  import Suits._

  Suits.values.foreach(suit => print(suit + " "))

  // 7.
  def isRedSuit(suit: Suits): Boolean = {
    if (suit == Suits.Diamonds || suit == Suits.Hearts) true
    else false
  }
  println(isRedSuit(Suits.Diamonds))
  println(isRedSuit(Suits.Hearts))
  println(isRedSuit(Suits.Clubs))
  println(isRedSuit(Suits.Spades))

  // 8.
  object ColorCubeAngles extends Enumeration {
    type ColorCubeAngles = Value
    val Black: Objects.ColorCubeAngles.Value = Value(0x000000)
    val Blue: Objects.ColorCubeAngles.Value = Value(0x0000ff)
    val Green: Objects.ColorCubeAngles.Value = Value(0x00ff00)
    val Cyan: Objects.ColorCubeAngles.Value = Value(0x00ffff)
    val Red: Objects.ColorCubeAngles.Value = Value(0xff0000)
    val Magenta: Objects.ColorCubeAngles.Value = Value(0xff00ff)
    val Yellow: Objects.ColorCubeAngles.Value = Value(0xffff00)
    val White: Objects.ColorCubeAngles.Value = Value(0xffffff)
  }

}
