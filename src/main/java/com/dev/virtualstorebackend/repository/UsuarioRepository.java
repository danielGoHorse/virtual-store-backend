package com.dev.virtualstorebackend.repository;

import com.dev.virtualstorebackend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);



}
