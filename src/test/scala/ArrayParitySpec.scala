import org.scalatest.{MustMatchers, WordSpec}

class ArrayParitySpec extends WordSpec with MustMatchers {

  "parity" must {

    "return a positive Int when given a List with one element" in {
      ArrayParity.parity(List(1)) mustEqual 1
    }

    "return a positive Int when given a List with three elements" in {
      ArrayParity.parity(List(1, -1, 2)) mustEqual 2
    }

    "return a positive Int when given a List with multiple elements" in {
      ArrayParity.parity(List(1, -1, 2, -2, 3, -3, 4)) mustEqual 4
    }

    "return a negative Int when given a List with multiple elements" in {
      ArrayParity.parity(List(1, -1, 2, -2, 3, -3, -4)) mustEqual -4
    }

    "return an Int when given a List with 2 matching positive elements" in {
      ArrayParity.parity(List(1, -1, 2, -2, 3, -3, 4, 4)) mustEqual 4
    }

  }

}
