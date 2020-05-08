class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
       
        // Stores all the x coordinate in the x arraylist
        for(int i=0;i<coordinates.length;i++){
            x.add(coordinates[i][0]);
        }
        
        // Stores all the y coordinate in the y arraylist
        for(int i=0;i<coordinates.length;i++){
            y.add(coordinates[i][1]);
        }
        
        int count = 0;
        
        // if two x co-ordinates are same it simply means that all other x co-ordinates also lie on the same                plane in order to make a straight line.
        if(x.get(0) == x.get(1)){
            for(int i=0;i<x.size()-1;i++){
                if(x.get(i) == x.get(i+1)){
                    ++count;
                }
            }
            
            if(count == x.size()-1){
                return true;
            }
            else{
                return false;
            }
        }
        
        // if two x co-ordinates are different so we have to check the necessary condition of straight line which            is y2 - y1 = m(x2 - x1). So, if this condition is satisfied means the line is straight otherwise not.
        
        else{
            double slope = (y.get(0) - y.get(1))/(x.get(0) - x.get(1));
            int temp = 0;
            for(int i=0;i<x.size();i++){
                if(y.get(i) - y.get(0) != slope * (x.get(i) - x.get(0))){
                    ++temp;
                }
            }
            
            if(temp == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}