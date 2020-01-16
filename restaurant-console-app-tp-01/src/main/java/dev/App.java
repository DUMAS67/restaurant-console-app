package dev;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("application-config.xml");
        Scanner scanner = context.getBean(Scanner.class);
        PlatServiceVersion1 plat = context.getBean(PlatServiceVersion1.class);

        Menu menu = context.getBean(Menu.class);
        
        // r�cup�ration du bean Menu 
        menu.afficher();
        
        // fermeture du Scanner �      
        context.getBean(Scanner.class).close();
        
        // fermeture du contexte Spring �

        context.close();
    }
}
