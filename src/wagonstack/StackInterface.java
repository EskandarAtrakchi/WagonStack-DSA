package wagonstack;

/**
 *
 * @author 23137517 Eskandar Atrakchi
 */
public interface StackInterface {
    
    public void pushStack (Object newItem);
    public Object pop ();
    public Object peek ();
    public boolean emptyStack();
    
    public int sizeStack ();
    public String displayStack();
    public void checkStack ();
    
}
