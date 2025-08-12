## 金额汇总(sum) <!-- {docsify-ignore-all} -->



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

> [!ATTENTION|label:存在长文本属性]
>
> `DESCRIPTION(款项说明)`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t21.`ACCOUNT_NAME`,
t1.`AMOUNT`,
t11.`BUSINESS_LINE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`ID`,
t1.`IS_NOT_IN_PLAN`,
t1.`NAME`,
t11.`ORDER_DATE`,
t11.`OWNER`,
t11.`O_NUMBER`,
t1.`PLANNED_TIME`,
CONCAT(t11.`NAME`, IFNULL(CONCAT(YEAR(t1.`PLANNED_TIME`), '-', LPAD(MONTH(t1.`PLANNED_TIME`), 2, '0'), '-', LPAD(DAY(t1.`PLANNED_TIME`), 2, '0')), '未明确'), '收款计划') AS `PLAN_NAME`,
t1.`PLAN_STATUS`,
t11.`PID` AS `PPROJECT_ID`,
t11.`AMOUNT` AS `PROJECT_AMOUNT`,
t1.`PROJECT_ID`,
t11.`NAME` AS `PROJECT_NAME`,
t1.`SEQUENCE`,
t11.`SETTLEMENT_AMOUNT`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `PAYEE_PLAN` t1 
LEFT JOIN `PROJECT` t11 ON t1.`PROJECT_ID` = t11.`ID` 
LEFT JOIN `ACCOUNT` t21 ON t11.`ACCOUNT_ID` = t21.`ID` 


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