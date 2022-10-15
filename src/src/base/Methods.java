package base;

public class Methods {

    public static void main(String[] args){
        int result;
        result = getSum(1, 10);
        System.out.println(result);

        result = getSum(5,100,66);
        System.out.println(result);

        sayHello("Petya");
        sayHello("Vasya", "Vanya");
        sayHello();

        int[] array = {1, 22, 52, 34, 16};

        int sumArray = getSum(array, "Oleg");

        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(10, 150);
        System.out.println(sum);
        System.out.println(getSum(2, 11));

        showSum(10, 51, 77);
        showSum(5,12, 14);
        saySmth();
        saySmth();

        sayHello("Petya");
        String name = "Vasya";
        sayHello("Vasya");

        showSumToPerson("Vanya", 15, 11, 33);
    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }

    static int getSum(int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }


    static void showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is:" + sum);
    }

    static void saySmth(){
        System.out.println("Hello");
        System.out.println("I'm running");

    }

    static void sayHello(String name) {
        System.out.println("Hello " + name +"!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    static void sayHello(String name1, String name2) {
        System.out.println("Hello " + name1 +"!");
        System.out.println("Hello " + name2 +"!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }
    static void sayHello() {
        System.out.println("Hello");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }


    static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of program");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program!");
    }
}
