import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a  = 5 ;
//        int b = 10 ;
//        System.out.println(a + b + 15);

        Scanner scanner = new Scanner(System.in);
//        double a = 9.7;
//        double result = Math.floor(a);
//        System.out.println( a - result );

        Random random = new Random();
//        int a = random.nextInt(10);
//        int b = random.nextInt(10);
//        int c= random.nextInt(10);
//        System.out.println(a+","+b+","+c);
//        System.out.println(a+b+c);
//        System.out.println((a+b+c)/(float)3);

//        int chas = scanner.nextInt();
//        int min = scanner.nextInt();
//        int sek = scanner.nextInt();
//        System.out.println(sek * 1 + min * 60 + chas * 3600 );

//        int scan = scanner.nextInt();
//        int scan3 = scan%10;
//        int scan2 = scan/10%10;
//        int scan1 = scan/100;
//        System.out.println( scan1 + "," + scan2 + ","+scan3 );

//        int scan1 = scanner.nextInt();
//        int scan2 = scanner.nextInt();
//        int scan3 = scanner.nextInt();
//        if ( scan1>scan2 && scan1>scan3) {
//        System.out.println(scan1);
//        }else if(scan2>scan1 && scan2>scan3){
//        System.out.println(scan2);
//        }else {
//        System.out.println(scan3);
//        }

//        while (true) {
//        int scan = scanner.nextInt();
//        int counter = 0;
//        while (scan > 0) {
//        scan /=10;
//        counter++;
//        }
//        System.out.println(counter);
//        }

//        int san1 = scanner.nextInt();
//        int san2 = scanner.nextInt();
//        san1++;
//        while (san1 < san2) {
//                System.out.println(san1 + "*" + san1 + "=" + san1 * san1);
//                san1++;
//        }

//        int scan = scanner.nextInt();
//        int counter = 0;
//        while (counter<=scan){
//            System.out.print(counter + " ");
//            counter +=2;
//        }

//        int san;
//        do {
//            System.out.println("San jazynyz : ");
//            san = scanner.nextInt();
//        }while (san >= 0);
//        System.out.println("Salamatta kalynyz");

//        int input = scanner.nextInt();
//        int counter=0;
//        int score=0;
//        while (counter<input){
//            counter++;
//            score=score+counter;
//        }
//        System.out.println(score);

//        int input = scanner.nextInt();
//        int result1 = 0;
//        int result2 = 0;
//        while (input>0) {
//            result1 = input % 10;
//            result2 = input / 10 % 10;
//            input = input / 10;
//        if (result1 == result2) {
//                System.out.println("bar");
//            } else {
//                System.out.println("jok");
//            }

//        int san = scanner.nextInt();
//        int counter = 0;
//        while (counter<10){
//            counter++;
//            System.out.println(san + "*" + counter + "=" + san*counter);
//        }

//        for (int i = 1; i <=10; i++) {
//            System.out.println(4*i);
//        }

//        int facto = scanner.nextInt();
//        for (int i = 1; i <=facto; i*=i) {
//            System.out.println(i);
//        }

//        for (int i = 10; i > 1  ; i--) {
//            System.out.println(i*i);
//        }

//        int counter = 1;
//        for (int i = 1; i <=6; i++) {
//            counter*=i;
//            System.out.println(counter);
//        }

//        int [] massiv = new int[20];
//        int summa1 = 0;
//        int summa2 = 0;
//        int conter1 = 0;
//        int conter2 = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            int randomNumber = random.nextInt(100);
//            massiv[i] = randomNumber;
//            if (randomNumber>=50){
//                summa1 += randomNumber;
//                conter1++;
//            }else if(randomNumber<50){
//                summa2  +=randomNumber;
//                conter2++;
//            }
//        }
//        System.out.println(summa1/(double)conter1);
//        System.out.println(summa2/(double)conter2);

//        int [] massiv = new  int[10];
//        int counter = 1;
//        for (int i = 0; i < 10; i++) {
//            massiv[i]+=counter;
//            counter++;
//            if (massiv[i]%2==0){
//                System.out.println(massiv[i]);
//            }
//        }

//        for (int i = 2; i <10 ; i++) {
//            for (int j = 1; j <10 ; j++) {
//                System.out.println(i + "*" + j + "=" + i*j);
//            }
//        }

//        int a=8;
//        int b=5;
//        int c=9;
//        if (a > b && b > c) {
//            System.out.println(c + "," + b + "," + a);
//        } else if (c > b && b > a) {
//            System.out.println(a + "," + b + "," + c);
//        } else if (b > c && c > a) {
//            System.out.println(a + "," + c + "," + b);
//        } else if (b > a && a > c) {
//            System.out.println(c + "," + a + "," + b);
//        }else if (b < c && c < a) {
//            System.out.println(b + "," + c + "," + a);
//        }else if (b < a && a < c) {
//            System.out.println(b + "," + a + "," + c);
//        }

//        int a = 5;
//            for (int i = 1; i <= a; i++) {
//                System.out.print("*");
//            }

//        int[] massiv = new int[10];
//        for (int i = 0; i < 10; i++) {
//            massiv[i] = random.nextInt(100);
//        }
//        int max = massiv[0];
//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i] > max) {
//                max = massiv[i];
//            }
//        }
//        System.out.println("max= " + max);
//        int min = massiv[0];
//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i] < min) {
//                min = massiv[i];
//            }
//        }
//        System.out.println("min= " + min);

//        int num = scanner.nextInt();
//        if(num %2==0){
//            System.out.println( "Жуп сан");
//        } else System.out.println( "Так сан");

//        int san = 0 ;
//        for (int i = 1; i <=120; i++) {
//            if (i%3==0&&i%4==0&&i%5==0){
//                System.out.println(i);
//                san=san+i;
//            }
//        }System.out.print("summa "+san);

//            www(3,6,8,0,3,6,32,6,7,8,9,8,7,6);public static  void www(int...var){
//            for (int counter:var) {
//                System.out.println(counter);
//            }
//            }

        String soz = scanner.nextLine();
        www(soz);
    }
        public static void www(String soz){
        soz.trim();
        int index = 0 ;
        if (soz.contains("a")){
            index=soz.indexOf("a");
                System.out.println(soz.substring(0,index));
        }else System.out.println("Anday tamga jok");
        }

}