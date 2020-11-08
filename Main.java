package ms0.a0;

public class Main {
	 public static void main(String []args) {
			Stack s;
			s = new Stack (); 
			s.push("Element1"); 
			s.push("Element2");
			s.push("Element3"); //Stack ist mit den 3 Strings befüllt

			while(s.size>0) {
			  System.out.println("Size: Anzahl der Elemente, welche sich im Stack befinden "+s.size);
			  System.out.println("Peek: Das oberste Element im Stack ist:  "+s.peek());
			  System.out.println("Pop: Das oberste Element im Stack wird entfernt:   "+s.pop());
			  System.out.println(" ");
			}
	 }
 }



