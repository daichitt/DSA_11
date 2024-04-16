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
        this.color = 'w';
        // this.color = 'w';
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
}
