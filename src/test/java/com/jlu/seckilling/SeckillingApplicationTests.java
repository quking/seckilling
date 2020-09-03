package com.jlu.seckilling;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeckillingApplicationTests {

    @Test
    void contextLoads() {
        int []nums = {4,5,6,7,0,1,2};
        int i = 0, j = nums.length-1, m = 0;
        while(j > i){
            m = (i + j) / 2;
            if(nums[m] > nums[i] && nums[m] > nums[j])
                i = m;
            else if(nums[m] < nums[i] && nums[m] < nums[j])
                j = m;
            else
                break;
        }
        System.out.println(m);
    }

}
