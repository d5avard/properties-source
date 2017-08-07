package ca.d5development.propertiessource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PropertiesSourceTestConfig.class)
public class PropertiesSourceTest {

	@Autowired
	PropertiesBroker propertiesBroker;
	
	@Test
	public void testExternalProperties () {
		assertEquals("test", propertiesBroker.getTest());
	}
}