public class Substraction {

        public int Sub(int ... n){
            int sub = n[0];
            for(int i= 1; i<n.length;i++)
                sub -= n[i];
            return sub;
        }
    }
