package Example.example1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class CustomCollectionDemo
{
	public static <T> List<T> convertALtoLL(List<T> aL) 
    {  
        List<T> ll = new LinkedList<T>(aL); 
        return ll; 
    }
	 
    public static void main(String[] args) {  
       try {
    	   Scanner sc=new Scanner(System.in);
    	   int choice;
    	  String s[] = {"a","b","c","d","e","f","g","h","i","j"};  
    	  Object o;  
    	  int i = 0;  
    	  MyClass a = new MyClass();  
    	  List list = a.myList(s);
          ArrayList al = new ArrayList(s);   
	      List<String> ll = convertALtoLL(al);
	      String ele;
	      int pos;
	      do {
	    	   System.out.format("%s","\n1.Display\n2.Insert\n3.Replace element at any position\n4.Retrieve\n5.Remove the element at particular index\n6.Remove the element\n7.size\n8.Exit\n");
	    	   System.out.format("%s","Enter the choice(1-8):\n");
	    	   choice=sc.nextInt();
	           switch(choice) {
	            case 1 : System.out.format("%s","The list is "+ll);
	        	         break;
	            case 2 : System.out.format("%s","Element to be added into the list : ");
	                     ele=sc.next();
	                     ll.add(ele);
   	                     break;
	            case 3 : System.out.format("%s","Enter the position : ");
	                     pos=sc.nextInt();
	                     System.out.format("%s","Enter the element : ");
	                     ele=sc.next(); 
	                     o = ll.set(pos, ele);  
                         break;
	            case 4 : System.out.format("%s","Enter the position of the element to be retrieved : ");
	                     int k=sc.nextInt();
	            	     o = ll.get(k);  
	  	                 System.out.format("%s","The retrieved element is " + o);
   	                     break;
	            case 5 : System.out.format("%s","Enter the index at which element to be removed");
	                     i=sc.nextInt();
	                     ll.remove(i);
	                     break;
	            case 6 : System.out.format("%s","Enter the element to be removed");
                         ele=sc.next();
                         ll.remove(ele);
                         System.out.format("%s","Element removed from the list");
                         break;
	            case 7 : i = ll.size();  
	  	                 System.out.format("%s","The size of the list is: " + i);
   	                     break;
	            case 8 : 
	            	     System.exit(0);
   	                     break;
   	            default: System.out.format("%s","Invalid choice choosen");
	         }
	      }while(choice!=8);
	      
	   } 
       catch (Exception e) {  
    	   System.out.format("%s","Error occured!!!!!!");
	   }  
   }  
}  
 

