<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT
	DATEDIFF(SYSDATE(), MAX(t.CREATE_TIME))  AS STAGE_DURATION_CALENDAR_DAYS 
FROM
	deal_history t 
WHERE
	t.deal_id =?;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`DEAL_HISTORY_STAGE_TIME(商机历史阶段持续时间)`，并将执行sql结果赋值给参数`DEAL_HISTORY_STAGE_TIME(商机历史阶段持续时间)`
