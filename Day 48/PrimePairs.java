import java.util.Scanner;
import java.util.ArrayList;
class PrimePairs{

    public static boolean isPrime(int n) {
        if(n == 1) return false;
       
       for(int i=2;i*i<=n;i++) {
           if(n % i == 0) return false;
       }
       
       return true;
   }
   
   public static void main(String[] args) {
    ArrayList<Integer> a=new ArrayList<Integer>();
       Scanner scn = new Scanner(System.in);
       int low = scn.nextInt();
       int high = scn.nextInt();
       
       for(int i=low;i<=high;i++) {
           if(isPrime(i)) {
            a.add(i);
            System.out.println(i);
           }
       }        
        for(int i=0;i<a.length;i++){
            System.out.println(a(i));
        }
        }
    }
