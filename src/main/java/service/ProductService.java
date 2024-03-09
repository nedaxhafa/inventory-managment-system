package service;

import dto.ProductRequest;
import entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> notifyForLowStock();
    void addProduct(ProductRequest request);

    List<Product> displayAllProduct();


}