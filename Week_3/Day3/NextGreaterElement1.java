 int[] ans = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ;i++){
            int j = 0;
            while(nums1[i] != nums2[j] ) {
                j++;
            }
            int right = j+1;
                
            ans[i] = -1 ;
               
            
           for( int k = j+1 ; k < nums2.length ; k++ ){
                if(nums1[i] < nums2[k] ){
                    ans[i] = nums2[k];
                    break;
                }
           }

        }
        return ans;
