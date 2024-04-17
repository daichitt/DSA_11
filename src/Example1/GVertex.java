/**
 * Class GVertex implement a simple vertex of a graph. Each vertex is assigned a character label.
 * @author (nxthang) 
 * @version (1.0)
 */
package Example1;
public class GVertex
{
    private char label;
    private char color;
    /**
     * Constructor for objects of class GVertex
     */
    public GVertex(char label)
    {
        this.label = label;
        this.color = 'B'; // init Black
    }
    // B = not visited
    // Y = visited already
    // color use status of Vertex weather visited of not visited
    
    public char getLabel()
    {
        return this.label;
    }
    
    public void setLabel(char label)
    {
        this.label = label;
    }
    
    public char getColor()
    {
        return this.color;
    }
    
    public void setColor(char color)
    {
        this.color = color;
    }
}
