package com.masai;

public class KidUsers implements LibraryUser {

	private int age;
	private String bookType;
	
	@Override
	public void registerAccount() {
		
		if(this.age < 12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		
		else if(this.age > 12)
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		if(this.age < 12)
		{
			if(this.bookType.equals("Kids"))
			{
				System.out.println("Book Issued successfully, please return the book within 10 days");
			}
			else
			{
				System.out.println("Oops, you are allowed to take only kids books");
			}
			
		}
	}

	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	public KidUsers() {

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public String toString() {
		return "KidUsers [age=" + age + ", bookType=" + bookType + "]";
	}
	
	

}
