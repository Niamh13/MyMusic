/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymusic;

/**
 * DoubleList
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
    
    //adding elements to the Double linked list
    public void add(int inIndex, Object inElement){
        DNode newN = new DNode(inElement, null, null);
        if (iSize == 0) {
            head = newN;
            last = newN;
        } else {
            if (inIndex == 1) {
                newN.setNext(head);
                head.setPrev(newN);
                head = newN;
            } else if (inIndex == (iSize + 1)) {
                newN.setPrev(last);
                last.setNext(newN);
                last = newN;
            } else {
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
    
    //adding elements to the Double linked list by using the index given
    public void remove(int iIndex){
        if(iSize > 1){
            // if its the first node
            if(iIndex == 0){
                head = head.getNext();
                head.setPrev(null);
            }
            // if its the last node
            else if(iIndex == (iSize-1)){
                last = last.getPrev();
                last.setNext(null);
            }
            // otherwise it have both a node before and after to set
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
        else if(iSize == 1){
            head = null;
            iSize--;
        }
        else{
            System.out.println("List is Empty");
        }
    }
    
    // setting and reseting current Node
    public void setCurrent(int inIndex){
        currNode = head;
        for(int i = 0; i < inIndex; i++){
            currNode = currNode.getNext();
        }
    }
    
    // to get the Object at that index
    public Object get(int iIndex){
        setCurrent(iIndex);
        return currNode;
    }
    
    // to return the String of the element at the index
    public String getItem(int index){
        setCurrent(index);
        if(currNode != null){
            return currNode.getELement().toString();
        }
        else{
            return "empty";
        }
    }
    
    // repeats the list by adding one on the the end of the Double linked list
    public void addList(LinearInterface listToAdd){
      for(int i=0; listToAdd.get(i)!=null;i++){
        listToAdd.setCurrent(i);
        this.add(1, listToAdd.getItem(i));
      }
    }
    
    // printing out the list by taking the element at each index and adding them to a string
    public String printList(){
        String allI = new String();
        for (DNode a = head; a != null; a=a.getNext()){
            String item = (a.getELement()).toString();
            allI = allI + item + ", ";
            
        }
        return allI;
    }
    
   
}
