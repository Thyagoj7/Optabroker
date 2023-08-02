package com.optabroker.apioptabroker.controller;

import com.optabroker.apioptabroker.dto.UserDTO;
import com.optabroker.apioptabroker.entity.Users;
import com.optabroker.apioptabroker.repository.UsersRepository;
import com.optabroker.apioptabroker.service.UsersService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsersController {

    @Autowired
   final UsersService usersService;

    @Autowired
    private UsersRepository usersRepository;

    public UsersController(UsersService usersService, UsersRepository usersRepository){
        this.usersService = usersService;
        this.usersRepository = usersRepository;
    }
    @PostMapping("/adcionar")
    public ResponseEntity<Object>saveUsers(@RequestBody @Valid UserDTO userDTO){
        Users users = new Users();
        BeanUtils.copyProperties(userDTO, users); //Converte de DTO para model
        return ResponseEntity.status(HttpStatus.CREATED).body(usersService.save(users));
    }

    @GetMapping("/getuser")
    public ResponseEntity<List<Users>> getAllUsers(){
        return ResponseEntity.status(HttpStatus.OK).body(usersService.findAll());
    }

}
