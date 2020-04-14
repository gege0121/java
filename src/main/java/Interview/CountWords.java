package Interview;

public class CountWords {
//    public static void main(String[] args) {
//        String s = "i am amazing";
//        System.out.println(s.trim().split(" ").length);
//    }

    public static void main(String[] args)
        {
            String str = "           Geeks     for    Geeks        ";

            // Call the replaceAll() method
            str = str.replaceAll("\\s", "");

            System.out.println(str);
        }
}
