package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Hasta la vista, baby";
    }
}
