package shiyan1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTest {

	test t=new test();
	test.graph g=new test.graph("D:/test1.txt");

	@Test
	public void testQueryBridgeWords() {
		assertEquals(g.queryBridgeWords("on", "tonight")," ");
		assertEquals(g.queryBridgeWords("the", "my"),"on ");
		assertEquals(g.queryBridgeWords("and", "cold")," ");
		assertEquals(g.queryBridgeWords("on", "snow"),"the my ");
		assertEquals(g.queryBridgeWords("a", "and"),null);
		assertEquals(g.queryBridgeWords("the", "c"),null);
	}

}
