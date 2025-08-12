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



### 查询条件

(`CREATE_MAN(建立人)` EQ `用户上下文.srfpersonid`)





<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ALL_DAY`,
t1.`CHECK_IN_CITY`,
t1.`CHECK_IN_COUNTRY`,
t1.`CHECK_IN_STATE`,
t1.`CHECK_IN_STATUS`,
t1.`CHECK_IN_SUB_LOCALITY`,
t1.`CHECK_IN_TIME`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`END_DATETIME`,
t1.`EVENT_TITLE`,
t1.`ID`,
t1.`LATITUDE`,
t1.`LONGITUDE`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNER_ID`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`PARTICIPANTS`,
t1.`START_DATETIME`,
t1.`TAG`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`VENUE`,
t1.`ZIP_CODE`
FROM `EVENT` t1 

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