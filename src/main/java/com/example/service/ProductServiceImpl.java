package com.example.service;

import com.example.model.Students;
import com.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Students> CheckLogin(Students students) {
        List<Students> studentsList = usersRepository.checkLogin(students.getEmail(), students.getPassword());
        return studentsList;
    }
}
