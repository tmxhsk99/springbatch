DROP TABLE IF EXISTS TB_TEST;

CREATE TABLE TB_TEST
(
    id      BIGINT      NOT NULL AUTO_INCREMENT,
    name    VARCHAR(20) NOT NULL,
    description VARCHAR(255),
    amount   INT         NOT NULL,
    price   INT         NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS product;

CREATE TABLE PRODUCT
(
    id      BIGINT      NOT NULL AUTO_INCREMENT,
    name    VARCHAR(20) NOT NULL,
    img_url VARCHAR(255),
    price   INT         NOT NULL,
    PRIMARY KEY (id)
);
