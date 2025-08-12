# 收款记录(payee)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户名称|ACCOUNT_NAME|外键值附加数据|200|是||
|分配模式|ALLOCATE_MODEL|[单项选择(文本值)](index/dictionary_index#distribution_model "分配模式")|100|是||
|金额|AMOUNT|数值||是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|业务条线|BUSINESS_LINE|[外键值附加数据](index/dictionary_index#industry "行业")|60|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|款项说明|DESCRIPTION|长文本，没有长度限制|32000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|收款方式|METHOD|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|订单日期|ORDER_DATE|外键值附加数据||是||
|所有者|OWNER|外键值附加数据|60|是||
|订单编号|O_NUMBER|外键值附加数据|120|是||
|回款分配|PAYEE_ALLOCATES|一对多关系数据集合|1048576|是||
|收款日期|PAYEE_DATE|日期型||是||
|编号|PAYEE_NUMBER|文本，可指定长度|120|是||
|收款计划标识|PAYEE_PLAN_ID|外键值|100|是||
|原计划时间|PLANNED_TIME|外键值附加数据||是||
|原计划金额|PLAN_AMOUNT|外键值附加数据||是||
|原计划说明|PLAN_DESCRIPTION|外键值附加数据|32000|是||
|计划名称|PLAN_NAME|外键值文本|200|是||
|父标识|PPROJECT_ID|外键值附加数据|100|是||
|订单标识|PROJECT_ID|外键值|100|是||
|订单名称|PROJECT_NAME|外键值文本|200|是||
|序号|SEQUENCE|数值||是||
|业绩结算金额|SETTLEMENT_AMOUNT|外键值附加数据||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#payee_status "收款状态")|60|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|所属年度|YEAR|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_PAYEE_ALLOCATE_PAYEE_PAYEE_ID](der/DER1N_PAYEE_ALLOCATE_PAYEE_PAYEE_ID)|[回款分配(PAYEE_ALLOCATE)](module/crm/payee_allocate)|1:N关系||
|[DERCUSTOM_ATTACHMENT_PAYEE](der/DERCUSTOM_ATTACHMENT_PAYEE)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PAYEE](der/DERCUSTOM_CUSTOM_BUTTON_PAYEE)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PAYEE](der/DERCUSTOM_NOTE_ATTACH_PAYEE)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_PAYEE_PAYEE_PLAN_PAYEE_PLAN_ID](der/DER1N_PAYEE_PAYEE_PLAN_PAYEE_PLAN_ID)|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|1:N关系||
|[DER1N_PAYEE_PROJECT_PROJECT_ID](der/DER1N_PAYEE_PROJECT_PROJECT_ID)|[订单(PROJECT)](module/crm/project)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|获取对应记录金额|AccountFromPlan|[实体处理逻辑](module/crm/payee/logic/plan_account_get "获取对应记录信息")|默认|不支持||||
|获取订单的人员分配|AllocateFromProject|[实体处理逻辑](module/crm/payee/logic/project_to_payee "将订单分配传入收款记录")|默认|不支持||||
|异步新建线索时添加到工作进展|Async_addPayeeToWorkProgress|用户自定义|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_Create)|||
|CreateTemp|CreateTemp|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_CreateTemp)|||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_GetDraft)|||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|通过project_id获取plan|plan_info_by_project|[实体处理逻辑](module/crm/payee/logic/plan_get_project_id "通过project_id获取记录信息")|默认|不支持||||
|获取订单相关信息|Project_Info|[实体处理逻辑](module/crm/payee/logic/project_get "获取对应订单信息")|默认|不支持|[附加操作](index/action_logic_index#payee_ProjectInfo)|||
|Remove|Remove|内置方法|默认|支持|[附加操作](index/action_logic_index#payee_Remove)|||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_Save)|||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_Update)|||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持|[附加操作](index/action_logic_index#payee_UpdateTemp)|||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||
|新建收款记录添加到工作进展|addPayeeToWorkProgress|[实体处理逻辑](module/crm/payee/logic/addPayeeToWorkProgress "新建收款记录添加到工作进展")|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|移动排序|move_order|用户自定义|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[传递订单id给向导视图](module/crm/payee/logic/get_project_id)|get_project_id|无||传递订单id给向导视图|
|[将订单分配传入收款记录](module/crm/payee/logic/project_to_payee)|project_to_payee|无|||
|[异步添加收款记录到工作进展](module/crm/payee/logic/asyncPayeeToWorkProgres)|asyncPayeeToWorkProgres|无|||
|[新建收款记录添加到工作进展](module/crm/payee/logic/addPayeeToWorkProgress)|addPayeeToWorkProgress|无|||
|[获取对应订单信息](module/crm/payee/logic/project_get)|project_get|无||订单信息回填到表单中|
|[获取对应记录信息](module/crm/payee/logic/plan_account_get)|plan_account_get|无||获取记录信息回填到表单中|
|[通过project_id获取记录信息](module/crm/payee/logic/plan_get_project_id)|plan_get_project_id|无||通过project_id获取记录信息|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/payee/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/payee/query/View)|VIEW|否|否 |否 ||
|[创建者(createman)](module/crm/payee/query/createman)|createman|否|否 |否 ||
|[执行人(executor)](module/crm/payee/query/executor)|executor|否|否 |否 ||
|[金额汇总(sum)](module/crm/payee/query/sum)|sum|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/payee/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/payee/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/payee/dataset/createman)|createman|数据查询|否|||
|[执行人(executor)](module/crm/payee/dataset/executor)|executor|数据查询|否|||
|[金额汇总(sum)](module/crm/payee/dataset/sum)|sum|数据查询|否|||
|[树表格(tree)](module/crm/payee/dataset/tree)|tree|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=payee-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `UPDATE`
* `DELETE`
* `READ`



