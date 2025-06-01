public class Main {

    public static void main(String[] args){
        Addition jog = new Addition();
        Substraction biyog = new Substraction();
        Multiplication goon = new Multiplication();
        Division bhaag = new Division();

        System.out.println("Add: "+ jog.Add(1,2,3,4,5,8));
        System.out.println("Sub: "+ biyog.Sub(1,0,3,4,5,8));
        System.out.println("Mul: "+ goon.Mul(1,2,4,4,5,8));
        System.out.println("Div: "+ bhaag.Div(1,2,3,4,5,8));
    }
}
