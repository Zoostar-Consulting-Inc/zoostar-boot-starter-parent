package net.zoostar.common;

import java.util.Collection;

import org.springframework.util.CollectionUtils;

public interface Hierarchical<H extends Hierarchical<H>> {

	Collection<H> getChildren();
	void addChild(H child);
	boolean isDescendantOf(H parent);
	default boolean isChildOf(H parent) {
		return parent != null && parent.getChildren().contains(this);
	}

	H getParent();
	default boolean isParentOf(H child) {
		return child != null && child.getParent().equals(this);
	}
	default boolean isAncestorOf(H child) {
		if (child == null || child.isRoot()) {
			return false;
		}
		return child.getParent().equals(this) || isAncestorOf(child.getParent());
	}

	default boolean isRoot() {
		return getParent() == null;
	}

	default boolean isLeaf() {
		return CollectionUtils.isEmpty(getChildren());
	}

}
