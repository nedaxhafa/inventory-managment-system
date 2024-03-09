package client;

import dto.ProductRequest;
import entity.Category;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        System.out.println("Inventory Managment Syste");
        System.out.println("1. Add product");
        System.out.println("2, Display all products");
        System.out.println("3, Notify for low stock product");
        System.out.println("4, Add category");
        System.out.println("5 display all categories");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                createProduct(sc);
                break;
            case 2:
                notifyLowStockProducts();
                break;
            case 3:
                displayAllProducts();
                break;
            case 4:
                createCategory(sc);
                break;
            case 5:
                displayAllCategories();
                break;
        }

    }

    private static void displayAllCategories() {
        //call displayAllCategories in productService
    }

    private static void createCategory(Scanner sc) {
//        System.out.println("Ju lutem fusni emrin e kategorise");
//        CategoryRequest request = new CategoryRequest();
//        request.addTitle(sc.next());
        //call createCategory in productService

    }

    private static void displayAllProducts() {
        //call displayAllProducts in productService

    }

    private static void notifyLowStockProducts() {
        //call notifyLowStockProducts in productService

    }

    private static void createProduct(Scanner sc) {
        ProductRequest request = new ProductRequest();
        System.out.println("Ju lutem fusni emrin e productit");
        request.setTitle(sc.next());
        System.out.println("Ju lutem fusni pershkrimin e produktit");
        request.setDescription(sc.next());
        System.out.println("Ju lutem me jepni cmimin e produktit");
        request.setPrice(sc.nextDouble());
        System.out.println("Ju lutem me jepni categorin e produktit ");
        request.setCategoryId(sc.nextInt());
        System.out.println("Ju lutem me jepni sasin e produktit");
        request.setQuantity(sc.nextInt());


        ProductService productService = new ProductServiceImpl();
        productService.addProduct(request);
    }
}



