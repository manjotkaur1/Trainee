package com.cvl.spring.Lab9;

public class A {

	private int a;
	private String msg;
	
	public void setA(int a) {
		this.a = a;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	  void showA(){
		 System.out.println(a+"\t"+msg);
	 }
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+ a+"\t"+msg;
	}*/
	
}
