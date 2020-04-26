public class N1021Solution {
    public static void main(String[] args) {
        String b = "((((((((()((((())(())";
        System.out.println( remov(b));
    }
    public static String removeOuterParentheses(String S) {
                StringBuilder a = new StringBuilder();
                int level = 0;
                for (char c : S.toCharArray()) {
                    if (c == ')') --level;
                    if (level >= 1) a.append(c);
                    if (c == '(') ++level;
                }
                return a.toString();
    }

    public static String remov(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
}
