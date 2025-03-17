/**Q 4. Can we declare local variable as static if not what is the error?*/

package com.nit.Assignment_8;

public class Test4 {

	public static void main(String[] args) {
		
	    static int x = 10;
		
		System.out.println(x);
		
	}

}

/*Explanation of Execution Flow:
The program will fail to compile due to the illegal use of the static modifier for the local variable x.

Execution Flow Diagram (Compilation Failure):
sql
Copy code
+-----------------------------+
|       Start Compilation     |
+-----------------------------+
           |
           v
+-----------------------------+
| Detect "static" Modifier    |
| Used on Local Variable `x`  |
| Compiler Error:             |
| "Illegal modifier for       |
|  parameter x"               |
+-----------------------------+
           |
           v
+-----------------------------+
|    Program Does Not Run     |
+-----------------------------+
Key Takeaway:
Local variables cannot be declared as static. Use static only for class-level variables.*/
