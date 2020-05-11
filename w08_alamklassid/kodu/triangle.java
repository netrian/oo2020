public class triangle extends shape {
    int kylg_a;
    int kylg_b;
    int kylg_c;
    int pindala_S;
    int korgus_h;

    public triangle(int a, int b, int c, int S, int h){
        this.kylg_a = a;
        this.kylg_b = b;
        this.kylg_c = c;
        this.pindala_S = S;
        this.korgus_h = h;
    }

    @Override
    public double getKYmbermoot(){
        return kylg_a + kylg_b + kylg_c;
    }

    @Override
    public double getKPindala() {
        return (kylg_a * korgus_h) / 2;
    }
}