package com.itcast.mapper;

import com.itcast.domain.TbCustomer;
import com.itcast.domain.TbCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户类的Dao层的接口
 */
public interface TbCustomerMapper {
    int countByExample(TbCustomerExample example);

    int deleteByExample(TbCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    //添加用户
    int insert(TbCustomer customer);

    int insertSelective(TbCustomer record);

    List<TbCustomer> selectByExample(TbCustomerExample example);

    TbCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByExample(@Param("record") TbCustomer record, @Param("example") TbCustomerExample example);

    int updateByPrimaryKeySelective(TbCustomer record);

    int updateByPrimaryKey(TbCustomer record);
}