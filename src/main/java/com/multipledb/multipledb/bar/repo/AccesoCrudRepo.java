package com.multipledb.multipledb.bar.repo;

import com.multipledb.multipledb.bar.domain.Acceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface AccesoCrudRepo extends JpaRepository<Acceso, Integer> {
    Acceso findByUsuario (String usuario);
    Acceso findByContrasena (String contrasena);
    Optional<Acceso> findByUsuarioAndContrasena (String usuario, String contrasena);
}
