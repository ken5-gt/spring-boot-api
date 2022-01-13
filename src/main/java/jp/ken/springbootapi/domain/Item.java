package jp.ken.springbootapi.domain;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Value;

import java.util.List;

@Value
public class Item {
    private int id;
    private List<ItemDetail> detailList;
    private JsonNode note;

}