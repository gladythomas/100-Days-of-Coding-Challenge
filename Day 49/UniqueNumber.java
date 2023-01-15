import java.util.Scanner;
class UniqueNumber{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int lower=sc.nextInt();
    int upper=sc.nextInt();
    int count=0;

    for(int j=lower;j<upper;j++){
        int q=j/10;
        int rem=j%10;
        if(q!=rem){
            count++;
        }
    }
    System.out.println(count);
    }
}