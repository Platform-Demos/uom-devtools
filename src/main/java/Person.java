
/**
 * @author : Padmaka Wijayagoonawardena
 * @date : 3/1/17
 */
public class Person {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}