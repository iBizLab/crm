## 查询实体订单(QueryPhysicalOrder) <!-- {docsify-ignore-all} -->

签单统计柱状图用

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

(`IS_PHYSICAL_ORDER(对应实体订单)` EQ `'1'` AND `ORDER_DATE(订单日期)` GTANDEQ `数据上下文.gt` AND `ORDER_DATE(订单日期)` LT `数据上下文.lt`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACCOUNT_ID`,
t11.`ACCOUNT_NAME`,
t1.`ALLOCATE_MODEL`,
t1.`AMOUNT`,
t1.`BUSINESS_LINE`,
t1.`CLOSED_DATE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
case when (YEAR(t1.`CLOSED_DATE`) = YEAR(CURDATE())) then 1 else 0 end AS `IS_CLOSE_THIS_YEAR`,
t1.`IS_IN_SALES_CAL`,
case when (YEAR(t1.`ORDER_DATE`) = YEAR(CURDATE())) then 1 else 0 end AS `IS_NEW_THIS_YEAR`,
t1.`IS_PHYSICAL_ORDER`,
t1.`LAST_ASSESS_TIME`,
t1.`NAME`,
t1.`ORDER_DATE`,
t1.`OWNER`,
t1.`O_NUMBER`,
t1.`PID`,
t21.`NAME` AS `PNAME`,
t1.`SETTLEMENT_AMOUNT`,
t1.`SETTLEMENT_COST`,
t1.`STATUS`,
t1.`TAX`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`YEAR`
FROM `PROJECT` t1 
LEFT JOIN `ACCOUNT` t11 ON t1.`ACCOUNT_ID` = t11.`ID` 
LEFT JOIN `PROJECT` t21 ON t1.`PID` = t21.`ID` 

WHERE ( t1.`IS_PHYSICAL_ORDER` = 1  AND  t1.`ORDER_DATE` >= #{ctx.datacontext.gt}  AND  t1.`ORDER_DATE` < #{ctx.datacontext.lt} )
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