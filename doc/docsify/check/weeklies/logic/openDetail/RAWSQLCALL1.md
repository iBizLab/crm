<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	ID as TARGET_ID,
	SUBJECT  as NAME,
	TYPE as TARGET_TYPE,
   	COALESCE(START_TIME, DUE_DATE) AS START_TIME,
    PRIORITY,
    STATUS,
    COST,
    DESCRIPTION 
from
	TASK
where
	(CREATE_MAN = ?
	or OWNER = ?)
    and 
	( 
        (YEARWEEK(START_TIME , 1) = YEARWEEK(?, 1)and TYPE = 'MANEUVER')
        or 
        (YEARWEEK(DUE_DATE, 1) = YEARWEEK(?, 1) and TYPE = 'TASK' )
	)
ORDER BY START_TIME desc;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CREATE_MAN(建立人)`
2. `Default(传入变量).OWNER(销售人员)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`activities(本周活动)`
