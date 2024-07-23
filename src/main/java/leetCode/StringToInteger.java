package leetCode;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("1337c0d3"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.trim().isEmpty()) return 0;

        char[] characters = s.toCharArray();
        StringBuilder numb = new StringBuilder();
        boolean hasDigit = false;
        boolean hasSign = false;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isDigit(characters[i])) {
                numb.append(characters[i]);
                hasDigit = true;
            } else if ((characters[i] == '-' || characters[i] == '+') && !hasDigit && !hasSign) {
                numb.append(characters[i]);
                hasSign = true;
            } else if (Character.isSpaceChar(characters[i])) {
                continue;
            } else if (!hasDigit && Character.isLetter(characters[i])){
                numb.append("0");
                break;
            } else {
                break;
            }
        }
        return Integer.parseInt(numb.toString());
    }
}
