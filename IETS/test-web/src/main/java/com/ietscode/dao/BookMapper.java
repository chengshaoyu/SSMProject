package com.ietscode.dao;

import com.ietscode.entity.Book;
import com.ietscode.entity.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    long countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int deleteByPrimaryKey(Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    Book selectByPrimaryKey(Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbg.generated Sun Feb 25 23:14:44 CST 2018
     */
    int updateByPrimaryKey(Book record);
}