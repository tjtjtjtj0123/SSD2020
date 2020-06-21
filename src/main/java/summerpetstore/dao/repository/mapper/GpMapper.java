package summerpetstore.dao.repository.mapper;

import java.util.List;

import summerpetstore.model.CompleteOrderModel;
import summerpetstore.model.GpModel;

public interface GpMapper {
	
	void updateGp(GpModel gm);
	void deleteGp(int itemId);
	void cancelGp(int itemId); //����
	List<GpModel> searchGp(String gpStatus, int productId, String name);
	
	//�������� ����
	void participateGp(int currentCon, int itemId);
	void addCompleteOrder(CompleteOrderModel com);
	void addGpJP(int itemId, String userId);
	
	boolean is_GPJP_exist(int itemId);
	void cancelGpJP(int itemId);

}
