package mypackage;

/**
 * Created by qwerty on 09-Nov-17.
 */
public class Integral {
    private double[] weights;
    private double[] points;

    private double f(double x, double y)
    {
        return 2*Math.pow(x,2)*Math.pow(y,2)+6*x+5;
    }

    Integral()
    {
        weights=new double[3];
        weights[0]=5./9.;
        weights[1]=8./9.;
        weights[2]=5./9.;

        points=new double[3];
        points[0]=-Math.sqrt(3./5.);
        points[1]=0;
        points[2]=Math.sqrt(3./5.);
    }

    public double licz()
    {
        double sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum+=f(points[i],points[j])*weights[i]*weights[j];
            }
        }
        return sum;
    }
}
