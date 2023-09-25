package com.shimamumu.information;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InformationMapper {

    @Select("SELECT * FROM informations")
    List<Information> findAll();
}
