-- 코드를 입력하세요
SELECT user_id
       , nickname
       , concat_ws(' ', city, street_address1, street_address2) as 전체주소
       , concat_ws('-', substring(tlno, 1, 3), substring(tlno, 4, 4), substring(tlno, 8, 4)) as 전화번호
from used_goods_user
where user_id in (
select case when count(1) >= 3 then writer_id else '' end as writer_id
from used_goods_board
group by writer_id)
order by user_id desc