
package com.exposit.sjc.domain.service;

import com.exposit.sjc.app.repository.entity.AuthorEntity;

import java.util.List;

public interface AuthorService {
    List<AuthorEntity> getAuthors();
    AuthorEntity getAuthorByID(Long authorId);

}
