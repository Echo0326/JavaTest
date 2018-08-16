package TestArrayUtils;
/*
*方法的重载
**/
public class TestOverLoad {
}
class OverLoad{
    //定义两个int型变量的和
    public int getSum(int i,int j){
        return i+j;
    }
    public int getSum(int i,int j,int k){
        return i+j+k;
    }
    public double getSum(double d1,double d2){
        return d1+d2;
    }
    public void getSum(double d1,double d2,double d3){
        System.out.println(d1+d2+d3);
    }
}