import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdvSqrtTest {

	AdvSqrt test;

	@BeforeClass
	void setUp(){
		test = new AdvSqrt();
	}

	@Test
	public void on3_ReturnSqrt() {
		assertEquals(test.sqrt(3), Math.sqrt(3), "3 sqrt test");
	}

	@Test
	public void on10_ReturnSqrt() {
		assertEquals(test.sqrt(10), Math.sqrt(10), "10 sqrt test");
	}

	@Test
	public void onDouble_ReturnSqrt() {
		assertEquals(test.sqrt(3.14), Math.sqrt(3.14), "10 sqrt test");
	}


	@Test
	public void onNegativeNumber_ReturnNan() {
		assertEquals(test.sqrt(-10), Double.NaN, "Negative number test");
	}

	@Test
	public void onNan_ReturnNan() {
		assertEquals(test.sqrt(Double.NaN), Double.NaN, "Nan test");
	}

	@Test
	public void onNegative0_ReturnNegative0() {
		assertEquals(test.sqrt(-0), -0, "-0 number test");
	}

	@Test
	public void onPositiveInfinity_ReturnPositiveInfinity() {
		assertEquals(test.sqrt(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, "Positive infinity test");
	}

	@Test
	public void on0_Return0() {
		assertEquals(test.sqrt(0), 0, "0 test");
	}

	@Test
	public void on1_Return1() {
		assertEquals(test.sqrt(1), 1, "1 test");
	}
}