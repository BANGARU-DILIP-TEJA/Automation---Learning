public class substrings {
        public static void main(String[]args)
        {
            String a="ABABCb ABAbcb babcb".toLowerCase(),l="",m="";
            int n=3;;//length of the common substring
            String b[]=a.toLowerCase().split(" ");

            int k=b.length;

            for(int i=0;i<b[0].length();i++)
            {
                for(int j=i+n;j<=b[0].length();j++)
                {
                   l=b[0].substring(i,j);
int h=0;
                   for(int o=1;o<k;o++)
                   {
                       if(b[o].contains(l))
                         h++;
                   }

                   if(h==(k-1))
                    m+=l+" ";

                i+=1;

                }
            }
if(m.length()>0)
System.out.println(m);
else
    System.out.println("No Substrings");
        }
}
