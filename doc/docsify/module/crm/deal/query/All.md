## 全部商机(All) <!-- {docsify-ignore-all} -->



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

* `全部数据`

> [!ATTENTION|label:存在长文本属性]
>
> `DESCRIPTION(描述)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACCOUNT_ID`,
t11.`ACCOUNT_NAME`,
t1.`AMOUNT`,
t1.`BUSINESS_LINE`,
t1.`CHANGE_LOG_TIME__S`,
t1.`CLOSING_DATE`,
t1.`CONTACT_ID`,
t31.`NAME` AS `CONTACT_NAME`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DEAL_NAME`,
t1.`DESCRIPTION`,
t1.`EXPECTED_REVENUE`,
t1.`ID`,
t1.`LAST_ACTIVITY_TIME`,
t1.`LAST_ASSESS_TIME`,
t1.`LEAD_CONVERSIONTIME`,
t1.`LEAD_SOURCE`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`NEXT_STEP`,
t1.`OVERALL_SALES_DURATION`,
t1.`OWNER`,
t1.`PROBABILITY`,
t1.`REASON_FOR_LOSS__S`,
t1.`SALES_CYCLE_DURATION`,
t1.`STAGE`,
t21.`PROBABILITY` AS `STAGE_PROBABILITY`,
t1.`TAG`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
1 AS `VALIDITY`
FROM `DEAL` t1 
LEFT JOIN `ACCOUNT` t11 ON t1.`ACCOUNT_ID` = t11.`ID` 
LEFT JOIN `DEAL_STAGE` t21 ON t1.`STAGE` = t21.`ID` 
LEFT JOIN `CONTACT` t31 ON t1.`CONTACT_ID` = t31.`ID` 


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