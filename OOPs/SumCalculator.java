package OOPs;

class SumCalculator {
    int num1;
    int num2;

    public SumCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int sum(){
        int add = num1 + num2;
        return add;
    }
    public int sum2(int a , int b){
        int add = a + b;
        return add;
    }
    public int fromObject (SumCalculator obj1 , SumCalculator obj2){
        int a = obj1.sum();
        int b = obj2.sum();
        return a+b;
    }
}
