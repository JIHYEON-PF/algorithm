-- 2022년 10월 5일에 등록된 중고거래 SQL문 조회
-- 거래상태가 SALE이면 판매중, RESERVED이면 예약중, DONE이면 거래완료 분류
-- 게시글 ID 기준 내림차순
SELECT board_id, writer_id, title, price, case status when 'sale' then '판매중' when 'reserved' then '예약중' when 'done' then '거래완료' end as status
from used_goods_board
where created_date = '2022-10-05'
order by board_id desc;