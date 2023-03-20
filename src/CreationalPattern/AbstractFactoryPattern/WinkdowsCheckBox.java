package CreationalPattern.AbstractFactoryPattern;

public class WinkdowsCheckBox implements CheckBox {
    @Override
    public void click() {
        System.out.println("Windows CheckBox Clicked");
    }
}
