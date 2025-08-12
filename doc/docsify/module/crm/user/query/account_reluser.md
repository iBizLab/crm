## 客户关联销售(account_reluser) <!-- {docsify-ignore-all} -->



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
* **RELATION存在1:N（EXISTS (SELECT)）DERCUSTOM_TARGET_RELATION_USER**<br>
连接关系：[DERCUSTOM_TARGET_RELATION_USER](der/DERCUSTOM_TARGET_RELATION_USER)<br>
连接实体：[用户](module/crm/user)<br>
连接条件：(`PRINCIPAL_ID(关联主体标识)` EQ `数据上下文.principal_id` AND `PRINCIPAL_TYPE(关联主体类型)` EQ `'ACCOUNT'`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ALIAS`,
t1.`CITY`,
t1.`COUNTRY`,
t1.`COUNTRY_LOCALE`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DOB`,
t1.`EMAIL`,
t1.`ENABLE`,
t1.`FAX`,
t1.`FIRST_NAME`,
t1.`FULL_NAME`,
t1.`ID`,
t1.`IMAGE_LINK`,
t1.`LAST_NAME`,
t1.`LOCALE`,
t1.`MOBILE`,
t1.`NAME`,
t1.`PHONE`,
t1.`ROLE`,
t1.`STATE`,
t1.`STATUS`,
t1.`STREET`,
t1.`SYSUSERID`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`,
t1.`USER_NAME`,
t1.`WEBSITE`,
t1.`ZIP`
FROM `USER` t1 

WHERE EXISTS(SELECT * FROM `RELATION` t11 
 WHERE 
 t1.`ID` = t11.`TARGET_ID`  AND  ( t11.`PRINCIPAL_ID` = #{ctx.datacontext.principal_id}  AND  t11.`PRINCIPAL_TYPE` = 'ACCOUNT' ) ) AND t1.ENABLE = 1
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