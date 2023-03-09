-- 코드를 입력하세요
SELECT A.TITLE, B.BOARD_ID, B.REPLY_ID, B.WRITER_ID, B.CONTENTS, date_format(B.created_date, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD AS A
INNER JOIN USED_GOODS_REPLY AS B ON A.BOARD_ID = B.BOARD_ID
WHERE A.created_date between '2022-10-01' and '2022-10-31'
order by B.created_date asc, A.title