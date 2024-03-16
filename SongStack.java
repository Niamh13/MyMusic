/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymusic;
import java.util.*;
/**
 * SongStack
 * @author niamh
 */
public class SongStack implements StackInterface {
    
    private ArrayList<String> likedStack;

    public SongStack() {
        likedStack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return likedStack.isEmpty();
    }
   
    public boolean isFull() {
        return false;
    }
    
    // deleting in elements to the stacked list (liked songs)
    public Object pop() {
        if (!(likedStack.isEmpty())) {
            return likedStack.remove(0);
        } else {
            return null;
        }
    }
    
    // adding in elements to the stacked list (liked songs)
    public void push(Object newItem) {
        likedStack.add(0, (String) newItem);
    }

    // checking the size of the stacked list (liked songs)
    public int size() {
        return likedStack.size();
    }
    
    // displaying the list by taking the element at each index in the stacked list (liked songs) and adding them to a string
    public String display() {
        int i;
        String sMessage = "";
        // if empty to display
        if (likedStack.isEmpty()) {
            sMessage = sMessage.concat("The Stack is EMPTY!");
        } 
        // otherwise run to make message
        else {
            sMessage = "";
            for (i = 0; i < likedStack.size(); i++) {
                sMessage = sMessage.concat(likedStack.get(i));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }
}
