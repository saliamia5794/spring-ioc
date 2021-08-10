package inversion.control.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class IocSpringApplication {


    public static void main(String... args) {


        //the first step is to load te application context.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Food japaneseFood = context.getBean("myJapaneseFood", Food.class);

        List<String> japaneseFoodList = japaneseFood.getListPlates();

        boolean isHealthyJapaneseFood = japaneseFood.isHealthyFood();

        System.out.println("Here is the list of my best japaneseFood: " + japaneseFoodList + " is a healthy food ? " + isHealthyJapaneseFood);

        FastFood fastFood=new FastFood();
        List<String> fastFoodList=fastFood.getListPlates();
        boolean isHealthyFastFood = fastFood.isHealthyFood();

        System.out.println("Here is the list of my best fastFood: " + fastFoodList + " is a healthy food ? " + isHealthyFastFood);








    }


}
