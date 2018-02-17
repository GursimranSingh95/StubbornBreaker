import java.io.*;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        try {
            FileWriter out1 = new FileWriter("C:\\MCA4\\Bin\\Vowel.txt");
            BufferedWriter out = new BufferedWriter(out1);
            Scanner obj = new Scanner(System.in);
            String str;
            System.out.print("Enter Your String");
            str = obj.nextLine();
            out.write(str);
            out.close();
            FileReader in1 = new FileReader("C:\\MCA4\\Bin\\Vowel.txt");
            BufferedReader in = new BufferedReader(in1);
            String k = in.readLine();
            System.out.println(k);
            int vowel =0;
            int j=0;
            while ((k.length()) > j ) {
                char ch;
                ch = k.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch=='E' || ch=='I' || ch=='O'||ch =='U')
                {
                    vowel++;
                }
                j++;

            }
            System.out.println("Vowel are " +vowel);
        }
            catch (FileNotFoundException e)
            {
            e.printStackTrace();
            }
            catch (IOException e1)
            {
            e1.printStackTrace();
            }
    }
}
