package com.rafael.utils;

import com.rafael.exception.ClienteException;

public class ValidationUtils {

	public static <T> T checkNotNull(T obj, String message) throws ClienteException {

		if (obj == null) {
			throw new ClienteException(message);
		}
		return obj;
	}

}
