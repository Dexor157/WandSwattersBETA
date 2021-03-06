package DataTypes;
import Functions.*;
import java.awt.*;
public class Angle {
    double deg,rad;
    Sysout out = new Sysout();
    public Angle(){
        deg = 0;
        rad = 0;
        out.out("help");
    }
    public double getDeg(){
        return deg;
    }
    public double getRad(){
        return rad;
    }
    public void setDeg(double _val){
        deg = _val;
        deg = fix(deg);
        rad = deg/360*(2*Math.PI);
    }
    public void setRad(double _val){
        rad = _val;
        deg = rad/(2*Math.PI)*360;
        deg = fix(deg);
        rad = deg/360*(2*Math.PI);
    }
    public double fix(double _deg){
        boolean fixed = false;
        fixed = (_deg >= 0 && _deg <= 360);
        while(fixed == false){
            if(_deg < 0){
                _deg = 360 + _deg;
            }else if(_deg > 360){
                _deg = _deg - 360;
            }else{
                fixed = true;
            }
        }
        return _deg;
    }
}
