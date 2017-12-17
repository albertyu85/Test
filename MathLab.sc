object MathLab {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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
 }                                                //> solve: (a: Double, b: Double, c: Double)Option[(Double, Double)]
  solve(2, -2, -4)                                //> res0: Option[(Double, Double)] = Some((2.0,-1.0))
  solve(1, 0, 1)                                  //> res1: Option[(Double, Double)] = None
  solve(1, 0, -1)                                 //> res2: Option[(Double, Double)] = Some((1.118033988749895,-1.118033988749895)
                                                  //| )
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
  	
  }                                               //> dist: (a: (Double, Double), b: (Double, Double))Double
  
  dist((1,1), (0,0))                              //> res3: Double = 1.4142135623730951
  dist((3, 0), (0, 0))                            //> res4: Double = 3.0
  dist((5, 1), (1, -2))                           //> res5: Double = 5.0
  
  //+++++++++++++++++++++++++++++++++++++++
  
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 3
  //+++++++++++++++++++++++++++++++++++++++
  def dot(a: (Double, Double, Double), b: (Double, Double, Double)): Double = {
  var x = a._1 * b._1
  var y = a._2 * b._2
  var z = a._3 * b._3
  x + y + z
  }                                               //> dot: (a: (Double, Double, Double), b: (Double, Double, Double))Double
  dot((2.0, 3, 4), (2, 2.0, 2))                   //> res6: Double = 18.0
  dot((3, 1, 8) , (5, 7, 4))                      //> res7: Double = 54.0
   dot((6, 0, 2) , (5, 9, 12))                    //> res8: Double = 54.0
  
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
	}                                         //> isPrime: (n: Integer)Boolean
  
  isPrime(0)                                      //> res9: Boolean = false
  isPrime(1)                                      //> res10: Boolean = false
  isPrime(2)                                      //> res11: Boolean = true
  isPrime(7)                                      //> res12: Boolean = true
  isPrime(9)                                      //> res13: Boolean = false
  isPrime(11)                                     //> res14: Boolean = false
  isPrime(13)                                     //> res15: Boolean = false
  
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
 }                                                //> phi: (n: Integer)Int
 phi(1)                                           //> res16: Int = 1
 phi(2)                                           //> res17: Int = 1
 phi(3)                                           //> res18: Int = 2
 phi(4)                                           //> res19: Int = 2
 phi(5)                                           //> res20: Int = 4
 phi(6)                                           //> res21: Int = 2
 phi(7)                                           //> res22: Int = 6
 phi(8)                                           //> res23: Int = 4
 phi(9)                                           //> res24: Int = 6
 phi(10)                                          //> res25: Int = 4
 
 //+++++++++++++++++++++++++++++++++++++++
   
 //+++++++++++++++++++++++++++++++++++++++
 // Problem 8
 //+++++++++++++++++++++++++++++++++++++++
 
 def rollDice(): (Double,Double) =  {
 val r = scala.util.Random
 
 (r.nextInt(6), r.nextInt(6))
 }                                                //> rollDice: ()(Double, Double)
	rollDice()                                //> res26: (Double, Double) = (4.0,5.0)
 rollDice()                                       //> res27: (Double, Double) = (4.0,5.0)
 rollDice()                                       //> res28: (Double, Double) = (1.0,5.0)
 rollDice()                                       //> res29: (Double, Double) = (3.0,4.0)
 rollDice()                                       //> res30: (Double, Double) = (2.0,2.0)
 //+++++++++++++++++++++++++++++++++++++++
}