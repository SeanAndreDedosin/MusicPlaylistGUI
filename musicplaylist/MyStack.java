/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplaylist;

import java.util.*;

    //@author Andre

public class MyStack implements StackInterface {

    private ArrayList<String> theStack;

    //Creates a new Instance of Stack
    public MyStack() {
        theStack = new ArrayList<String>();
    }

    //Size of the Stack
    public int size() {
        return theStack.size();

    }

    //Check if Stack is Empty
    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    //Always False, No limit on Size
    public boolean isFull() {
        return false;
    }

    //Removes item from the top of the Stack and returns it
    public Object pop() {
        if (!(theStack.isEmpty())) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    //Places an item on top of the stack
    public void push(Object newItem) {
        theStack.add(0, (String) newItem);
    }

    //Removes all Elements from Stack
    public void emptyStack() {
        while (!theStack.isEmpty()) {
            pop();
        }
    }

    //Returns a String Object that consists of All Elements from the Stack
    public String displayStack() {
        int iCount;
        String sMessage = "";
        if (theStack.isEmpty()) {
            sMessage = sMessage.concat("The Playlist is Empty. \n");
        } else {
            sMessage = "The Playlist contains: \n";
            for (iCount = 0; iCount < theStack.size(); iCount++) {
                sMessage = sMessage.concat(theStack.get(iCount));
                sMessage = sMessage.concat("; \n");
            }
        }
        return sMessage;
    }
}