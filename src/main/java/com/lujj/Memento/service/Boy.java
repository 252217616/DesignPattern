package com.lujj.Memento.service;


public class Boy implements Cloneable{
    private String state;
    private Boy backup;

    public void changeState(){
        this.state = "心情可能很不好";
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    /**
     * 原型模式+备忘录
     * @return
     */
    public void createMemento() {
        this.backup = this.clone();
    }

    public void restoreMemento(){
        if(this.backup == null){
            System.out.println("未备份");
            return;
        }
        this.setState(this.backup.getState());
    }

    @Override
    protected Boy clone(){
        try {
            return (Boy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
