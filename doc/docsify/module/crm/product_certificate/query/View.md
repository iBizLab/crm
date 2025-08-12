## 默认（全部数据）(View) <!-- {docsify-ignore-all} -->



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
t1.`ACCREDITED_ORGANIZATION`,
t1.`AWARDING_ORGANIZATION`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`END_DATE`,
t1.`ID`,
t1.`ISSUE_DATE`,
t1.`ISSUE_MAN`,
t1.`NAME`,
t1.`PC_NUMBER`,
t1.`PRODUCT_ID`,
t1.`SCOPE`,
t1.`SERVICE_NAME`,
t1.`START_DATE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `PRODUCT_CERTIFICATE` t1 


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