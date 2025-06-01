public class Addition {

    public int Add(int... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++)
            sum += n[i];
        return sum;
    }
}
