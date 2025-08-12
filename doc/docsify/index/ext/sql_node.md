
## 存在直接SQL调用的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[28]</font></sup>

#### [商机(DEAL)](module/crm/deal)的处理逻辑[商机阶段更新时生成历史(scdealstagehis)](module/crm/deal/logic/scdealstagehis)

节点：查询历史阶段持续天数
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
#### [商机(DEAL)](module/crm/deal)的处理逻辑[获取商机关联任务和活动(get_task_and_maneuver)](module/crm/deal/logic/get_task_and_maneuver)

节点：获取线索关联任务和活动
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select t1.`CLOSED_TIME`,
t1.`COST`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`DUE_DATE`,
DATEDIFF(CURDATE(), t1.`DUE_DATE`) AS `DUE_DATE_SORT`,
t1.`END_TIME`,
t1.`ID`,
t1.`LAST_ASSESS_TIME`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNER_ID`,
t1.`OWNER_NAME`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`PRIORITY`,
t1.`REMIND_AT`,
t1.`SEND_NOTIFICATION_EMAIL`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`SUBJECT`,
t1.`TAG`,
COALESCE(START_TIME, DUE_DATE) AS `TASK_DATE`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
from task t1 
	left join relation t2 ON t1.ID = t2.TARGET_ID 
	left join deal t3 ON t3.ID = t2.PRINCIPAL_ID
where t3.ID = ?
ORDER BY TASK_DATE desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).n_deal_id_eq`

重置参数`task_and_maneuver_list(任务活动列表)`，并将执行sql结果赋值给参数`task_and_maneuver_list(任务活动列表)`
#### [线索(LEAD)](module/crm/lead)的处理逻辑[线索转商机(leadToDeal)](module/crm/lead/logic/leadToDeal)

节点：更新工作进展数据
<p class="panel-title"><b>执行sql语句</b></p>

```sql
update work_progress set target_name = CONCAT(target_name,'(由线索转换)'),target_type='DEAL' where target_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

#### [线索(LEAD)](module/crm/lead)的处理逻辑[线索转商机(leadToDeal)](module/crm/lead/logic/leadToDeal)

节点：附件线索转商机
<p class="panel-title"><b>执行sql语句</b></p>

```sql
update attachment t set t.OWNER_ID=?,t.OWNER_TYPE='DEAL'
where t.OWNER_ID= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `DEAL(商机).ID(标识)`
2. `LEADBACK(后台查询返回的线索).ID(标识)`

#### [线索(LEAD)](module/crm/lead)的处理逻辑[线索转商机(leadToDeal)](module/crm/lead/logic/leadToDeal)

节点：relation中线索转为商机
<p class="panel-title"><b>执行sql语句</b></p>

```sql
update relation t set t.PRINCIPAL_ID=? ,t.PRINCIPAL_TYPE='DEAL' 
 where t.PRINCIPAL_ID= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `DEAL(商机).ID(标识)`
2. `LEADBACK(后台查询返回的线索).ID(标识)`

#### [线索(LEAD)](module/crm/lead)的处理逻辑[线索转商机(leadToDeal)](module/crm/lead/logic/leadToDeal)

节点：进展评估线索转商机
<p class="panel-title"><b>执行sql语句</b></p>

```sql
update note_attach t set t.PRINCIPAL_ID=?
,t.OWNER_TYPE='DEAL',t.PRINCIPAL_TYPE='DEAL'  
 where t.PRINCIPAL_ID= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `DEAL(商机).ID(标识)`
2. `LEADBACK(后台查询返回的线索).ID(标识)`

#### [线索(LEAD)](module/crm/lead)的处理逻辑[获取线索关联任务和活动(get_task_and_maneuver)](module/crm/lead/logic/get_task_and_maneuver)

节点：获取线索关联任务和活动
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select t1.`CLOSED_TIME`,
t1.`COST`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`DUE_DATE`,
DATEDIFF(CURDATE(), t1.`DUE_DATE`) AS `DUE_DATE_SORT`,
t1.`END_TIME`,
t1.`ID`,
t1.`LAST_ASSESS_TIME`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNER_ID`,
t1.`OWNER_NAME`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`PRIORITY`,
t1.`REMIND_AT`,
t1.`SEND_NOTIFICATION_EMAIL`,
t1.`START_TIME`,
t1.`STATUS`,
t1.`SUBJECT`,
t1.`TAG`,
COALESCE(START_TIME, DUE_DATE) AS `TASK_DATE`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
from task t1 
	left join relation t2 ON t1.ID = t2.TARGET_ID 
	left join lead t3 ON t3.ID = t2.PRINCIPAL_ID
where t3.ID = ?
ORDER BY TASK_DATE desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).principal_id`

