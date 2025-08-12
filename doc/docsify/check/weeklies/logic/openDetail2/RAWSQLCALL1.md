<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	ID as TARGET_ID,
	SUBJECT  as NAME,
	'MANEUVER' as TARGET_TYPE,
    START_TIME,
    PRIORITY,
    STATUS,
    COST,
    DESCRIPTION 
from
	TASK
where
	`TYPE` = 'MANEUVER'
	and (CREATE_MAN = ?
		or OWNER = ?)
    AND START_TIME >= ?
AND START_TIME <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY)
ORDER BY START_TIME;

```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CREATE_MAN(建立人)`
2. `Default(传入变量).OWNER(销售人员)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).END_DATE(结束时间)`

将执行sql结果赋值给参数`activities(本周活动)`
