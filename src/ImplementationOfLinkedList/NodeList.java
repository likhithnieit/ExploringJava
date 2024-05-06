package ImplementationOfLinkedList;

import ImplementationOfLinkedList.ListItem;

public interface NodeList {

    ListItem getRoot();

    boolean addItem(ListItem listItem);

    boolean removeList(ListItem listItem);

    void traverse(ListItem root);

}
