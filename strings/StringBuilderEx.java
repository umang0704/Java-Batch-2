package strings;

public class StringBuilderEx {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(20);

        s.append("rahul");
        s.trimToSize();
        System.out.println(s.capacity());
        s.deleteCharAt(0);
        s.append("rahul");
        System.out.println(s);
        s.append(12);
        System.out.println(s);
        s.insert(2, "hello");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.replace(2, 8, "india");
        System.out.println(s);
        s.delete(2, 8);
        System.out.println(s);
        //coversion from String -> StringBuilderEx and StringBuilderEx -> String
        String a = "incapp";
        StringBuilder b = new StringBuilder(a);
        String c = b.toString();

        StringBuilder s1 = new StringBuilder("Hi");
        s = new StringBuilder("Hi");
        System.out.println(s.equals(s1));
        System.out.println(s == s1);

        String a1 = s.toString();
        System.out.println(a1);
        String b1 = s1.toString();
        System.out.println(a1.equals(b1));

    }
}
