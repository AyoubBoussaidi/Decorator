package com.example.decorator;

import com.example.decorator.boissons.Boisson;
import com.example.decorator.boissons.Espresso;
import com.example.decorator.decorateurs.Caramel;
import com.example.decorator.decorateurs.Chocolat;
import com.example.decorator.decorateurs.Lait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorApplication.class, args);
        Boisson a=new Espresso();
        a=new Lait(a);
        a=new Chocolat(new Chocolat(new Caramel(a)));
        System.out.println(a.getDescription());
        System.out.println("Prix : "+a.cout());
    }

}
