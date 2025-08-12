## 空未明确(emptyIndefinite) <!-- {docsify-ignore-all} -->

未明确：0

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

* `是`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT T1.* FROM (
SELECT
0 AS AMOUNT,
#{ctx.datacontext.n_business_line_eq} AS BUSINESS_LINE,
NULL AS CREATE_MAN,
NULL AS CREATE_TIME,
UUID() AS ID,
'未明确' AS NAME,
#{ctx.datacontext.n_owner_eq} AS OWNER,
NULL AS SECTOR,
NULL AS STATISTIC_DATE,
'0' AS TYPE,
NULL AS UPDATE_MAN,
NULL AS UPDATE_TIME
FROM DUAL  
) T1

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