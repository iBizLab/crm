## 被关联的数据(target_relation) <!-- {docsify-ignore-all} -->



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




### 查询连接
* **RELATION存在1:N（EXISTS (SELECT)）DERCUSTOM_RELATION_USER_ACCOUNT**<br>
连接关系：[DERCUSTOM_RELATION_USER_ACCOUNT](der/DERCUSTOM_RELATION_USER_ACCOUNT)<br>
连接实体：[客户](module/crm/account)<br>
连接条件：(`TARGET_ID(关联目标标识)` EQ `数据上下文.principal_id`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACCOUNT_NAME`,
t1.`ACCOUNT_NUMBER`,
t1.`ACCOUNT_SITE`,
t1.`ACCOUNT_TYPE`,
t1.`ANNUAL_REVENUE`,
t1.`BILLING_CITY`,
t1.`BILLING_CODE`,
t1.`BILLING_COUNTRY`,
t1.`BILLING_STATE`,
t1.`BILLING_STREET`,
t1.`CHANGE_LOG_TIME__S`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`EMPLOYEES`,
t1.`ENRICH_STATUS__S`,
t1.`FAX`,
t1.`ID`,
t1.`INDUSTRY`,
t1.`LAST_ACTIVITY_TIME`,
t1.`LAST_ENRICHED_TIME__S`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNERSHIP`,
t11.`ACCOUNT_NAME` AS `PACCOUNT_NAME`,
t1.`PHONE`,
t1.`PID`,
t1.`RATING`,
t1.`RECORD_LMAGE`,
t1.`SHIPPING_CITY`,
t1.`SHIPPING_CODE`,
t1.`SHIPPING_COUNTRY`,
t1.`SHIPPING_STATE`,
t1.`SHIPPING_STREET`,
t1.`SIC_CODE`,
t1.`TAG`,
t1.`TICKER_SYMBOL`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`WEBSITE`
FROM `ACCOUNT` t1 
LEFT JOIN `ACCOUNT` t11 ON t1.`PID` = t11.`ID` 

WHERE EXISTS(SELECT * FROM `RELATION` t21 
 WHERE 
 t1.`ID` = t21.`PRINCIPAL_ID`  AND  ( t21.`TARGET_ID` = #{ctx.datacontext.principal_id} ) )
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