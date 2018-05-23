object ArrayParity {

  def parity(input : List[Int]) : Int = {

    input match {
      case Nil => 0
      case x => x.sum
    }
  }


}
