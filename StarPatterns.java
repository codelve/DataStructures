public class StarPatterns {

	public static void main(String args[]) // driver function
	{
		int n = 5;
		pyramidPattern(n);
		leftTriangle(n);
		rightTriangle(n);
		diamondPattern(n);
		downwardRightTriangle(n);
		mirroredRightTriangle(n);
		reversePyramid(n);
		reverseDownLeftMirror(n);
		pascalTriangle(n);
		leftPascalTriangle(n);
		Sandglass(n);
		hollowTriangle(n);
		invertedHollowTriangle(n);
		hollowDiamond(n);
		pascalNumberTriangle(n);
		numberDiamond();
	}

//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * *
	public static void pyramidPattern(int n) {
		for (int i = 0; i < n; i++) // outer loop for number of rows(n)
		{
			for (int j = n - i; j > 1; j--) // inner loop for spaces
			{
				System.out.print(" "); // print space
			}
			for (int j = 0; j <= i; j++) // inner loop for number of columns
			{
				System.out.print("* "); // print star
			}

			System.out.println(); // ending line after each row
		}
	}

//    	  * 
//      * * 
//    * * * 
//  * * * * 
//* * * * *   
	public static void leftTriangle(int n) {
		int i, j;
		for (i = 0; i < n; i++) // outer loop for number of rows(n)
		{
			for (j = 2 * (n - i); j >= 0; j--) // inner loop for spaces
			{
				System.out.print(" "); // printing space
			}
			for (j = 0; j <= i; j++) // inner loop for columns
			{
				System.out.print("* "); // print star
			}
			System.out.println(); // ending line after each row
		}
	}

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
	public static void rightTriangle(int n) {
		int i, j;
		for (i = 0; i < n; i++) // outer loop for number of rows(n)
		{
			for (j = 0; j <= i; j++) // inner loop for columns
			{
				System.out.print("* "); // print star
			}
			System.out.println(); // ending line after each row
		}
	}

//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *
	public static void diamondPattern(int n) {
		int i, j;
		int space = n - 1;
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= n - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*
	public static void downwardRightTriangle(int n) {
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

//     *
//    **
//   ***
//  ****
// *****
//******
	static void mirroredRightTriangle(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

//	 * * * * * 
//	  * * * * 
//	   * * * 
//	    * * 
//	     * 
	static void reversePyramid(int n) {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= n - 1 - i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

//	*****
//	 ****
//	  ***
//	   **
//	    *
	static void reverseDownLeftMirror(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 

	static void pascalTriangle(int n) {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *
	static void leftPascalTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println("");

		}
	}

//	* * * * * 
//	 * * * * 
//	  * * * 
//	   * * 
//	    * 
//	    * 
//	   * * 
//	  * * * 
//	 * * * * 
//	* * * * * 
	static void Sandglass(int n) {
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n - 1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n - 1; k++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	
//    *
//   * *
//  *   *
// *     *
//*********
	static void hollowTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == n || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	
//	*********
//	 *     *
//	  *   *
//	   * *
//	    *
	static void invertedHollowTriangle(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || i == n || k == (2 * i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

//    *
//   * *
//  *   *
// *     *
//*       *
// *     *
//  *   *
//   * *
//    *
	static void hollowDiamond(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.println("");
			} else {
				System.out.println("*");
			}
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int k = 1; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			if (i == 1)
				System.out.println("");
			else
				System.out.println("*");
		}
	}

//        1
//      1   1
//    1   2   1
//  1   3   3   1
//1   4   6   4   1
	static void pascalNumberTriangle(int n) {
		for (int i = 0; i < n; i++) {
			int number = 1;
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.printf("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

	
//	    1
//	   212
//	  32123
//	 4321234
//	  32123
//	   212
//	    1
	static void numberDiamond() {
		for (int i = 1; i <= 4; i++) {
			int n = 4;

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		for (int i = 3; i >= 1; i--) {
			int n = 3;

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			for (int l = 2; l <= i; l++) {
				System.out.print(l);
			}

			System.out.println();
		}
	}

}
