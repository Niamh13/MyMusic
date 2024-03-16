/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mymusic;
import java.util.*;
/**
 *
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
    
    public Object pop() {
        if (!(likedStack.isEmpty())) {
            return likedStack.remove(0);
        } else {
            return null;
        }
    }
    
    public void push(Object newItem) {
        likedStack.add(0, (String) newItem);
    }

    public int size() {
        return likedStack.size();
    }
    
    public String display() {
        int i;
        String sMessage = "";
        if (likedStack.isEmpty()) {
            sMessage = sMessage.concat("The Stack is EMPTY!");
        } else {
            sMessage = "";
            for (i = 0; i < likedStack.size(); i++) {
                sMessage = sMessage.concat(likedStack.get(i));
                sMessage = sMessage.concat(", ");
            }
        }
        return sMessage;
    }
}
