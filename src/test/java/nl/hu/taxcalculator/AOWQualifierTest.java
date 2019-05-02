package nl.hu.taxcalculator;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AOWQualifierTest {
	
	private AOWQualifier aowQualifier;
	
	@BeforeEach
	public void beforeEach() {
		aowQualifier = new AOWQualifier(of(2017,1,1));
	}

	@Test
	@DisplayName("This should always be true")
	public void testTrue() {
		assertTrue(true);
	}

//	@Test
//	@DisplayName("Does Date qualify")
//	public void testDateQualify(){
//		AOWQualifier aowq = new AOWQualifier(of(Date.));
//
//	}


}
