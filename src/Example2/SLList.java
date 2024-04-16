/**
 * Class SLList implement a linked-list data structure. Each element of the list is a string.
 * Please refer to Lecture 6 for the detail Linked-List ADT.
 * @author (nxthang) 
 * @version (1.0)
 */
package Example2;
public class SLList
{
    private SLNode head;

    /**
     * Constructor for objects of class SLList.
     * This constructor will create an empty list.
     */
    public SLList()
    {
        head = null; // Initialize head to null
    }

    /**
     * This operation returns true if the list is empty, otherwise it returns false
     */

    public boolean isEmpty()
    {
        return head==null;
    }

    /**
     * This is a private operation (supplementary operation). It returns the node at the pos position of the list.
     */    
    private SLNode traversing(int pos)
    {
        SLNode temp = head;
        for(int i=0;i<pos;i++)
        {
            temp = temp.getNext();
        }
        return temp;

    }
    
    /**
     * This operation adds a newNode into the beginning of the list
     */
    
    public void add(SLNode newNode)
    {
        newNode.setNext(head);
        head = newNode;
    }
    
    /**
     * This operation returns the node at the pos position of the list.
     */    
    public SLNode get(int pos)
    {
        return traversing(pos);
    }

    /**
     * This operation returns the current length of the list. 
     */    
    public int getLength()
    {
        SLNode temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp = temp.getNext();
        }
        return count;
    }    
}