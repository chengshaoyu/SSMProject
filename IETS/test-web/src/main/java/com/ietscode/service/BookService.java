package com.ietscode.service;

import com.ietscode.entity.Book;

public interface BookService {
	/**
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);
}
