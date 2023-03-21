//Create class Example
class Test {
    //create two static variable and assign value on variable a
    static int a = 10;
    static int b;

    //create a static block and initialize value of b
    static {
        b = a * 10;
        System.out.println("Value of b is :" + b);
    }

    //create a static method, and it performs sum operation.
    static void sum() {
        int c = a + b;
        System.out.println("Sum of 2 variable is :" + c);
    }
}

//Create a class main and
class Main {
    public static void main(String[] args) {
        //We  cannot create an object of Test class we directly call static method and print static value.
        //print static instance variable value
        System.out.println("Value of a is : " + Test.a);
        //call static method with classname Test.
        Test.sum();
    }
}