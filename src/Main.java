import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        ArrayList<String> arr = new ArrayList<>();
        int sum = 0;

        s = sc.nextLine();
        s = s.concat("_");

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == 'o' && s.charAt(i + 1) == 'o') {
                sum += 1;
                arr.add("oo");
                i += 1;
            } else if (s.charAt(i) == 'e' && s.charAt(i + 1) == 'e') {
                sum += 1;
                arr.add("ee");
                i += 1;
            } else if (s.charAt(i) == 'd' && s.charAt(i + 1) == 'd') {
                sum += 1;
                arr.add("dd");
                i += 1;
            } else if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'a') {
                sum += 1;
                arr.add("aa");
                i += 1;
            } else if (s.charAt(i) == 'w') {
                sum += 1;
                arr.add("w");
            } else if (s.charAt(i + 1) == 'w') {
                switch (s.charAt(i)) {
                    case 'a':
                        sum += 1;
                        arr.add("aw");
                        i += 1;
                        break;
                    case 'o':
                        sum += 1;
                        i += 1;
                        arr.add("ow");
                        break;
                    default:

                        break;
                }
            }
        }
        s = s.substring(0, s.length()-1);

        System.out.print(sum + " (");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
            if (i != arr.size() - 1)
                System.out.print(", ");
        }
        System.out.print(")");
    }
}