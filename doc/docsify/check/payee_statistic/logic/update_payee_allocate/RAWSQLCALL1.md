<p class="panel-title"><b>执行sql语句</b></p>

```sql
  select t2.AMOUNT,t2.PAYEE_DATE,t1.USER_ID,t1.RATIO from payee_allocate t1 left join payee t2 on t2.id = t1.payee_id
```


重置参数`Payee_info(计划集合)`，并将执行sql结果赋值给参数`Payee_info(计划集合)`
