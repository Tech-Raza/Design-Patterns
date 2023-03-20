package CreationalPattern.AbstractFactoryPattern;

public class MacCheckBox implements CheckBox {
    @Override
    public void click() {
        System.out.println("Mac CheckBox Clicked");
    }
}
