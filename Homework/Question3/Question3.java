import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        int s2=1;
        int s1=0;
        int temp;
        System.out.println("Enter the number");
        number=scan.nextInt();
        for(int i=1;i<=number;i++){
            System.out.print(s1 + " ");
            temp=s1+s2;  
            s1=s2;
            s2=temp;

    }
}
}