//Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int l= flowerbed.length;
        for(int i=0;i<l;i++)
        {
            if(flowerbed[i]!=1)
            {
                if(i==0)
                {
                    if(i!=l-1)
                    {
                        if(flowerbed[i]==0 && flowerbed[i+1]==0)
                        {
                            count++;
                            flowerbed[i]=1;
                        }
                        
                    }
                    else
                    {
                        if(flowerbed[i]==0)
                        {
                            count++;
                            flowerbed[i]=1;
                        }
                    }
                }
                else if(i==l-1)
                {
                    if(flowerbed[i-1]==0)
                    {
                       count++;
                       flowerbed[i]=1; 
                    }
                }
                
                else if(i>0 && i<l-1)
                    {
                        if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                        {
                            count++;
                            flowerbed[i]=1;
                        }
                            
                    }
                }
            }
        if(count>=n)
            return true;
        else 
            return false;
        }
    }
