import java.util.Scanner;

public class java{

public static void main(String[] args){
Scanner scan = new Scanner(System.in);

System.out.println("Digite 1 para Masculino ou 2 para Feminino ?");

//String sexo = (scan.nextInt() == 1 ? "Masculino" : "Feminino");

int inputSexo = scan.nextInt();
String sexo;

switch (inputSexo){
    case 1 : {
        sexo = "Masculino";
    break;
}
    case 2 : {
        sexo = "Feminino";
    break;
}
    default : sexo = "outros";
}

System.out.println("O sexo é " + sexo);

// == igual
// >= 
// <=
// >
// <
// != diferente

// System.out.println("Digite seu nome");
// String nome = scan.nextLine();

// System.out.println("Digite a 1° nota");
// double n1 = scan.nextDouble();

// System.out.println("Digite a 2° nota");
// double n2 = scan.nextDouble();

// System.out.println("Digite a 3° nota");
// double n3 = scan.nextDouble();

//     double total = n1 + n2 + n3;
//     double media = total / 3;

//     if (media >= 70){

//         System.out.println("voce esta Aprovado");
//     }else{
//         System.out.println("voce esta Reprovado");

//         double exame = 100 - media;

//         System.out.println("Voce esta de exame" + exame);
//     }
}
}