/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import Savers.SaveToFile;
import entity.Product;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import static mysneakershop.sptvr19.App.CYAN;
import static mysneakershop.sptvr19.App.GREEN;
import static mysneakershop.sptvr19.App.PURPLE;
import static mysneakershop.sptvr19.App.RESET;
import static mysneakershop.sptvr19.App.WHITE;

/**
 *
 * @author Jegor Bakunin
 */
public class ProductManager implements Serializable {

    public static void addToList(Product sneaker, List<Product> listProducts) {
        listProducts.add(sneaker);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listProducts, "listProducts");
    }

    public static void getListProducts(List<Product> listProducts) {
        System.out.println("<--- Список продуктов --->");
        for(int i = 0; i < listProducts.size(); i++){
            System.out.println(PURPLE+ "\n▻" 
                    +CYAN+"  Бренд:   " +WHITE+ listProducts.get(i).getDesignation() 
                    +CYAN+"\n   Цена:    " +WHITE+ listProducts.get(i).getPrice() +GREEN+ "$" + RESET
                    +CYAN+"\n   Цвет:    " +WHITE+ listProducts.get(i).getColor() + RESET 
                    +CYAN+"\n   Размер:  " +WHITE+ listProducts.get(i).getSize() + RESET 
                    +CYAN+"\n   Коли-во: " +WHITE+ listProducts.get(i).getAmount() + RESET
            );
        }
    }
    
    private Scanner input = new Scanner(System.in);

    public Product createProduct() {
        System.out.println("<--- Добавление продукта --->");
        Product sneaker = new Product();
        System.out.println("Брэнд: ");
        sneaker.setDesignation(input.nextLine());
        System.out.println("Количество: ");
        sneaker.setAmount(input.nextInt());
        System.out.println("Размер: ");
        sneaker.setSize(input.nextLine());
        sneaker.setSize(input.nextLine());
        System.out.println("Цвет: ");
        sneaker.setColor(input.nextLine());
        System.out.println("Цена: ");
        sneaker.setPrice(input.nextDouble());
        
        return sneaker;
    }

}
