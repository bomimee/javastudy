package com.ict.day18;

import java.util.function.BinaryOperator;

class Ex05 implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
	// or lengthr값이 긴걸 쓸 수도 있지
	public String apply2(String s1, String s2) {
		if (s1.length() >= s2.length())
			return s1;
		else
			return s2;
	}

}
