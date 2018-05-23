import org.scalatest.{MustMatchers, WordSpec}

class ArrayParitySpec extends WordSpec with MustMatchers {

  "parity" must {

    "return an Int when given a List with one element" in {
      ArrayParity.parity(List(1)) mustEqual 1
    }

    "return an Int when given a List with three elements" in {
      ArrayParity.parity(List(1, -1, 2)) mustEqual 2
    }

  }

}
