import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import tut.meven.test.Calculater;

public class DemoTest {
	@Test
	public void test() {
		Calculater c = new Calculater();
		int res = c.add(10, 20);
		assertEquals(30, res);
	}
}
