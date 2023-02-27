package org.example.ex8.state;

public class Ctx2 implements Context{
    State state = State.STUDENT;
    @Override
    public void next(Student s) {
        System.out.println("Nope");
    }

    @Override
    public void previous(Student s) {
        s.setCtx(new Ctx1());
    }

    @Override
    public String getState() {
        return state.toString();
    }
}
