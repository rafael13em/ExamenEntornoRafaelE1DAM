import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class MainTest {
	private Operaciones Op;
	private int result;
	private String resultado;
	private boolean comprobar;
	
	@Before
	public void createOperaciones()
	{
		Op = new Operaciones();
	}
	
	@After
	public void zeroOperaciones()
	{
		Op = null;
	}
	
	@Test
	public void Union()
	{
		String a="hola";
		String b=" mundo";
		resultado=Op.Union(a, b);
		Assert.assertEquals("hola mundo", resultado);
	}
	
	@Test
	public void Mayuscula()
	{
		String a="hola";
		resultado=Op.May(a);
		Assert.assertEquals("HOLA", resultado);
	}
	
	@Test
	public void NumElementos()
	{
		String a="hola";
		result=Op.Long(a);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void Comparar()
	{
		int a=2;
		int b=3;
		comprobar=Op.Comp(a, b);
		Assert.assertEquals(false, comprobar);
	}
	
	@Test
	public void Square()
	{
		int a=2;
		result=Op.Cuadrado(a);
		Assert.assertEquals(4, result);
	}
	
	@Test
	public void Comp10()
	{
		int a=2;
		comprobar=Op.Diez(a);
		Assert.assertEquals(false, comprobar);
	}
	
}
