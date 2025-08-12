```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`END_DATETIME`,
t1.`ID`,
case when t1.`TYPE` = 'TASK' and t1.`STATUS` <> '40' then 0 when t1.`TYPE` = 'EVENT' and  now()  < t1.`END_DATETIME`  then 0 when t1.`START_DATETIME` = 'CALL' and   now()  < t1.`STATUS` then 0  else 1 end AS `IS_CLOSE`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`START_DATETIME`,
t1.`STATUS`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `SCHEDULE` t1 

WHERE ( case when t1.`TYPE` = 'TASK' and t1.`STATUS` <> '40' then 0 when t1.`TYPE` = 'EVENT' and  now()  < t1.`END_DATETIME`  then 0 when t1.`START_DATETIME` = 'CALL' and   now()  < t1.`STATUS` then 0  else 1 end = '0'  AND  t1.`TYPE` <> 'RESERVATION' )
```