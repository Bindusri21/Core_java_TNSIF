package StaticDemo;

class Game
{
	static int maxlevel;
	
	static
	{
		System.out.println("Intializating Game settings");
		maxlevel=50;
	}
	void showLevelInfo()
   {
	System.out.println("Game has "+maxlevel+"levels");	
   }
}


public class StaticBlockDemo {

	public static void main(String[] args) {
		Game g1=new Game();
		g1.showLevelInfo();
	}

}