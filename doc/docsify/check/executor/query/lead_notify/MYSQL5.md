```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t1.`PRINCIPAL_ID`,
t1.`PRINCIPAL_TYPE`,
t11.`SYSUSERID`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USER_ID`
FROM `EXECUTOR` t1 
LEFT JOIN `USER` t11 ON t1.`USER_ID` = t11.`ID` 

WHERE ( t11.`SYSUSERID` <> #{ctx.sessioncontext.srfpersonid}  AND  ( t1.`PRINCIPAL_ID` = #{ctx.webcontext.principal_id}  OR  t1.`PRINCIPAL_ID` = #{ctx.datacontext.id} )  AND  t1.`PRINCIPAL_TYPE` = 'LEAD' )
```