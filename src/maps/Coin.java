package maps;

public enum Coin {
    FIVE_CENT(0.05), TEN_CENT (0.10), TWENTY_CENT (0.20), FIFTY_CENT(0.50), ONE_EURO(1.00), TWO_EURO(2.00);

    private double monetaryValue;

    Coin(double monetaryValue) {
        this.monetaryValue = monetaryValue;
    }

    public double getMonetaryValue() {
        return monetaryValue;
    }
}
