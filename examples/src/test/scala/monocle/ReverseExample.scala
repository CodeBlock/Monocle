package monocle

import monocle.TestUtil._
import monocle.function.Reverse._
import monocle.syntax.iso._
import org.specs2.scalaz.{ScalazMatchers, Spec}
import scalaz.Tree._

class ReverseExample extends Spec with ScalazMatchers {

  "reverse creates an Iso from a List to its reversed version" in {
    (List(1,2,3) <-> reverse get) shouldEqual List(3,2,1)
  }

  "reverse creates an Iso from a Stream to its reversed version" in {
    // Todo: look at infinite case
    (Stream(1,2,3) <-> reverse get) shouldEqual Stream(3,2,1)
  }

  "reverse creates an Iso from a String to its reversed version" in {
    ("Hello" <-> reverse get) shouldEqual "olleH"
  }

  "reverse creates an Iso from a Tree to its reversed version" in {
    (node(1, Stream(leaf(2), leaf(3))) <-> reverse get) must equal (node(1, Stream(leaf(3), leaf(2))))
  }

}
