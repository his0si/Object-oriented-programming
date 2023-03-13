public class TypeConversion {

    public static void main(String[] args) {
		
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);
		System.out.println(10.0/4);
		System.out.println((char)0x12340041);//16진수 아스키 코드로 char 타입으로 받음
        System.out.println((byte)(b+i));//오버 플로우 때문에 한 바퀴 돌아서 값이 저렇게 나왔다
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);

	}
    
}
