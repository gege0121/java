import Java8.Stream.Person;

public class Main {
    public static void main(String[] args){
        Person p=new Person();
        Person gg=new Person("gg",22);
       try{
           int n=101;
           Integer[] array={0,1,2,3,4};
           int length=array.length;
           System.out.println(length);

           //if int n=101 throw exception
        p.setAge(n);
        p.setName("john","wang");
        System.out.println(p.getFName()+","+p.getAge()+","+p.getBirth());
       }
       //多个catch语句的匹配顺序非常重要，子类必须放在前面；
       catch(IllegalArgumentException e){
           System.out.println(e);

        }

//        //indexof()
//        String s = "Java8.Stream.Test string";
//        //how many "t" the string have
//        int n1 = s.indexOf('t');
//        //how many "st" the string have
//        int n2 = s.indexOf("st");
//        //staring from the 4th positon, the first position when meet "st"
//        int n3 = s.indexOf("st", 4);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
    }

//    public static void main(String[] args) {
//        Adder adder = new Adder();
//        adder.add(3)
//                .add(5)
//                .inc()
//                .add(10);
//        System.out.println(adder.value());
    }


