/*
 *  scala-exercises - exercises-stdlib
 *  Copyright (C) 2015-2019 47 Degrees, LLC. <http://www.47deg.com>
 *
 */

package stdlib

import org.scalacheck.ScalacheckShapeless._
import org.scalaexercises.Test
import org.scalatest.refspec.RefSpec
import org.scalatestplus.scalacheck.Checkers
import shapeless.HNil

class LiteralBooleansSpec extends RefSpec with Checkers {
  def `are either true or false` = {
    check(
      Test.testSuccess(
        LiteralBooleans.literalBooleanLiteralBooleans _,
        true :: false :: false :: true :: false :: false :: HNil
      )
    )
  }
}
