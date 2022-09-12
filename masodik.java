import java.util.Scanner;

public class masodik
{
    static String greeting(String name)
    {
        return "Hello"+name+"!";
    }

    public static void main(String[] args)
    {
        /*
        int a = 3;

        boolean oszthato = a % 2 == 0;
        boolean bool = false;
        
        int[] array = new int[10];
        int[] b = array;
        b[0]=10;
        

        //String s = new String("Java 17");


        String s = "Java 17";

        s.charAt(2);
        System.out.println(s.charAt(2));

        s = "asd" + "dsa";
        s += "asdasd";
        System.out.println(s);
        
        String s = "Java 17";

        String s1 = s.substring(0,4);

        System.out.println(s1);
        */
        /*
        String s1 = "sajtos kifli";

        System.out.println(s1.substring(7));
        System.out.println(s1.substring(0,6).toUpperCase());
        

        String s1 = "Java";
        System.out.println(s1.length()); 
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf("va"));
        System.out.println(s1.indexOf('x'));


        //s1 = "         Java       17      ";

        //System.out.println(s1.trim());

        System.out.println(s1.startsWith("Ja"));
        System.out.println(s1.endsWith("va"));


        //System.out.println(s1.replace("Java", "C#"));
        
        Sting s3 = "Java" + 17;
        System.out.println(s3);

        




        String name = "Mate";
        int age = 20;
        String school ="DEIK";
        //Név (életkor), suli
        //System.out.println(name+" ("+age+"), "+school);

        System.out.printf("%s (%d), %s\n",name ,age, school);
        



        Scanner scanner = new Scanner(System.in);

        //String s =scanner.nextLine();
        String s1 = scanner.next();
        System.out.println(s1);


        scanner.close();
        */

        System.out.println("Add meg a nevedet!");

        Scanner scanner1 = new Scanner(System.in);
        String s2 = scanner1.nextLine();
        System.out.println("Szia "+s2+"!");

        scanner1.close();


    }

}