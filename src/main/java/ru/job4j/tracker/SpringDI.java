package ru.job4j.tracker;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) throws BeansException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.tracker");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.add();
        ui.print();

        StartUI ui2 = context.getBean(StartUI.class);
        ui2.add();
        ui2.add();
        ui2.print();
        ui.print();
    }
}
