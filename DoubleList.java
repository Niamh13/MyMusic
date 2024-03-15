/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymusic;

/**
 *
 * @author niamh
 */
public class DoubleList implements LinearInterface{
    
    private DNode head;
    private DNode last;
    private DNode currNode;
    private int iSize;
    
    DoubleList(){
        head = null;
        last = null;
        currNode = head;
        iSize = 0;
    }
    
    public boolean isEmpty(){
        return (iSize == 0);
    }
    
    public int size(){
        return iSize;
    }
    
    public void add(int inIndex, Object inElement){
        DNode newN = new DNode(inElement, null, null);
        if (iSize == 0) {
            //insert a new Node when the list is empty
            // write your code here
            head = newN;
            last = newN;
        } else {
            if (inIndex == 1) {
                // Insert a new Node at the head position
                // write your code here
                newN.setNext(head);
                head.setPrev(newN);
                head = newN;
            } else if (inIndex == (iSize + 1)) {
                // Insert a new Node at the last position
                // write your code here
                newN.setPrev(last);
                last.setNext(newN);
                last = newN;
            } else {
                // Insert a new node in the middle
                // write your code here
                setCurrent(inIndex);
                newN.setNext(currNode);
                DNode prev = currNode.getPrev();
                newN.setPrev(prev);
                prev.setNext(newN);
                currNode.setPrev(newN);
            }
        }
        iSize++;
    }
    
    public void remove(int iIndex){
        if(iSize > 0){
            if(iIndex == 1){
                head = head.getNext();
                head.setPrev(null);
            }
            else if(iIndex == iSize){
                last = last.getPrev();
                last.setNext(null);
            }
            else{
                setCurrent(iIndex); 
                DNode prev = currNode.getPrev();
                DNode next = currNode.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            currNode = null;
            iSize--;
        }
        else{
            System.out.println("List is Empty");
        }
    }
    
    private void setCurrent(int inIndex){
        currNode = head;
        for(int i = 0; i < inIndex; i++){
            currNode = currNode.getNext();
        }
    }
    
    public Object get(int iIndex){
        setCurrent(iIndex);
        return currNode;
    }
    
    public String printList(){
        String allI = new String();
        for (DNode a = head; a != null; a=a.getNext()){
            String item = (a.getELement()).toString();
            allI = allI + item + ", ";
        }
        return allI;
    }
    
    public String printListBwd(){
        String allI = new String();
        for(DNode a = last; a!= null; a = a.getPrev()){
            String item = (a.getELement()).toString();
            allI = allI + item + ", ";
        }
        return allI;
    }
}
