public class StringReverse {
    public static void main(String[] args) {
        String str = "vamshinarayana";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
