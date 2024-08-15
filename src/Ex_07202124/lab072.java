package Ex_07202124;

public class lab072 {
    public static void main(String[] args) {
        String s ="banana";
        for (int i=0;i<s.length(); i++){
            char c =s.charAt(i);
            if (c=='a'){
                continue;
            }
            System.out.print(c);

        }
    }
}
