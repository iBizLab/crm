## 创建者(createman) <!-- {docsify-ignore-all} -->



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

(`CREATE_MAN(建立人)` EQ `用户上下文.srfpersonid`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`AMOUNT`,
t1.`CLOSING_DATE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DEAL_ID`,
t1.`EXPECTED_REVENUE`,
t1.`ID`,
t1.`LAST_ACTIVITY_TIME`,
t1.`MOVED_TO__S`,
t1.`NAME`,
t1.`PROBABILITY`,
t1.`STAGE`,
t1.`STAGE_DURATION_CALENDAR_DAYS`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `DEAL_HISTORY` t1 

WHERE ( t1.`CREATE_MAN` = #{ctx.sessioncontext.srfpersonid} )
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