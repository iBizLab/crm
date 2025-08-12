```sql
SELECT
t1.`ACTIONTYPE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`ID`,
t1.`NAME`,
t1.`TARGET_ID`,
t1.`TARGET_NAME`,
t1.`TARGET_TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `WORK_PROGRESS` t1 

WHERE ( DATE(t1.`CREATE_TIME`) >= 
 #{ctx.datacontext.starttime_gt}
			AND DATE(t1.`CREATE_TIME`) <= 
 #{ctx.datacontext.endtime_lt} )
```