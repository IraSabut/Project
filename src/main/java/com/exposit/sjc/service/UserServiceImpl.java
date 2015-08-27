package com.exposit.sjc.service;

import com.exposit.sjc.app.repository.dao.UserDao;
import com.exposit.sjc.app.repository.entity.BookEntity;
import com.exposit.sjc.app.repository.entity.UserEntity;
import com.exposit.sjc.domain.model.User;
import com.exposit.sjc.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userRepository;
    @Override
    public void addUser(User contact) {

    }

    @Override
    public List<UserEntity> getUsers() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities;
    }

    @Override
    public UserEntity getUserByID(Long userId) {
        UserEntity userEntity = userRepository.findById(userId);


        return userEntity;
    }

    @Override
    public void removeUser(Integer id) {

    }

    @Override
    public void save(UserEntity userEntity) {
userRepository.save(userEntity);
    }

    @Override
    public void updateUser(UserEntity user) {

         userRepository.updateUser(user);
    }
}
