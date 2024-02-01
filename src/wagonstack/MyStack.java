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
        
        StackGUI.displayTA.setText(null);
        if ( aStackWagon.size() > 4) {

            JOptionPane.showMessageDialog(null , "detach extra wagons from the train");

        } else {

            //String addWagon = StackGUI.trainProductTF.getText();
            aStackWagon.add(0, (String) newItem);
            JOptionPane.showMessageDialog(null , "Added successfully!");

        }
        
    }
    
    @Override
    public Object emptyStack() {
        
        if (aStackWagon.isEmpty() == true) {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty!");
            return null;
            
        } else {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack removed successfully!");
            return aStackWagon.remove(aStackWagon.size() - 1);
            
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
        
        return JOptionPane.showConfirmDialog(null , "The number of Wagons are :"  + aStackWagon.size());
        
    }
    
    @Override
    public void displayStack () {
        
        StackGUI.displayTA.setText(null);
        for (int i = 0; i < aStackWagon.size(); i ++ ) {
            
            StackGUI.displayTA.append("Index number " + i + " is " + (String) aStackWagon.get(i) + "\n");
            
            if ( i > 4) {
                
                JOptionPane.showMessageDialog(null , "(detach extra wagons from the train");
                
            }
        }
        
    }
    
    @Override
    public void removeWagons () {
        
        if (aStackWagon.isEmpty() == true) {
            
            StackGUI.displayTA.setText(null);
            StackGUI.displayTA.append("The stack is empty!");
            
        } else {
            
            aStackWagon.clear();
            JOptionPane.showMessageDialog(null, "All wagons removed successfully.");
            
        }
    }
    
}
