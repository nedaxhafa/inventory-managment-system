package service;

import config.HibernateConfig;
import converter.ProductConverter;
import dao.ProductDao;
import dao.ProductDaoImpl;
import dto.ProductRequest;
import entity.Product;
import org.hibernate.SessionFactory;
import validatior.ProductValidatior;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{

    private final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
    private final ProductDao productDao =
            new ProductDaoImpl(sessionFactory);
    private final Integer limitStock =5;
    public List<Product>notifyForLowStock(){
        List<Product>products = new ArrayList<>();
        List<Product>lowStock = new ArrayList<>();
        for (Product product : products){
            if (product.getQuantity()<this.limitStock){
                lowStock.add(product);
            }
        }
        return lowStock;

    }

    public void addProduct(ProductRequest request){
        ProductValidatior.validateProduct(request);
        Product product = ProductConverter.convertRequestToEntity(request);
        productDao.save(product);
        System.out.println(request);

    }

    public List<Product> displayAllProduct() {
        return new ArrayList<>();
    }

}