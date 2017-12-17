object MathLab {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(488); 
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 1
  //+++++++++++++++++++++++++++++++++++++++
  def solve(a: Double, b: Double, c: Double): Option[(Double, Double)] = {
  	val discriminant = Math.pow(a, 2) - (4 * a * c)
  if (discriminant < 0 )
  	 None
  else {
  	val negativeb = - b
  	val squareroot = Math.sqrt(discriminant)
  	val dividend = 2 * a
  	
  	val x = (negativeb + squareroot) / dividend
  	val y = (negativeb - squareroot) / dividend
  	Some(x, y)
  
  }
 };System.out.println("""solve: (a: Double, b: Double, c: Double)Option[(Double, Double)]""");$skip(19); val res$0 = 
  solve(2, -2, -4);System.out.println("""res0: Option[(Double, Double)] = """ + $show(res$0));$skip(17); val res$1 = 
  solve(1, 0, 1);System.out.println("""res1: Option[(Double, Double)] = """ + $show(res$1));$skip(18); val res$2 = 
  solve(1, 0, -1);System.out.println("""res2: Option[(Double, Double)] = """ + $show(res$2));$skip(356); 
  //+++++++++++++++++++++++++++++++++++++++
  
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 2
  //+++++++++++++++++++++++++++++++++++++++
  def dist(a: (Double, Double), b: (Double, Double)): Double = {
  	var x = b._1 - a._1
  	var y = b._2 - a._2
  	x = Math.pow(x, 2)
  	y = Math.pow(y,2)
  	val sum  = x + y
  	Math.sqrt(sum)
  	
  };System.out.println("""dist: (a: (Double, Double), b: (Double, Double))Double""");$skip(24); val res$3 = 
  
  dist((1,1), (0,0));System.out.println("""res3: Double = """ + $show(res$3));$skip(23); val res$4 = 
  dist((3, 0), (0, 0));System.out.println("""res4: Double = """ + $show(res$4));$skip(24); val res$5 = 
  dist((5, 1), (1, -2));System.out.println("""res5: Double = """ + $show(res$5));$skip(321); 
  
  //+++++++++++++++++++++++++++++++++++++++
  
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 3
  //+++++++++++++++++++++++++++++++++++++++
  def dot(a: (Double, Double, Double), b: (Double, Double, Double)): Double = {
  var x = a._1 * b._1
  var y = a._2 * b._2
  var z = a._3 * b._3
  x + y + z
  };System.out.println("""dot: (a: (Double, Double, Double), b: (Double, Double, Double))Double""");$skip(32); val res$6 = 
  dot((2.0, 3, 4), (2, 2.0, 2));System.out.println("""res6: Double = """ + $show(res$6));$skip(29); val res$7 = 
  dot((3, 1, 8) , (5, 7, 4));System.out.println("""res7: Double = """ + $show(res$7));$skip(31); val res$8 = 
   dot((6, 0, 2) , (5, 9, 12));System.out.println("""res8: Double = """ + $show(res$8));$skip(448); 
  
  //+++++++++++++++++++++++++++++++++++++++
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 6
  //+++++++++++++++++++++++++++++++++++++++
  def isPrime(n: Integer): Boolean = {
			// place iterative solution here
			if (n == 2 || n == 3 || n == 5 || n == 7 ) {
				return true
			}
			if ( n % 2 == 0)
			   return false

			for ( i <- 1 until 11 by 2) {
				if (n % i == 0) {
					 return false
				}
				
			}
			return true
	};System.out.println("""isPrime: (n: Integer)Boolean""");$skip(16); val res$9 = 
  
  isPrime(0);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(13); val res$10 = 
  isPrime(1);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(13); val res$11 = 
  isPrime(2);System.out.println("""res11: Boolean = """ + $show(res$11));$skip(13); val res$12 = 
  isPrime(7);System.out.println("""res12: Boolean = """ + $show(res$12));$skip(13); val res$13 = 
  isPrime(9);System.out.println("""res13: Boolean = """ + $show(res$13));$skip(14); val res$14 = 
  isPrime(11);System.out.println("""res14: Boolean = """ + $show(res$14));$skip(14); val res$15 = 
  isPrime(13);System.out.println("""res15: Boolean = """ + $show(res$15));$skip(371); 
  
 //+++++++++++++++++++++++++++++++++++++++
  
 //+++++++++++++++++++++++++++++++++++++++
 //Problem 7
 def phi(n: Integer): Int = {
 	def gcd(x: Int, y: Int): Int = {
 		var a = x
 		var b = y
 		while (a != 0) {
 			val temp = a
 			a = b % a
 			b = temp
 		}
 		b
 	}
 	var result = 1
 	for (i <- 2 until n) {
 	if (gcd(i, n) == 1)
 			result += 1
 	}
 	result
 };System.out.println("""phi: (n: Integer)Int""");$skip(8); val res$16 = 
 phi(1);System.out.println("""res16: Int = """ + $show(res$16));$skip(8); val res$17 = 
 phi(2);System.out.println("""res17: Int = """ + $show(res$17));$skip(8); val res$18 = 
 phi(3);System.out.println("""res18: Int = """ + $show(res$18));$skip(8); val res$19 = 
 phi(4);System.out.println("""res19: Int = """ + $show(res$19));$skip(8); val res$20 = 
 phi(5);System.out.println("""res20: Int = """ + $show(res$20));$skip(8); val res$21 = 
 phi(6);System.out.println("""res21: Int = """ + $show(res$21));$skip(8); val res$22 = 
 phi(7);System.out.println("""res22: Int = """ + $show(res$22));$skip(8); val res$23 = 
 phi(8);System.out.println("""res23: Int = """ + $show(res$23));$skip(8); val res$24 = 
 phi(9);System.out.println("""res24: Int = """ + $show(res$24));$skip(9); val res$25 = 
 phi(10);System.out.println("""res25: Int = """ + $show(res$25));$skip(251); 
 
 //+++++++++++++++++++++++++++++++++++++++
   
 //+++++++++++++++++++++++++++++++++++++++
 // Problem 8
 //+++++++++++++++++++++++++++++++++++++++
 
 def rollDice(): (Double,Double) =  {
 val r = scala.util.Random
 
 (r.nextInt(6), r.nextInt(6))
 };System.out.println("""rollDice: ()(Double, Double)""");$skip(12); val res$26 = 
	rollDice();System.out.println("""res26: (Double, Double) = """ + $show(res$26));$skip(12); val res$27 = 
 rollDice();System.out.println("""res27: (Double, Double) = """ + $show(res$27));$skip(12); val res$28 = 
 rollDice();System.out.println("""res28: (Double, Double) = """ + $show(res$28));$skip(12); val res$29 = 
 rollDice();System.out.println("""res29: (Double, Double) = """ + $show(res$29));$skip(12); val res$30 = 
 rollDice();System.out.println("""res30: (Double, Double) = """ + $show(res$30))}
 //+++++++++++++++++++++++++++++++++++++++
}
