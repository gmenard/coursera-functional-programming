object PascalTriangle {

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r)
      1
    else if (c > r)
      0
    else
      pascal(c, r - 1) + pascal(c - 1, r - 1)
  }

  //  1
  //  1 1
  //  1 2 1
  //  1 3 3 1
  //  1 4 6 4 1

  pascal(45, 1)
  pascal(1, 45)
  pascal(0, 0)
  pascal(0, 4)
  pascal(1, 3)
  pascal(2, 4)
  pascal(4, 4)
}
