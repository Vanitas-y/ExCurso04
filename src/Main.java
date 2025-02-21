import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, hr;
        double valHora, sal;

        num = sc.nextInt();
        hr = sc.nextInt();
        valHora = sc.nextDouble();

        sal = valHora * hr;

        System.out.println("Number = " + num);
        System.out.printf("Salary = %.2f\n", sal);

//
//        System.out.println("Numero do funcionario: " );
//        int numFunc = sc.nextInt();
//
//        System.out.println("Digite suas horas trabalhadas: ");
//        int ht = sc.nextInt();
//
//        System.out.println("Digite seu valor por hora: ");
//        double vl = sc.nextDouble();
//
//        double sal = ht * vl;
//
//        System.out.println("Number " + numFunc);
//        System.out.printf("Salary: %.2f reais\n", sal);
//
//        sc.close();


    }
}