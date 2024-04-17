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
                                {0,1,0,0,1,0,0}, // v0=A index of 0
                                {1,0,1,0,0,0,1}, // v1=A
                                {0,1,0,0,0,1,0}, // v2=A
                                {0,0,0,0,1,1,0}, // v3=A
                                {1,0,0,1,0,1,0}, // v4=A
                                {0,0,1,1,1,0,0}, // v5=A
                                {0,1,0,0,0,0,0}  // v6=A
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
        for (int i = 0; i < n; i++) { // AlL black 0 to 6
            v[s].setColor('B'); // init color is black
        }
        ArrayQueue q = new ArrayQueue(); // create ArrayQueue instance
        v[s].setColor('Y'); // change Y to graph array by index of s (S is argument)
        System.out.println(v[s].getLabel() + " ");
        q.enqueue(s); // add data
        while (!q.isEmpty()) {
            int u = q.dequeue();
            for (int j = 0; j < n; j++){
                // System.out.println();
                // (a[u][j] == 1) == adjacent && not visited
                if((a[u][j] == 1)&&(v[j].getColor() == 'B')) {
                    v[j].setColor('Y'); // visited
                    System.out.println(v[j].getLabel() + " " );
                    q.enqueue(j);
                }
            }
        }
    }
    
    public static void main(String[]args)
    {
        v = new GVertex[n];     //Create an empty list of n vertices with len 7
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
