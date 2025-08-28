package StaticDemo;

class User2
{
	String username;
	static String appName="Instaclone";
	
	User2(String username)
	{
		this.username=username;
	}
	void showDetails()
	{
		System.out.println("User :"+username + ",App :"+appName);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		User2 u1=new User2("bindu");
		User2 u2=new User2("avyuu");
		u1.showDetails();
		u2.showDetails();	}

}