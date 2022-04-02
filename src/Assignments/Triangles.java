package Assignments;

public class Triangles {
    public static void main(String... args){
        int n = 10;
        for(int j=1;j<=n;j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

       for(int j=1;j<=n;j++) {
          for (int i = 1; i <= j; i++) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j=1;j<=n;j++) {
            for (int i = j; i <= n; i++) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
        System.out.println();


        for(int j=1;j<=n;j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("*  ");
            }
            for (int i = j; i <= n; i++) {
                System.out.print("#  ");
            }
            for (int i = j; i <= n; i++) {
                System.out.print("*  ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j=1;j<=n;j++) {
            for (int i = j; i <= n; i++) {
                System.out.print("*  ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("#  ");
            }
            System.out.println();
        }
        System.out.println();




        for(int j=1;j<=n;j++) {
            for (int i = j; i <= n; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <=j ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j=1;j<=n;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("  ");
            }
            for (int i = j; i <=n ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for(int j=1;j<=n;j++) {
            for (int i = j; i <=n ; i++) {
                System.out.print("*  ");
            }
            for (int i = 1; i <=j ; i++) {
                System.out.print(" ");
            }
            System.out.println();
        }



        for(int j=1;j<=n;j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            for (int i = j; i <n ; i++) {
                System.out.print("  ");
            }
            for (int i = j; i <=n ; i++) {
                System.out.print("* ");
            }
            for (int i = 1; i < j; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i < j; i++) {
                System.out.print("  ");
            }
            for (int i = j; i <=n ; i++) {
                System.out.print("* ");
            }
            for (int i = j; i <n ; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



        for(int j=1;j<n;j++){
            for(int i=j;i<=n;i++){
                System.out.print("  ");
            }
            for(int i=1;i<j;i++){
                System.out.print("* ");
            }
            for(int i=1;i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=1;j<=n;j++){
            for(int i=1; i<=j; i++){
                System.out.print("  ");
            }
            for(int i=j; i<=n;i++){
                System.out.print("* ");
            }
            for(int i=j; i<n;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
