package com.masai;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUsers kid = new KidUsers();
		kid.setAge(11);
		kid.setBookType("Kids");
		
		kid.registerAccount();
		
		kid.requestBook();
		
		
		System.out.println("===================================");
		
		AdultUser adUser = new AdultUser();
		
		adUser.setAge(13);
		adUser.setBookType("ff");
		
		
		adUser.registerAccount();
		
		adUser.requestBook();
		
	}

}
