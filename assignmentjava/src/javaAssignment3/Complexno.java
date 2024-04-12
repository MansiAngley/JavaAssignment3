/* 2.Print the sum, difference and product of two complex numbers bycreating aclass, named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user. Use Constructors to initializethedatamembers*/

package javaAssignment3;

public class Complexno {
	
	int real;
	int imag;
	
	public Complexno() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Complexno(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}


	Complexno addComp(Complexno C1, Complexno C2) 
    { 
        // Creating temporary variable 
        Complexno temp = new Complexno(); 
  
        // Adding real part of complex numbers 
        temp.real = C1.real + C2.real; 
  
        // Adding Imaginary part of complex numbers 
        temp.imag = C1.imag + C2.imag; 
  
        // Returning the sum 
        return temp;
		
	}
	
	

}
