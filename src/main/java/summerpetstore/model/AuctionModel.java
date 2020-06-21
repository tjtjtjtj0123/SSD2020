package summerpetstore.model;

import java.sql.Date;

public class AuctionModel {
	
	int auctionId;
	String name;
	Date deadline;
	int dday;
	String description;
	int minprice;
	String astatus;
	int productId;
	int sellerInfoId;
	String firstId;
	int currentCon;
	int curMaxPrice;
	
	public AuctionModel() {
		
	}
	public AuctionModel(int auctionId, String name, Date deadline, int dday, String description, int minprice,
			String astatus, int productId, int sellerInfoId, String firstId, int currentCon, int curMaxPrice) {
		super();
		this.auctionId = auctionId;
		this.name = name;
		this.deadline = deadline;
		this.dday = dday;
		this.description = description;
		this.minprice = minprice;
		this.astatus = astatus;
		this.productId = productId;
		this.sellerInfoId = sellerInfoId;
		this.firstId = firstId;
		this.currentCon = currentCon;
		this.curMaxPrice = curMaxPrice;
	}
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public int getDday() {
		return dday;
	}
	public void setDday(int dday) {
		this.dday = dday;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMinprice() {
		return minprice;
	}
	public void setMinprice(int minprice) {
		this.minprice = minprice;
	}
	public String getAstatus() {
		return astatus;
	}
	public void setAstatus(String astatus) {
		this.astatus = astatus;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getSellerInfoId() {
		return sellerInfoId;
	}
	public void setSellerInfoId(int sellerInfoId) {
		this.sellerInfoId = sellerInfoId;
	}
	public String getFirstId() {
		return firstId;
	}
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}
	public int getCurrentCon() {
		return currentCon;
	}
	public void setCurrentCon(int currentCon) {
		this.currentCon = currentCon;
	}
	public int getCurMaxPrice() {
		return curMaxPrice;
	}
	public void setCurMaxPrice(int curMaxPrice) {
		this.curMaxPrice = curMaxPrice;
	}
	
	
	
	

}