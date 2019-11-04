package com.decksy.product;

import com.decksy.domain.Product;
import java.time.LocalDateTime;
import java.util.List;
import javax.inject.Singleton;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

@Singleton
public class ProductMapperImpl implements ProductMapper {

  private final SqlSessionFactory sqlSessionFactory;

  public ProductMapperImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  private ProductMapper getMapper(SqlSession sqlSession) {
    return sqlSession.getMapper(ProductMapper.class);
  }

  @Override
  public Product findById(long id) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findById(id);
    }
  }

  @Override
  public void save(Product product) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).save(product);
      sqlSession.commit();
    }
  }

  @Override
  public void deleteById(long id) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).deleteById(id);
      sqlSession.commit();
    }
  }

  @Override
  public void update(
      long id,
      LocalDateTime last_modified,
      String name,
      int icon,
      String expansion,
      String rarity) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).update(id, LocalDateTime.now(), name, icon, expansion, rarity);
      sqlSession.commit();
    }
  }

  @Override
  public List<Product> findAll() {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findAll();
    }
  }
}
