package net.zoostar.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	Employee manager;

	Employee employee1;

	Employee employee2;

	Employee employee3;

	@BeforeEach
	void beforeEach() {
		manager = new Employee("manager");
		employee1 = new Employee("employee1");
		manager.addChild(employee1);
		employee2 = new Employee("employee2");
		manager.addChild(employee2);
		employee3 = new Employee();
		employee3.setUsername("employee3");
		employee2.addChild(employee3);
	}

	@Test
	void testIsRoot() {
		assertThat(manager.isRoot()).isTrue();
	}

	@Test
	void testGetChildren() {
		assertThat(manager.getChildren()).hasSize(2);
	}

	@Test
	void testIsLeaf() {
		assertThat(employee1.isLeaf()).isTrue();
	}

	@Test
	void testGetParent() {
		assertThat(employee1.getParent()).isEqualTo(manager);
	}

	@Test
	void testIsAncestorOf() {
		assertThat(manager.isAncestorOf(employee1)).isTrue();
		assertThat(employee2.isAncestorOf(employee1)).isFalse();
		assertThat(employee1.isAncestorOf(manager)).isFalse();
		assertThat(manager.isAncestorOf(employee3)).isTrue();
	}

	@Test
	void testIsDescendantOf() {
		assertThat(employee1.isDescendantOf(manager)).isTrue();
		assertThat(employee2.isDescendantOf(manager)).isTrue();
		assertThat(manager.isDescendantOf(employee1)).isFalse();
		assertThat(employee2.isDescendantOf(employee1)).isFalse();
		assertThat(employee3.isDescendantOf(manager)).isTrue();
	}

	@Test
	void testIsParent() {
		assertThat(manager.isParentOf(employee1)).isTrue();
		assertThat(manager.isParentOf(employee3)).isFalse();
		assertThat(employee1.isParentOf(employee3)).isFalse();
	}

	@Test
	void testIsChild() {
		assertThat(employee3.isChildOf(employee2)).isTrue();
		assertThat(employee3.isChildOf(employee1)).isFalse();
		assertThat(employee3.isChildOf(manager)).isFalse();
	}

	@Test
	void testAddChild() {
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> manager.addChild(null))
				.withMessage("Child may not be null or equal to parent!");
		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> manager.addChild(manager))
				.withMessage("Child may not be null or equal to parent!");
	}
	
	@Test
	void testGetUsername() {
		assertThat(manager.getUsername()).isEqualTo("manager");
	}
}
