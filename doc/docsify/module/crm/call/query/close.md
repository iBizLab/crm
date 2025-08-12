## 关闭的(close) <!-- {docsify-ignore-all} -->



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






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CALLER_ID`,
t1.`CALL_AGENDA`,
t1.`CALL_DURATION`,
t1.`CALL_DURATION_IN_SECONDS`,
t1.`CALL_PURPOSE`,
t1.`CALL_RESULT`,
t1.`CALL_START_TIME`,
t1.`CALL_TYPE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`CTI_ENTRY`,
t1.`DIALLED_NUMBER`,
t1.`ID`,
t1.`NAME`,
t1.`OUTGOING_CALL_STATUS`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`REMINDER`,
t1.`SCHEDULED_IN_CRM`,
t1.`SUBJECT`,
t1.`TAG`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`VOICE_RECORDING__S`
FROM `CALL` t1 


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