package com.storygraph;

import java.lang.reflect.InvocationTargetException;

public interface Builder {
	void build() throws InvocationTargetException, IllegalAccessException, IllegalArgumentException;
}
