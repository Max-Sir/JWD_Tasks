package home_task.solution;


import javax.swing.text.html.parser.Parser;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
	    var sln=new Solution();
	    int x=1235;
        System.out.println(sln.last_digit(x));

        int year=2020, month= Calendar.FEBRUARY;
        System.out.println(sln.numberOfDaysInMonth(year,month));

        double S1=25.0;
        System.out.println(sln.Squares(S1)+" S1:S2 == "+S1/sln.Squares(S1));

        int [] vals={1,2,3,4};
        System.out.println(sln.check_condition(vals));

        int to_check=6;
        System.out.println(sln.isPerfect(to_check));
    //    System.out.println("result is "+sln.Squares(new BigDecimal("25.0"))+" "+sln.Squares(new BigDecimal("25.0")).equals(new BigDecimal("25.0").divide(new BigDecimal("2.0"))));

        sln.HH_MM_SS_DateFormatter(40000);

        sln.closest_Point2D(5,4,10.56,16.654);

        double arg_x=3.0;
        System.out.printf("F(%f) = %f\n",arg_x,sln.F(arg_x));

        double R=9.85;
        var result=sln.Circle(R);
        System.out.printf("S = %f\tC=%f\n",result[0],result[1]);

        System.out.println();
        System.out.println("F(x)=tg(x)");
        sln.F_tg_with_step(5.0,10.5,5.50000000000000000000000000000000000000000000000005);
    }
}
