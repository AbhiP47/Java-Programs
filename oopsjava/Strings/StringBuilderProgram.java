package oopsjava.Strings;

public class StringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" ");
        str.append("World");
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.append('h');
        System.out.println(str);
        System.out.println(str.length());
        str.deleteCharAt(13);
        System.out.println(str);
        str.delete(11,14);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        str.insert(6,"java ");
        System.out.println(str);
        str.replace(6, 11, "Universe");//Replaces characters from index 6 to 10 with "Universe"

        // converting StringBuilder to String

        String sb = str.toString();
        sb.toUpperCase();
        System.out.println(sb);

    }
}
