/**
 * Example of a generic method using bounded types.
 *
 * @author sm@creativefusion.net
 */
public class BoundedTypes {

    public static void main(String[] args) {
        System.out.println(add(10,30));
        System.out.println(add(10.4,30.5));
        System.out.println(add(10,30.5));
    }

    static <T extends Number> double add(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }
}
