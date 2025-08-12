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

> [!ATTENTION|label:存在长文本属性]
>
> `DESCRIPTION(款项说明)`



### 查询条件

(`CREATE_MAN(建立人)` EQ `用户上下文.srfpersonid`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t31.`ACCOUNT_NAME`,
t1.`ALLOCATE_MODEL`,
t1.`AMOUNT`,
t21.`BUSINESS_LINE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`ID`,
t1.`METHOD`,
t1.`NAME`,
t21.`ORDER_DATE`,
t21.`OWNER`,
t21.`O_NUMBER`,
t1.`PAYEE_DATE`,
t1.`PAYEE_NUMBER`,
t1.`PAYEE_PLAN_ID`,
t11.`PLANNED_TIME`,
t11.`AMOUNT` AS `PLAN_AMOUNT`,
CONCAT(t41.`NAME`, IFNULL(CONCAT(YEAR(t11.`PLANNED_TIME`), '-', LPAD(MONTH(t11.`PLANNED_TIME`), 2, '0'), '-', LPAD(DAY(t11.`PLANNED_TIME`), 2, '0')), '未明确'), '收款计划') AS `PLAN_NAME`,
t21.`PID` AS `PPROJECT_ID`,
t1.`PROJECT_ID`,
t21.`NAME` AS `PROJECT_NAME`,
t1.`SEQUENCE`,
t21.`SETTLEMENT_AMOUNT`,
t1.`STATUS`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`YEAR`
FROM `PAYEE` t1 
LEFT JOIN `PAYEE_PLAN` t11 ON t1.`PAYEE_PLAN_ID` = t11.`ID` 
LEFT JOIN `PROJECT` t21 ON t1.`PROJECT_ID` = t21.`ID` 
LEFT JOIN `ACCOUNT` t31 ON t21.`ACCOUNT_ID` = t31.`ID` 
LEFT JOIN `PROJECT` t41 ON t11.`PROJECT_ID` = t41.`ID` 

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