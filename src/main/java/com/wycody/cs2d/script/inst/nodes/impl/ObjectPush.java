package com.wycody.cs2d.script.inst.nodes.impl;

import com.wycody.cs2d.script.inst.types.StackType;

/**
 * 
 * @author Walied-Yassen
 * @date Dec 5, 2015
 */
public class ObjectPush extends OperandPush<Object> {

	public ObjectPush(Object value) {
		super(StackType.OBJECT, value);
	}

}
