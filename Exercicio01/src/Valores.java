public class Valores implements ValoresITF{
	
	//ArrayList<Integer> array = new ArrayList();
	int array[] = new int[10];

	@Override
	public boolean ins(int v) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = v;
				return true;
			}
		}
//		if(v > 0 && array.size() <= 10) {
//			array.add(v);
//			return true;
//		}
		
		return false;
		
	}

	@Override
	public int del(int i) {
		
//		if (array.size() == 0) {
//			return -1;
//		}
//		
//		array.remove(i);
//		return array.get(i);
		
		int aux = 0;
		boolean flag = false;
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				flag = true;
			}
		}
		
		if (flag) {
			if (i >= 0 && i <= 9) {
				 aux = array[i];
				 array[i] = 0;
				
			}
			return aux;
		}
		
		return -1;
		
	}

	@Override
	public int size() {
		
//		return array.size();
		
		int cont = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				cont++;
			}
		}
		return cont;
		
	}
	
	public void zerarArray() {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[i] = 0;
			}
		}
		
	}
	
	
}

