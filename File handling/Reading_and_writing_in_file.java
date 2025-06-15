import java.io.*;
class Reading_and_writing_in_file{
    public static void main(String[] args)throws IOException{
        FileReader f = new FileReader("new.txt");
        BufferedReader r= new BufferedReader(f);
        FileWriter f2 = new FileWriter("output.txt");
        BufferedWriter w= new BufferedWriter(f2);
        String line = r.readLine();
        w.write(line);
        System.out.println("Writing into file output.txt");
        r.close();
        f.close();
        w.close();
        f2.close();
    }
}