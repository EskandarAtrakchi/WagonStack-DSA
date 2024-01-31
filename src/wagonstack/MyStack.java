package wagonstack;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author 23137517 Eskandar Atrakchi
 */
public class MyStack implements StackInterface {
    
    private ArrayList <String> aStackWagon;
    
    public MyStack () {
        
        aStackWagon = new ArrayList <> () ;
        
    }
    
    @Override
    public void pushStack (Object newItem) {
        
        //String addWagon = StackGUI.trainProductTF.getText();
        aStackWagon.add(0, (String) newItem);
        JOptionPane.showMessageDialog(null , "Added successfully!");
        
    }
    
    @Override
    public boolean emptyStack() {
        
        boolean check = false ;
        
        if (aStackWagon.isEmpty() == true) {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty");
            check = true;
            
        } else {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is not empty!");
            check = false;
            
        }
        
        return check;
    }
    
    @Override
    public Object pop () {
        
        if (aStackWagon.isEmpty() == true) {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty!");
            return null;
            
        } else {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack removed successfully!");
            return aStackWagon.remove(0);
            
        }
    }
    
    @Override
    public Object peek () {
        
        if (aStackWagon.isEmpty() == true ) {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty!");
            return null ;
            
        } else {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append(aStackWagon.get(0));
            return aStackWagon.get(0);
            
        }
        
    }
    
    @Override
    public int sizeStack () {
        
        StackGUI.displayTA.setText(null);
        StackGUI.displayTA.append("The total stacks are: " + aStackWagon.size());
        return aStackWagon.size();
        
    }
    
    @Override
    public String displayStack () {
        //display stack from top zero index to the bottom
        String str = "";
        if (aStackWagon.isEmpty() == true) {
            
            str = str.concat("Empty stack, nothing to display!");
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty!");
            
        } else {
            
            for (int i = 0 ; i < aStackWagon.size() ; i ++) {
                
                str = str.concat(aStackWagon.get(i));
                
                Iterator it;
                it = aStackWagon.iterator();
                
                while (it.hasNext () ) {//hasNext returns true or false 
                    
                    StackGUI.displayTA.setText(null);
                    StackGUI.displayTA.append((String) it.next());
            
                    str = str.concat( (String) it.next());//next returns the 
                    str = str.concat(" : ") ;
                    
                }
            }
        }
        //return the str
        return str;
        
    }
    
    public void checkStack () {
        
        System.out.println("Index number one is " + (String) aStackWagon.get(1));
        
    }
    
}
