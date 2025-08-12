## 未关联的任务和活动(商机)(deal_not_related_task_and_maneuver) <!-- {docsify-ignore-all} -->



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
* **RELATION不存在1:N（NOT EXISTS (SELECT)）DERCUSTOM_TAGET_RELATION_TASK**<br>
连接关系：[DERCUSTOM_TAGET_RELATION_TASK](der/DERCUSTOM_TAGET_RELATION_TASK)<br>
连接实体：[任务&活动](module/crm/task)<br>
连接条件：(`PRINCIPAL_ID(关联主体标识)` EQ `数据上下文.PRINCIPAL_ID`)<br>




<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`CLOSED_TIME`,
t1.`COST`,
t1.`CREATE_MAN`,
t1.`CREATE_TIME`,
t1.`DUE_DATE`,
DATEDIFF(CURDATE(), t1.`DUE_DATE`) AS `DUE_DATE_SORT`,
t1.`END_TIME`,
t1.`ID`,
case when t1.`START_TIME` BETWEEN DATE_SUB(CURDATE(), INTERVAL 1 WEEK) AND DATE_SUB(CURDATE(), INTERVAL 1 DAY) then 1 else 0 end AS `IS_LAST_WEEK`,
case when t1.`CREATE_TIME` BETWEEN DATE_SUB(CURDATE(), INTERVAL 1 WEEK) AND DATE_SUB(CURDATE(), INTERVAL 1 DAY) then 1 else 0 end AS `IS_NEW_LAST_WEEK`,
case when (YEARWEEK(t1.`CREATE_TIME`, 1) = YEARWEEK(CURDATE(), 1)) then 1 else 0 end AS `IS_NEW_THIS_WEEK`,
case when (MONTH(t1.`START_TIME`) = MONTH(CURDATE())) then 1 else 0 end AS `IS_THIS_MONTH`,
case when (YEARWEEK(t1.`START_TIME`, 1) = YEARWEEK(CURDATE(), 1)) then 1 else 0 end AS `IS_THIS_WEEK`,
t1.`LAST_ASSESS_TIME`,
t1.`LOCKED__S`,
t1.`NAME`,
t1.`OWNER`,
t1.`OWNER_ID`,
t1.`OWNER_NAME`,
t1.`OWNER_SUBTYPE`,
t1.`OWNER_TYPE`,
t1.`PRIORITY`,
t1.`REMIND_AT`,
t1.`SEND_NOTIFICATION_EMAIL`,
t1.`START_TIME`,
DATEDIFF(CURDATE(),  START_TIME) AS `START_TIME_SORT`,
t1.`STATUS`,
t1.`SUBJECT`,
t1.`TAG`,
COALESCE(t1.`START_TIME`, t1.`DUE_DATE`) AS `TASK_DATE`,
t1.`TYPE`,
t1.`UPDATE_MAN`,
t1.`UPDATE_TIME`
FROM `TASK` t1 

WHERE NOT(EXISTS(SELECT * FROM `RELATION` t11 
 WHERE 
 t1.`ID` = t11.`TARGET_ID`  AND  ( t11.`PRINCIPAL_ID` = #{ctx.datacontext.principal_id} ) ))
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