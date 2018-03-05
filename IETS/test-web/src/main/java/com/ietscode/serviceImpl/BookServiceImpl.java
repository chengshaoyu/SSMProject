package com.ietscode.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ietscode.dao.BookMapper;
import com.ietscode.entity.Book;
import com.ietscode.service.BookService;

public class BookServiceImpl implements BookService {

	// ◊¢»ÎService“¿¿µ
    @Autowired
    private BookMapper bookDao;
	
	@Override
	public Book getById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.selectByPrimaryKey(bookId);
	}

}
