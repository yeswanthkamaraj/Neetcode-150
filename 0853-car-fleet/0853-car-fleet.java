class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet=position.length;
        Map<Integer,Float> fmap=new HashMap<Integer,Float>();
        for(int i=0;i<position.length;i++){
             float time=((float)target-position[i])/speed[i];
             fmap.put(position[i],time);
        }
        Arrays.sort(position);
        int i=position.length-1;
        while(i>0){
            float c=fmap.get(position[i]);
            i--;
            while(i>=0 && c>=(float)fmap.get(position[i])){
                fleet--;
                i--;
            }
        }
        return fleet;
    }
}