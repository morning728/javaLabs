package org.example.ex8.memento;

public class Obj {
    String text;
    Integer data;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    void recover(RecoverObj r){
        text = r.getText();
        data = r.getData();
    }

    public Obj(String text, Integer data) {
        this.text = text;
        this.data = data;
    }

    public RecoverObj makeBackup(){
        return new RecoverObj(text, data);
    }

    @Override
    public String toString() {
        return "Obj{" +
                "text='" + text + '\'' +
                ", data=" + data +
                '}';
    }
}
