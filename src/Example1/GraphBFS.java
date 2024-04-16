/**
 * Write a description of class GraphBFS here.
 * @author (nxthang) 
 * @version (1.0)
 */
package Example1;
public class GraphBFS
{
    private static int n=7;
    private static int[][] a = {
                                {0,1,0,0,1,0,0},
                                {1,0,1,0,0,0,1},
                                {0,1,0,0,0,1,0},
                                {0,0,0,0,1,1,0},
                                {1,0,0,1,0,1,0},
                                {0,0,1,1,1,0,0},
                                {0,1,0,0,0,0,0}                                
                               };
    private static GVertex[] v;                               
    
    /**
     * Constructor for objects of class GraphBFS
     */
    public GraphBFS()
    {
        // Initialize the adjacency matrix
        // Initialize the list of vertices
    }
    
    public static void BFS(int s)
    {
        ArrayQueue q = new ArrayQueue();
        v[s].setColor('g');
        q.enqueue(s);
        while(!q.isEmpty())
        {
            int u = q.dequeue();
            System.out.println(v[u].getLabel());
            for(int i=0;i<n;i++)
            {
                if(a[u][i]==1 && v[i].getColor()=='w')
                {
                    v[i].setColor('g');
                    q.enqueue(i);
                }
            }
            v[u].setColor('b');
        }

    }
    
    public static void main(String[]args)
    {
        v = new GVertex[n];     //Create an empty list of n vertices
        // Initialize vertex's label
        v[0]=new GVertex('A');
        v[1]=new GVertex('B');
        v[2]=new GVertex('C');
        v[3]=new GVertex('D');
        v[4]=new GVertex('E');
        v[5]=new GVertex('F');
        v[6]=new GVertex('G');

        System.out.println("BFS traversal from vertex v[0]");
        BFS(0);
        System.out.println("BFS traversal from vertex v[6]");
        BFS(6);
        
    }
}
