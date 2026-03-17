
/*
 2 - Faça um programa que declare um número. Em seguida verifique se ele é: Positivo,
Negativo ou Zero.
*/

void main() {
    Scanner sc = new Scanner(System.in);
    int n1;


    System.out.println("Declare um numero: ");
    n1 = sc.nextInt();

    if (n1 > 0){
        System.out.println("Positivo");
    } else if (n1 < 0) {
        System.out.println("Negativo");
    }else {
        System.out.println("Zero");
    }
}
