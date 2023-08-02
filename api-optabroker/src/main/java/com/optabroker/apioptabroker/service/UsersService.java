package com.optabroker.apioptabroker.service;

import com.optabroker.apioptabroker.entity.Users;
import com.optabroker.apioptabroker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;


@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Transactional
    public Users save(Users users){
        return usersRepository.save(users);
    }

    public boolean existsphone(String phone){
        return usersRepository.existsByphone(phone);
    }

    public boolean existsemail(String email){
        return usersRepository.existsByemail(email);
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

//    public Optional<Users> findById(long idUser){
//        return usersRepository.findById(idUser);
//    }

    @Transactional
    public void delete(Users users){
        usersRepository.delete(users);
    }
}
