package dev;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.config.AppConfig;
import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;

public class App {

    public static void main(String[] args) {

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (AppConfig.class);

        PlatServiceVersion1 plat = context.getBean(PlatServiceVersion1.class);

        Menu menu = context.getBean(Menu.class);
        
        // récupération du bean Menu 
        menu.afficher();
        
        // fermeture du Scanner        
        context.getBean(Scanner.class).close();
        
        // fermeture du contexte Spring  

        context.close();
    }
}
