package ImplementationOfLinkedList;

import ImplementationOfLinkedList.ListItem;

public class MyLinkedList implements NodeList {

    protected ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return null;
        //not implemented
    }

    @Override
    public boolean addItem(ListItem listItem) {
        return false;
        //not implemented
    }

    @Override
    public boolean removeList(ListItem listItem) {
        return false;
        //not implemented
    }

    @Override
    public void traverse(ListItem root) {
        //not implemented
    }
}
