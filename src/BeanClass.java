public class BeanClass {
    private final String property1;
    private final String property2;
    private final int intProperty;

    public BeanClass(String property1, String property2, int intProperty) {
        this.property1 = property1;
        this.property2 = property2;
        this.intProperty = intProperty;
    }

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public int getIntProperty() {
        return intProperty;
    }
}