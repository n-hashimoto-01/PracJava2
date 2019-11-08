package sample;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleMainTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMain_success() {
		SampleMain main = new SampleMain();
		SampleMain.main(new String[] {"test", "2"});
	}

	@Test
	void testMain_paramCountOverError() {
		try {
			SampleMain.main(new String[] {"test", "2", "over"});
		} catch (Exception e) {
			assertEquals(InvalidParameterException.class, e.getClass());
			assertEquals(e.getMessage(), "������2�w�肵�Ă��������@���ہF3");
		}
	}

	@Test
	void testMain_paramCountShortError() {
		try {
			SampleMain.main(new String[] {"test"});
		} catch (Exception e) {
			assertEquals(InvalidParameterException.class, e.getClass());
			assertEquals(e.getMessage(), "������2�w�肵�Ă��������@���ہF1");
		}
	}

	@Test
	void testMain_paramTypeError() {
		try {
			SampleMain.main(new String[] {"test", "a"});
		} catch (Exception e) {
			assertEquals(InvalidParameterException.class, e.getClass());
			assertEquals(e.getMessage(), "����2�͐��l�Ŏw�肵�Ă�������");
		}
	}

}
