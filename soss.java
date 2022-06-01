import java.util.Scanner;
public class soss {

    int x = 1;
    public static void main(String args[]) {
        System.out.println("Say: Hello!", x);
        //type identifier = new type();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        System.out.println(name);
    }
}
