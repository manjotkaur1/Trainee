package com.cvl.spring.Lab9;

public class B {

	private int b;
	private String Bmsg;
	
	public B(int b, String bmsg) {
		
		this.b = b;
		this.Bmsg = bmsg;
	}
	
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
			return ""+ b+"\t"+Bmsg;
	}
	*/
	 void showB(){
		 System.out.println(b+"\t"+Bmsg);
	 }
	
}
