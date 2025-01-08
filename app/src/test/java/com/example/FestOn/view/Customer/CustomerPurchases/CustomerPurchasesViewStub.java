package com.example.FestOn.view.Customer.CustomerPurchases;

public class CustomerPurchasesViewStub implements CustomerPurchasesView {
    private Integer count, showPurchasesMadeCount;

    public CustomerPurchasesViewStub() {
        count = showPurchasesMadeCount = 0;
    }

    @Override
    public void setCountOfPurchases(Integer count) {
        this.count = count;
    }

    public Integer getCountOfPurchases() {
        return count;
    }

    @Override
    public void showPurchasesMade() {
        showPurchasesMadeCount++;
    }

    public Integer getShowPurchasesMadeCount() {
        return showPurchasesMadeCount;
    }
}
