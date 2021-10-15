package com.multipledb.multipledb.controller;

import com.multipledb.multipledb.bar.repo.AccesoCrudRepo;
import com.multipledb.multipledb.foo.repo.DocumentosCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {

    private DocumentosCrudRepo fooRepo;
    private AccesoCrudRepo barRepo;

    @Autowired
    void FooBarController(DocumentosCrudRepo fooRepo, AccesoCrudRepo barRepo) {
        this.fooRepo = fooRepo;
        this.barRepo = barRepo;
    }

    @RequestMapping("/foobar/{id}")
    public ResponseEntity<String> fooBar(@PathVariable("id") Integer id) {
        return new ResponseEntity(fooRepo.findById(id), HttpStatus.ACCEPTED);
    }
}
