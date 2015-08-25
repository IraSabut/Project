package com.exposit.sjc.app.repository.dao;

import java.sql.SQLException;
import java.util.List;

import com.exposit.sjc.domain.model.Author;

public interface AuthorDao {
	public void addAuthor(Author author) throws SQLException;

	public void updateAuthor(Author author) throws SQLException;

	public Author getAuthor(int id) throws SQLException;

	public List<Author> getAuthors() throws SQLException;

}
