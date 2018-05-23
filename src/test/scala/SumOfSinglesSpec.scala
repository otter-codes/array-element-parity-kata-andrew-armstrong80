import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "sum" must {

    "return the sum of 2 integers" in {

      SumOfSingles.sum(List(1,2)) mustEqual 3
    }
  }

}
