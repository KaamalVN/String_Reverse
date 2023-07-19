import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(reverse_string(input));
    }

    static String reverse_string(String input) {
        String result="";
        for(int i=0;i<input.length();i++){
            char c = input.charAt(input.length()-1-i);
            result+=c;
        }
        return result;
    }
}
