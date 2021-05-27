import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("giai phương trình ax + b = 0");
        System.out.println("nhap a");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap b");
        int b = sc.nextInt();
        sc.nextLine();
        double kq;
        if(a==0 && b==0){
            System.out.println("phuong trinh vo so nghiem");
        }else if (a==0){
            System.out.println("phuong trinh vo nghiem");
        }else {
            kq = (double) -b/a;
            System.out.println(kq);
        }
    }
}
