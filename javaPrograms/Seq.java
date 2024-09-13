import java.util.Scanner;

public class Seq{

    public static String countSeq(String a){
        
        int count = 1;
        StringBuilder r = new StringBuilder();
        System.out.println("Entered String is "+a);
        //main Business logic
        for(int i=1; i<a.length(); i++){
            if(a.charAt(i) == a.charAt(i-1)){
                count++;
            }else {
                if (count > 1) {
                    r.append(count);
                }
                r.append(a.charAt(i - 1)); 
                count = 1; 
            }
        }
        if (count > 1) {
            r.append(count);
        }
        r.append(a.charAt(a.length() - 1));

        return r.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = "";
        System.out.println("Enter the String");
        str = sc.next();
        System.out.println(Seq.countSeq(str));
        sc.close();

    }
}