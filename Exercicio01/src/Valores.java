
public class Valores implements ValoresITF{
	
	int lista[] = new int[10];

	public boolean ins(int v) {
		for (int i=0; i<lista.length; i++) {
			if(lista[i] == 0 && v > 0) {
				lista[i] = v;
				return true;
			}
		}
		return false;
	}

	public int del(int i) {
		int aux = 0;
		boolean flag = false;
		for(int e=0; e<lista.length; e++) {
			if(lista[i] != 0) {
				flag = true;
			}
		}
		if(flag) {
			if(i >= 0 && i <= 9) {
				aux = lista[i];
				lista[i] = 0;
			}
			return aux;
		}else {
			return -1;
		}
	}

	public int size() {
		int count = 0;
		for(int i=0; i<lista.length; i++) {
			if(lista[i] != 0) {
				count = count+1;
			}
		}
		return count;
	}
	
	
	
}
