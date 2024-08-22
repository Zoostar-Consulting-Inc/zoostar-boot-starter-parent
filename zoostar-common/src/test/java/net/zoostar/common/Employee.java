package net.zoostar.common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class Employee implements Hierarchical<Employee> {

	@Setter
	private String username;

	@Setter
	private Employee parent;
	
	private Collection<Employee> children;
	
	public Employee(String username) {
		this(username, new HashSet<>());
	}
	
	public Employee(String username, Collection<Employee> children) {
		this.username = username;
		this.children = children;
	}

	@Override
	public void addChild(Employee child) {
		if(child == null || child.equals(this)) {
			throw new IllegalArgumentException("Child may not be null or equal to parent!");
		}
		child.setParent(this);
		children.add(child);
	}

	@Override
	public boolean isDescendantOf(Employee parent) {
		return parent.isAncestorOf(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(username, other.username);
	}

}
