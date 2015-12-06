package com.wycody.cs2d.script.inst.nodes;

import com.wycody.cs2d.script.inst.types.StackType;

/**
 * 
 * @author Walied-Yassen
 * @date Dec 5, 2015
 * @param <T>
 */
public class PushNode<T> {

	private StackType pushType;
	private T value;

	public PushNode(StackType pushType, T value) {
		this.pushType = pushType;
		this.value = value;
	}

	public void set(T value) {
		this.value = value;
	}

	public T get() {
		return value;
	}

	public StackType getPushType() {
		return pushType;
	}

}
