package nl.hu.taxcalculator;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AOWQualifierTest {
	
	private AOWQualifier aowQualifier;
	
//	@BeforeEach
//	public void beforeEach() {
//		aowQualifier = new AOWQualifier(of(2016,1,1));
//	}

	@Test
	@DisplayName("This should always be true")
	public void testTrue() {
		assertTrue(true);
	}

	@Test
	@DisplayName("1950-12-1 geboren voor de datum van 2016-1-1")
	public void shouldNotQualify(){
        aowQualifier = new AOWQualifier(of(2016,1,1));
		assertFalse(aowQualifier.doesDateQualify(of(1950,12,1)));
	}

    @Test
    @DisplayName("1950-12-1 geboren voor de datum van 2017-1-1")
    public void shouldQualify(){
        aowQualifier = new AOWQualifier(of(2017,1,1));
        assertTrue(aowQualifier.doesDateQualify(of(1950,12,1)));
    }




}
