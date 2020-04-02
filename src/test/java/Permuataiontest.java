
public class Permuataiontest {

    public static void main(String[] args) {
        Permutation permutation=new Permutation();
//        String s1 = "ab";
//        String s2 = "mcfkvdkfvmdba";
        String s1 = "test";
        String s2 = "ttes";
        if (permutation.checkInclusion(s1, s2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
