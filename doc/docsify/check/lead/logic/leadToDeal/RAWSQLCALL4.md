<p class="panel-title"><b>执行sql语句</b></p>

```sql
update work_progress set target_name = CONCAT(target_name,'(由线索转换)'),target_type='DEAL' where target_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

