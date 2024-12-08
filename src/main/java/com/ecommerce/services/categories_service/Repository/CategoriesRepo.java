package com.ecommerce.services.categories_service.Repository;

import com.ecommerce.services.categories_service.Entity.Categories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriesRepo extends CrudRepository<Categories, UUID> {
}