重置参数`task_and_maneuver_list(任务活动列表)`，并将执行sql结果赋值给参数`task_and_maneuver_list(任务活动列表)`
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[将分配数据更新到统计表(update_payee_allocate)](module/crm/payee_statistic/logic/update_payee_allocate)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
  select t2.AMOUNT,t2.PAYEE_DATE,t1.USER_ID,t1.RATIO from payee_allocate t1 left join payee t2 on t2.id = t1.payee_id
```


重置参数`Payee_info(计划集合)`，并将执行sql结果赋值给参数`Payee_info(计划集合)`
#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[清空收款计划表(delete_statistic)](module/crm/payee_statistic/logic/delete_statistic)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
TRUNCATE table payee_statistic
```


#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[计算统计数据(Calculation)](module/crm/payee_statistic/logic/Calculation)

节点：删除已有数据
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM PAYEE_STATISTIC;
```


#### [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic)的处理逻辑[计算统计数据(Calculation)](module/crm/payee_statistic/logic/Calculation)

节点：计算统计数据
<p class="panel-title"><b>执行sql语句</b></p>

```sql
INSERT INTO PAYEE_STATISTIC(ID,AMOUNT,NAME,TYPE,OWNER,STATISTIC_DATE,BUSINESS_LINE)
SELECT UUID(),SUM(T1.AMOUNT),CASE WHEN T1.PLANNED_TIME IS NOT NULL THEN CONCAT(YEAR(T1.PLANNED_TIME),'-',LPAD(MONTH(T1.PLANNED_TIME), 2, '0')) ELSE '未明确' END,CASE WHEN T1.PLANNED_TIME IS NULL THEN 0 ELSE 2 END,T2.OWNER,STR_TO_DATE(CONCAT(YEAR(T1.PLANNED_TIME),'-',LPAD(MONTH(T1.PLANNED_TIME), 2, '0'),'-01'), '%Y-%m-%d'),T2.BUSINESS_LINE FROM PAYEE_PLAN T1,PROJECT T2
WHERE T1.PROJECT_ID = T2.ID AND T1.PLAN_STATUS = '10' 
GROUP BY T2.OWNER,T2.BUSINESS_LINE,YEAR(T1.PLANNED_TIME),MONTH(T1.PLANNED_TIME)
UNION ALL
SELECT UUID(),SUM(T1.AMOUNT),CONCAT(YEAR(T1.PAYEE_DATE),'-',LPAD(MONTH(T1.PAYEE_DATE), 2, '0')),'1',T2.OWNER,STR_TO_DATE(CONCAT(YEAR(T1.PAYEE_DATE),'-',LPAD(MONTH(T1.PAYEE_DATE), 2, '0'),'-01'), '%Y-%m-%d'),T2.BUSINESS_LINE FROM PAYEE T1,PROJECT T2
WHERE T1.PROJECT_ID = T2.ID
GROUP BY T2.OWNER,T2.BUSINESS_LINE,YEAR(T1.PAYEE_DATE),MONTH(T1.PAYEE_DATE)
```


#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail)

节点：本周任务
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	ID as TARGET_ID,
	SUBJECT  as NAME,
	'TASK' as TARGET_TYPE,
    START_TIME,
    PRIORITY,
    STATUS,
    COST,
    DESCRIPTION 
from
	TASK
where
	`TYPE` = 'TASK'
	and (CREATE_MAN = ?
		or OWNER = ?)
        and YEARWEEK(START_TIME , 1) = YEARWEEK(?, 1)
order by START_TIME desc		
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`
2. `用户全局对象.userid`
3. `Default(传入变量).START_DATE(开始时间)`

