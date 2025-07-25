
import java.util.HashMap;


public class Questions {

    public static String reverseStr(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }

    public static void reverseStr2(String str) {
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        str = s.toString();
        System.out.println(str);
    }

    public static void reverseStr3(String str) {
        // converting str to chr array
        char[] ch = str.toCharArray();

        for (int i = 0, j = ch.length - 1; i < (ch.length / 2); i++, j--) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        // converting ch array back to string
        String st = new String(ch);
        System.out.println(st);
    }

    public static void reverseWordByWord(String str) {
        String[] words = str.split(" ");
        StringBuilder s = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            s.append(words[i]).append(" ");
        }
        System.out.println(s);
    }

    public static void isPalindrome(String str) {
        String s = reverseStr(str);

        if (s.equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void isPalindrome2(String str) {
        StringBuilder s = new StringBuilder(str);
        String reversed = s.reverse().toString();
        if (reversed.equals(str)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void isPalindrome3(String str) {
    StringBuilder s = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (Character.isLetterOrDigit(ch)) {
            s.append(Character.toLowerCase(ch));
        }
    }

    String newS = s.toString();
    String reversedStr = s.reverse().toString(); 

    System.out.println(newS.equals(reversedStr));
    }

    public static void isPalindrome4(String str){
        str = str.toLowerCase().trim();
        int si = 0, ei = str.length()-1;

        while(si <= ei){
            char start = str.charAt(si);
            char end = str.charAt(ei);
            if(!Character.isLetterOrDigit(start)){
                si++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                ei--;
                continue;
            }
            if(start != end){
                System.out.println(false);
                return;
            }
            si++; ei--;
        }
        System.out.println(true);
    }

    public static void countVowelConsonent(String str) {
        str = str.toLowerCase();
        int vowel = 0, consonents = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonents++;
                }
            }
        }
        System.out.println("Vowels:" + vowel + " & Consonents:" + consonents);
    }

    public static void charCounter(String str){
        HashMap<Character, Integer> list = new HashMap<>();
        str = str.toLowerCase();
        int si = 0;
        while(si <= str.length() - 1){
            char start = str.charAt(si);

            if(Character.isLetterOrDigit(start)){
                list.put(start, list.getOrDefault(start, 0)+ 1);
            }
            si++;
        }
        list.forEach((key, value) -> System.out.println(key+ " ->" + value));
    }

    public static void firstNonRepeating(String str){
        charCounter(str);
    }

    public static void addNumString(String str){
        
    }
    public static void main(String[] args) {
        String str = "Gurbani";
        String str1 = "Gurbani Saroy is here guys!";
        String str2 = "madam";
        String str4 = "A man, a plan, a canal: Panama";
        String str5 = "programming";
        String s = "1232";
        String s1 = "435";

        // reversing sting ------------------
        // revserseStr(str); // brute-force
        // reverseStr2(str); //string-builder
        // reverseStr3(str1); //convert to char arr and then swap positions

        // reverse-word by word ---------------------
        // reverseWordByWord(str1);

        // palindrome -------------------------
        // isPalindrome(str2); //using reverse method
        // isPalindrome2(str2); //using stringBuilder
        // isPalindrome4(str4); // using 2 pointer

        // leetcode 125 ------------------------
        // isPalindrome3(str4);

        // count vowels and consonants ------------
        // countVowelConsonent(str1);

        //character counter--------------
        // charCounter(str4);

        //find the First Non-Repeating Character in a String ----------------
        // firstNonRepeating(String)

        // add 2 number string ----------------
        addNumString(s, s1);
    }
}
