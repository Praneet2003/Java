class String_methodsindexOf{
    public static void main(String[] args) {
        // 10. indexOf():- it returns the index of first charcter from the first occurence of substring.
        String name = "Harryrry";
        System.out.println(name.indexOf("rry"));
        // 11. 10. indexOf(string s,int startindex):- it returns the index of first charcter from the first 
        //occurence of substring after the starting index.
        System.out.println(name.indexOf("rry",3));// after index 3.
        String a = "Hello word world";
        System.out.println(a.indexOf("wor",6));
        // 11. lastIndexOf():- returns the index of firstcharcter from the last occurence of substring.
        String a1 = "apple apple maple";
        System.out.println(a1.lastIndexOf("ple"));
        String a2 = "apple apple apple";
        System.out.println(a2.lastIndexOf("ple",8));
        String a3 = "Praneet aur Nraneet";
        System.out.println("Lastindex: "+a3.lastIndexOf("ee",18));

    }
}