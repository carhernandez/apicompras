package com.platzi.apicompras.domain.repository;

import com.platzi.apicompras.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Product save (Product product);
    void delete (int productId);
}
