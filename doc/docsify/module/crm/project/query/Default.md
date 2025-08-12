## 数据查询(Default) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `是`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`






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