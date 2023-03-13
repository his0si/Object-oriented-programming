public class TypeConversion {

    public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);//16진수 아스키 코드로 char 타입으로 받음
		System.out.println((byte)(b+i));
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);

	}
    
}
