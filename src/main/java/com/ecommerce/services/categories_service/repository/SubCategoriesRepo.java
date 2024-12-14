package com.ecommerce.services.categories_service.repository;

import com.ecommerce.services.categories_service.entity.SubCategories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubCategoriesRepo extends CrudRepository<SubCategories, UUID> {
}
