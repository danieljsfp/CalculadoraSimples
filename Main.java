import java.util.Scanner;
class Main {

    public static double soma(double x, double y) {
        double z = x + y;
        return z;
    }
        public static double subtracao(double x, double y) {
        double z = x - y;
        return z;
    }
        public static double multiplicacao(double x, double y) {
        double z = x * y;
        return z;
    }
        public static double divisao(double x, double y) {
        double z = x / y;
        return z;
    }
  
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        char op = ' ';
        double n1 = 0;
        double n2 = 0;
        double resp = 0;
                      
        System.out.println("Digite o 1° número: ");
        n1 = sc.nextDouble();
        
        System.out.println("Digite o 2° número: ");
        n2 = sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Digite a opção desejada: A S M D");
        op = sc.nextLine().toUpperCase().charAt(0);
        
        /*
        if (op == 'A'){
        } else if (op == 'S') {
        } else if (op == 'M') {
        } else if (op == 'D') {
        } else {
        }
        */
        
        switch (op) {
            case 'A':
                //resp = n1 + n2;
                //System.out.println("A soma de " + n1 + " + " + n2 + " = " + resp);
                resp = soma(n1,n2);
                System.out.println("A soma de " + n1 + " + " + n2 + " = " + resp);
            break;
            case 'S':
                //resp = n1 - n2;
                resp = subtracao(n1,n2);
                System.out.println("A subtração de " + n1 + " - " + n2 + " = " + resp);
            break;
            case 'M':
                //resp = n1 * n2;
                resp = multiplicacao(n1,n2);
                System.out.println("A multiplicação de " + n1 + " * " + n2 + " = " + resp);
            break;
            case 'D':
                //resp = n1 / n2;
                resp = divisao(n1,n2);
                System.out.println("A divisão de " + n1 + " / " + n2 + " = " + resp);
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }
   
    }
  }