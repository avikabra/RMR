package rmr_esports;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author home
 */
public class ListNode {
    private Player name;
    private ListNode next = null;
    
    public ListNode(Player name, ListNode next) {
        this.name = name;
        this.next = next;
    }
    
    public Player get() {return name;}
    public ListNode getNext() {return next;}
    public void set(Player name) {this.name = name;}
    public void setNext(ListNode node) {this.next = node;}
    public String toString() {
        return name.toString();
    }
}
