package org.example.ex8.state;

public interface Context {
    void next(Student s);
    void previous(Student s);
    String getState();
}
