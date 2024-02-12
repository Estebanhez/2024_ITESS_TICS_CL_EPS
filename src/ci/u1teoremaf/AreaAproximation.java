/*
 * ITESS-TICS*ENERO JUNIO 20-24 U1 TEOREMA FUNDAMENTA DEL CALCULO 
CALCULO DEL AREA MEDIANTE APROXIMACION DE AREA 
ESTEBAN PEREZ SANCHEZ 
09/FEBRERO/2024
 */
package ci.u1teoremaf;

public class AreaAproximation {
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x[];
    private double fx[];
    private double area;

    public AreaAproximation(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        x=new double[n +1];
        fx=new double[n +1];
    }
    
    public void computeArea(){
        dx=(xEnd-xIni)/n;
        area=0;
        for(int i=0; i<=n; i++){
            x[i]=xIni+i*dx;
            fx[i]=x[i]*x[i];
            area=area+fx[i]*dx;
        }
    }

    public double getArea() {
        return area;
    }
    
}
