# 商机(deal)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户ID|ACCOUNT_ID|外键值|100|是||
|客户名称|ACCOUNT_NAME|外键值文本|200|是||
|金额|AMOUNT|数值||是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|业务条线|BUSINESS_LINE|[单项选择(文本值)](index/dictionary_index#industry "行业")|60|是||
|Change Log Time|CHANGE_LOG_TIME__S|日期时间型||是||
|预计成交日期|CLOSING_DATE|日期型||是||
|联系人标识|CONTACT_ID|外键值|100|是||
|联系人名称|CONTACT_NAME|外键值文本|200|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|商机名称|DEAL_NAME|文本，可指定长度|120|是||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|执行人|EXECUTORS|一对多关系数据集合|1048576|是||
|预期收益|EXPECTED_REVENUE|数值||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|最近操作时间|LAST_ACTIVITY_TIME|日期时间型||是||
|最近评估时间|LAST_ASSESS_TIME|日期时间型||是||
|线索转换用时|LEAD_CONVERSIONTIME|整型||是||
|线索来源|LEAD_SOURCE|[单项选择(文本值)](index/dictionary_index#lead_source "线索来源")|60|是||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|名称|NAME|文本，可指定长度|200|是||
|下一步|NEXT_STEP|文本，可指定长度|100|是||
|总销售时间|OVERALL_SALES_DURATION|整型||是||
|所有者|OWNER|单项选择(文本值)|60|是||
|可能性|PROBABILITY|数值||是||
|丢单原因|REASON_FOR_LOSS__S|单项选择(文本值)|60|是||
|销售周期的持续时间|SALES_CYCLE_DURATION|整型||是||
|阶段标识|STAGE|外键值|60|是||
|商机阶段概率|STAGE_PROBABILITY|外键值附加数据||是||
|标签|TAG|文本，可指定长度|2000|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#type "类型")|60|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|是否有效|VALIDITY|文本，可指定长度|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DEAL_HISTORY_DEAL_DEAL_ID](der/DER1N_DEAL_HISTORY_DEAL_DEAL_ID)|[阶段历史(DEAL_HISTORY)](module/crm/deal_history)|1:N关系||
|[DERCUSTOM_ATTACHMENT_DEAL](der/DERCUSTOM_ATTACHMENT_DEAL)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_DEAL](der/DERCUSTOM_CUSTOM_BUTTON_DEAL)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_DEAL_RELATION](der/DERCUSTOM_DEAL_RELATION)|[关联(RELATION)](module/crm/relation)|自定义关系||
|[DERCUSTOM_EXECUTOR_DEAL](der/DERCUSTOM_EXECUTOR_DEAL)|[执行人(EXECUTOR)](module/crm/executor)|自定义关系||
|[DERCUSTOM_NOTE_ATTACH_DEAL](der/DERCUSTOM_NOTE_ATTACH_DEAL)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_TARGET_DEAL_RELATION](der/DERCUSTOM_TARGET_DEAL_RELATION)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DEAL_ACCOUNT_ACCOUNT_ID](der/DER1N_DEAL_ACCOUNT_ACCOUNT_ID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||
|[DER1N_DEAL_CONTACT_CONTACT_ID](der/DER1N_DEAL_CONTACT_CONTACT_ID)|[联系人(CONTACT)](module/crm/contact)|1:N关系||
|[DER1N_DEAL_DEAL_STAGE_STAGE](der/DER1N_DEAL_DEAL_STAGE_STAGE)|[商机阶段(DEAL_STAGE)](module/crm/deal_stage)|1:N关系||
|[DERCUSTOM_DEAL_USER](der/DERCUSTOM_DEAL_USER)|[用户(USER)](module/crm/user)|自定义关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步新建商机时添加到工作进展|Async_addDealToWorkProgress|用户自定义|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#deal_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#deal_Update)|||
|新建商机时添加到工作进展|addDealToWorkProgress|[实体处理逻辑](module/crm/deal/logic/addDealToWorkProgress "新建商机时添加到工作进展")|默认|不支持||||
|添加商机|add_deal|[实体处理逻辑](module/crm/deal/logic/add_deal "添加商机")|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|关联任务和活动|relate_task_and_maneuver|[实体处理逻辑](module/crm/deal/logic/relate_task_and_maneuver "关联任务和活动")|默认|不支持||||
|获取阶段概率|stageProbability|[实体处理逻辑](module/crm/deal/logic/stageProbability "获取商机阶段概率")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[关联任务和活动](module/crm/deal/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[商机新建、更新通知](module/crm/deal/logic/changeNotiy)|changeNotiy|无|||
|[商机阶段更新时生成历史](module/crm/deal/logic/scdealstagehis)|scdealstagehis|属性逻辑|||
|[异步添加商机到工作进展](module/crm/deal/logic/asyncDealToWorkProgres)|asyncDealToWorkProgres|无|||
|[新建商机时添加到工作进展](module/crm/deal/logic/addDealToWorkProgress)|addDealToWorkProgress|无|||
|[新建商机时生成阶段历史](module/crm/deal/logic/scCreatedealstagehis)|scCreatedealstagehis|无|||
|[添加商机](module/crm/deal/logic/add_deal)|add_deal|无|||
|[获取商机关联任务和活动](module/crm/deal/logic/get_task_and_maneuver)|get_task_and_maneuver|无|||
|[获取商机阶段概率](module/crm/deal/logic/stageProbability)|stageProbability|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[全部商机(All)](module/crm/deal/query/All)|All|否|否 |否 ||
|[根据客户筛选(ByAccount)](module/crm/deal/query/ByAccount)|ByAccount|否|否 |否 ||
|[数据查询(DEFAULT)](module/crm/deal/query/Default)|DEFAULT|否|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/deal/query/View)|VIEW|是|否 |否 ||
|[创建者(createman)](module/crm/deal/query/createman)|createman|否|否 |否 ||
|[执行人(executor)](module/crm/deal/query/executor)|executor|否|否 |否 ||
|[所有者(owner)](module/crm/deal/query/owner)|owner|否|否 |否 ||
|[商机关联的信息(relation)](module/crm/deal/query/relation)|relation|否|否 |否 ||
|[金额合计(sum)](module/crm/deal/query/sum)|sum|否|否 |否 ||
|[被关联的商机信息(target_relation)](module/crm/deal/query/target_relation)|target_relation|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[全部商机(All)](module/crm/deal/dataset/All)|All|数据查询|否|||
|[根据客户筛选(ByAccount)](module/crm/deal/dataset/ByAccount)|ByAccount|数据查询|否|||
|[数据集(DEFAULT)](module/crm/deal/dataset/Default)|DEFAULT|数据查询|是|||
|[图表(chart)](module/crm/deal/dataset/chart)|chart|数据查询|否|||
|[创建者(createman)](module/crm/deal/dataset/createman)|createman|数据查询|否|||
|[商机关联的任务和活动(deal_relation_task)](module/crm/deal/dataset/deal_relation_task)|deal_relation_task|[实体逻辑](module/crm/deal/logic/get_task_and_maneuver)|否|||
|[执行人(executor)](module/crm/deal/dataset/executor)|executor|数据查询|否|||
|[所有者(owner)](module/crm/deal/dataset/owner)|owner|数据查询|否|||
|[关联的商机(relation)](module/crm/deal/dataset/relation)|relation|数据查询|否|||
|[金额汇总(sum)](module/crm/deal/dataset/sum)|sum|数据查询|否|||
|[被关联的商机信息(target_relation)](module/crm/deal/dataset/target_relation)|target_relation|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=deal-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `READ`
* `UPDATE`



##### 全部数据-只读 :id=deal-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=deal-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/deal#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `DELETE`
* `READ`



##### 执行人-读 :id=deal-EXECUTOR_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/deal#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 所有者-读写 :id=deal-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/deal#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `READ`
* `CREATE`



## 消息通知

|    中文名col200   | 代码名col150       |  消息队列col200   |  消息模板col200 |  通知目标col150     |  备注col350  |
|------------| -----   |  -------- | -------- |-------- |-------- |
|[商机新建、更新通知](module/crm/deal/notify/deal_change_notify)|deal_change_notify|[默认消息队列](index/notify_index)|[商机新建、更新通知模板](index/notify_index#deal_change)|销售领导 ||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_ID_EQ|客户ID|EQ||
|N_ACCOUNT_NAME_EQ|客户名称|EQ||
|N_ACCOUNT_NAME_LIKE|客户名称|LIKE||
|N_AMOUNT_GT|金额|GT||
|N_AMOUNT_GTANDEQ|金额|GTANDEQ||
|N_AMOUNT_LT|金额|LT||
|N_AMOUNT_LTANDEQ|金额|LTANDEQ||
|N_BUSINESS_LINE_EQ|业务条线|EQ||
|N_CLOSING_DATE_GTANDEQ|预计成交日期|GTANDEQ||
|N_CLOSING_DATE_IN|预计成交日期|IN||
|N_CLOSING_DATE_LTANDEQ|预计成交日期|LTANDEQ||
|N_CONTACT_ID_EQ|联系人标识|EQ||
|N_CONTACT_NAME_EQ|联系人名称|EQ||
|N_CONTACT_NAME_LIKE|联系人名称|LIKE||
|N_DEAL_NAME_LIKE|商机名称|LIKE||
|N_ID_EQ|标识|EQ||
|N_LEAD_SOURCE_EQ|线索来源|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_REASON_FOR_LOSS__S_EQ|丢单原因|EQ||
|N_STAGE_EQ|阶段标识|EQ||
|N_STAGE_PROBABILITY_EQ|商机阶段概率|EQ||
|N_STAGE_PROBABILITY_LIKE|商机阶段概率|LIKE||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 打开商机主数据视图 | openDealZsjView | 商机 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[商机信息](app/view/deal_main_view)</details>||
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[商机](app/view/deal_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 导入数据 | ImportData | 导入商机 |无数据|<details><summary>打开数据导入视图</summary>[导入商机]()</details>|自动生成|
| 打开关联活动任务视图 | open_relation_view | 添加 |无数据|<details><summary>后台调用</summary>[relate_task_and_maneuver](#行为)||
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 创建商机 | createDeal | 创建商机 |无数据|<details><summary>打开视图或向导（模态）</summary>[商机](app/view/deal_edit_view)</details>||
| 保存并打开商机主数据视图 | createAndOpenDeal | 保存并打开商机主数据视图 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[导航到表格视图（图表导航）](module/crm/deal/uilogic/exp_to_gridview)|exp_to_gridview||
|[导航（全部商机含查询条件）](module/crm/deal/uilogic/all_deal_with_query)|all_deal_with_query||
|[添加附件](module/crm/deal/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入商机**


<el-descriptions direction="vertical" :column="35" :size="size" border>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="执行人">-</el-descriptions-item>
<el-descriptions-item label="是否有效">-</el-descriptions-item>
<el-descriptions-item label="业务条线">-</el-descriptions-item>
<el-descriptions-item label="商机阶段概率">-</el-descriptions-item>
<el-descriptions-item label="最近评估时间">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="金额">-</el-descriptions-item>
<el-descriptions-item label="商机名称">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="预期收益">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="下一步">-</el-descriptions-item>
<el-descriptions-item label="预计成交日期">-</el-descriptions-item>
<el-descriptions-item label="可能性">-</el-descriptions-item>
<el-descriptions-item label="线索来源">-</el-descriptions-item>
<el-descriptions-item label="丢单原因">-</el-descriptions-item>
<el-descriptions-item label="类型">-</el-descriptions-item>
<el-descriptions-item label="阶段标识">-</el-descriptions-item>
<el-descriptions-item label="最近操作时间">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="Change Log Time">-</el-descriptions-item>
<el-descriptions-item label="线索转换用时">-</el-descriptions-item>
<el-descriptions-item label="销售周期的持续时间">-</el-descriptions-item>
<el-descriptions-item label="总销售时间">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="客户ID">-</el-descriptions-item>
<el-descriptions-item label="联系人标识">-</el-descriptions-item>
<el-descriptions-item label="联系人名称">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/deal?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=消息通知`">
  消息通知
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal?id=导入模式`">
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