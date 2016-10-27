package com.hj.d_16_04_30;

/**
 * Created by hengjiang on 16/4/30.
 */
public class test_package {
    public String bang;
    //String Sex;

   public void Launch(String Name,String Sex){
        if (Sex == "girl"){
            System.out.print("我要操" + Name + "\n");
            if(bang!=null)
                System.out.print(Name + "吃" + bang);
        }
        else
        {
            System.out.print("滚");
        }
    }
}
