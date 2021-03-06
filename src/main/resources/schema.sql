DROP TABLE IF EXISTS ITEM;

CREATE TABLE ITEM (
    id INTEGER AUTO_INCREMENT,
    note json,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS ITEM_DETAIL;

CREATE TABLE ITEM_DETAIL (
    id INTEGER AUTO_INCREMENT,
    item_id INTEGER,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS ITEM_DELIVERY;

CREATE TABLE ITEM_DELIVERY (
    id INTEGER AUTO_INCREMENT,
    item_detail_id INTEGER,
    name VARCHAR(225),
    PRIMARY KEY(id)
);