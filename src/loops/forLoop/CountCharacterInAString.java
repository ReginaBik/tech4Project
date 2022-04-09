package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {
        String s = "TechGlobal School";
        int count = 0;

        for (int i = 0; i < s.length(); i++ ) {
            if (s.charAt(i) == 'o') count++;
        }
            System.out.println(count);

 }
}