重置参数`works(本周任务)`，并将执行sql结果赋值给参数`works(本周任务)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail)

节点：本周活动和任务
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
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail)

节点：本周进展评估
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT T1.* FROM (
select t1.id,t1.principal_type,t1.principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,task t2 where t1.PRINCIPAL_TYPE = 'TASK' and t1.principal_id = t2.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM task_executor T21 WHERE T21.TASK_ID = T1.PRINCIPAL_ID AND T21.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,project t2,account t3 where t1.PRINCIPAL_TYPE = 'PROJECT' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM executor T31 WHERE T31.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T31.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,lead t2,account t3 where t1.PRINCIPAL_TYPE = 'LEAD' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM executor T31 WHERE T31.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T31.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,deal t2,account t3 where t1.PRINCIPAL_TYPE = 'DEAL' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or t2.owner = ?)
) T1
WHERE T1.UPDATE_TIME >= ?
AND T1.UPDATE_TIME <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY)
ORDER BY T1.UPDATE_TIME desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CREATE_MAN(建立人)`
2. `Default(传入变量).OWNER(销售人员)`
3. `Default(传入变量).CREATE_MAN(建立人)`
4. `Default(传入变量).OWNER(销售人员)`
5. `Default(传入变量).CREATE_MAN(建立人)`
6. `Default(传入变量).OWNER(销售人员)`
7. `Default(传入变量).CREATE_MAN(建立人)`
8. `Default(传入变量).OWNER(销售人员)`
9. `Default(传入变量).START_DATE(开始时间)`
10. `Default(传入变量).END_DATE(结束时间)`

将执行sql结果赋值给参数`notes(本周进展评估)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail)

节点：下周计划
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT  
    ID as TARGET_ID,  
    SUBJECT as NAME,  
    'TASK' as TARGET_TYPE,
    PRIORITY,
    STATUS,
    DUE_DATE,
    DESCRIPTION
FROM  
    TASK  T1
WHERE  
    T1.`TYPE` = 'TASK'  
    AND EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.ID AND T2.USER_ID = ?)
      		AND T1.DUE_DATE >=  DATE_ADD(? + INTERVAL (7-WEEKDAY(?)) DAY, INTERVAL 0 DAY)
		AND T1.DUE_DATE <= DATE_ADD(?, INTERVAL (13-WEEKDAY(?)) DAY)
    ORDER BY T1.DUE_DATE desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).OWNER(销售人员)`
2. `Default(传入变量).START_DATE(开始时间)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`
5. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`tasks(下周任务计划)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据(openDetail)](module/crm/weeklies/logic/openDetail)

节点：新建的商机或线索
<p class="panel-title"><b>执行sql语句</b></p>

```sql
(select t1.id,CONCAT('（',t2.account_name,'）',t1.subject) as name,t1.create_time,'线索' as `type`, 'LEAD' as `link_type`,t1.description from `lead` t1,account t2 where t1.account_id = t2.id and t1.create_time >= STR_TO_DATE(?, '%Y-%m-%d') and t1.create_time <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY) and (t1.create_man = ? or t1.owner = ? or EXISTS (SELECT 1 FROM executor T11 WHERE T11.PRINCIPAL_ID = T1.id AND T11.USER_ID = ?))) 
union all
(select t1.id,CONCAT('（',t2.account_name,'）',t1.deal_name) as name,t1.create_time,'商机' as `type`, 'DEAL' as `link_type`,t1.description from `deal` t1,account t2 where t1.account_id = t2.id and t1.create_time >= STR_TO_DATE(?, '%Y-%m-%d') and t1.create_time <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY) and (t1.create_man = ? or t1.owner = ? ))
ORDER BY create_time desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).START_DATE(开始时间)`
2. `Default(传入变量).END_DATE(结束时间)`
3. `Default(传入变量).CREATE_MAN(建立人)`
4. `Default(传入变量).OWNER(销售人员)`
5. `Default(传入变量).OWNER(销售人员)`
6. `Default(传入变量).START_DATE(开始时间)`
7. `Default(传入变量).END_DATE(结束时间)`
8. `Default(传入变量).CREATE_MAN(建立人)`
9. `Default(传入变量).OWNER(销售人员)`

将执行sql结果赋值给参数`news(新建数据)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据2(openDetail2)](module/crm/weeklies/logic/openDetail2)

节点：本周活动
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
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据2(openDetail2)](module/crm/weeklies/logic/openDetail2)

