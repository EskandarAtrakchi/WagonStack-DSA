package wagonstack;

/**
 *
 * @author 23137517 Eskandar Atrakchi
 */
public interface StackInterface {
    
    public void pushStack (Object newItem);
    public Object peek ();
    public Object emptyStack();
    
    public int sizeStack ();
    public void displayStack();
    public void removeWagons ();
    
}
