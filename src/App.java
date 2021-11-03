import java.util.Scanner;


class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero;


    System.out.print("Digite um número positivo inteiro: ");
    numero = scanner.nextInt();

    if (numero < 0){
      System.out.println("Número invalido");
    }
    else {
      for (int i = 0; i <= numero*2; i++){
        if (i%2 !=0){
        System.out.println(i);}
      }

    }

  
  }
}