节点：本周进展评估
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT T1.* FROM (
select t1.id,t1.principal_type,t1.principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,task t2 where t1.PRINCIPAL_TYPE = 'TASK' and t1.principal_id = t2.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM task_executor T21 WHERE T21.TASK_ID = T1.PRINCIPAL_ID AND T21.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,project t2,account t3 where t1.PRINCIPAL_TYPE = 'PROJECT' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM executor T31 WHERE T31.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T31.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,lead t2,account t3 where t1.PRINCIPAL_TYPE = 'LEAD' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM executor T31 WHERE T31.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T31.USER_ID = ?))
UNION ALL
select t1.id,t1.principal_type,CONCAT('（',t3.account_name,'）',t1.principal_name) as principal_name,t1.update_time,t1.principal_id,t1.content,t1.create_man from note_attach t1,deal t2,account t3 where t1.PRINCIPAL_TYPE = 'DEAL' and t1.principal_id = t2.id and t2.account_id = t3.id and (t1.CREATE_MAN = ? or EXISTS (SELECT 1 FROM executor T31 WHERE T31.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T31.USER_ID = ?))
) T1
WHERE T1.UPDATE_TIME >= ?
AND T1.UPDATE_TIME <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY)
ORDER BY T1.principal_name,T1.UPDATE_TIME
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CREATE_MAN(建立人)`
2. `Default(传入变量).OWNER(销售人员)`
3. `Default(传入变量).CREATE_MAN(建立人)`
4. `Default(传入变量).OWNER(销售人员)`
5. `Default(传入变量).CREATE_MAN(建立人)`
6. `Default(传入变量).OWNER(销售人员)`
7. `Default(传入变量).CREATE_MAN(建立人)`
8. `Default(传入变量).OWNER(销售人员)`
9. `Default(传入变量).START_DATE(开始时间)`
10. `Default(传入变量).END_DATE(结束时间)`

将执行sql结果赋值给参数`notes(本周进展评估)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[打开详情页获取关联数据2(openDetail2)](module/crm/weeklies/logic/openDetail2)

节点：下周计划
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT  
    ID as TARGET_ID,  
    SUBJECT as NAME,  
    'TASK' as TARGET_TYPE,
    PRIORITY,
    STATUS,
    DUE_DATE,
    DESCRIPTION
FROM  
    TASK  T1
WHERE  
    T1.`TYPE` = 'TASK'  
    AND EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.ID AND T2.USER_ID = ?)
      		AND T1.DUE_DATE >=  DATE_ADD(? + INTERVAL (7-WEEKDAY(?)) DAY, INTERVAL 0 DAY)
		AND T1.DUE_DATE <= DATE_ADD(?, INTERVAL (13-WEEKDAY(?)) DAY)
    ORDER BY T1.DUE_DATE
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).OWNER(销售人员)`
2. `Default(传入变量).START_DATE(开始时间)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`
5. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`tasks(下周任务计划)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：本周任务
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	ID as TARGET_ID,
	SUBJECT  as NAME,
	'TASK' as TARGET_TYPE,
    START_TIME,
    PRIORITY,
    STATUS,
    COST,
    DESCRIPTION 
from
	TASK
where
	`TYPE` = 'TASK'
	and (CREATE_MAN = ?
		or OWNER = ?)
        and YEARWEEK(START_TIME , 1) = YEARWEEK(?, 1)
order by START_TIME desc		
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`
2. `用户全局对象.userid`
3. `Default(传入变量).START_DATE(开始时间)`

重置参数`works(本周工作)`，并将执行sql结果赋值给参数`works(本周工作)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：本周活动和任务
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
order by START_TIME desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`
2. `用户全局对象.userid`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`activities(本周活动)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：本周进展评估
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
*
    
from
	note_attach T1
where
	YEARWEEK(T1.UPDATE_TIME  ,1) = YEARWEEK(?,1)
	and ((T1.UPDATE_MAN =?)
	or 
	(EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.PRINCIPAL_ID AND T2.USER_ID = ?))
	or
	(EXISTS (SELECT 1 FROM executor T3 WHERE T3.PRINCIPAL_ID = T1.PRINCIPAL_ID AND T3.USER_ID = ?))

	)
order by T1.UPDATE_TIME desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).START_DATE(开始时间)`
2. `用户全局对象.srfuserid`
3. `用户全局对象.userid`
4. `用户全局对象.userid`

将执行sql结果赋值给参数`notes(本周进展评估)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：下周任务计划
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT  
    ID as TARGET_ID,  
    SUBJECT as NAME,  
    'TASK' as TARGET_TYPE,
    PRIORITY,
    STATUS,
    DUE_DATE,
    DESCRIPTION
FROM  
    TASK  T1
