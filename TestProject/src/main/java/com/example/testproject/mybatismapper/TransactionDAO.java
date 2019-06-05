/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testproject.mybatismapper;

import com.utilibill.market.dto.MarketTransactionDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 *
 * @author kelly
 */
@Component
public class TransactionDAO {

  private final SqlSession sqlSession;

  public TransactionDAO(SqlSession sqlSession) {
    this.sqlSession = sqlSession;
  }

  public MarketTransactionDto selectTransactionsByRowId(int row_id) {
    return this.sqlSession.selectOne("selectTransactionsByRowId", row_id);
  }

}