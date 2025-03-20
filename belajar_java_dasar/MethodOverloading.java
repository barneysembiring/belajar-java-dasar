public class MethodOverloading{

    public static void main(String[] args){
        sayHello();
        sayHello("Barney");
        sayHello("Barney", "Sembiring");
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }

    public static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}