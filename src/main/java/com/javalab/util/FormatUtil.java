package com.javalab.util;

import java.text.DecimalFormat;

/*
 * EL(Expression Language)에서 사용할 함수
 *  - 숫자 패턴을 받아서 그 패턴대로 숫자를 만들어서 반환해주는 함수를 갖고 있다.
 */

public class FormatUtil {

	/*
	 * 숫자 패턴을 받아서 그 패턴대로 숫자를 만들어서 반환해주는 함수
	 *  - static 함수
	 *  @param number
	 *  @param pattern
	 *  @return
	 */
	
	public static String number(long number, String pattern) {
		DecimalFormat format = new DecimalFormat(pattern);
		return format.format(number);
	}
}
