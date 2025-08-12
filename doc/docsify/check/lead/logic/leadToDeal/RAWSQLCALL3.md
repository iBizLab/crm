<p class="panel-title"><b>执行sql语句</b></p>

```sql
update attachment t set t.OWNER_ID=?,t.OWNER_TYPE='DEAL'
where t.OWNER_ID= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `DEAL(商机).ID(标识)`
2. `LEADBACK(后台查询返回的线索).ID(标识)`

