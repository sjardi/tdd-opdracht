package nl.hu.taxcalculator;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class AOWQualifierTest {
	
	private AOWQualifier aowQualifier;
	
//	@BeforeEach
//	public void beforeEach() {
//		aowQualifier = new AOWQualifier(of(2016,1,1));
//	}

    @Disabled("This test has been disabled.")
    @Test
    void disabledTest(){
        assertEquals(1, 1, "Is '1' gelijk aan '1' ");
    }

	@Test
	@DisplayName("This should always be true")
    private void testTrue() {
		assertTrue(true);
	}

	@Test
	@DisplayName("1950-12-1 geboren voor de datum van 2016-1-1")
    void shouldNotQualify(){
        aowQualifier = new AOWQualifier(of(2016,1,1));
		assertFalse(aowQualifier.doesDateQualify(of(1950,12,1)));
	}

    @Test
    @DisplayName("1950-12-1 geboren voor de datum van 2017-1-1")
    void shouldQualify(){
        aowQualifier = new AOWQualifier(of(2017,1,1));
        assertTrue(aowQualifier.doesDateQualify(of(1950,12,1)));
    }


    @AfterAll
    static void afterAll(){
	    System.out.println("All test are Done.");
    }




}
