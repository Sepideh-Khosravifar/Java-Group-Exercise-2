package com.syntax.groupProjectII;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenShot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Chrome Driver opens");
    }

    @Override
    public void close() {
        System.out.println("Chrome Driver closes");
    }

    @Override
    public String getTitle() {

        return "Title Chrome Driver" ;
    }

    @Override
    public void navigate() {
        System.out.println("navigates to Chrome Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome Driver takes a screenshot");
    }
}
class FireFoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("FireFox Driver opens");
    }

    @Override
    public void close() {
        System.out.println("FireFox Driver closes");
    }

    @Override
    public String getTitle() {

        return "Title FireFox Driver";
    }

    @Override
    public void navigate() {
        System.out.println("navigates to FireFox Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("FireFox Driver takes a screenshot");
    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("opens Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("closes Safari Driver");
    }

    @Override
    public String getTitle() {

        return "Title Safari Driver";
    }

    @Override
    public void navigate() {
        System.out.println("navigates to Safari Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari Driver takes a screenshot");
    }
}
class WebDriverTester {

    public static void main(String[] args) {

        RemoteWebDriver[] driver = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (RemoteWebDriver d : driver) {
            d.open();
            d.close();
            System.out.println(d.getTitle());
            d.navigate();
            d.getScreenshot();
        }
    }
}
