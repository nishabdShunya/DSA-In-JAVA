public class methodParameters {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println("a = " + a + "; b = " + b);

        String name = "Nishant";
        changeName(name);
        System.out.println("name = " + name);
    }

    static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + "; y = " + y);
    }

    static void changeName(String personName){
        personName = "Dhanish";
        System.out.println("personName = " + personName);
    }
}
