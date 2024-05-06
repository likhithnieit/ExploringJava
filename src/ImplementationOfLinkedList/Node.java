package ImplementationOfLinkedList;

import ImplementationOfLinkedList.ListItem;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem nextItem) {
        this.rightLink = nextItem;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem previousItem) {
        this.leftLink = previousItem;
        return this.leftLink;
    }

//    @Override
//    int compareTo(ListItem listItem) {
//        if ((int)getValue() >  (int)listItem.getValue()){
//            return 1;
//        }
//        else if ((int)getValue() <  (int)listItem.getValue()){
//            return -1;
//        }
//        else
//            return 0;
//        //implementation doubt //likely to have logical error
//    }

    @Override
    int compareTo(ListItem item) {

        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
