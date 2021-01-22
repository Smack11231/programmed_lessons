public class Tester {
    public static void main(String[] args) {
        Class_1 class1 = new Class_1(1,2);
        Class_2 class2 = new Class_2(1,2,3);
        System.out.println(class1);
        class2.print();
        class2.set(4,5,6);
        System.out.println(class2);
    }
}