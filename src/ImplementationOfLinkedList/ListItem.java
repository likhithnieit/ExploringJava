package ImplementationOfLinkedList;

public  abstract class ListItem {
    protected Object value;
    ListItem rightLink;
    ListItem leftLink;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();

     abstract ListItem setNext(ListItem nextItem);

    abstract ListItem previous();

     abstract ListItem setPrevious(ListItem previousItem);

    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
