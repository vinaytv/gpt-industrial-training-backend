package net.javaguides.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import net.javaguides.springboot.model.Student;

@SpringBootTest
class SpringbootBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void addTest() {
		Student stu=new Student();
		stu.add(0, 0);
		assertEquals(5, stu.add(2, 3));
	}
}
