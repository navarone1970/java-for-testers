package com.serenitydojo.assertions;

import com.serenitydojo.banking.InterestYieldingBond;
import com.serenitydojo.banking.Portfolio;
import com.serenitydojo.banking.SavingsAccount;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WhenCalculatingMonthlyInterest {

    @Test
    public void shouldCalculateInterestForSavingsAccount(){

        // GIVEN
        SavingsAccount savingsAccount = new SavingsAccount(1200,0.01);
        //savingsAccount.setBalance(1200);
        //savingsAccount.setInterestRate(0.01);

        // WHEN
        double earnedInterest = savingsAccount.calculateMonthlyInterest();

        // THEN
        assertThat(earnedInterest).isEqualTo(1.0);

    }

    @Test
    public void shouldCalculateInterestForBonds(){

        // GIVEN
        InterestYieldingBond bonds = new InterestYieldingBond(1200.00, 0.01);

        // WHEN
        double earnedInterest = bonds.calculateMonthlyInterest();

        // THEN
        assertThat(earnedInterest).isEqualTo(1.0);
    }

    @Test
    public void calculateInterestEarnedPortfolio(){

        // GIVEN
        Portfolio portfolio = new Portfolio();
        portfolio.add(new SavingsAccount(1200,0.01));
        portfolio.add(new InterestYieldingBond(1200, 0.01));

        // WHEN
        double totalEarnedInterest = portfolio.calculateMonthlyInterest();

        // THEN
        assertThat(totalEarnedInterest).isEqualTo(2.0);
    }
}
