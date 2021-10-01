package com.spring.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import com.spring.factory.shape.Shape;
@RunWith(SpringRunner.class)
@SpringBootTest(classes= {Config.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
class ServiceLocatorDemoApplicationTests {
@Autowired
private ShapeFactory shapeFactory;	
@Test
public void testGetShape() {
	Shape circle=shapeFactory.getShape("circle");
	assertNotNull(circle);
	circle.draw();
	Shape square=shapeFactory.getShape("square");
	assertNotNull(circle);
	square.draw();
}
	@Test
	public void testGetShapeForWrongShape() {
		Shape rectangle=shapeFactory.getShape("rectangle");
		assertNotNull(rectangle);
		rectangle.draw();
	}
	
}



