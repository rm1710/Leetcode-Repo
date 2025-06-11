class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> s=new HashSet<>();

        int x=0,y=0;
        s.add("0,0");

        for(char d:path.toCharArray()){
            if(d=='N') y++;
            else if(d=='S') y--;
            else if(d=='E') x++;
            else if(d=='W') x--;

            String p=x+","+y;
            if(s.contains(p)){
                return true;
            }
            s.add(p);
        }   
        return false;
    }
}