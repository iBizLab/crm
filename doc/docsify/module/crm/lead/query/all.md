## 全部数据(all) <!-- {docsify-ignore-all} -->



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
t1.`ACCOUNT_ID`,
t11.`ACCOUNT_NAME`,
t1.`ANNUALREVENUE`,
t1.`CITY`,
t1.`COMPANY`,
t1.`CONVERTED_DATE_TIME`,
t1.`CONVERTED__S`,
t1.`COUNTRY`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DESCRIPTION`,
t1.`DESIGNATION`,
t1.`EMAIL`,
t1.`EMAIL_OPT_OUT`,
t1.`ENRICH_STATUS_S`,
t1.`FIRST_NAME`,
t1.`FULL_NAME`,
t1.`ID`,
t1.`IS_DELETED`,
t1.`LAST_ASSESS_TIME`,
t1.`LAST_NAME`,
t1.`LEAD_CONVERSION_TIME`,
t1.`LEAD_SOURCE`,
t1.`LEAD_STATUS`,
t1.`MOBILE`,
t1.`NAME`,
t1.`NO_OF_EMPLOYEES`,
t1.`OWNER`,
t1.`PID`,
t21.`SUBJECT` AS `PNAME`,
t1.`SALUTATION`,
t1.`SECONDARY_EMAIL`,
t1.`SKYPE_ID`,
t1.`STATE`,
t1.`STREET`,
t1.`SUBJECT`,
t1.`UNSUBSCRIBED_MODE`,
t1.`UNSUBSCRIBED_TIME`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`ZIP_CODE`
FROM `LEAD` t1 
LEFT JOIN `ACCOUNT` t11 ON t1.`ACCOUNT_ID` = t11.`ID` 
LEFT JOIN `LEAD` t21 ON t1.`PID` = t21.`ID` 

WHERE t1.IS_DELETED = 0
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