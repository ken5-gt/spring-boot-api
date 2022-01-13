package jp.ken.springbootapi.domain;

import lombok.Value;

@Value
public class ItemDetail {
    private int id;
    private ItemDelivery delivery;
}