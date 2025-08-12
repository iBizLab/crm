<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
*
from
	note_attach T1
where
  T1.UPDATE_TIME >= ?
    AND T1.UPDATE_TIME <= ?
    	and (
    (T1.UPDATE_MAN =?)
	or 
	(EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.PRINCIPAL_ID AND T2.USER_ID = ?))
	or
	(EXISTS (SELECT 1 FROM executor T3 WHERE T3.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T3.USER_ID = ?))

	)
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).START_DATE(开始时间)`
2. `Default(传入变量).END_DATE(结束时间)`
3. `用户全局对象.srfpersonid`
4. `用户全局对象.srfpersonid`
5. `用户全局对象.srfpersonid`

将执行sql结果赋值给参数`notes(本周进展评估)`
