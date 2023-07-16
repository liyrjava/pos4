package cn.itbaizhan;

public class TestIf01 {
    public  static  void main(String[] args)
    {
    double r = Math.random();
    double area = Math.PI*r*r;
    double circle= 2*Math.PI*r;
    System.out.println("半径："+ r );
    System.out.println("周长："+ circle );
    System.out.println("面积："+ area );

    if(area>=circle)
    {
        System.out.println("面积大于等于周长" );
    }
    else
    {
        System.out.println("面积小于周长" );

    }


    //int i = (int )(d*7);
   // System.out.println(i);
    }

}
