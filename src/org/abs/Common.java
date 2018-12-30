package org.abs;

public class Common extends Banking{

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("10%");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("12%");
		
	}
	public static void main(String[] args) {
		Common co=new Common();
		co.saving();
		co.deposit();
		
	}
	
	

}
