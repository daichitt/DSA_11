/**
 * Class GALVertex implement a simple vertex of a graph. Each vertex is assigned a character label.
 * @author (nxthang) 
 * @version (1.0)
 */
package Example2;
public class GALVertex
{
    private char label;
    private char color;
    private SLList adjList;
    /**
     * Constructor for objects of class GVertex
     */
    public GALVertex(char label)
    {
        this.label = label;
        this.color = 'w';
        adjList = new SLList();
    }
    
    public char getLabel()
    {
        return label;
    }
    
    public void setLabel(char label)
    {
        this.label = label;
    }
    
    public char getColor()
    {
        return color;
    }
    
    public void setColor(char color)
    {
        this.color = color;
    }
    
    public void addToAdjList(int vertex)
    {
//        adjList.add(vertex);//
        adjList.add(new SLNode(vertex));
    }
    
    public SLList getAdjList()
    {
        return adjList;
    }
}
