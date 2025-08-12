## 关联的目标产品(relation_target) <!-- {docsify-ignore-all} -->



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
* **RELATION存在1:N（EXISTS (SELECT)）DERCUSTOM_PRODUCT_RELATION**<br>
连接关系：[DERCUSTOM_TARGET_PRODUCT_RELATION](der/DERCUSTOM_TARGET_PRODUCT_RELATION)<br>
连接实体：[产品](module/crm/product)<br>
连接条件：(`PRINCIPAL_ID(关联主体标识)` EQ `数据上下文.PRINCIPAL_ID` AND `PRINCIPAL_TYPE(关联主体类型)` EQ `数据上下文.PRINCIPAL_TYPE`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`COMMISSION_RATE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`ID`,
t1.`LOCKED__S`,
t1.`MANUFACTURER`,
t1.`NAME`,
t1.`OWNER`,
t1.`PRODUCT_ACTIVE`,
t1.`PRODUCT_CATEGORY`,
t1.`PRODUCT_CODE`,
t1.`PRODUCT_NAME`,
t1.`QTY_IN_DEMAND`,
t1.`QTY_IN_STOCK`,
t1.`QTY_ORDERED`,
t1.`RECORD_IMAGE`,
t1.`REORDER_LEVEL`,
t1.`SALES_END_DATE`,
t1.`SALES_START_DATE`,
t1.`SUPPORT_EXPIRY_DATE`,
t1.`SUPPORT_START_DATE`,
t1.`TAG`,
t1.`TAX`,
t1.`TAXABLE`,
t1.`UNIT_PRICE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USAGE_UNIT`,
t1.`VENDOR_ID`,
t11.`NAME` AS `VENDOR_NAME`
FROM `PRODUCT` t1 
LEFT JOIN `VENDOR` t11 ON t1.`VENDOR_ID` = t11.`ID` 

WHERE EXISTS(SELECT * FROM `RELATION` t21 
 WHERE 
 t1.`ID` = t21.`TARGET_ID`  AND  ( t21.`PRINCIPAL_ID` = #{ctx.datacontext.principal_id}  AND  t21.`PRINCIPAL_TYPE` = #{ctx.datacontext.principal_type} ) )
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