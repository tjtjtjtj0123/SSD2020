package dongduk.cs.ssd.summerpetstore.dao.repository.mapper;

import dongduk.cs.ssd.summerpetstore.model.ItemModel;

public interface SproductMapper {
	
	//�˻��� ���� ī�װ� â ������ ������ �޼ҵ带 ������ �ҵ�
	ItemModel showInfoSp(int itemId);
	void registerSP(ItemModel im);
	void deleteSP(int itemId);
	void updateSP(ItemModel im);


}
