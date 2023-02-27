package org.example.ex8.state;

public class Student {
    private Context ctx;

    public void getState(){
        System.out.println(ctx.getState());
    }

    public void nextState(){
        ctx.next(this);
    }

    public void prevState(){
        ctx.previous(this);
    }


    public void setCtx(Context ctx){
        this.ctx = ctx;
    }
}
