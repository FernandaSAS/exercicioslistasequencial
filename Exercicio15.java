import java.util.Scanner;

public class Exercicio15 {
    /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o
     total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
     5% para o sindicato, faça um programa que nos dê:salário bruto. quanto pagou ao INSS. quanto pagou ao sindicato. o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo: */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quanto você ganha por Hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horaTrabalhada = scanner.nextDouble();
        double salarioBruto = valorHora * horaTrabalhada;
        double ir = salarioBruto * 8 /100;
        double inss = salarioBruto * 11 /100;
        double sindicato = salarioBruto * 5 /100;
        double desconto = ir+inss+sindicato;
        double salarioLiquido = salarioBruto-desconto;
                System.out.println("Seu salario mensal bruto é " +salarioBruto);
        System.out.println("O desconto de IR será de " +ir);
        System.out.println("O desconto de FGTS será de " + inss);
        System.out.println("O desconte de Sindicato será de " +sindicato);
        System.out.println("O valor dos descontos será de " + desconto);
        System.out.println("O valor do salario Liquido é R$ " +salarioLiquido);
        scanner.close();


    }
}
