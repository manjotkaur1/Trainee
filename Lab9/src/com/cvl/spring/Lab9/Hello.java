package com.cvl.spring.Lab9;

public class Hello {

	private A aobj;

	private B bobj;
	
	

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

	 void show(){
		/* System.out.println(aobj);
		 System.out.println(bobj);*/
		aobj.showA();
		bobj.showB();
	 }
}
