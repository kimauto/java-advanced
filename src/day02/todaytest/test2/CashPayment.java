package day02.todaytest.test2;

public class CashPayment extends Payment {
    private String cashReceipNumber;


    public CashPayment(String shopName, String productName, long productPrice, String cashReceipNumber) {
        super(shopName, productName, productPrice);
        this.cashReceipNumber = cashReceipNumber;
    }

    @Override
    public void pay() throws PayException {
        if (productPrice <=0){
            throw new PayException("가격이 잘못되었습니다.");
        }

    }

    @Override
    public String toString() {
        return "현금이 정상적으로 지불되었습니다.\n" +
                "[ 현금 결제 정보]\n" +
                "상점명: " + shopName + "\n" +
                "상품명 : " + productName + "\n" +
                "상품가격 : " + productPrice + "\n" +
                "현금영수증번호 : " + cashReceipNumber ;
    }
}
