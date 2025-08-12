# 收款情况统计(payee_statistic)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户名称|ACCOUNT_NAME|文本，可指定长度|100|是||
|收款金额|AMOUNT|数值||是||
|业务条线|BUSINESS_LINE|[单项选择(文本值)](index/dictionary_index#industry "行业")|60|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|款项说明|DESCRIPTION|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|销售人员|OWNER|文本，可指定长度|100|是||
|订单编号|O_NUMBER|文本，可指定长度|100|是||
|订单标识|PROJECT_ID|文本，可指定长度|100|是||
|订单名称|PROJECT_NAME|文本，可指定长度|100|是||
|行业|SECTOR|文本，可指定长度|100|是||
|统计时间|STATISTIC_DATE|日期型||是||
|类型|TYPE|[文本，可指定长度](index/dictionary_index#collection_type "收款情况类型")|100|是||
|计划/记录时间|TYPE_DATE|日期时间型||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步计算统计数据|Async_Calculation|用户自定义|默认|不支持||||
|计算统计数据|Calculation|[实体处理逻辑](module/crm/payee_statistic/logic/Calculation "计算统计数据")|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|将计划数据更新到统计表|all_statistic|[实体处理逻辑](module/crm/payee_statistic/logic/update_payee_staticstic "将计划数据更新到统计表")|默认|不支持|[附加操作](index/action_logic_index#payee_statistic_all_statistic)|||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[将分配数据更新到统计表](module/crm/payee_statistic/logic/update_payee_allocate)|update_payee_allocate|无|||
|[将计划数据更新到统计表](module/crm/payee_statistic/logic/update_payee_staticstic)|update_payee_staticstic|无|||
|[清空收款计划表](module/crm/payee_statistic/logic/delete_statistic)|delete_statistic|无|||
|[计算统计数据](module/crm/payee_statistic/logic/Calculation)|Calculation|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/payee_statistic/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/payee_statistic/query/View)|VIEW|否|否 |否 ||
|[通过姓名查询(byName)](module/crm/payee_statistic/query/byName)|byName|否|否 |否 ||
|[当前收款(curPayee)](module/crm/payee_statistic/query/curPayee)|curPayee|否|否 |否 ||
|[当前计划(curPlan)](module/crm/payee_statistic/query/curPlan)|curPlan|否|否 |否 ||
|[空未明确(emptyIndefinite)](module/crm/payee_statistic/query/emptyIndefinite)|emptyIndefinite|否|否 |是 |未明确：0|
|[空收款记录(emptyPayee)](module/crm/payee_statistic/query/emptyPayee)|emptyPayee|否|否 |是 |收款记录：1|
|[空计划(emptyPlan)](module/crm/payee_statistic/query/emptyPlan)|emptyPlan|否|否 |是 |收款计划：2|
|[查询计划和记录(findplan_payee)](module/crm/payee_statistic/query/findplan_payee)|findplan_payee|否|否 |是 |用于反查计划/记录实体数据|
|[未明确(indefinite)](module/crm/payee_statistic/query/indefinite)|indefinite|否|否 |否 ||
|[所有者(owner)](module/crm/payee_statistic/query/owner)|owner|否|否 |否 ||
|[统计时间之后(pending)](module/crm/payee_statistic/query/pending)|pending|否|否 |是 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/payee_statistic/dataset/Default)|DEFAULT|数据查询|是|||
|[通过情况名来排序(SortbyName)](module/crm/payee_statistic/dataset/SortbyName)|SortbyName|数据查询|否|||
|[全部数据(all)](module/crm/payee_statistic/dataset/all)|all|数据查询|否|||
|[附加记录/计划信息(findplan_payee)](module/crm/payee_statistic/dataset/findplan_payee)|findplan_payee|数据查询|否||用于反查计划/记录实体数据|
|[所有者(owner)](module/crm/payee_statistic/dataset/owner)|owner|数据查询|否|||
|[统计(statistic)](module/crm/payee_statistic/dataset/statistic)|statistic|数据查询|否||未明确：0|

## 数据权限

##### 全部数据-读写 :id=payee_statistic-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `UPDATE`
* `CREATE`



##### 全部数据-只读 :id=payee_statistic-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 所有者-读 :id=payee_statistic-OWNER_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/payee_statistic#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_BUSINESS_LINE_EQ|业务条线|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_EQ|名称|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|销售人员|EQ||
|N_STATISTIC_DATE_GT|统计时间|GT||
|N_STATISTIC_DATE_GTANDEQ|统计时间|GTANDEQ||
|N_STATISTIC_DATE_LTANDEQ|统计时间|LTANDEQ||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 订单号反查 | open_project | 查看 |单项数据|<details><summary>打开视图或向导（模态）</summary>[订单信息](app/view/project_main_view)</details>||
| 导航收款统计表格视图(只传搜索表单参数) | nav_statistic_grid | 导航收款统计表格视图 |无数据|用户自定义||
| 反查数据打开编辑视图 | open_edit | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary></details>||
| 生成收款情况统计 | save_statistic_ALLOCATE | 生成收款情况统计 |无数据|<details><summary>后台调用</summary>[Calculation](#行为)||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[导航到表格视图(只传搜索表单参数)](module/crm/payee_statistic/uilogic/exp_to_gridview3)|exp_to_gridview3||
|[导航到表格视图（统计图表导航）](module/crm/payee_statistic/uilogic/exp_to_gridview)|exp_to_gridview||
|[界面跳转至记录/计划](module/crm/payee_statistic/uilogic/redirect)|redirect||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/payee_statistic?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_statistic?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>