package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		return browserName;
		
	}
	public String loadUrl(String url) {
		return url;
	}
	public static void main(String[] args) {
		Browser brw=new Browser();
		System.out.println(brw.launchBrowser("Browser launched successfully"));
		System.out.println(brw.loadUrl("Application url loaded successfully"));
				

	}}

	