```sql
SELECT
SUM(t1.`AMOUNT`) AS AMOUNT,
	t1.`BUSINESS_LINE`,
	t1.`CREATE_MAN`,
	t1.`CREATE_TIME`,
	t1.`ID`,
	CONCAT(YEAR(#{ctx.datacontext.lt}),'-',LPAD(MONTH(#{ctx.datacontext.lt}), 2, '0'),'之后') AS NAME,
	t1.`OWNER`,
	t1.`SECTOR`,
	t1.`STATISTIC_DATE`,
	'3' AS TYPE,
	t1.`UPDATE_MAN`,
	t1.`UPDATE_TIME` 
FROM `PAYEE_STATISTIC` t1
WHERE ( t1.`STATISTIC_DATE` >= #{ctx.datacontext.lt}  AND  t1.`TYPE` = '2' )
```