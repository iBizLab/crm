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
