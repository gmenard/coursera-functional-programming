object ParentheseBalancing {

  def balance(chars: List[Char]): Boolean = {
    def isBalanced(count: Int, chars: List[Char]): Boolean = {

      if (count < 0)
        return false

      if (chars.isEmpty)
        return count == 0

      val char = chars.head

      if (char == '(')
        isBalanced(count + 1, chars.tail)
      else if(char == ')')
        isBalanced(count - 1, chars.tail)
      else
        isBalanced(count, chars.tail)
    }
    isBalanced(0, chars)
  }

  balance("(just an) example".toList)
  balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)
  balance("((()))()()()(())()(()())((()()(())))".toList)

  balance("())(".toList)
  balance("(".toList)
  balance(")".toList)
}
