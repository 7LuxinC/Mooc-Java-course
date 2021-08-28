
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }


    public Money plus(Money addtion) {

        Money newMoney = new Money((this.euros + addtion.euros), (this.cents + addtion.cents));

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros < compared.euros && this.cents < compared.cents) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents) {
            return true;
        }

        return false;
    }


    public Money minus(Money decreaser) {
        int takeEuros = this.euros - decreaser.euros;
        ;
        int takeCents = this.cents - decreaser.cents;
        ;

        if (this.euros > decreaser.euros && this.cents < decreaser.cents) {
            takeEuros--;
            takeCents += 100;
            //if the initial of Takecents are negative,
            // then take away 1 euro(==100 cents)
            // and take away the rest of the money
            Money newMoney = new Money(takeEuros, takeCents);
            return newMoney;
        } else if (this.euros < decreaser.euros) {
            takeEuros = 0;
            takeCents = 0;

            Money newMoney = new Money(takeEuros, takeCents);
            return newMoney;
        }

        Money newMoney = new Money(takeEuros, takeCents);
        return newMoney;

    }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
