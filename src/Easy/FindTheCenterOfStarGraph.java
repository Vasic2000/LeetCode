package Easy;

public class FindTheCenterOfStarGraph {
    public static void main(String[] args) {
        int[][] edges1 = {{1,2},{2,3},{4,2}};
        int[][] edges2 = {{1,2},{5,1},{1,3},{1,4}};
        int[][] edges3 = {{5,20},{511,5},{5,321},{5,400},{1032,5}};


        System.out.println(findCenter(edges1));
        System.out.println(findCenter(edges2));
        System.out.println(findCenter(edges3));
    }

    public static int findCenter(int[][] edges) {
        if(edges[0][0] == edges[1][0]) return edges[0][0];
        if(edges[0][0] == edges[1][1]) return edges[0][0];
        if(edges[0][1] == edges[1][0]) return edges[0][1];
        if(edges[0][1] == edges[1][1]) return edges[0][1];
        return -1;

//        for (int i = 0; i < edges.length; i++) {
//
//        }
    }
}
