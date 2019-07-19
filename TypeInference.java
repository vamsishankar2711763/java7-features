/* This is Java Type Inference improvement, earlier in java 6 and previous versions,
the diamond operator (i.e) "<>" isn't smart enough to know the data type which is 
present in the diamond operator, so we need to explicity mention the data type in the 
diamond operator. But in java 7, the diamond operator is smart enough to figure out
the type in the operator*/  


import java.util.List;  
import java.util.ArrayList;  
public class TypeInference {  
public static void main(String[] args) {  
// In Java 6 and earlier  
List<Integer> list = new ArrayList<Integer>();  
list.add(47);  
for (Integer element : list) {  
System.out.println(element);  
}  
// In Java 7  
List<Integer> list2 = new ArrayList<>();    
list2.add(47);  
for (Integer element : list2) {  
System.out.println(element);  
}  
}  
}  
