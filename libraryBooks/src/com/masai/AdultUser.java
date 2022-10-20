package com.masai;

public class AdultUser implements LibraryUser{

	private int age;
	private String bookType;
	
	@Override
	public void registerAccount() {
		
		if(this.age < 12)
		{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
		else if(this.age > 12)
		{
			System.out.println("You have successfully registered under an Adult Account");
		}
		
	}

	@Override
	public void requestBook() {
		if(this.age > 12)
		{
			if(this.bookType.equals("Fiction"))
			{
				System.out.println("Book Issued successfully, please return the book within 7 days");
			}
			else
			{
				System.out.println("Oops, you are allowed to take only adult Fiction books");
			}
			
		}
		
	}

	
	
	
	public AdultUser() {
		super();
	}

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
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
		return "AdultUser [age=" + age + ", bookType=" + bookType + "]";
	}

	
	
	
}
