package jp.ken.springbootapi.mapper;

import jp.ken.springbootapi.domain.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemMapper {
    @Select("select id, note from item WHERE id = #{id}")
    Item get(String id);
}