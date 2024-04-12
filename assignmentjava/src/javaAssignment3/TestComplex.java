package javaAssignment3;

public class TestComplex {

	public static void main(String[] args) {
		// First Complex number 
        Complexno C1 = new Complexno(3, 2); 
  
        // printing first complex number 
        System.out.println("Complex number 1st : " + C1.real+ " + i" + C1.imag); 
  
        // Second Complex number 
        Complexno C2 = new Complexno(9, 5); 
  
        // Printing second complex number 
        System.out.println("Complex number 2nd : " + C2.real + " + i" + C2.imag); 
  
        // Storing the sum 
        Complexno C3 = new Complexno(); 
  
        // Calling addComp() method 
        C3 = C3.addComp(C1, C2); 
  
        // Printing the sum 
        System.out.println("Sum of complex number : "+ C3.real + " + i"+ C3.imag); 
    


	}

}
