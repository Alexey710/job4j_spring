package ru.job4j.tracker;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Scope("prototype")
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public int askInt(String question) {
        return Integer.valueOf(askStr(question));
    }

    @Override
    public String toString() {
        return "ConsoleInput{" + "scanner=" + scanner + '}';
    }
}
