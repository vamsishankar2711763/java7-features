/* I didn't find this feature useful, previously before Java 7 multiple exceptions
can't be caught in single block, but from java 7 multiple exceptions can be caught from a single block
*/

public class CatchingExceptions 
{  
public static void main(String[] args) {  
try{    
int a[]=new int[5];    
a[5]=30/0;    
}    
catch(ArithmeticException | ArrayIndexOutOfBoundsException e)  
{  
System.out.println("Arithmetic Exception occurs");
System.out.println("ArrayIndexOutOfBounds Exception occurs");
}  
catch(Exception e)  
{  
System.out.println("Parent Exception occurs");  
}             
}  
}  
