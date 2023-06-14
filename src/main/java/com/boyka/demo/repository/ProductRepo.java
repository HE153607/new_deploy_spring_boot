package com.boyka.demo.repository;

import com.boyka.demo.database.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "dataRest")
public interface ProductRepo extends JpaRepository<Product, String> {
}
