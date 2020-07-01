package StringBuilder;

public class StringBuilderrr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuilder sb2 = new StringBuilder("XXX");
        System.out.println(sb2);
        System.out.println(sb2.length());

        StringBuilder sb3 = sb2.append("xxx");
        System.out.println(sb2 == sb3);

        sb3.append("a").append("b").append(777);
        sb3.reverse();
    }
}
