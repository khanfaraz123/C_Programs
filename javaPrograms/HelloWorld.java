class HelloWorld {
    public static void main(String[] args) {
        byte myByte = 127;		//ranges -128 and 127
        short myShort= 32767;		//range -32768 to 32767
	int myInt = 2147483647		//range -2147483648 to 2147483647
	long myLong = 15000000000L;	//range -9223372036854775808 to 9223372036854775807
	float f1 = 35e3f;	// e3 means three 0's after 35
	double d1 = 12E4d;
	
        System.out.println(myByte);
        System.out.println(myShort);
	System.out.println(myInt);
	System.out.println(myLong);
	System.out.println(f1);
	System.out.println(d1);
    }
}
