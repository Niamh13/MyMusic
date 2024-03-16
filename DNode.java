/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymusic;

/**
 *
 * @author niamh
 */
public class DNode {
    private Object element;
    private DNode next;
    private DNode prev;
    
    public DNode(Object inElement, DNode inNext, DNode inPrevious){
        element = inElement;
        next = inNext;
        prev = inPrevious;
    }
    
    public DNode getNext(){
        return next;
    }
    
    public void setNext(DNode inNext){
        next = inNext;
    }
    
    public DNode getPrev(){
        return prev;
    }
    
    public void setPrev(DNode inPrevious){
        prev = inPrevious;
    }
    
    public Object getELement(){
        return element;
    }
    
    public void setElement(Object inElement){
        element = inElement;
    }
}
