-- 
SELECT concat_ws('/', '/home/grep/src', B.board_id, concat(B.file_id, concat(B.file_name, file_ext))) as file_path
from used_goods_board as a 
inner join used_goods_file as b on a.board_id = b.board_id
where a.board_id = (select board_id from used_goods_board order by views desc limit 1)
order by b.file_id desc