import java.util.Scanner;

public class exer5cap2 {

        public static void main (String args[]) {

            Scanner sc = new Scanner(System.in);
            int mes;
            do{
                System.out.println("\nDigite o número de um mês do ano ou 0 para sair:");
                mes = sc.nextInt();
                switch (mes){
                    case 0:
                        System.out.println("See you later. Bye!");
                        break;
                    case 1:
                        System.out.println("1 - Janeiro");
                        break;
                    case 2:
                        System.out.println("2 - Fevereiro");
                        break;
                    case 3:
                        System.out.println("3 - Março");
                        break;
                    case 4:
                        System.out.println("4 - Abril");
                        break;
                    case 5:
                        System.out.println("5 - Maio");
                        break;
                    case 6:
                        System.out.println("6 - Junho");
                        break;
                    case 7:
                        System.out.println("7 - Julho");
                        break;
                    case 8:
                        System.out.println("8 - Agosto");
                        break;
                    case 9:
                        System.out.println("9 - Setembro");
                        break;
                    case 10:
                        System.out.println("10 - Outubro");
                        break;
                    case 11:
                        System.out.println("11 - Novembro");
                        break;
                    case 12:
                        System.out.println("12 - Dezembro");
                        break;
                    default:
                        System.out.println("Mês inválido. Entre com um número entre 1 e 12 ou digite 0 para sair. ");
                        break;
                }

            } while (mes != 0);
            sc.close();
        }
    }




