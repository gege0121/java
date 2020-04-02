class Demo1{
    String name; 
    int age; 
    String college; 
    String course; 
    String address;
    public Demo1(String name, int age, String college, String course, String address) {
        this.name = name; 
        this.age = age; 
        this.college = college; 
        this.course = course; 
        this.address = address; 
    } 
public static void main(String[] args) {
        Demo1 b= new Demo1("Gulpreet Kaur", 21, "BIT MESRA", "M.TECH", "Kiriburu");
        System.out.println(b); 
        System.out.println(b.toString()); 
    } 
} 

