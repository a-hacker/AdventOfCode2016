package main.Problem3;

/**
 * Created by ahacker on 12/11/2016.
 */
public class TriangeCounter {

    private String[] possibleTriangles;
    private int knownTriangles;

    public TriangeCounter(String[] numb3rs){
        this.possibleTriangles = numb3rs;
        this.knownTriangles = 0;
    }

    public int countTriangles(){
        for(String triangle : this.possibleTriangles){
            String[] vals = triangle.split("\\s");
            int[] realVals = new int[3];
            int j = 0;
            for (int i = 0; i < vals.length; i++){
                if (!vals[i].equals("")){
                    realVals[j] = Integer.parseInt(vals[i]);
                    j++;
                }
            }
            Triangle t = new Triangle(realVals);
            if (t.isTriangle()){
                this.knownTriangles++;
            }
        }
        return this.knownTriangles;
    }
}
