package dongduk.cs.ssd.summerpetstore.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import dongduk.cs.ssd.summerpetstore.model.GpModel;
@Repository
public class CartDAO {
	
//	private String namespace = "summerpetstore.repository.mapper.CartMapper";
//	private SqlSessionFactory sqlSessionFactory = createSqlSessionFactory();
//	private SqlSessionFactory createSqlSessionFactory() {
//		String resource = "mybatis-config.xml";
//		InputStream inputStream;
//		try {
//			inputStream = Resources.getResourceAsStream(resource);
//		} catch (IOException e) {
//			throw new IllegalArgumentException(e);
//		}
//		return new SqlSessionFactoryBuilder().build(inputStream);
//	}
//	
//	
//
//	public int deleteCart(String userId, int itemId) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			int result = sqlSession.delete(namespace + ".deleteCart", itemId);
//			if(result > 0) { sqlSession.commit(); }
//			return result;
//		}finally { sqlSession.close(); }
//	}
//	
//
//	public int deleteCartByUser(String userId) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			int result = sqlSession.delete(namespace + ".deleteCartByUser",userId);
//			if(result > 0) { sqlSession.commit(); }
//			return result;
//		}finally { sqlSession.close(); }
//	}
//	
//	
//
//	public int order(String userId, int orderId){
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			int result = sqlSession.delete(namespace + ".cancelGp", userId); 
//			if(result > 0) { sqlSession.commit(); }
//			return result;
//		}finally { sqlSession.close(); }
//	}
//	
//
//	public int addCart(String userId, int itemId, int price) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			int result = sqlSession.insert(namespace + ".addCart", userId); 
//			if(result > 0) { sqlSession.commit(); }
//			return result;
//		}finally { sqlSession.close(); }
//		//return GpMapper.searchGp(name, itemKind);
//	}
//	
//	
//
//	public int getItemCount(int itemId, String userId) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			int result = sqlSession.selectOne(namespace + ".containsItemId", userId); 
//			return result;
//		}finally { sqlSession.close(); }
//	}
//	
//	//quantity + 1
//	public void incrementQuantityByItemId(int itemId, String userId) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//		try {
//			sqlSession.update(namespace + ".incrementQuantityByItemId", userId); 
//		}finally { sqlSession.close(); }
//	}
	
}