package dongduk.cs.ssd.summerpetstore.dao.repository.mapper;

import java.util.List;

import dongduk.cs.ssd.summerpetstore.model.ItemModel;

public interface SproductMapper {
	
	//�˻��� ���� ī�װ� â ������ ������ �޼ҵ带 ������ �ҵ�
	List<ItemModel> showInfoSP(String cname);
	void registerSP(ItemModel im);
	void deleteSP(int itemId);
	void updateSP(ItemModel im);
	ItemModel showdetailInfoSP(int itemId);
}
