package day7.Methods.returnFromMethods;

public class CharReturn {
	public static void main(String[] args) {
		CharReturn o = new CharReturn();
		
		char ch = o.returnByUsingVariable_ASCII();
		System.out.println(ch);
	
		
		ch = o.returnByUsingVariable_CHAR();
		System.out.println(ch);
	
		
		ch = o.returnByUsingLiteral_ASCII();
		System.out.println(ch);
	
		
		ch = o.returnByUsingLiteral_CHAR();
		System.out.println(ch);

		// In Chars we can perform calculations to retrieve the desired character value
		// It is used in Encryption and Decryption
		// Caeser Cypher >> A(1) > D(4)
		// +3 Encryption of Hello >> Khoor
		// -3 Decryption of Khoor >> Hello
		char aaa = 65;
		
		char zzz = (char) (aaa + 25);
		
		System.out.println(zzz);
		
	}

	private char returnByUsingLiteral_CHAR() {
		return('Z');
	}

	private char returnByUsingLiteral_ASCII() {
		return 88;
	}

	private char returnByUsingVariable_CHAR() {
		char temp = 'A';
		return temp;
	}

	private char returnByUsingVariable_ASCII() {
		char temp = 80;
		return temp;
	}
	
	
}
