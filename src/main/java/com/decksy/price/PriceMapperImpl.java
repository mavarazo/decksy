package com.decksy.price;

import com.decksy.domain.Price;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import javax.inject.Singleton;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

@Singleton
public class PriceMapperImpl implements PriceMapper {

  private final SqlSessionFactory sqlSessionFactory;

  public PriceMapperImpl(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  private PriceMapper getMapper(SqlSession sqlSession) {
    return sqlSession.getMapper(PriceMapper.class);
  }

  @Override
  public Price findById(long id) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findById(id);
    }
  }

  @Override
  public void save(Price price) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).save(price);
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
  public void update(long id, LocalDateTime last_modified, BigDecimal price) {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      getMapper(sqlSession).update(id, LocalDateTime.now(), price);
      sqlSession.commit();
    }
  }

  @Override
  public List<Price> findAll() {
    try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
      return getMapper(sqlSession).findAll();
    }
  }
}
