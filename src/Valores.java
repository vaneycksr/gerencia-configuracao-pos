import java.util.ArrayList;

public class Valores implements ValoresITF{
	
	ArrayList<Integer> array = new ArrayList();

	@Override
	public boolean ins(int v) {
		
		if(v > 0 && array.size() <= 10) {
			array.add(v);
			return true;
		}
		
		return false;
		
	}

	@Override
	public int del(int i) {
		
		if (array.size() == 0) {
			return -1;
		}
		
		array.remove(i);
		return array.get(i);
	}

	@Override
	public int size() {
		
		return array.size();
	}
	
	
}

