object SumOfSingles {

  def sum(input : List[Int]) : Int = {

    val distinctive = input.diff(input.distinct)

    input.filterNot(x => distinctive.contains(x)).sum
  }

}
