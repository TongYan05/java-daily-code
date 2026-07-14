package advancedSstarter;

public class phonePriceCalculation extends goodsPriceCalculation {

    public phonePriceCalculation() {
        System.out.println("手机享受额外补贴，在原有的基础上基础打9折。");
    }

    public phonePriceCalculation(String value1, double value2) {
        super(value1, value2);
    }

    @Override
    public double calculatedPrice(double goodsPrice) {
        goodsPrice=super.calculatedPrice(goodsPrice)*0.9;//继承父类的方法
        return goodsPrice;
    }
}
