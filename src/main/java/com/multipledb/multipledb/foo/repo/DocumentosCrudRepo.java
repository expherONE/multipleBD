package com.multipledb.multipledb.foo.repo;


import com.multipledb.multipledb.foo.domain.DocumentosCandidato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentosCrudRepo extends CrudRepository<DocumentosCandidato, Integer> {
    DocumentosCandidato findByIdDocumentacion (int idDocumentacion);
}
