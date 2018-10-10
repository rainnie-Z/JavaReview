package com.rainnie.myself;

public class PapperMountain {
	public static void main(String[] args) {
		//定义一个统计变量，默认值是0
        int count = 0;
         
        //最高山峰是珠穆朗玛峰：8848m这是最终的厚度
        //我现在有一张足够大的纸张，厚度为：0.05m这是初始厚度
        //为了简单，我把0.05变成5，同理8848就变成了884800
        double mountain = 884800;
        double papper = 0.05;
         
        while(papper<mountain) {
            //只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
            count++;
             
            //折叠一次有什么变化呢?就是厚度是以前的2倍。
            papper *= 2;
             
            System.out.println("第"+count+"次厚度是"+papper);
        }  
        //输出统计变量。
        System.out.println("要叠"+count+"次");
		 
	}
}
