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
t1.`ADJUSTMENT`,
t1.`BILING_STREET`,
t1.`BILLING_CITY`,
t1.`BILLING_CODE`,
t1.`BILLING_COUNTRY`,
t1.`BILLING_STATE`,
t1.`CARRIER`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DISCOUNT`,
t1.`DUE_DATE`,
t1.`EXCISE_DUTY`,
t1.`GRAND_TOTAL`,
t1.`ID`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`PO_DATE`,
t1.`PO_NUMBER`,
t1.`REQUISITION_NO`,
t1.`SALES_COMMISSION`,
t1.`SHIPPING_CITY`,
t1.`SHIPPING_CODE`,
t1.`SHIPPING_COUNTRY`,
t1.`SHIPPING_STATE`,
t1.`SHIPPING_STREET`,
t1.`STATUS`,
t1.`SUBJECT`,
t1.`SUB_TOTAL`,
t1.`TAG`,
t1.`TAX`,
t1.`TRACKING_NUMBER`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `PURCHASE_ORDER` t1 


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