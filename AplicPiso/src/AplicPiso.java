import java.util.Scanner;
import java.text.DecimalFormat;
public class AplicPiso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		DecimalFormat f1 = new DecimalFormat("#,##0.00"); 
		double L, C, LP, CP; 
		char   OPCAO, OPCAO2;
		double   RESULTADO=0, RESULTADO2=0;
 		double   AREA;
		double   PRECOPISO;
		double   ARGAMASSA , REJUNTE , VALOR_PISO , QESPACADOR=0 , MAODEOBRA , TOTAL;
		
		//INÍCIO

		 System.out.println("Digite a largura do local em metros: ");
		 L=Double.parseDouble(sc.nextLine());
		 System.out.println("Digite o comprimento do local em metros: ");
		 C=Double.parseDouble(sc.nextLine());
		 System.out.println("Digite o valor do m² do piso desejado: ");
		 PRECOPISO=Double.parseDouble(sc.nextLine());
		 System.out.println("Digite a largura em metros do piso: ");
		 LP=Double.parseDouble(sc.nextLine());
		 System.out.println("Digite o comprimento em metros do piso: ");
		 CP=Double.parseDouble(sc.nextLine());

		      System.out.println("Instalação feita na diagonal? 1-Sim 2-Não: ");
		      OPCAO=(char) Double.parseDouble(sc.nextLine());

		      if (OPCAO == 1){ 
		         RESULTADO = (L * C) * 15 / 100; 
		      }else{
		         if(OPCAO == 2){
		            RESULTADO = (L * C) * 10 / 100;
		         }   
		       }   		
		            
		     
		      System.out.println("Instalação com espaçadores? 1-Sim 2-Não: ");
		       OPCAO2=(char) Double.parseDouble(sc.nextLine());

		      if (OPCAO2 == 1){
		         RESULTADO2 = ((L * C) / (LP * CP) - (((L * C) / (LP * CP)/3)));
		      }else{
		         if (OPCAO2 == 2){
		            RESULTADO2 = 0;
		         }
		      }
		      
		//FÓRMULAS
		      
		      if (RESULTADO2 == 0) {
		                 QESPACADOR = (RESULTADO2/100);
		      }else{
		              if (RESULTADO2 > 0) {
		                 QESPACADOR = (Math.ceil(RESULTADO2/100) +1);
		         
		  }
		 }
		      
		 AREA = L*C;
		 ARGAMASSA = Math.ceil(L * C / 4)+1; 
		 REJUNTE = Math.ceil(L * C / 3) + 1; 
		 VALOR_PISO = ( (RESULTADO + AREA) * PRECOPISO );
		 MAODEOBRA = (L * C) * 61;
		 TOTAL = (ARGAMASSA * 35) + (REJUNTE * 4) + VALOR_PISO + (QESPACADOR * 5)+ MAODEOBRA;
		      
		 //SAÍDA     
		 
		 System.out.println("Material necessário:");
    	 System.out.println("M² de pisos necessários:"  +f1.format(+RESULTADO + +AREA) +"m²");
		 System.out.println("Quantidade de argamassa é:" +f1.format(+ARGAMASSA) +"sacos de 20Kg");
		 System.out.println("Quantidade de espaçadores é:" +f1.format(+ QESPACADOR) +"Pacotes de 100 unidades");
		 System.out.println("Quantidade de rejunte é:" +f1.format(+ REJUNTE) +"Kg:");  
		          
		      
		 System.out.println("Custos:");
		 System.out.println("O custo do piso é R$:" +f1.format((+RESULTADO +  AREA) * +PRECOPISO));
		 System.out.println("Argamassa R$:" +f1.format(+ ARGAMASSA * 35));
		 System.out.println("Espaçador R$:" +f1.format(+ QESPACADOR * 5) );
		 System.out.println("Rejunte R$:" +f1.format(+ REJUNTE * 4) ); 
		 System.out.println("Mão de obra R$:" + f1.format(+ MAODEOBRA));
		 System.out.println("Total R$:"  + f1.format(+ TOTAL));  
		 sc.close();
	}

}

