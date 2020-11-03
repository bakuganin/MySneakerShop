/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysneakershop.sptvr19;

import Savers.SaveToFile;
import entity.Consumers;
import entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import manager.ConsumerManager;
import manager.ProductManager;

/**
 *
 * @author Jegor Bakunin
 */
public class App {
    private Scanner input = new Scanner(System.in);
    
    private List<Product> listProducts = new ArrayList();
    private List<Consumers> listConsumer = new ArrayList();
    
    private ConsumerManager consumerManager = new ConsumerManager();
    private ProductManager productManager = new ProductManager();

    public App() {
        SaveToFile saveToFile = new SaveToFile();
        this.listConsumer = saveToFile.loadFromFile("listConsumers");
        this.listProducts = saveToFile.loadFromFile("listProducts");
    }
    
    
//    Цвет текста
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
//    Цвет фона
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
     
    public void run() {
        System.out.println(PURPLE + "░▒▓█ " + CYAN + "Магазин Обуви" + PURPLE + " █▓▒░" + RESET);
        boolean cycle = true;
        do{
            System.out.println(PURPLE+"\n▻ "+CYAN+"Задачи:");
            System.out.println(PURPLE+"0"+WHITE+"."+CYAN+" Выход из магазина");
            System.out.println(PURPLE+"1"+WHITE+"."+CYAN+" Добавить товар");
            System.out.println(PURPLE+"2"+WHITE+"."+CYAN+" Список товаров");
            System.out.println(PURPLE+"3"+WHITE+"."+CYAN+" Добавить покупателя");
            System.out.println(PURPLE+"4"+WHITE+"."+CYAN+" Список покупателей");
            System.out.println(PURPLE+"5"+WHITE+"."+CYAN+" Купить товар");
            System.out.println(PURPLE + "▻ " + CYAN + "Выберите задачу: " + GREEN);
            
            String Choose = input.nextLine();
            switch(Choose){
                case "0":
                    System.out.println(PURPLE+"▻ "+CYAN+"До свидания!");
                    cycle = false;
                    break;

                case "1":
                    Product sneaker = productManager.createProduct();
                    ProductManager.addToList(sneaker, listProducts);
                    break;
                    
                case "2":
                    ProductManager.getListProducts(listProducts);
                    break;
                    
                case "3":
                    System.out.println("Задача 3");
                    break;
                    
                case "4":
                    System.out.println("Задача 4");
                    break;
                    
                case "5":
                    System.out.println("Задача 5");
                    break;
                    
                default:

                    break;
                }     
            }while(cycle);
        
    }
    
}
