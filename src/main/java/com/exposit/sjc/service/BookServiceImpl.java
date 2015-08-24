
package com.exposit.sjc.service;

import com.exposit.sjc.app.repository.dao.BookDao;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.impl.BookRepository;
import com.exposit.sjc.domain.model.Book;
import com.exposit.sjc.domain.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class BookServiceImpl implements BookService {

   @Autowired
	private BookDao bookRepository;


    @Override
    public List<BookEntity> getBooks() {
        List<BookEntity> bookEntities = bookRepository.findAll();

        return bookEntities;

    }

    @Override
    public BookEntity getBookByID(Long bookId) {

        BookEntity bookEntity = bookRepository.findById(bookId);


        return bookEntity;
    }


}
