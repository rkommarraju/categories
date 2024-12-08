package com.ecommerce.services.categories_service.Controller;

import com.ecommerce.services.categories_service.Entity.Categories;
import com.ecommerce.services.categories_service.Repository.CategoriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.String;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private CategoriesRepo categoriesRepo;


    @PostMapping
    private ResponseEntity<String> createCategory(@RequestBody Categories requestBody){
        categoriesRepo.save(requestBody);
        return ResponseEntity.ok("category created");
    }

    @GetMapping
    private ResponseEntity<List<Categories>> listAll(){
        return ResponseEntity.ok((List<Categories>) categoriesRepo.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Categories> getACategory(@PathVariable UUID id) throws Exception{
        Optional<Categories> response=categoriesRepo.findById(id);
        if(response.isPresent()){
            return ResponseEntity.ok(response.get());
        }
        throw new FileNotFoundException();
    }

    @PutMapping("/{id}")
    private ResponseEntity<String> updateACategory(@RequestBody Categories requestBody, @PathVariable UUID id) throws Exception{
        if(categoriesRepo.existsById(id)){
            categoriesRepo.save(requestBody);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        throw new FileNotFoundException();
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> deleteACategory(@PathVariable UUID id) throws Exception{
        if(categoriesRepo.existsById(id)){
            categoriesRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        throw new FileNotFoundException();
    }
}
