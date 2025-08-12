## 任务变更通知对象(executor_notify) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `否`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`



### 查询条件

(`SYSUSERID(sysuserid)` NOTEQ `用户上下文.srfpersonid` AND `TASK_ID(任务标识)` EQ `数据上下文.id`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`NAME`,
t11.`SYSUSERID`,
t1.`TASK_ID`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USER_ID`
FROM `TASK_EXECUTOR` t1 
LEFT JOIN `USER` t11 ON t1.`USER_ID` = t11.`ID` 

WHERE ( t11.`SYSUSERID` <> #{ctx.sessioncontext.srfpersonid}  AND  t1.`TASK_ID` = #{ctx.datacontext.id} )
```

</el-dialog>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
                MYSQL5 : false
        
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>