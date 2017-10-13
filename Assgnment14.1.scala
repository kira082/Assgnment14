object Rationals
{
     val x= new Rational(1, 2) // 1/2

     x.numer // *
     x.denom // **
       /*  * and ** are my questions. why I have to use them?   */

     val y = new Rational(2, 3) // 2/3
     x.add(y)
	 x.mul(y)
	 x.div(y)
	 x.sub(y)
      /* my result most be equal to 7/6 */
}


class Rational (x : Int, y : Int)
{
     def numer= x
     def denom= y

     def add (that : Rational) =
     new Rational (
     numer * that.denom + that.numer * denom,   /* 1/2 * 2/3 */
     denom * that.denom) /* 2*2 */
	
	def mul (that : Rational) =
     new Rational (
     numer * that.numer,   /**/
     denom * that.denom)
	
	def sub (that : Rational) =
     new Rational (
     numer * that.denom - that.numer * denom,   /* 1/2 - 2/3 */
     denom * that.denom )	
	 
	def div (that : Rational) =
     new Rational (
     numer * that.denom ,that.numer * denom)
	 
    override def toString = numer + "/" + denom   /*  */

 }