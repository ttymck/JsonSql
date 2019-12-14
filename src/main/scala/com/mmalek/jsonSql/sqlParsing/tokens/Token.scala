package com.mmalek.jsonSql.sqlParsing.tokens

import enumeratum._
import com.mmalek.jsonSql.sqlParsing.tokens.TokenType._

sealed abstract class Token(`type`: TokenType) extends EnumEntry

object Token extends Enum[Token] {
  val values: IndexedSeq[Token] = findValues

  case object Sum extends Token(Function)
  case object Avg extends Token(Function)

  case object From extends Token(Initializer)

  case object Insert extends Token(Statement)
  case object Select extends Token(Statement)
  case object Update extends Token(Statement)
  case object Delete extends Token(Statement)

  case object Where extends Token(Statement)

  case class Any(value: String) extends Token(Value)
}
