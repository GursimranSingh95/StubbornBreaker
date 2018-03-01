import java.io.*;
import java.util.*;

class Demo implements java.io.Serializable
{
    public int a;
    public String b;

    // Default constructor
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }

}

public class Serial {
    public static void main(String[] args)
        {
            Scanner scn = new Scanner(System.in);
            String filename = "Serialization.txt";
            try {
                System.out.print("Enter Your Roll Number:-");
                int num = scn.nextInt();
                System.out.print("Enter Your Name:-");
                String Nam = scn.next();
                Demo object = new Demo(num,Nam);
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(object);
                out.close();
                file.close();
                System.out.println("Object has been serialized");

            } catch (IOException ex) {
                System.out.println("IOException is caught");
            }


            Demo object1 = null;

            try {

                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);
                object1 = (Demo) in.readObject();
                in.close();
                file.close();
                System.out.println("Object has been deserialized ");
                System.out.println("a = " + object1.a);
                System.out.println("b = " + object1.b);
            } catch (IOException ex) {
                System.out.println("IOException is caught");
            } catch (ClassNotFoundException ex) {
                System.out.println("ClassNotFoundException is caught");
            }

        }
    }

