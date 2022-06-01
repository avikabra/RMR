package rmr_esports;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class DoubleNode {
    private Object obj;
    private DoubleNode next = null;
    private DoubleNode prev = null;
    
    public DoubleNode(Object obj, DoubleNode prev, DoubleNode next) {
        this.obj = obj;
        this.next = next;
        this.prev = prev;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }
    
    public String toString() {
        return obj.toString();
    }
}
