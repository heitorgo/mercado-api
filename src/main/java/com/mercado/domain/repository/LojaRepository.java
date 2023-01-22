package com.mercado.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mercado.domain.model.Loja;

@Repository
public interface LojaRepository  extends JpaRepository<Loja, Long>, JpaSpecificationExecutor<Loja>{
	
	@Query("from Loja l join fetch l.empresa")
	List<Loja> findAll();

}
