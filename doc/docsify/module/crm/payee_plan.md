# 收款计划(payee_plan)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|订单客户|ACCOUNT_NAME|外键值附加数据|200|是||
|金额|AMOUNT|数值||是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|业务条线|BUSINESS_LINE|[外键值附加数据](index/dictionary_index#industry "行业")|60|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|款项说明|DESCRIPTION|长文本，没有长度限制|32000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|未纳入结算计划款|IS_NOT_IN_PLAN|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|名称|NAME|文本，可指定长度|200|是||
|订单日期|ORDER_DATE|外键值附加数据||是||
|所有者|OWNER|外键值附加数据|60|是||
|订单编号|O_NUMBER|外键值附加数据|120|是||
|计划收款时间|PLANNED_TIME|日期型||是||
|计划名称|PLAN_NAME|文本，可指定长度|200|是||
|计划状态|PLAN_STATUS|[单项选择(文本值)](index/dictionary_index#UsrCodeList0618913512 "计划状态")|100|是||
|父订单标识|PPROJECT_ID|外键值附加数据|100|是||
|订单金额|PROJECT_AMOUNT|外键值附加数据||是||
|订单名称|PROJECT_ID|外键值|100|是||
|订单名称|PROJECT_NAME|外键值文本|200|是||
|序号|SEQUENCE|数值||是||
|业绩结算金额|SETTLEMENT_AMOUNT|外键值附加数据||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_PAYEE_PAYEE_PLAN_PAYEE_PLAN_ID](der/DER1N_PAYEE_PAYEE_PLAN_PAYEE_PLAN_ID)|[收款记录(PAYEE)](module/crm/payee)|1:N关系||
|[DERCUSTOM_ATTACHMENT_PAYEE_PLAN](der/DERCUSTOM_ATTACHMENT_PAYEE_PLAN)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PAYEE_PLAN](der/DERCUSTOM_CUSTOM_BUTTON_PAYEE_PLAN)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PAYEE_PLAN](der/DERCUSTOM_NOTE_ATTACH_PAYEE_PLAN)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_PAYEE_PLAN_PROJECT_PROJECT_ID](der/DER1N_PAYEE_PLAN_PROJECT_PROJECT_ID)|[订单(PROJECT)](module/crm/project)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_plan_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持|[附加操作](index/action_logic_index#payee_plan_Remove)|||
|Save|Save|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_plan_Save)|||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_plan_Update)|||
|获取订单数据|add_project|[实体处理逻辑](module/crm/payee_plan/logic/dateFromProject "将订单数据传给计划")|默认|不支持|||获取订单数据|
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|移动排序|move_order|用户自定义|默认|不支持||||
|将数据传给记录|plan_to_payee|[实体处理逻辑](module/crm/payee_plan/logic/plan_to_payee "将数据传给记录")|默认|不支持|||将数据传给记录|

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[将数据传给记录](module/crm/payee_plan/logic/plan_to_payee)|plan_to_payee|无||将计划数据（金额、描述等）传给记录|
|[将订单数据传给计划](module/crm/payee_plan/logic/dateFromProject)|dateFromProject|无||获取订单的数据并赋给计划展示|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/payee_plan/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/payee_plan/query/View)|VIEW|否|否 |否 ||
|[全部(all)](module/crm/payee_plan/query/all)|all|否|否 |否 ||
|[创建者(createman)](module/crm/payee_plan/query/createman)|createman|否|否 |否 ||
|[执行人(executor)](module/crm/payee_plan/query/executor)|executor|否|否 |否 ||
|[金额汇总(sum)](module/crm/payee_plan/query/sum)|sum|否|否 |否 ||
|[进行中(toward)](module/crm/payee_plan/query/toward)|toward|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/payee_plan/dataset/Default)|DEFAULT|数据查询|是|||
|[全部(all)](module/crm/payee_plan/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/payee_plan/dataset/createman)|createman|数据查询|否|||
|[执行人(executor)](module/crm/payee_plan/dataset/executor)|executor|数据查询|否|||
|[金额汇总(sum)](module/crm/payee_plan/dataset/sum)|sum|数据查询|否|||
|[进行中(toward)](module/crm/payee_plan/dataset/toward)|toward|数据查询|否|||
|[树表格(tree)](module/crm/payee_plan/dataset/tree)|tree|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=payee_plan-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `READ`
* `DELETE`



