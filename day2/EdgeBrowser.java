     package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser tkl=new Browser();
		System.out.println(tkl.launchBrowser("Browser launched successfully"));
		String loadUrl = tkl.loadUrl("Application url loaded successfully");
	System.out.println(loadUrl);			

	}

}
