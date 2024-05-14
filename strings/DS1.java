import java.util.*;
class DS_1 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                StringBuilder s = new StringBuilder();
                String s2 = sc.nextLine();
                s.append(s2);
                reverse1(s);
               s.reverse();
               System.out.println(s);
        }

        public static void reverse1(StringBuilder s) {
                int start = 0, end;
                for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == ' ') {
                                end = i - 1;
                                reverseEach(s, start, end);
                                start = i+1;
                        }
                }
                reverseEach(s, start, s.length() - 1);
        }

        public static void reverseEach(StringBuilder s, int start, int end) {
                char temp;
                while (start < end) {
                        temp = s.charAt(start);
                        s.setCharAt(start, s.charAt(end));
                        s.setCharAt(end, temp);
                        start++;
                        end--;
                }
        }
}
