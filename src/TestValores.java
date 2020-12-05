import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestValores {
	
	@Test
	public void testInsercao() {
		
		Valores valores = new Valores();
		
		assertEquals(valores.ins(-1),false);
		assertEquals(valores.ins(0),false);
		assertEquals(valores.ins(1),true);
		
	}
	
	@Test
	public void testDelete() {
		
		Valores valores = new Valores();
	
		//assertEquals(valores.del(6),-1);
		
		valores.ins(2);
		valores.ins(5);
		valores.ins(6);
		valores.ins(1);
		
		int valorRemovido = valores.del(2);
		
		assertEquals(valorRemovido,2);
		
		
	}
	
	
	@Test
	public void testTamanho() {
		
		Valores valores = new Valores();
		
		valores.ins(1);
		
		assertEquals(valores.size(),1);
		
	}
	

}
