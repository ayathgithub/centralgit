class program1
{
	static void application(String name,long mobilenumber,String mailid,String relation,int DOB,String qualification,char gender)
	{
    System.out.println("name="+name);
	System.out.println("mobilenumber="+mobilenumber);
	System.out.println("mailid="+mailid);
    System.out.println("relation="+relation);
    System.out.println("DOB="+DOB);
    System.out.println("qualification="+qualification);
    System.out.println("gender="+gender);


	}
	public static void main(String[] args) 
	{
		System.out.println("i am user");
		application("Ayath",123456789L,"@gmail.com","father",14,"bacholers",'m');
	}
}

