package ImplementationOfLinkedList;

import ImplementationOfLinkedList.ListItem;
import ImplementationOfLinkedList.NodeList;

public class SearchTree implements NodeList {

    protected ListItem root;
    public SearchTree(ListItem root) {
        this.root = root;
    }

    private void performRemoval(ListItem itemToRemove,ListItem parent){

    }

    @Override
    public ListItem getRoot() {
        return root;
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
