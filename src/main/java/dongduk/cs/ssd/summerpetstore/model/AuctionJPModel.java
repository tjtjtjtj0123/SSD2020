package dongduk.cs.ssd.summerpetstore.model;

public class AuctionJPModel {
	
	int auctionId; //��ǰ��ȣ
	String userId; //����: yerinie0526'
	int offerPrice;
	
	public AuctionJPModel() {
		
	}
	public AuctionJPModel(int auctionId, String userId, int offerPrice) {
		super();
		this.auctionId = auctionId;
		this.userId = userId;
		this.offerPrice = offerPrice;
	}
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getOfferPrice() {
		return offerPrice;
	}
	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	} 
	
	
	

}

