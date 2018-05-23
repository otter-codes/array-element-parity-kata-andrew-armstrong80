import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec extends WordSpec with MustMatchers {

  "sum" must {

    "return the sum of 2 integers" in {

      SumOfSingles.sum(List(1, 2)) mustEqual 3
    }

    "return the sum of 2 integers when given a short List including other Ints" in {

      SumOfSingles.sum(List(1, 2, 2, 4)) mustEqual 5
    }

    "return the sum of 2 integers when given a long List including other Ints" in {

      SumOfSingles.sum(List(4, 5, 7, 5, 4, 8)) mustEqual 15
    }

    "return the sum of 2 integers when given another long List including other Ints" in {

      SumOfSingles.sum(List(1, 1, 2, 2, 3, 3, 4, 5)) mustEqual 9
    }

  }
}
