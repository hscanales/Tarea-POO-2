import java.util.Scanner;


public class Tarea2 {
	public static void main(String[] args){
		Numeros n= new Numeros();
		Hc hc= new Hc();
		Scanner sc= new Scanner(System.in),sc1= new Scanner(System.in);
		boolean flag=true;

		while(flag){
		hc.print("TAREA 2\nMenu: \n1-Verificar un numero par\n2-Verificar si un numero es primo\n0- Salida");
		
		int op=Integer.parseInt(sc.nextLine());
		
		switch(op){
			case 1:

				hc.print("Ingrese el numero que desea evaluar: ");
				double x= Double.parseDouble(sc1.nextLine());
				
				if((x%1)!=0){
					if(n.esPar(x)){
						hc.print("\nEs par");
					}
					else{
						hc.print("\nNo es Par");
					}
				}
				else{
					int e=(int)x;
					if(n.esPar(e)){
						hc.print("\nEs par");
					}
					else{
						hc.print("\nNo es Par");
					}
				}
				break;
			case 2:
				hc.print("Ingrese el numero que desea evaluar: ");
				double y= Double.parseDouble(sc1.nextLine());
				
				if((y%1)!=0){
					if(n.esPrimo(y)){
						hc.print("\nEs primo");
					}
					else{
						hc.print("\nNo es primo");
					}
				}
				else{
					int e=(int)y;
					if(n.esPrimo(e)){
						hc.print("\nEs primo");
					}
					else{
						hc.print("\nNo es primo");
					}
				}
				break;
			case 0:

				flag=false;
				
				break;
			default:
				hc.print("Opcion no valida, intente denuevo\n");
				break;


		}
		hc.n(4);
	}

		
	}
}