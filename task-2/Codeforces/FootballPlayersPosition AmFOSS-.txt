import java.util.*;
public class FootBallPositions{
    public static void main(String[] args){
        Scanner obj_In=new Scanner(System.in);
        //System.out.println("Enter the Players Position Now");
        String nStrg=obj_In.nextLine();
        Integer pos0=nStrg.indexOf("0000000"),pos1=nStrg.indexOf("1111111");
if(pos0!=-1 ||pos1!=-1){
    System.out.println("YES");
}
else
System.out.println("NO");
    }
    
}
