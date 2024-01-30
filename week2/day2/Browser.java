
package week2.day2;


public class Browser {
	public  String launchBrowser(String BrowserName)
	{
		System.out.println("Browser launched successfully" + BrowserName);
		return BrowserName;
	}
	public void loadURL ()
	{
		System.out.println("Application URL loaded successfully");
	}
	



public static void main(String[] args)
{
Browser B = new Browser();
B.launchBrowser("FireFox");
B.loadURL();
}
}