package fieldAndMethod;


public class PrimitiveVariInitValue {
	boolean classVarBoolean;  // 'false'
	static boolean staticVarBoolean;
	Boolean classObjVarBoolean; // null
	
	char ClassVarChar; // '\u0000(null)'
	byte ClassVarByte;      // (byte)0
	short ClassVarShort;   // (short)0
	int ClassVarInt;       // 0
	long ClassVarLong;     // 0L
	float ClassVarFloat;   // 0.0f
	double ClassVarDouble;  // 0.0d
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean methodVarBoolean;
//		System.out.println(methodVarBoolean); // compile error -->methodVarBoolean无法解析为变量
		
		System.out.println(staticVarBoolean); // output --> false
		
		PrimitiveVariInitValue varibleInit = new PrimitiveVariInitValue();
		System.out.println(varibleInit.classVarBoolean); // output --> false
		System.out.println(varibleInit.ClassVarChar); // output --> ''
		System.out.println(varibleInit.ClassVarByte);// output --> 0
		System.out.println(varibleInit.ClassVarShort);// output --> 0
		System.out.println(varibleInit.ClassVarInt);// output --> 0
		System.out.println(varibleInit.ClassVarLong);// output --> 0
		System.out.println(varibleInit.ClassVarFloat);// output --> 0.0
		System.out.println(varibleInit.ClassVarDouble);// output --> 0.0
	}

}
