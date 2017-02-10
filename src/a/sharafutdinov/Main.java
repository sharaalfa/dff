package a.sharafutdinov;

public class Main {

    public static void main(String[] args) {
        People people = new People("Марсель", 30, 1000000.0);
        //people.getClass();
        try {
            people.getClass().getConstructor();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        people.serialize("data.xml");

    // write your code here
    }
}
