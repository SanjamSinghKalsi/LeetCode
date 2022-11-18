class Solution {
    public boolean isUgly(int n) {
        
       int abs  = Math.abs(n);
        if(n==1){
            return true;
        }
        if(n<=0){
            return false;
        }
       
        for(int i =2;i<=abs;i++){
            int flag = 0;
            if(abs%i==0 && (i!=2 && i!=3 && i!=5)){
                for(int j = 2 ; j<i;j++){
                    if(i%j ==0){
                        flag =1;
                    }
                }
                if(flag == 0){
                    System.out.println(i);
                    return false;
                }
                else{
                    continue;
                }
                
                
            }
            
        }
        return true;
    }
}




//Optimised code


class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        while(n>0 && n%5==0){
            n=n/5;
        }
        while(n>0 && n%3==0){
            n=n/3;
        }
        while(n>0 && n%2==0){
            n=n/2;
        }
        return n==1;

    }
}

