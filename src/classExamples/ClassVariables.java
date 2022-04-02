package classExamples;

public class ClassVariables {
    private  static int acTemperature;
    private String name;
    private int age;

    public static int getAcTemperature() {
        return acTemperature;
    }

    public static void setAcTemperature(int acTemperature) {
        ClassVariables.acTemperature = acTemperature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

    }
}
