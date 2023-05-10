package desafioImpostoJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Renda anual com salário: ");
		double salarioAnual = sc.nextDouble();
		
		System.out.println("Renda anual com prestação de serviço: ");
		double rendaServico = sc.nextDouble();
		
		System.out.println("Renda anual com ganho de capital: ");
		double rendaCapital = sc.nextDouble();
		
		System.out.println("Gastos médicos: ");
		double GastosMedicos = sc.nextDouble();
		
		System.out.println("Gastos educacionais: ");
		double gastosEducacao = sc.nextDouble();
		
		double salarioMensal = salarioAnual / 12;
		double impostoSalario;
		
		// calculos dos impostos
		
		if (salarioMensal < 3000.0) {
			impostoSalario = 0;
		}else if (salarioMensal < 5000.0) {
			impostoSalario = salarioAnual * 0.1;
		}else {
			impostoSalario = salarioAnual * 0.2;
		}
		
		double impostoServico = rendaServico * 0.15;
		
		double impostoCapital = rendaCapital * 0.2;
		
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA: ");
		System.out.printf("Imposto sobre salário: %.2f%n",impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n",impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n",impostoCapital);
		
		System.out.println();
		
		//calculos deduções
		
		double totalImposto = impostoSalario + impostoServico + impostoCapital; 
		double totalGastos = GastosMedicos + gastosEducacao;
		double maximoDedutivel = totalImposto * 0.3;
		
		System.out.println("DEDUÇÕES: ");
		
		System.out.printf("Máximo dedutível: %.2f%n",maximoDedutivel);
	    System.out.printf("Gastos dedutíveis: %.2f%n",totalGastos);
	    
	    System.out.println();
	    
	    // calculos finais (resumo)
	    double abatimento;
	    
	    if (totalGastos >= maximoDedutivel) {
	    	abatimento = maximoDedutivel;
	    }else {
	    	abatimento = totalGastos;
	    }
	    
	    double impostoAserPago = totalImposto - abatimento;
	    
	    System.out.println("RESUMO:");
	    System.out.printf("Imposto bruto total: %.2f%n",totalImposto);
	    System.out.printf("Abatimento: %.2f%n", abatimento);
	    System.out.printf("Imposto devido: %.2f%n",impostoAserPago);
	    
	    
	  
	    
	   
	    
	    
	   
	    
	    
		
				
		
		
		
		
		
		
		
		
		
	
		
		
		sc.close(); 

	}

}
