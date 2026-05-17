class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        List<Integer> pos= new ArrayList<>();
        List<Integer> neg= new ArrayList<>();

        for(int num:nums){
            if(num<0) neg.add(num);
            else pos.add(num);
        }

        //full negative
        if(pos.size()==0){
            for(int i=0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }
        

        // full positive
        if(neg.size()==0){
            for(int j=0;j<pos.size();j++){
                pos.set(j,pos.get(j)*pos.get(j));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        //Case 3: both negative and positive exist
        int n1=neg.size();
        int n2=pos.size();

        int[] res= new int[n1+n2];

        //square neg and reverse them
        for(int i=0;i<n1;i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);

        //square positives
        for(int i=0;i<n2;i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        int i=0;
        int j=0;
        int id=0;
        while(i<n1 && j<n2){
            if(neg.get(i)<=pos.get(j)){
                res[id++]= neg.get(i++);
            }else{
                res[id++]=pos.get(j++);
            }
        }

        while(i<n1){
            res[id++]=neg.get(i++);
        }
        
        while(j<n2){
            res[id++]=pos.get(j++);
        }

        return res;

    }
}