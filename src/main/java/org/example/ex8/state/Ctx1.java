package org.example.ex8.state;

public class Ctx1 implements Context{
    State state = State.ABITURA;
    @Override
    public void next(Student s) {
        s.setCtx(new Ctx2());
    }

    @Override
    public void previous(Student s) {
        System.out.println("NOPE");
    }

    @Override
    public String getState() {
        return state.toString();
    }
}
