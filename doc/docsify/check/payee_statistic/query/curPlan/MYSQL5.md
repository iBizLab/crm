```sql
SELECT
t1.`AMOUNT`,
t1.`BUSINESS_LINE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`OWNER`,
t1.`SECTOR`,
t1.`STATISTIC_DATE`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `PAYEE_STATISTIC` t1 

WHERE ( t1.`TYPE` = '1'  AND  t1.`STATISTIC_DATE` >= #{ctx.datacontext.gt}  AND  t1.`STATISTIC_DATE` < #{ctx.datacontext.lt} )
```