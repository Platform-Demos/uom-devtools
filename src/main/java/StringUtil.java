
/**
 * @author : Padmaka Wijayagoonawardena
 * @date : 3/1/17
 */
public class StringUtil {

    public static void main(String[] args) {

        StringUtil stringUtil = new StringUtil();
        System.out.println(stringUtil.checkStringAndPrint("name"));
    }

    public Person checkStringAndPrint(String str) {
        Person person = null;

        //comment
        if (str == null) {
            throw new IllegalArgumentException();
        } else {
            person = new Person();
            person.setName(str);
        }

        return person;
    }
}
