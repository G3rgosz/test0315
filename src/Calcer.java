public class Calcer {
    double aSide;
    double bSide;
    double cSide;
    double dSide;
    public void setSides(double aSide,double bSide,double cSide,double dSide){
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.dSide = dSide;
    }
    public void getSides(){
        aSide = Input.input("A oldal");
        bSide = Input.input("B oldal");
        cSide = Input.input("C oldal");
        dSide = Input.input("D oldal");
    }
    public double calcArea(){
        if(!valuesIsOk()){
            return -1;
        }
        double halfPerimeter = (this.aSide+this.bSide+this.cSide+this.dSide)/2;
        double area = Math.sqrt(
            (halfPerimeter-aSide)*
            (halfPerimeter-bSide)*
            (halfPerimeter-cSide)*
            (halfPerimeter-dSide)
        );
        return area;
    }
    public boolean valuesIsOk(){
        if(this.aSide <= 0 || this.bSide <= 0 || this.cSide <= 0 || this.dSide <= 0){
            return false;
        }else{
            return true;
        }
    }
}
