import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        System.out.println("\nPattern 1:");
        pattern1(n);

        System.out.println("\nPattern 2:");
        pattern2(n);

        System.out.println("\nPattern 3:");
        pattern3(n);

        System.out.println("\nPattern 4:");
        pattern4(n);

        System.out.println("\nPattern 5:");
        pattern5(n);

        System.out.println("\nPattern 6:");
        pattern6(n);

        System.out.println("\nPattern 7:");
        pattern7(n);

        System.out.println("\nPattern 8:");
        pattern8(n);

        System.out.println("\nPattern 9:");
        pattern9(n);

        System.out.println("\nPattern 10:");
        pattern10(n);

        System.out.println("\nPattern 11:");
        pattern11(n);

        System.out.println("\nPattern 12:");
        pattern12(n);

        System.out.println("\nPattern 13:");
        pattern13(n);

        System.out.println("\nPattern 14:");
        pattern14(n);

        System.out.println("\nPattern 15:");
        pattern15(n);

        System.out.println("\nPattern 16:");
        pattern16(n);

        System.out.println("\nPattern 17:");
        pattern17(n);

        System.out.println("\nPattern 18:");
        pattern18(n);

        System.out.println("\nPattern 19:");
        pattern19(n);

        System.out.println("\nPattern 20:");
        pattern20(n);

        System.out.println("\nPattern 21:");
        pattern21(n);

        System.out.println("\nPattern 22:");
        pattern22(n);

        System.out.println("\nPattern 23:");
        pattern23(n);

        System.out.println("\nPattern 24:");
        pattern24(n);

        sc.close();
    }


    public static void pattern1(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern10(int n) {

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern11(int n) {

        for(int i=1;i<=2*n-1;i++){

            int stars=i;

            if(i>n){
                stars=2*n-i;
            }

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern12(int n) {

        for(int i=1;i<=n;i++){

            int num=1;

            if(i%2==0){
                num=0;
            }

            for(int j=1;j<=i;j++){

                System.out.print(num);

                num=1-num;
            }

            System.out.println();
        }
    }

    public static void pattern13(int n) {

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void pattern14(int n) {
        int num = 1;
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <=i;j++) {
                System.out.print(num+" ");
                num++;
            }
        System.out.println();
        }
    }

    public static void pattern15(int n) {
        for(int i=0; i<n; i++) {
            for(char j = 'A'; j<='A' + i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for(int i=n; i>0; i--) {
            for(char j = 'A'; j<='A' + i - 1;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        char chr= 'A';
        for(int i = 0; i<n;i++) {
            for(int j = 0;j <= i; j++) {
                System.out.print(chr);
            }
        System.out.println();
        chr++;
        }
    }

    public static void pattern18(int n) {
    for(int i = 0; i < n; i++) {

        for(int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        // Increasing letters
        for(char k = 'A'; k <= 'A' + i; k++) {
            System.out.print(k);
        }

        // Decreasing letters
        for(char k = (char)('A' + i - 1); k >= 'A'; k--) {
            System.out.print(k);
        }

        System.out.println();
    }
    }

    public static void pattern19(int n) {
        for(int i=0;i<n;i++) {
            for(char k = (char)('A' + i -1); k >= 'A'; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
       for(int i=0;i<n;i++) {
         for(char k = (char)('A' + n -1 - i); k <= 'A' + n -1 ; k++){
            System.out.print(k);
            }
            System.out.println();
         }
    }

    public static void pattern21(int n) {
    for (int i = 0; i < 2 * n; i++) {

        int stars;
        if (i < n) {
            stars = n - i;
        } else {
            stars = i - n + 1;
        }

        // left stars
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }

        // spaces
        for (int j = 0; j < 2 * (n - stars); j++) {
            System.out.print(" ");
        }

        // right stars
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
    }

    public static void pattern22(int n) {
        for(int i = 0; i < 2*n; i++) {
            int stars;
            if(i < n) {
                stars = i +1;  
            }
            else {
                stars = (2*n - i -1);
            }

            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            for(int j = 0; j <2*(n- stars); j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern23(int n) {
        for(int i = 0; i<n;i++) {
            for(int j = 0; j< n;j++) {
                if(i==0 | j ==0 | i == n -1 | j == n-1) {
                System.out.print(" * ");
                }
                else {System.out.print("   ");

                }
            }
            System.out.println();
        }   
    }

    public static void pattern24(int n) {
        for(int i = 0; i<2*n - 1;i++) {
            for(int j = 0; j<2*n - 1;j++) {
                int top = i;
                int left = j;
                int right = (2*n - 2) -j;
                int bottom = (2*n - 2) -i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(n-min);
            }
            System.out.println();
        }
    }
}