package com.exposit.sjc.service;

import com.exposit.sjc.app.repository.dao.AuthorDao;
import com.exposit.sjc.app.repository.entity.AuthorEntity;
import com.exposit.sjc.domain.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl  implements AuthorService{
    @Autowired
    private AuthorDao authorRepository;
    @Override
    public List<AuthorEntity> getAuthors() {
        List<AuthorEntity> authorEntities = authorRepository.findAll();

        return authorEntities;
    }

    @Override
    public AuthorEntity getAuthorByID(Long authorId) {
        AuthorEntity authorEntity = authorRepository.findById(authorId);


        return authorEntity;
    }
}
