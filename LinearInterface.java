/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mymusic;

/**
 *
 * @author niamh
 */
public interface LinearInterface {
    
    public boolean isEmpty();
    public int size();
    public Object get(int iIndex);
    public void remove(int iIndex);
    public void add(int iIndex, Object element);
    public String printList();
    public String getItem(int iIndex);
    public void addList(LinearInterface listToAdd);
    public void setCurrent(int inIndex);
    
}
