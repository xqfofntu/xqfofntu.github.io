package Javalearn;


public class StringBuilder {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        java.lang.StringBuilder builder = new java.lang.StringBuilder();
        builder.append(str1);
        builder.append(str2);
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
