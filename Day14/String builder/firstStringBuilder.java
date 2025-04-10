class firstStringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonny");
        //charAt
        System.out.println(sb.charAt(0));
        //setCharAt
        sb.setCharAt(0, 's');
        System.out.println(sb);
        //insert
        sb.insert(0, "T");
        System.out.println(sb);
        //delete 
        sb.delete(0,3);
        System.out.println(sb);
        sb.insert(0, 'S');
        sb.insert(1, 'u');
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);
        //append
        sb.append(" is Bright");
        System.out.println(sb);
    }
}
