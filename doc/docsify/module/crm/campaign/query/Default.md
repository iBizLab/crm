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
t1.`ACTUAL_COST`,
t1.`BUDGETED_COST`,
t1.`CAMPAIGN_NAME`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`END_DATE`,
t1.`EXPECTED_RESPONSE`,
t1.`EXPECTED_REVENUE`,
t1.`ID`,
t1.`NAME`,
t1.`NATIVE_SURVEY__EXTN__DEPARTMENT_ID`,
t1.`NATIVE__SURVEY__EXTN__SURVEY`,
t1.`NATIVE__SURVEY__EXTN__SURVEY_TYPE`,
t1.`NATIVE__SURVEY__EXTN__SURVEY_URL`,
t1.`NATIVE__SURVEY__EXTN__SURVEY__DEPARTMENT`,
t1.`NATIVE__WEBINAR__EXTN__WEBINAR_LAUNCH_URL`,
t1.`NATIVE__WEBINAR__EXTN__WEBINAR_REGISTRATION_URL`,
t1.`NATIVE__WEBINAR__EXTN__WEBINAR__DURATION`,
t1.`NATIVE__WEBINAR__EXTN__WEBINAR__SCHEDULE`,
t1.`NUM_SENT`,
t1.`START_DATE`,
t1.`STATUS`,
t1.`TAG`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `CAMPAIGN` t1 


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