##### 全部数据-只读 :id=payee-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=payee-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/payee#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`



##### 执行人-只读 :id=payee-EXECUTOR_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/payee#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PAYEE_DATE_GT|收款日期|GT||
|N_PAYEE_DATE_GTANDEQ|收款日期|GTANDEQ||
|N_PAYEE_DATE_IN|收款日期|IN||
|N_PAYEE_DATE_LTANDEQ|收款日期|LTANDEQ||
|N_PAYEE_PLAN_ID_EQ|收款计划标识|EQ||
|N_PLAN_NAME_EQ|计划名称|EQ||
|N_PLAN_NAME_LIKE|计划名称|LIKE||
|N_PROJECT_ID_EQ|订单标识|EQ||
|N_PROJECT_NAME_EQ|订单名称|EQ||
|N_PROJECT_NAME_LIKE|订单名称|LIKE||
|N_STATUS_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 导入数据 | ImportData | 导入收付款 |无数据|<details><summary>打开数据导入视图</summary>[导入收付款]()</details>|自动生成|
| 打开收款记录详情页 | openPayeeView | 收款记录 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[收款记录表格编辑视图](app/view/payee_multimode_edit_view)</details>||
| 打开记录编辑视图 | open_edit | 打开记录编辑视图 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[收款记录](app/view/payee_payee_edit_view)</details>|用于给界面行为提供打开记录编辑的功能|
| 获取订单分配配置 | allocate_from_project | 获取订单分配配置 |单项数据|<details><summary>后台调用</summary>[AllocateFromProject](#行为)||
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 打开收款记录向导视图 | open_wizard | 向导 |无数据|<details><summary>打开视图或向导（模态）</summary>[收款记录](app/view/payee_wizard_view)</details>||
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[收款记录保存之前](module/crm/payee/uilogic/before_save_payee)|before_save_payee|从收款计划->新建收款记录时：判断收款记录金额若小于计划金额时，弹出提示|

## 导入模式

* **导入收付款**


<el-descriptions direction="vertical" :column="31" :size="size" border>
<el-descriptions-item label="序号">-</el-descriptions-item>
<el-descriptions-item label="收款方式">-</el-descriptions-item>
<el-descriptions-item label="收款日期">-</el-descriptions-item>
<el-descriptions-item label="原计划金额">-</el-descriptions-item>
<el-descriptions-item label="原计划时间">-</el-descriptions-item>
<el-descriptions-item label="原计划说明">-</el-descriptions-item>
<el-descriptions-item label="回款分配">-</el-descriptions-item>
<el-descriptions-item label="所属年度">-</el-descriptions-item>
<el-descriptions-item label="订单编号">-</el-descriptions-item>
<el-descriptions-item label="分配模式">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="父标识">-</el-descriptions-item>
<el-descriptions-item label="订单名称">-</el-descriptions-item>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="业绩结算金额">-</el-descriptions-item>
<el-descriptions-item label="业务条线">-</el-descriptions-item>
<el-descriptions-item label="订单日期">-</el-descriptions-item>
<el-descriptions-item label="计划名称">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="编号">-</el-descriptions-item>
<el-descriptions-item label="金额">-</el-descriptions-item>
<el-descriptions-item label="状态">-</el-descriptions-item>
<el-descriptions-item label="款项说明">-</el-descriptions-item>
<el-descriptions-item label="订单标识">-</el-descriptions-item>
<el-descriptions-item label="收款计划标识">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/payee?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/payee?id=导入模式`">
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