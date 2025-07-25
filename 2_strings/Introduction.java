public class Introduction {
    public static void main(String[] args) {

        // ----------------------------create string using string literal-----------------------
        String s1 = "First string"; // stored in string pool

        String s = "hello";
        // for(int i=0; i<100; i++){
        // s += "x";
        // System.out.println(s);
        // }
        // -----------------------------Using the new keyword------------------------------
        String s2 = new String("First string"); // made with new keyword so stored in heap
        String s3 = new String("Second string");
        String s4 = "   try n o t to get hurt here ";
        String s5 = "first String";
        String s6 = "Apple";
        String s7 = "Banana";

        // --------------------getting character ----------------
        char ch = s1.charAt(3);

        // --------------------getting length ----------------------
        // System.out.println(s1.length());

        // --------------------getting substring----------------------
        // System.out.println(s1.substring(3));
        // System.out.println(s1.substring(0, 7));

        // ---------------------lower & uppercase ----------------------
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());

        // -------------------------trim ------------------------
        // System.out.println(s4.trim());

        // ---------------------compare strings ------------------------
        // System.out.println(s1 == s2); // false as it compare references

        boolean k = s1.equals(s5); // equal compares content not memory references
        // System.out.println(k);

        // System.out.println(s1.equalsIgnoreCase(s5));

        // ----------------lexicographically (like dictionary order)----------------------
        // System.out.println(s1.compareTo(s2)); // o/p 0
        // System.out.println(s6.compareTo(s7)); // B comes before A in ASCII codes. O/P -> -ve
        // System.out.println(s7.compareTo(s6)); // O/P -> +ve

        // ----------------concatination ----------------
        // System.out.println(s1 + s);
        // System.out.println(s1.concat(s));

        // -------------------------------- STRING BUILDER --------------------------------------
        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" ");
        sb.append("Rocks");
        String str = sb.toString(); // converts stringbuilder to string
        // System.out.println(str); // Java Rocks

        // --------------------------- CONVERT STRING TO CHAR ARR --------------------------
        char[] chr = str.toCharArray();
        for(char c : chr){
            // System.out.println(c + " ");
        }

        // --------------------------- CONVERT CHAR ARR TO STRING --------------------------
        // ---------new String(charArray)-----------
        String str1 = new String(chr);
        System.out.println(str1);
        
        //---------- Using String.valueOf(charArray) ----------
        String str2 = String.valueOf(chr);
        System.out.println(str2);
}
}
