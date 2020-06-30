package dongduk.cs.ssd.summerpetstore.dao.repository.mapper;

import java.util.List;

import dongduk.cs.ssd.summerpetstore.controller.AuctionForm;
import dongduk.cs.ssd.summerpetstore.model.AuctionJPModel;
import dongduk.cs.ssd.summerpetstore.model.AuctionModel;

public interface AuctionMapper {
	
	List<AuctionModel> searchAuction(String cname, String itemKind, String keyword);
	List<AuctionModel> searchAuctionByDday(AuctionModel am);
	List<AuctionModel> searchAuctionByCon(AuctionModel am);
	AuctionModel showInfo(int auctionId);
	List<AuctionJPModel> showJPModel(int auctionId);
	void registerAuction(AuctionForm af);
	void updaeAuction(AuctionModel am);
	void deleteAuction(int auctionId);
	void bid(String firstId, int curMaxPrice, int auctionId);
	void changeFirstId(AuctionJPModel jpm); //���⼭ userId�� offerPrice�� ������������ �ƴϸ� �׳� �� �ΰ��� �����ִ���
	void updateBid(AuctionJPModel jpm);
	//void deleteBid ���ݸ� �������� ����� ��Ȳ�� ����� ���ֱ���� toss��ɵ� ��������
	void sucBid(AuctionModel am);
	int getFirstPrice(int auctionId); //���� �ְ� ��ȯ: �ַ� ���������̳� �����Ҷ� �������� �ְ����� ������ Ŀ���ϹǷ� ���Ҷ� ���
	List<AuctionModel> showAuctionList();
	List<AuctionModel> searchAuctionByUser(String userId);
	void registerPriceAuction(AuctionJPModel ajp);
	public void updateinfoBID(AuctionJPModel ajp);
}
