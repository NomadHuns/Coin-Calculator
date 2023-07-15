public class Coin {
    public static void main(String[] args) {
        int money = 13420;

        int restMoney = money;

        int count500 = 0;
        int count100 = 0;
        int count50 = 0;
        int count10 = 0;

        count500 = restMoney / 500;
        System.out.println("500원 : " + count500);
        restMoney = restMoney % 500;

        count100 = restMoney / 100;
        System.out.println("100원 : " + count100);
        restMoney = restMoney % 100;

        count50 = restMoney / 50;
        System.out.println("50원 : " + count50);
        restMoney = restMoney % 50;

        count10 = restMoney / 10;
        System.out.println("10원 : " + count10);
        restMoney = restMoney % 10;
    }

}
