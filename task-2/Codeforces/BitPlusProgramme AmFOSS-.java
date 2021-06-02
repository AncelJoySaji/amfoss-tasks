import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.*;
    public class Test {


        public static void main(String[] args) throws IOException {
            String line = "";
            String paragraph = "",ind,l,fin,s;
Integer index,i=0,li,mi,countp=0,countm=0,mip,mim,X=0,op;
            //System.out.println("Enter the text: ");
         Scanner Obj_In=new Scanner (System.in);
            ArrayList <String> num=new ArrayList<String>();
                 for(;i!=1;i=i+1){
                     line = Obj_In.nextLine();
                     num.add(line);}
                     l=num.get(0);
                     li=Integer.parseInt(l);
                      //System.out.println("Enter the text: ");
                    for(int p=0;p<li;p=p+1){
                        s=Obj_In.nextLine();
                        if(s.contains("++")){
                            countp=countp+1;
                        }
                        else{countp=countp-1;}
                       s="";
}
System.out.println(countp);

}
}
