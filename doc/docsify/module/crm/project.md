# 订单(project)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户标识|ACCOUNT_ID|外键值|100|是||
|客户名称|ACCOUNT_NAME|外键值文本|200|是||
|分配模式|ALLOCATE_MODEL|文本，可指定长度|100|是||
|订单金额|AMOUNT|数值||是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|业务条线|BUSINESS_LINE|[单项选择(文本值)](index/dictionary_index#industry "行业")|60|是||
|关闭日期|CLOSED_DATE|日期型||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|执行人|EXECUTORS|一对多关系数据集合|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否本年执行|IS_CLOSE_THIS_YEAR|文本，可指定长度|200|是||
|纳入销售业绩计算|IS_IN_SALES_CAL|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|是否本年新签|IS_NEW_THIS_YEAR|文本，可指定长度|200|是||
|对应实体订单|IS_PHYSICAL_ORDER|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|最近评估时间|LAST_ASSESS_TIME|日期时间型||是||
|订单名称|NAME|文本，可指定长度|200|是||
|分配人员|ORDER_ALLOCATES|一对多关系数据集合|1048576|是||
|订单日期|ORDER_DATE|日期型||是||
|所有者|OWNER|单项选择(文本值)|60|是||
|订单编号|O_NUMBER|文本，可指定长度|120|是||
|父标识|PID|外键值|100|是||
|父订单|PNAME|外键值文本|200|是||
|业绩结算金额|SETTLEMENT_AMOUNT|数值||是||
|结算成本|SETTLEMENT_COST|数值||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#order_status "订单状态")|60|是||
|税率|TAX|数值||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|所属年度|YEAR|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_PAYEE_PLAN_PROJECT_PROJECT_ID](der/DER1N_PAYEE_PLAN_PROJECT_PROJECT_ID)|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|1:N关系||
|[DER1N_PAYEE_PROJECT_PROJECT_ID](der/DER1N_PAYEE_PROJECT_PROJECT_ID)|[收款记录(PAYEE)](module/crm/payee)|1:N关系||
|[DER1N_PROJECT_PROJECT_PID](der/DER1N_PROJECT_PROJECT_PID)|[订单(PROJECT)](module/crm/project)|1:N关系||
|[DERCUSTOM_ATTACHMENT_PROJECT](der/DERCUSTOM_ATTACHMENT_PROJECT)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PROJECT](der/DERCUSTOM_CUSTOM_BUTTON_PROJECT)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_EXECUTOR_PROJECT](der/DERCUSTOM_EXECUTOR_PROJECT)|[执行人(EXECUTOR)](module/crm/executor)|自定义关系||
|[DERCUSTOM_NOTE_ATTACH_PROJECT](der/DERCUSTOM_NOTE_ATTACH_PROJECT)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_ORDER_ALLOCATE_PROJECT](der/DERCUSTOM_ORDER_ALLOCATE_PROJECT)|[订单分配(ORDER_ALLOCATE)](module/crm/order_allocate)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_PROJECT_ACCOUNT_ACCOUNT_ID](der/DER1N_PROJECT_ACCOUNT_ACCOUNT_ID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||
|[DER1N_PROJECT_PROJECT_PID](der/DER1N_PROJECT_PROJECT_PID)|[订单(PROJECT)](module/crm/project)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步新建订单时添加到工作进展|Async_addProjectToWorkProgress|用户自定义|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|检测子订单是否有未关闭订单|scan_status|[实体处理逻辑](module/crm/project/logic/scan_save "检测子订单状态后保存订单")|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#project_Create)|||
|查询父订单信息|FindByPid|[实体处理逻辑](module/crm/project/logic/GetAccount "通过父订单查询客户")|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#project_GetDraft)|||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#project_Update)|||
|新建订单时添加到工作进展|addProjectToWorkProgress|[实体处理逻辑](module/crm/project/logic/addProjectToWorkProgress "新建订单时添加到工作进展")|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[异步添加订单到工作进展](module/crm/project/logic/asyncProjectToWorkProgres)|asyncProjectToWorkProgres|无|||
|[循环子订单判断](module/crm/project/logic/loop_son_project)|loop_son_project|无||循环订单下的子订单来判断是否有未关闭的订单|
|[新建、更新订单后推送](module/crm/project/logic/project_change_notify)|project_change_notify|无|||
|[新建订单前加载执行人](module/crm/project/logic/defaultExecutor)|defaultExecutor|无|||
|[新建订单时添加到工作进展](module/crm/project/logic/addProjectToWorkProgress)|addProjectToWorkProgress|无|||
|[检测子订单状态后保存订单](module/crm/project/logic/scan_save)|scan_save|无||判断子订单状态，如果出现未关闭订单则提示订单状态；调用了【循环子订判断】的逻辑|
|[通过父订单查询客户](module/crm/project/logic/GetAccount)|GetAccount|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/project/query/Default)|DEFAULT|是|否 |否 ||
|[查询实体订单(QueryPhysicalOrder)](module/crm/project/query/QueryPhysicalOrder)|QueryPhysicalOrder|否|否 |否 |签单统计柱状图用|
|[查询实体订单(QueryPhysicalOrderGrid)](module/crm/project/query/QueryPhysicalOrderGrid)|QueryPhysicalOrderGrid|否|否 |否 |签单统计表格用|
|[默认（全部数据）(VIEW)](module/crm/project/query/View)|VIEW|否|否 |否 ||
|[创建者(createman)](module/crm/project/query/createman)|createman|否|否 |否 ||
|[执行人(executor)](module/crm/project/query/executor)|executor|否|否 |否 ||
|[月份无订单(monthNoPro)](module/crm/project/query/monthNoPro)|monthNoPro|否|否 |是 |签单统计柱状图用|
|[所有者(owner)](module/crm/project/query/owner)|owner|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/project/dataset/Default)|DEFAULT|数据查询|是|||
|[签单统计(OrderStatistics)](module/crm/project/dataset/OrderStatistics)|OrderStatistics|数据查询|否||签单统计柱状图用|
|[实体订单(QueryPhysicalOrderGrid)](module/crm/project/dataset/QueryPhysicalOrderGrid)|QueryPhysicalOrderGrid|数据查询|否||签单统计表格用|
|[所有数据(all)](module/crm/project/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/project/dataset/createman)|createman|数据查询|否|||
|[执行人(executor)](module/crm/project/dataset/executor)|executor|数据查询|否|||
|[所有者(owner)](module/crm/project/dataset/owner)|owner|数据查询|否|||
|[树表格(tree)](module/crm/project/dataset/tree)|tree|数据查询|否|[TreeGridDEDataSetRuntime](index/plugin_index#UsrSFPlugin0407757309)||

## 数据权限

##### 全部数据-读写 :id=project-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`



##### 全部数据-只读 :id=project-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=project-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/project#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`
* `UPDATE`
* `DELETE`



##### 执行人-读写 :id=project-EXECUTOR_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/project#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



##### 执行人-只读 :id=project-EXECUTOR_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/project#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 所有者-读写 :id=project-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/project#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `CREATE`
* `READ`



## 消息通知

|    中文名col200   | 代码名col150       |  消息队列col200   |  消息模板col200 |  通知目标col150     |  备注col350  |
|------------| -----   |  -------- | -------- |-------- |-------- |
|[订单新建、更新通知](module/crm/project/notify/changeNotify)|changeNotify|[默认消息队列](index/notify_index)|[订单新建、更新通知模板](index/notify_index#project_change)|订单执行人 销售领导 ||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_ID_EQ|客户标识|EQ||
|N_ACCOUNT_NAME_EQ|客户名称|EQ||
|N_ACCOUNT_NAME_LIKE|客户名称|LIKE||
|N_AMOUNT_GT|订单金额|GT||
|N_AMOUNT_GTANDEQ|订单金额|GTANDEQ||
|N_AMOUNT_LT|订单金额|LT||
|N_AMOUNT_LTANDEQ|订单金额|LTANDEQ||
|N_BUSINESS_LINE_EQ|业务条线|EQ||
|N_EXECUTORS_EXISTS__N_NAME_LIKE|执行人|EXISTS||
|N_EXECUTORS_EXISTS__N_USER_ID_EQ|执行人|EXISTS||
|N_EXECUTORS_LIKE|执行人|LIKE||
|N_ID_EQ|标识|EQ||
|N_IS_CLOSE_THIS_YEAR_EQ|是否本年执行|EQ||
|N_IS_NEW_THIS_YEAR_EQ|是否本年新签|EQ||
|N_IS_PHYSICAL_ORDER_EQ|对应实体订单|EQ||
|N_NAME_LIKE|订单名称|LIKE||
|N_ORDER_DATE_GT|订单日期|GT||
|N_ORDER_DATE_GTANDEQ|订单日期|GTANDEQ||
|N_ORDER_DATE_LT|订单日期|LT||
|N_OWNER_EQ|所有者|EQ||
|N_O_NUMBER_LIKE|订单编号|LIKE||
|N_PID_EQ|父标识|EQ||
|N_PNAME_EQ|父订单|EQ||
|N_PNAME_LIKE|父订单|LIKE||
|N_STATUS_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 创建订单/子订单 | create_node_project | 创建子订单 |无数据|<details><summary>打开视图或向导（模态）</summary>[订单](app/view/project_edit_view3)</details>|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[订单](app/view/project_edit_view3)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 导航签单情况统计表格视图(只传搜索表单参数) | nav_project_grid | 导航签单情况统计表格视图 |无数据|用户自定义||
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 打开订单主数据视图 | openProjectZsjVeiw | 订单 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[订单信息](app/view/project_main_view)</details>||
| 关闭订单 | close_project | 关闭订单 |单项数据|<details><summary>后台调用</summary>[scan_status](#行为)||
| 导入数据 | ImportData | 导入在线项目 |无数据|<details><summary>打开数据导入视图</summary>[导入在线项目]()</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 保存并打开订单主数据视图 | createAndOpenProject | 保存并打开订单主数据视图 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/project/uilogic/add_attachment)|add_attachment|自动生成|
|[签单导航到表格视图(只传搜索表单参数)](module/crm/project/uilogic/qd_exp_to_gridview)|qd_exp_to_gridview||

## 导入模式

* **导入在线项目**


<el-descriptions direction="vertical" :column="31" :size="size" border>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="关闭日期">-</el-descriptions-item>
<el-descriptions-item label="订单日期">-</el-descriptions-item>
<el-descriptions-item label="纳入销售业绩计算">-</el-descriptions-item>
<el-descriptions-item label="所属年度">-</el-descriptions-item>
<el-descriptions-item label="分配人员">-</el-descriptions-item>
<el-descriptions-item label="分配模式">-</el-descriptions-item>
<el-descriptions-item label="执行人">-</el-descriptions-item>
<el-descriptions-item label="业务条线">-</el-descriptions-item>
<el-descriptions-item label="对应实体订单">-</el-descriptions-item>
<el-descriptions-item label="最近评估时间">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="订单名称">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="客户标识">-</el-descriptions-item>
<el-descriptions-item label="状态">-</el-descriptions-item>
<el-descriptions-item label="是否本年新签">-</el-descriptions-item>
<el-descriptions-item label="是否本年执行">-</el-descriptions-item>
<el-descriptions-item label="订单金额">-</el-descriptions-item>
<el-descriptions-item label="税率">-</el-descriptions-item>
<el-descriptions-item label="业绩结算金额">-</el-descriptions-item>
<el-descriptions-item label="结算成本">-</el-descriptions-item>
<el-descriptions-item label="父标识">-</el-descriptions-item>
<el-descriptions-item label="父订单">-</el-descriptions-item>
<el-descriptions-item label="订单编号">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/project?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=消息通知`">
  消息通知
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/project?id=导入模式`">
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