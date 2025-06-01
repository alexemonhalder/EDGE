public class Division {

    public double Div (double ... n){
        double div = n[0];
        for( int i = 1; i<n.length; i++)
            div /= n[i];
        return div;
    }
}
