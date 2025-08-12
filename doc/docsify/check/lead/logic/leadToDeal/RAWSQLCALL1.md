<p class="panel-title"><b>执行sql语句</b></p>

```sql
update relation t set t.PRINCIPAL_ID=? ,t.PRINCIPAL_TYPE='DEAL' 
 where t.PRINCIPAL_ID= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `DEAL(商机).ID(标识)`
2. `LEADBACK(后台查询返回的线索).ID(标识)`

