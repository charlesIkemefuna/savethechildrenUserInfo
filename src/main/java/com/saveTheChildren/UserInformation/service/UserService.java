package com.saveTheChildren.UserInformation.service;

import com.saveTheChildren.UserInformation.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends CrudRepository<User,Integer> {
}
