package test.scala

trait Pet[C] {
  def apply (c : C) : Unit
  val name: String
}