WHERE  
    T1.`TYPE` = 'TASK'  
    AND EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.ID AND T2.USER_ID = ?)
		AND T1.DUE_DATE >=  DATE_ADD(? + INTERVAL (7-WEEKDAY(?)) DAY, INTERVAL 0 DAY)
		AND T1.DUE_DATE <= DATE_ADD(?, INTERVAL (13-WEEKDAY(?)) DAY)
order by T1.DUE_DATE desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.userid`
2. `Default(传入变量).START_DATE(开始时间)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`
5. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`tasks(任务)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[新建周报时加载关联信息(relation)](module/crm/weeklies/logic/relation)

节点：新建的商机或线索
<p class="panel-title"><b>执行sql语句</b></p>

```sql
(select t1.id,CONCAT('（',t2.account_name,'）',t1.subject) as name,t1.create_time,'线索' as `type`, 'LEAD' as `link_type`,t1.description from `lead` t1,account t2 where t1.account_id = t2.id and t1.create_time >= STR_TO_DATE(?, '%Y-%m-%d') and t1.create_time <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY) and (t1.create_man = ? or t1.owner = ? or EXISTS (SELECT 1 FROM executor T11 WHERE T11.PRINCIPAL_ID = T1.id AND T11.USER_ID = ?))) 
union all
(select t1.id,CONCAT('（',t2.account_name,'）',t1.deal_name) as name,t1.create_time,'商机' as `type`, 'DEAL' as `link_type`,t1.description from `deal` t1,account t2 where t1.account_id = t2.id and t1.create_time >= STR_TO_DATE(?, '%Y-%m-%d') and t1.create_time <= DATE_ADD(STR_TO_DATE(?, '%Y-%m-%d'), INTERVAL 1 DAY) and (t1.create_man = ? or t1.owner = ? ))
ORDER BY create_time desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).START_DATE(开始时间)`
2. `Default(传入变量).END_DATE(结束时间)`
3. `Default(传入变量).CREATE_MAN(建立人)`
4. `Default(传入变量).OWNER(销售人员)`
5. `Default(传入变量).OWNER(销售人员)`
6. `Default(传入变量).START_DATE(开始时间)`
7. `Default(传入变量).END_DATE(结束时间)`
8. `Default(传入变量).CREATE_MAN(建立人)`
9. `Default(传入变量).OWNER(销售人员)`

重置参数`news(新建)`，并将执行sql结果赋值给参数`news(新建)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation)

节点：本周工作(任务)
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	ID as TARGET_ID,
	SUBJECT  as NAME,
	'TASK' as TARGET_TYPE,
    START_TIME,
    PRIORITY,
    STATUS,
    COST,
    DESCRIPTION 
from
	TASK
where
	`TYPE` = 'TASK'
	and (CREATE_MAN = ?
		or OWNER = ?)
        and YEARWEEK(START_TIME , 1) = YEARWEEK(?, 1)
order by START_TIME desc		
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`
2. `用户全局对象.userid`
3. `Default(传入变量).START_DATE(开始时间)`

重置参数`works(本周工作)`，并将执行sql结果赋值给参数`works(本周工作)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation)

节点：本周活动和任务
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
order by START_TIME desc
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`
2. `用户全局对象.userid`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`activities(本周活动)`
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation)

节点：本周进展评估
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
#### [周报(WEEKLIES)](module/crm/weeklies)的处理逻辑[根据统计时间更新关联信息(updateRelation)](module/crm/weeklies/logic/updateRelation)

节点：下周任务
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT  
    ID as TARGET_ID,  
    SUBJECT as NAME,  
    'TASK' as TARGET_TYPE,
    PRIORITY,
    STATUS,
    DUE_DATE,
    DESCRIPTION
FROM  
    TASK T1 
WHERE  
    T1.`TYPE` = 'TASK'  
    AND EXISTS (SELECT 1 FROM task_executor T2 WHERE T2.TASK_ID = T1.ID AND T2.USER_ID = ?)
		AND T1.DUE_DATE >=  DATE_ADD(? + INTERVAL (7-WEEKDAY(?)) DAY, INTERVAL 0 DAY)
		AND T1.DUE_DATE <= DATE_ADD(?, INTERVAL (13-WEEKDAY(?)) DAY)
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.userid`
2. `Default(传入变量).START_DATE(开始时间)`
3. `Default(传入变量).START_DATE(开始时间)`
4. `Default(传入变量).START_DATE(开始时间)`
5. `Default(传入变量).START_DATE(开始时间)`

将执行sql结果赋值给参数`tasks(下周任务计划)`




