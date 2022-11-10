package VarArgs;

//varargs allows the method to accept zero or multiple arguments.
public class Example1 {

    static void display(String... values){
        System.out.println("Display method");
    }

    public static void main(String[] args) {
        display(); //zero argument
        display("Hello");
        display("This", "is", "a", "string"); //4 arguments
    }
}
