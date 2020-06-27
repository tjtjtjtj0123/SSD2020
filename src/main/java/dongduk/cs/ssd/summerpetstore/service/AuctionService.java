package dongduk.cs.ssd.summerpetstore.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dongduk.cs.ssd.summerpetstore.dao.AuctionDAO;
import dongduk.cs.ssd.summerpetstore.dao.CartDAO;
import dongduk.cs.ssd.summerpetstore.model.AuctionJPModel;
import dongduk.cs.ssd.summerpetstore.model.AuctionModel;


@Service
public class AuctionService {
	
	@Autowired
	private AuctionDAO adao;
	

	//ī���ڸ�, ���� �����ε� �˻��� �����ؾ��ϹǷ� �� ��ü�� ��������ҵ�
	public List<AuctionModel> searchAuction(AuctionModel am) { 
		return adao.searchAuction(am);
	}
	
	public List<AuctionModel> searchAuctionByDday(AuctionModel am) { 
		return adao.searchAuctionByDday(am);
	}
	
	public List<AuctionModel> searchAuctionByCon(AuctionModel am) { 
		return adao.searchAuctionByDday(am);
	}
	

	public AuctionModel showInfo(int auctionId) { 
		return adao.showInfo(auctionId);
	}

	public List<AuctionJPModel> showJPList(int auctionId) {
		return adao.showJPList(auctionId);
	}


	public void registerAuction(AuctionModel am) { 
		adao.registerAuction(am);
	}
	

	public void updateAuction(AuctionModel am) {
		adao.updateAuction(am);
	}

	
	public void deleteAuction(int auctionId) {
		adao.deleteAuction(auctionId);
	}
	
	public void bid(AuctionJPModel jpm, AuctionModel am) {
		adao.bid(jpm, am);
	}
	
	
	public void updateBid(AuctionJPModel jpm) {
		adao.updateBid(jpm);
	}
	
	public void sucBid(AuctionModel am) {
		adao.sucBid(am);
	}
	
	public boolean isNewPrice(int price, int auctionId) {
		if(adao.getFirstPrice(auctionId) < price) return true;
		else return false;
	}

}