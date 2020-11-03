/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import Savers.SaveToFile;
import entity.Product;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
public class ProductManager {

    public static void addToList(Product sneaker, List<Product> listProducts) {
        listProducts.add(sneaker);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listProducts, "listProducts");
    }

    public static void getListProducts(List<Product> listProducts) {
        System.out.println("<--- Список продуктов --->");
        for(int i = 0; i < listProducts.size(); i++){
            System.out.println( i + " " + listProducts.get(i).toString());      
        }
    }
    
    private Scanner input = new Scanner(System.in);

    public Product createProduct() {
        System.out.println("<--- Добавление продукта --->");
        Product sneaker = new Product();
        System.out.println("Брэнд: ");
        sneaker.setDesignation(input.nextLine());
        System.out.println("Количество: ");
        sneaker.setAmount(input.nextLine());
        System.out.println("Размер: ");
        sneaker.setSize(input.nextLine());
        System.out.println("Цвет: ");
        sneaker.setColor(input.nextLine());
        System.out.println("Цена: ");
        sneaker.setPrice(input.nextInt());
        
        return sneaker;
    }

}
