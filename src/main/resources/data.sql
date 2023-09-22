-- TB_TEST Test Data

INSERT INTO TB_TEST (name, description, amount, price)
values ('테스트_이름_1',
        '테스트_설명_1',
        10,
        13000);
INSERT INTO TB_TEST (name, description, amount, price)
values ('테스트_이름_2',
        '테스트_이름_2',
        23,
        20000);
INSERT INTO TB_TEST (name, description, amount, price)
values ('테스트_이름_3',
        '테스트_이름_3',
        312,
        30000);

-- Product Test Data

INSERT INTO PRODUCT (name, img_url, price)
values ('피자',
        'https://cdn.dominos.co.kr/admin/upload/goods/20200311_x8StB1t3.jpg',
        13000);
INSERT INTO PRODUCT (name, img_url, price)
values ('샐러드',
        'https://m.subway.co.kr/upload/menu/K-%EB%B0%94%EB%B9%84%ED%81%90-%EC%83%90%EB%9F%AC%EB%93%9C-%EB%8B%A8%ED%92%88_20220413025007802.png',
        20000);
INSERT INTO PRODUCT (name, img_url, price)
values ('치킨',
        'https://cdn.thescoop.co.kr/news/photo/202010/41306_58347_1055.jpg',
        10000);
