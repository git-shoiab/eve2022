package eve;

public class VariableDemo {
	public static void main(String[] args) {
		//VARIABLE DECLARATION
		
		//NUMBER TYPE OR INTEGER TYPE
		
		//size of byte is 8 bits - a number of upto 256 can be assigned- but since it has positive and negative - it ranges from -128 to +127
		byte ameba=127;// value 10 is assigned to a variable by name ameba of type byte
		byte amebeneg=-128;
		
		//size of short is 16 bits
		short joker=32767;
		short jokerneg=-32768;
		
		//size of int is 32 bits
		
		int wealthOfCM=2147483647;
		int wealthOfCMNeg=-2147483648;
		
		//size of long is 64 bits
		
		long distanceofMoon=-9223372036854775808L;//remember for long variable the last character should be lower case of L or upper case of L
		long distanceofMoonNeg=9223372036854775807L;
		
		//FLOATING - DECIMALNUMBERS -
		
		//FLOAT - 32 BIT AND DOUBLE IS 64 BIT
		
		float amount=34500;
		amount=34500.100f;//f is compulsory for decimal value floats
		
		double bigAmount=2323233.455;
		
		//CHARACTER - 0 TO 65535 
		
		char c='a';
		c=97;
		c=0;
		c=65535;
		
		//BOOLEAN - TRUE OR FALSE
		
		boolean married=true;
		married=false;
		//married=1;//invalid
		
		//STRING DATA TYPE
		String message="Welcome to Java Proramming....";//set of character - no size limit - its unlimited
		
	}
}
