package com.company.aula02;
import java.util.Scanner;



public class Ex05 {
/*11.As Organizações Tabajara resolveram dar um aumento de salário aos 
     seus colaboradores e lhe contraram para desenvolver o programa que 
     calculará os reajustes.

           Faça um programa que recebe o salário de um colaborador e o 
           reajuste segundo o seguinte critério, baseado no salário atual: 

           salários até R$ 280,00 (incluindo) : aumento de 20%
           salários entre R$ 280,00 e R$ 700,00: aumento de 15% 
           salários entre R$ 700,00 e R$ 1500,00: aumento de 10%

        •  salários de R$ 1500,00 em diante : aumento de 5% Após o 

        •  aumento ser realizado, informe na tela:

        •  o salário antes do reajuste;

        •   percentual de aumento aplicado;

        •  o valor do aumento;
    
        •  o novo salário, após o aumento. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu salário:");
        double salario = input.nextDouble();
        
        if(salario <= 280){
            System.out.println("Aumento de 20%!");
            System.out.println("Salário:" + salario);

            double aumento = (salario * 0.20);
            System.out.println("O aumento é de:" + aumento);

            double salarioFinal = salario + aumento;
            System.out.println("Salário Final:" + salarioFinal);

        }else if(salario > 280 && salario < 700){
            System.out.println("Aumento de 15%!");
            System.out.println("Salário:" + salario);

            double aumento = (salario * 0.15);
            System.out.println("O aumento é de:" + aumento);

            double salarioFinal = salario + aumento ;
            System.out.println("Salário Final:" + salarioFinal);

        }else if(salario >= 700 && salario < 1500){
            System.out.println("Aumento de 10%!");
            System.out.println("Salário:" + salario);

            double aumento = (salario * 0.10);
            System.out.println("O aumento é de:" + aumento);

            double salarioFinal = salario + aumento ;
            System.out.println("Salário Final:" + salarioFinal);

        }else if(salario >= 1500){
            System.out.println("Aumento de 5%!");
            System.out.println("Salário:" + salario);
            double aumento = (salario * 0.05);

            System.out.println("O aumento é de:" + aumento);
            double salarioFinal = salario + aumento ;

            System.out.println("Salário Final:" + salarioFinal);
            

        }

        input.close();
    }
    
}