##### 全部数据-只读 :id=payee_plan-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=payee_plan-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/payee_plan#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `CREATE`
* `UPDATE`



##### 执行人-只读 :id=payee_plan-EXECUTOR_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/payee_plan#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AMOUNT_GTANDEQ|金额|GTANDEQ||
|N_AMOUNT_IN|金额|IN||
|N_AMOUNT_LTANDEQ|金额|LTANDEQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_O_NUMBER_LIKE|订单编号|LIKE||
|N_PLANNED_TIME_GT|计划收款时间|GT||
|N_PLANNED_TIME_GTANDEQ|计划收款时间|GTANDEQ||
|N_PLANNED_TIME_IN|计划收款时间|IN||
|N_PLANNED_TIME_LTANDEQ|计划收款时间|LTANDEQ||
|N_PLAN_NAME_LIKE|计划名称|LIKE||
|N_PLAN_STATUS_EQ|计划状态|EQ||
|N_PROJECT_ID_EQ|订单名称|EQ||
|N_PROJECT_NAME_EQ|订单名称|EQ||
|N_PROJECT_NAME_LIKE|订单名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 生成收款记录 | create_payee | 生成收款记录 |单项数据|<details><summary>打开视图或向导（模态）</summary>[收款记录](app/view/payee_payee_edit_view)</details>||
| 拆分计划 | split_plan | 拆分计划 |无数据|<details><summary>打开视图或向导（模态）</summary>[收款计划](app/view/payee_plan_edit_view)</details>||
| 导入数据 | ImportData | 导入收款计划 |无数据|<details><summary>打开数据导入视图</summary>[导入收款计划]()</details>|自动生成|
| 计划拆分保存 | cut_save | 计划拆分保存 |单项数据|<details><summary>打开视图或向导（模态）</summary></details>||
| 打开计划编辑视图 | open_edit | 打开计划编辑视图 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[收款计划](app/view/payee_plan_edit_view)</details>||
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 关闭计划 | close_plan | 关闭计划 |单项数据（主键）|<details><summary>后台调用</summary>[Update](#行为)|计划状态改为50|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[拆分前保存检测](module/crm/payee_plan/uilogic/cut_and_save)|cut_and_save|拆分订单时上一订单减掉新订单的金额|

## 导入模式

* **导入收款计划**


<el-descriptions direction="vertical" :column="24" :size="size" border>
<el-descriptions-item label="序号">-</el-descriptions-item>
<el-descriptions-item label="计划收款时间">-</el-descriptions-item>
<el-descriptions-item label="未纳入结算计划款">-</el-descriptions-item>
<el-descriptions-item label="订单编号">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="父订单标识">-</el-descriptions-item>
<el-descriptions-item label="计划状态">-</el-descriptions-item>
<el-descriptions-item label="计划名称">-</el-descriptions-item>
<el-descriptions-item label="订单金额">-</el-descriptions-item>
<el-descriptions-item label="业绩结算金额">-</el-descriptions-item>
<el-descriptions-item label="订单客户">-</el-descriptions-item>
<el-descriptions-item label="订单日期">-</el-descriptions-item>
<el-descriptions-item label="业务条线">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="订单名称">-</el-descriptions-item>
<el-descriptions-item label="款项说明">-</el-descriptions-item>
<el-descriptions-item label="金额">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="订单名称">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/payee_plan?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee_plan?id=导入模式`">
  导入模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>