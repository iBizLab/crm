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
t1.`CATEGORY`,
t1.`CITY`,
t1.`COUNTRY`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`EMAIL`,
t1.`EMAIL_OPT_OUT`,
t1.`GL_ACCOUNT`,
t1.`ID`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`OWNER`,
t1.`PHONE`,
t1.`RECORD_LMAGE`,
t1.`STATE`,
t1.`STREET`,
t1.`TAG`,
t1.`UNSUBSCRIBED_MODE`,
t1.`UNSUBSCRIBED_TIME`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`VENDOR_NAME`,
t1.`WEBSITE`,
t1.`ZIP_CODE`
FROM `VENDOR` t1 


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