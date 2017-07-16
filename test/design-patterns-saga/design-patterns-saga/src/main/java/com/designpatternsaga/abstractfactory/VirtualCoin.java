package com.designpatternsaga.abstractfactory;

public class VirtualCoin {
	
	protected double volume;
	
	protected int buyOrderAmount;
	protected int sellOrderAmount;
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public int getBuyOrderAmount() {
		return buyOrderAmount;
	}
	public void setBuyOrderAmount(int buyOrderAmount) {
		this.buyOrderAmount = buyOrderAmount;
	}
	public int getSellOrderAmount() {
		return sellOrderAmount;
	}
	public void setSellOrderAmount(int sellOrderAmount) {
		this.sellOrderAmount = sellOrderAmount;
	}

}
