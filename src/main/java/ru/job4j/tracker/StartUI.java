package ru.job4j.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;

    @Autowired
    private ConsoleInput input;

    public void add() {
        String value = input.askStr("Введите значение:");
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
        System.out.println("store = " + store.getAll());
    }

    @Override
    public String toString() {
        return "StartUI{" + "store=" + store + ", input=" + input + '}';
    }
}
