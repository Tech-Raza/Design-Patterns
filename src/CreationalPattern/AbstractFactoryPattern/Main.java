package CreationalPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windows = windowsFactory.createButton();
        windows.click();

        GUIFactory macFactory = new MacFactory();
        CheckBox mac = macFactory.createCheckBox();
        mac.click();
    }
}
