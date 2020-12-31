package com.company;

public class Stock {
   Object[][] stockObjects = new Object[2][5];
    public String stockName;

    public Double shareInvestment;
    public Double sharePrice;
    public Double totalInvested;

    public Integer sharesOwned;
    public Integer stockShares;

    String getStockName() {
        return stockName;
    }

    Integer getNumberOfShares() {
        return sharesOwned;
    }

    Double getSharesValue() {
        return sharesOwned * sharePrice;
    }

    Integer getSharesOwned() {
        return sharesOwned;
    }

    Double getTotalInvested() {
        return totalInvested;
    }

    void setInvestAmount(Double newInvestment) {
        this.shareInvestment = newInvestment;
    }


}
