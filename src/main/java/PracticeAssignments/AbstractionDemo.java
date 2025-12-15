package PracticeAssignments;

public class AbstractionDemo {

    public static void main(String[] args) {
        Browser chrome = new ChromeBrowser();
        Browser firefox = new FirefoxBrowser();

        chrome.launch();
        firefox.launch();

        WebActions actions = new WebDriverActions();
        actions.click();
        actions.sendKeys("Hello from automation");
    }
}

abstract class Browser {
    abstract void launch();
}

class ChromeBrowser extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Chrome browser");
    }
}

class FirefoxBrowser extends Browser {
    @Override
    void launch() {
        System.out.println("Launching Firefox browser");
    }
}

interface WebActions {
    void click();

    void sendKeys(String text);
}

class WebDriverActions implements WebActions {
    @Override
    public void click() {
        System.out.println("Click action performed");
    }

    @Override
    public void sendKeys(String text) {
        System.out.println("Typing text: " + text);
    }
}

