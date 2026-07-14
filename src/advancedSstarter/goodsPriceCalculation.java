package advancedSstarter;

public class goodsPriceCalculation {
    private String goodsName;
    private double goodsPrice;

    public goodsPriceCalculation(){}
    public goodsPriceCalculation(String value1, double value2) {
        goodsName = value1;
        goodsPrice = value2;
    }

    public void setGoodsName(String name) {goodsName = name;}
    public String getGoodsName() {return goodsName;}
    public void setGoodsPrice(double price) {goodsPrice = price;}
    public double getGoodsPrice() {return goodsPrice;}





    public double calculatedPrice(double goodsPrice) {
        if (goodsPrice >= 0 && goodsPrice < 1000) {
            return goodsPrice;
        } else if (goodsPrice >= 1000 && goodsPrice < 5000) {
            goodsPrice = goodsPrice * 0.9;
            return goodsPrice;
        } else if (goodsPrice >= 5000 && goodsPrice < 10000) {
            goodsPrice = goodsPrice * 0.8;
            return goodsPrice;
        } else if (goodsPrice<0) {
            System.out.println("价格不能小于0");
            return 0;
        } else {
            goodsPrice = goodsPrice * 0.7;
            return goodsPrice;
        }
    }



}
