
package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.domain.model.Book;

import java.util.List;

public interface BookService {

    List<BookEntity> getBooks();
    BookEntity getBookByID(Long bookId);
}
