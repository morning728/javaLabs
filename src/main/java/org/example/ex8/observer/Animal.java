package org.example.ex8.observer;

public class Animal implements Observer{
    String rules;

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public Animal(String rules) {
        this.rules = rules;
    }

    @Override
    public void update(String rules) {
        this.rules = rules;
        System.out.println("updated");
    }
}
