public class Multiplication {

    public int Mul(int ... n){
        int mux = n[0];
        for(int i= 1; i < n.length; i++)
            mux *= n[i];
        return mux;
    }
}
