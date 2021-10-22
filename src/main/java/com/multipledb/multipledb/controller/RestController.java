package com.multipledb.multipledb.controller;

import com.multipledb.multipledb.bar.domain.Acceso;
import com.multipledb.multipledb.bar.repo.AccesoCrudRepo;
import com.multipledb.multipledb.foo.domain.DocumentosCandidato;
import com.multipledb.multipledb.foo.repo.DocumentosCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RestController {

    @Autowired
    private DocumentosCrudRepo docs;
    @Autowired
    private AccesoCrudRepo acceso;

    @RequestMapping("/docs/{id}")
    public ResponseEntity<DocumentosCandidato> fooBar(@PathVariable("id") Integer id) {
        System.out.println(id);
        docs.findById(id);
        return new ResponseEntity(docs.findById(id), HttpStatus.ACCEPTED);
    }
    @RequestMapping("/docs/all")
    public ResponseEntity<List<DocumentosCandidato>> docAll() {
        System.out.println("todos");
        docs.findAll();
        return new ResponseEntity(docs.findAll(), HttpStatus.ACCEPTED);
    }
    @RequestMapping("/acceso/all")
    public ResponseEntity<List<Acceso>> accesoAll() {
        System.out.println("todos");
        acceso.findAll();
        return new ResponseEntity(acceso.findAll(), HttpStatus.ACCEPTED);
    }
}
