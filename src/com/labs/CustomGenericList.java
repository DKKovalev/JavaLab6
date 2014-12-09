package com.labs;

import java.util.List;

public class CustomGenericList<E> {

    private List<E> listItems;

    public CustomGenericList(E... elements){

        for(E element : elements) {
            listItems.add(element);
        }
    }

    public Object returnItemByIndex(int index){
        return listItems.get(index);
    }

    public void returnAllObjects(){
        for(int i = 0; i<listItems.size(); i++){
            if(listItems.isEmpty()){
                System.out.println("List is empty");
            } else {
                System.out.println(listItems.get(i));
            }
        }
    }

    /*public void addItems(E... elements){
        for(E element : elements){
            listItems.add(element);
        }
    }*/

    public void addItem(E element){
        listItems.add(element);
    }
}
