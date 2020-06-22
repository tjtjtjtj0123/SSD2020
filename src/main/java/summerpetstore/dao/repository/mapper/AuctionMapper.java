package summerpetstore.dao.repository.mapper;

import java.util.List;

import summerpetstore.model.AuctionJPModel;
import summerpetstore.model.AuctionModel;

public interface AuctionMapper {
	
	List<AuctionModel> searchAuction(AuctionModel am);
	List<AuctionModel> searchAuctionByDday(AuctionModel am);
	List<AuctionModel> searchAuctionByCon(AuctionModel am);
	AuctionModel showInfo(int auctionId);
	List<AuctionJPModel> showJPModel(int auctionId);
	void registerAuction(AuctionModel am);
	void updaeAuction(AuctionModel am);
	void deleteAuction(int auctionId);
	void bid(AuctionJPModel jpm);
	void changeFirstId(AuctionJPModel jpm); //���⼭ userId�� offerPrice�� ������������ �ƴϸ� �׳� �� �ΰ��� �����ִ���
	void updateBid(AuctionJPModel jpm);
	//void deleteBid ���ݸ� �������� ����� ��Ȳ�� ����� ���ֱ���� toss��ɵ� ��������
	void sucBid(AuctionModel am);
	int getFirstPrice(int auctionId); //���� �ְ� ��ȯ: �ַ� ���������̳� �����Ҷ� �������� �ְ����� ������ Ŀ���ϹǷ� ���Ҷ� ���

}
