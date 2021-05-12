package com.xushen;

/**
 * Created by Administrator on 2019/1/8/005.
 */
public class TestQiyun {

    public static void main(String[] args) {
//        new TestQiyun().testI(5);
        new TestQiyun().testBeautyString3("abcdefghijklmnopqrstuvwxyz", 3);
//        new TestQiyun().testBeautyString("abcdefghijklmnopqrstuvwxyz", 10);
//        new TestQiyun().testFive();
    }

    /**
     * 计算第i个用户报数
     * @param n
     * @return
     */
    int testI(int n){
        int icount=0;
        int a1=3;
        int a2=5;
        int a3=7;
        int temp=0;
        if(n==1){
            return  a1;
        }
        if(n==2){
            return  a2;
        }
        if(n==3){
            return  a3;
        }
        for(int i=4;i<=n;i++){
            icount=a1+a3-a2*2;
            a1=a2;
            a2=a3;
            a3=icount;
            System.out.println("n:"+icount);
        }
        return icount;
    }

    /**
     * 计算等差数列个数
     * @param str
     * @param n
     * @return
     */
    int testBeautyString(String str,int n){
        int totalCount=0;
        char [] aa=str.toCharArray();
        if(n>26){
            return totalCount;
        }
        for(int i=0;i<aa.length-n;i++){
            String sub=str.substring(i, i + n);
            int lasttemp=0;
            for(int j=0;j<sub.length()-2;j++){
                if(j==0){
                    lasttemp= sub.charAt(j)-sub.charAt(j+1);
                }else if(lasttemp!=(sub.charAt(j)-sub.charAt(j+1))){
                    System.out.println("不是等差数列");
                    continue;
                }
            }
            System.out.print(" "+sub+" ");
            totalCount=totalCount+1;
        }
        System.out.println(totalCount);
        return totalCount;
    }

    int testBeautyString2(String str,int n){
        int totalCount=0;
        if(n>26){
            return totalCount;
        }
        for(int i=0;i<str.length();i++){
            int lasttemp=0;
            for(int j=0;(j+i<str.length());j++){
                if(j==0){
                    lasttemp= str.charAt(j)-str.charAt(j+i);
                }else if(lasttemp!=(str.charAt(j)-str.charAt(j+i))){
                    System.out.println("不是等差数列");
                }
            }
            totalCount=totalCount+1;
        }
        System.out.println(totalCount);
        return totalCount;
    }

    /**
     * 打印所有等差数列
     * @param str
     * @param n
     * @return
     */
    int testBeautyString3(String str,int n){
        int totalCount=0;
        if(n>26){
            return totalCount;
        }
        for(int i=0;i<str.length()-n;i++){//从第几个开始
            for(int x=1;x<str.length()-n;x++){//每次隔几个
                StringBuffer sub=new StringBuffer(str.charAt(i));
                for(int y=1;y<n;y++){//第几个字母
                    sub.append(str.charAt(i + x));
                }
                int lasttemp=0;
                for(int j=0;j<sub.length()-2;j++){
                    if(j==0){
                        lasttemp= sub.charAt(j)-sub.charAt(j+1);
                    }else if(lasttemp!=(sub.charAt(j)-sub.charAt(j+1))){
                        System.out.println("不是等差数列");
                        continue;
                    }
                }
                System.out.print(" "+sub+" ");
                totalCount=totalCount+1;

            }
        }
        System.out.println(totalCount);
        return totalCount;
    }
    /**
     * 计算Timothy数
     * 计算次数：399990  Timothy个数：199996
     */
    void testFive(){
        int count=1;
        int cc=0;
        for(long i=25;i<1000000l;i++){
            cc=cc+1;
           long mounty=i*i;
            if(mounty%5==0) {
                cc=cc+1;
                count=count+1;
            }
            if(mounty>1000000000000l){
               break ;
            }
        }
        System.out.println("计算次数："+cc+"  Timothy个数："+count);
    }
}
