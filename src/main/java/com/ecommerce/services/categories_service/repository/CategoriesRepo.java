package com.ecommerce.services.categories_service.repository;

import com.ecommerce.services.categories_service.entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;

@Repository
public interface CategoriesRepo extends CrudRepository<Categories, UUID> {

    Optional<Categories> findByName(String name);
    boolean existsByName(String name);
    void deleteByName(String name);

}
