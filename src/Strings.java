
public class Strings {
    public static void main(String[]args)
    {
        String a="Dilip TEja!@#!@$#@%1 BA123124ngaru",b=""; int k=0,g=0;
        a=a.replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println(a);
        for(int i=0;i<=a.length();i++)
        {
            g=a.length();
            char c= a.charAt(0);
            a=a.replaceAll(a.substring(0,1),"");
            if(g-a.length()==1)
                b+=String.valueOf(c);i=0;

        }
        System.out.println(b);
    }
}
/*

public class Strings
{
   public static void main(String[]args){
    String a="Dilip",b="";
    for (int i=0;i<a.length();i++)
    { int k=0;
        for(int j=i+1;j<a.length();j++)
        {
            if(a.charAt(i)==(a.charAt(j)))
            {a.replaceAll(String.valueOf(a.charAt(j)),"");   k++;}
            System.out.println(k);
        }
        if(k<1)
        b+=String.valueOf(a.charAt(i));
    }
    System.out.println(b);
}}
*/