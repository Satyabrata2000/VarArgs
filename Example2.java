package VarArgs;

public class Example2 {

    static void display(String... values){
        System.out.println("Display method invoked");
        for(String s:values){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        display();//zero argument
        display("Hello");
        display("Hello", "World", "City", "State");
    }
}
