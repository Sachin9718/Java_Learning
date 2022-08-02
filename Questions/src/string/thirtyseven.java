package string;

public class thirtyseven {
    public static void main(String[] args) {
        String originalString1 = "   hello world   "; // 3 leading and trailing spaces

        String newStr = removeTrailingSpaces(originalString1);
        newStr = newStr.trim();
        System.out.println(newStr);
    }

    public static String removeTrailingSpaces(String param) {
        if (param == null)
            return null;

        int len = param.length();
        for (; len > 0; len--) {
            if (!Character.isWhitespace(param.charAt(len - 1)))
                break;
        }
        return param.substring(0, len);
    }
}
