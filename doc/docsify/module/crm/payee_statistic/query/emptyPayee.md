## 空收款记录(emptyPayee) <!-- {docsify-ignore-all} -->

收款记录：1

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
SELECT DISTINCT
0 AS AMOUNT,
#{ctx.datacontext.n_business_line_eq} AS BUSINESS_LINE,
NULL AS CREATE_MAN,
NULL AS CREATE_TIME,
UUID() AS ID,
DATE_FORMAT(your_date, '%Y-%m') AS NAME,
#{ctx.datacontext.n_owner_eq} AS OWNER,
NULL AS SECTOR,
NULL AS STATISTIC_DATE,
'1' AS TYPE,
NULL AS UPDATE_MAN,
NULL AS UPDATE_TIME
FROM (
    SELECT
        DATE_ADD(
            DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.gt},'%Y-%m-%d'), '%Y-%m-01'),
            INTERVAL a.a + (10 * b.a) MONTH
        ) AS your_date
    FROM
        (SELECT 0 a UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3
         UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6
         UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS a
    CROSS JOIN
        (SELECT 0 a UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3
         UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6
         UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS b
    WHERE
        DATE_ADD(DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.gt},'%Y-%m-%d'), '%Y-%m-01'),INTERVAL a.a + (10 * b.a) MONTH) <= DATE_FORMAT(STR_TO_DATE(#{ctx.datacontext.lt},'%Y-%m-%d'), '%Y-%m-01') - INTERVAL 1 DAY
) AS months
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