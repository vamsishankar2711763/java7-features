/* In Java 7, the try-with-resources statement is a try statement that declares one or more resources. 
The resource is as an object that must be closed after finishing the program. 
The try-with-resources statement ensures that each resource is closed at the end of the statement execution.
Prior to Java 7 we need to close the resources after usage */
import java.io.FileOutputStream;    
public class AutoResourceMgmt {    
public static void main(String args[]){      
              
try(FileOutputStream fileOutputStream =new FileOutputStream("/home/vamsi/hai.txt"))
{      
String msg = "Automatic Resource management";      
byte byteArray[] = msg.getBytes();       
fileOutputStream.write(byteArray);  
System.out.println("Message written to file successfuly!");      
}
catch(Exception exception)
{  
System.out.println(exception);  
}      
}      
}    
