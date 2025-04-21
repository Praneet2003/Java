import java.io.*;
class writing_fibonacci_in_file{
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));
        String line;
        while((line = reader.readLine())!=null){
            int n = Integer.parseInt(line.trim());
            int a = 0,b=1;
            writer.write("Fibonacci Series for n = "+n+": ");
            for(int i=0;i<n;i++){
                writer.write(a+" ");
                int next = a+b;
                a = b;
                b = next;
            }
            writer.write("\n");
        }
        System.out.println("Output printed to output2.txt");
        writer.close();
        reader.close();    
    }
}