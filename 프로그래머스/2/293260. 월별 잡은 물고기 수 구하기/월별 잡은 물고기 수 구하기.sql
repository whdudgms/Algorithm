-- 코드를 작성해주세요


select count(*) as  FISH_COUNT, CONVERT(FISH.MONTH, signed) as MONTH
from (select FISH_TYPE, LENGTH, SUBSTRING(TIME,6,2) as MONTH FROM FISH_INFO) FISH
GROUP By FISH.month order by month asc;