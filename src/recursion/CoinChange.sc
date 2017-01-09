object CoinChange {

  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money > 0 && coins.nonEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }

  countChange(1, List(1))
  countChange(1, List())
  countChange(0, List(1))
  countChange(4, List(1, 2))
  countChange(3, List(1, 2, 3))
}
