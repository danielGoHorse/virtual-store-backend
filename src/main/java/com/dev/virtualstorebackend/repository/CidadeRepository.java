package com.dev.virtualstorebackend.repository;

import com.dev.virtualstorebackend.entity.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
