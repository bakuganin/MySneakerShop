/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import Savers.SaveToFile;
import entity.Consumers;
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
public class ConsumerManager implements Serializable {

    public static void addToList(Consumers personWhoGiveMeMoney, List<Consumers> listConsumer) {
        listConsumer.add(personWhoGiveMeMoney);
        SaveToFile saveToFile = new SaveToFile();
        saveToFile.saveToFile(listConsumer, "listConsumers");
    }
    private Scanner input = new Scanner(System.in);

    public Consumers createShopper() {
        System.out.println("<--- Добавление покупателя --->");
        Consumers personWhoGiConsumers = new Consumers();
        System.out.println("Имя: ");
        personWhoGiConsumers.setName(input.nextLine());
        System.out.println("Фамилия: ");
        personWhoGiConsumers.setLastName(input.nextLine());
        System.out.println("Телефон: ");
        personWhoGiConsumers.setPhone(input.nextLine());
        System.out.println("Баланс: ");
        personWhoGiConsumers.setPurse(input.nextDouble());
        
        return personWhoGiConsumers;
    }
    public static void getListConsumers(List<Consumers> listConsumer) {
        System.out.println("<--- Список покупателей --->");
        for(int i = 0; i < listConsumer.size(); i++){
            System.out.println(PURPLE+ "\n▻" 
                    +CYAN+"  Имя:     " +WHITE+ listConsumer.get(i).getName() +RESET
                    +CYAN+"\n   Фамилия: " +WHITE+ listConsumer.get(i).getLastName() +RESET
                    +CYAN+"\n   Телефон: " +WHITE+ listConsumer.get(i).getPhone() +RESET 
                    +CYAN+"\n   Баланс:  " +WHITE+ listConsumer.get(i).getPurse() +GREEN+ "$" + RESET
            );
        }
    }
    
}
