import java.util.Scanner;
public class Sayi_Siralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter first number");
        a = inp.nextInt();
        System.out.println("Please enter second number");
        b = inp.nextInt();
        System.out.println("Please enter third number");
        c = inp.nextInt();
        if(a<b && a<c){
            if(b<c){
                System.out.println(a+"<"+b+"<"+c);
            }
            else{
                System.out.println(a+"<"+c+"<"+b);
            }
        }
        else if(b<a && b<c){
            if(a<c){
                System.out.println(b+"<"+a+"<"+c);
            }
            else{
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else{
            if(a<b){
                System.out.println(c+"<"+a+"<"+b);
            }
            else{
                System.out.println(c+"<"+b+"<"+a);
            }
        }
    }
}