package ru.job4j.tracker;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) throws BeansException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConsoleInput.class);
        context.register(Store.class);
        context.register(StartUI.class);
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.add();
        ui.print();
    }
}
