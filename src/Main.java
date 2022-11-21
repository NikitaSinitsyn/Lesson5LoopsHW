public class Main {
    public static void main(String[] args) {
        // Exercise 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Exercise 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Exercise 3
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Exercise 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Exercise 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Exercise 6
        for (int i = 7; i <= 98; i = i + 7) {
            if (i < 98) {
                System.out.print(i + " ");
            } else
                System.out.println(i);
        }

        // Exercise 7
        for (int i = 1; i <= 512; i = i * 2) {
            if ( i < 512){
                System.out.print(i + " ");
            } else
                System.out.println(i);
        }

        // Exercise 8
        int moneyForSave = 29000;
        int total = 0;
        int month = 0;
        for( int i = 0; i < 12; i++){
            total = total + total/100;
            total = total + moneyForSave;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }
}