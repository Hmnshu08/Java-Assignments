package io.javabeans;

public class TypeInterfaceEx {
	public static void main(String[] args) {
		StringLength mylamda = (String s) -> s.length();
		System.out.println(mylamda.getLength("HEllo Lambda"));
	}
}


interface StringLength{
	int getLength(String s);
}
 // 12