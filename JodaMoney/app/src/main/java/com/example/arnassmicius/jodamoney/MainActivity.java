package com.example.arnassmicius.jodamoney;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.joda.money.BigMoney;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a monetary value
        Money money = Money.parse("USD 23.87");
        Log.d(TAG, "onCreate: initial money = " + money);

        // add another amount with safe double conversion
        CurrencyUnit usd = CurrencyUnit.of("USD");
        money = money.plus(Money.of(usd, 12.43d));
        Log.d(TAG, "onCreate: money + 12.43 = " + money);

        // subtracts an amount in dollars
        money = money.minusMajor(2);
        Log.d(TAG, "onCreate: money - 2 = " + money);

        // multiplies by 3.5 with rounding
        money = money.multipliedBy(3.5d, RoundingMode.DOWN);
        Log.d(TAG, "onCreate: money * 3.5 = " + money);

        // compare two amounts
        Money dailyWage = Money.parse("USD 700");
        boolean bigAmount = money.isGreaterThan(dailyWage);
        Log.d(TAG, "onCreate: money.isGreaterThan(700) = " + bigAmount + "; money = " + money);

        // convert to GBP using a supplied rate
        BigDecimal conversionRate = new BigDecimal(1.2315);
        Money moneyGBP = money.convertedTo(CurrencyUnit.GBP, conversionRate, RoundingMode.HALF_EVEN);
        Log.d(TAG, "onCreate: moneyGBP = " + moneyGBP);

        // use a BigMoney for more complex calculations where scale matters
        BigMoney moneyCalc = money.toBigMoney();
        Log.d(TAG, "onCreate: moneyToBigMoney = " + moneyCalc);
    }
}
