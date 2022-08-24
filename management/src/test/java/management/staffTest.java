package management;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class staffTest {
management man = new management ();
management m;
@BeforeAll 
public static void start () {
	System.out.println("Before All");
	
}
@BeforeEach
public void setUp() {
	m = new management("paul", "neve", "stock", "1992-12-12", 19000);
	man.setfirstName("john");
	man.setlastName("smith");
	man.position("till");
	man.dob("1999-11-11");
	man.pay(21000);
	System.out.println("Before Each");
}
@Test
public void testGetfirstName() {
	Assertions.assertEquals("john",man.getfirstName());
	Assertions.assertEquals("neve",m.getfirstName());
	Assertions.assertNotEquals(null, man.getfirstName());
	System.out.println("Test");
}
@Test
public void testGetlastName() {
	Assertions.assertEquals("smith",man.getlastName());
	Assertions.assertEquals("paul",m.getlastName());
	Assertions.assertNotEquals(null, man.getlastName());
	System.out.println("Test2");
}
@Test 
public void testGetposition() {
	Assertions.assertEquals("till",man.getposition());
	Assertions.assertEquals("stock",m.getposition());
	Assertions.assertNotEquals(null, man.getposition());
	System.out.println("Test3");
}
@Test
public void testGetDob() {
	Assertions.assertEquals("1999-11-11",man.getdob());
	Assertions.assertEquals("1992-12-12",m.getdob());
	Assertions.assertNotEquals(null, man.getdob());
	System.out.println("Test4");
}
@Test 
public void testGetpay() {
	Assertions.assertEquals(21000,man.getpay());
	Assertions.assertEquals(19000,m.getpay());
	Assertions.assertNotEquals(0, man.getpay());
	System.out.println("Test4");
}

@Test
public void setfirstName() {
	man.setfirstName("abdi");
	assertEquals("abdi",man.getfirstName());
}
@Test
public void setlastName() {
	man.setlastName("zee");
	assertEquals("zee",man.getlastName());
}
@Test
public void setposition() {
	man.position("head");
	assertEquals("head",man.getposition());
}
@Test
public void setdob() {
	man.dob("1998-09-09");
	assertEquals("1998-09-09",man.getdob());
}
@Test
public void setpay() {
	man.pay(22000);
	assertEquals(22000,man.getpay());
	
	
	
}

@AfterEach //JUNIT4 - After
public void clean() {
	System.out.println("After Each");
	//clear any data
}

@AfterAll //JUNIT4 - AfterClass
public static void stop() {
	System.out.println("After all");
	//closing connection
}


}
