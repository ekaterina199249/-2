public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Task 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Task 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Task 8");
        int salary = 67850;
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            total = (total + salary) - 29000;
            System.out.println("Месяц " + i + " " + total);
        }
        System.out.println(total);

        System.out.println("Task 9");
        int salaryMonth = 67850;
        int general = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            general = general + general / 100;
            general = (general + salaryMonth);
            System.out.println("Месяц " + i + " сумма накоплений равна " + general + " рублей");
        }
        System.out.println(general);
        System.out.println("Task 10");
        for (int i = 2; i <= 2; i++) {
            for (int j = 1; j <= 10 ; j++) {
                int sum = 2;
                sum = i*j;
                System.out.println(i + "*"+j+"="+sum);
            }
            System.out.println();
        }
    }
}
