public class Numeros{
	Numeros(){

	};

	public boolean esPar(int n){
		return((n%2)==0);
	};
	public boolean esPar(double n){
		return((n%2)==0);
	}

	public boolean esPrimo(double n){
		return false;
		//Ningun numero con decimales es primo.
	}

	public boolean esPrimo(int n){
		int cont=0;
		for(int i=n;i>0;i--){
			if((n%i)==0){
				cont++;
			}
		}
		if(cont>2){
			return false;
		}
		else{
			return true;
		}
	}

}