# 任务&活动(task)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|关闭时间|CLOSED_TIME|日期时间型||是||
|费用|COST|数值||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|到期日期|DUE_DATE|日期型||是||
|到期时间|DUE_DATE_SORT|整型||是||
|结束时间|END_TIME|日期时间型||是||
|执行人|EXECUTORS|一对多关系数据集合|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否上周活动|IS_LAST_WEEK|文本，可指定长度|200|是||
|是否上周新建|IS_NEW_LAST_WEEK|文本，可指定长度|200|是||
|是否本周新建|IS_NEW_THIS_WEEK|文本，可指定长度|200|是||
|是否本月活动|IS_THIS_MONTH|文本，可指定长度|200|是||
|是否本周活动|IS_THIS_WEEK|文本，可指定长度|200|是||
|最近评估时间|LAST_ASSESS_TIME|日期时间型||是||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属数据名称|OWNER_NAME|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|优先级|PRIORITY|[单项选择(文本值)](index/dictionary_index#priority "优先级")|60|是||
|关联数据|RELATIONS|一对多关系数据集合|1048576|是||
|提醒时间|REMIND_AT|日期时间型||是||
|发送通知邮件|SEND_NOTIFICATION_EMAIL|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|开始时间|START_TIME|日期型||是||
|开始时间|START_TIME_SORT|整型||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#task_status "任务状态")|60|是||
|主题|SUBJECT|文本，可指定长度|255|是||
|标签|TAG|文本，可指定长度|2000|是||
|任务&活动日期|TASK_DATE|日期型||是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#activityType "任务活动类型")|60|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="任务属性组" name="field_group_task_field">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_TASK_EXECUTOR_TASK_TASK_ID](der/DER1N_TASK_EXECUTOR_TASK_TASK_ID)|[任务执行人(TASK_EXECUTOR)](module/crm/task_executor)|1:N关系||
|[DERCUSTOM_ATTACHMENT_TASK](der/DERCUSTOM_ATTACHMENT_TASK)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_TASK](der/DERCUSTOM_CUSTOM_BUTTON_TASK)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_TASK](der/DERCUSTOM_NOTE_ATTACH_TASK)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_TAGET_RELATION_TASK](der/DERCUSTOM_TAGET_RELATION_TASK)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_TASK_WEEKLIES](der/DERCUSTOM_TASK_WEEKLIES)|[周报(WEEKLIES)](module/crm/weeklies)|自定义关系||
|[DERINDEX_TASK_SCHEDULE](der/DERINDEX_TASK_SCHEDULE)|[日程(SCHEDULE)](module/crm/schedule)|索引关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|异步新建活动时添加到工作进展|Async_maneuverToWorkProgress|[实体处理逻辑](module/crm/task/logic/maneuverToWorkProgress "新建活动时添加到工作进展")|默认|不支持||||
|CheckKey|CheckKey|内置方法|默认|不支持||||
|关闭任务/活动|closed_task|[实体处理逻辑](module/crm/task/logic/closed_taskormaneuver "关闭任务")|默认|不支持|||将任务/活动状态设为已完成，添加关闭时间|
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#task_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#task_GetDraft)|||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#task_Update)|||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|取消关联|cancel_relation|[实体处理逻辑](module/crm/task/logic/cancel_relation "取消关联")|默认|不支持||||
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|商机取消关联任务和活动|deal_cancel_relation|[实体处理逻辑](module/crm/task/logic/deal_cancel_relation "取消关联(商机)")|默认|不支持||||
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|无操作|ingore|[实体处理逻辑](module/crm/task/logic/ignore "ignore")|默认|不支持||||
|线索取消关联任务和活动|lead_cancel_relation|[实体处理逻辑](module/crm/task/logic/lead_cancel_relation "取消关联(线索)")|默认|不支持||||
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|新建活动时添加到工作进展|maneuverToWorkProgress|[实体处理逻辑](module/crm/task/logic/maneuverToWorkProgress "新建活动时添加到工作进展")|默认|不支持||||
|关联任务和活动|relate_task_and_maneuver|[实体处理逻辑](module/crm/task/logic/relate_task_and_maneuver "关联任务和活动")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[ignore](module/crm/task/logic/ignore)|ignore|无|||
|[关联任务和活动](module/crm/task/logic/relate_task_and_maneuver)|relate_task_and_maneuver|无|||
|[关闭任务](module/crm/task/logic/closed_taskormaneuver)|closed_taskormaneuver|无|||
|[取消关联](module/crm/task/logic/cancel_relation)|cancel_relation|无|||
|[取消关联(商机)](module/crm/task/logic/deal_cancel_relation)|deal_cancel_relation|无|||
|[取消关联(线索)](module/crm/task/logic/lead_cancel_relation)|lead_cancel_relation|无|||
|[异步添加活动到工作进展](module/crm/task/logic/asyncManeuverToWorkProgres)|asyncManeuverToWorkProgres|无|||
|[新建、更新任务后推送](module/crm/task/logic/notify)|notify|无|||
|[新建任务前加载执行人](module/crm/task/logic/defaultExecutor)|defaultExecutor|无|||
|[新建活动时添加到工作进展](module/crm/task/logic/maneuverToWorkProgress)|maneuverToWorkProgress|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/task/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/task/query/View)|VIEW|否|否 |否 ||
|[所有活动(all_maneuver)](module/crm/task/query/all_maneuver)|all_maneuver|否|否 |否 ||
|[所有任务(all_task)](module/crm/task/query/all_task)|all_task|否|否 |否 ||
|[关闭的(close)](module/crm/task/query/close)|close|否|否 |否 ||
|[关闭的活动(close_maneuver)](module/crm/task/query/close_maneuver)|close_maneuver|否|否 |否 ||
|[关闭的任务(close_task)](module/crm/task/query/close_task)|close_task|否|否 |否 ||
|[关闭的任务（关联）(close_task_related)](module/crm/task/query/close_task_related)|close_task_related|否|否 |否 ||
|[创建者(createman)](module/crm/task/query/createman)|createman|否|否 |否 ||
|[未关联的任务和活动(商机)(deal_not_related_task_and_maneuver)](module/crm/task/query/deal_not_related_task_and_maneuver)|deal_not_related_task_and_maneuver|否|否 |否 ||
|[执行人(executor)](module/crm/task/query/executor)|executor|否|否 |否 ||
|[未关联的任务和活动(线索)(lead_not_related_task_and_maneuver)](module/crm/task/query/lead_not_related_task_and_maneuver)|lead_not_related_task_and_maneuver|否|否 |否 ||
|[活动_关联(maneuver_related)](module/crm/task/query/maneuver_related)|maneuver_related|否|否 |否 ||
|[我的所有任务(my_all_task)](module/crm/task/query/my_all_task)|my_all_task|否|否 |否 ||
|[我已取消的任务(my_canceled_task)](module/crm/task/query/my_canceled_task)|my_canceled_task|否|否 |否 ||
|[我完成的任务(my_done_task)](module/crm/task/query/my_done_task)|my_done_task|否|否 |否 ||
|[我的活动(my_maneuver)](module/crm/task/query/my_maneuver)|my_maneuver|否|否 |否 ||
|[我的待办任务(my_todo_task)](module/crm/task/query/my_todo_task)|my_todo_task|否|否 |否 ||
|[未关闭的(not_close)](module/crm/task/query/not_close)|not_close|否|否 |否 ||
|[未关闭的任务(not_close_task)](module/crm/task/query/not_close_task)|not_close_task|否|否 |否 ||
|[未关闭的任务（关联）(not_close_task_related)](module/crm/task/query/not_close_task_related)|not_close_task_related|否|否 |否 ||
|[未关联的任务和活动(not_related_task_and_maneuver)](module/crm/task/query/not_related_task_and_maneuver)|not_related_task_and_maneuver|否|否 |否 ||
|[所有者(owner)](module/crm/task/query/owner)|owner|否|否 |否 ||
|[任务关联已完成任务(relate_complete_task)](module/crm/task/query/relate_complete_task)|relate_complete_task|否|否 |否 |已完成的任务&历史活动|
|[周报活动(weeklyActivities)](module/crm/task/query/weeklyActivities)|weeklyActivities|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/task/dataset/Default)|DEFAULT|数据查询|是|||
|[所有活动(all_maneuver)](module/crm/task/dataset/all_maneuver)|all_maneuver|数据查询|否|||
|[所有任务(all_task)](module/crm/task/dataset/all_task)|all_task|数据查询|否|||
|[关闭的(close)](module/crm/task/dataset/close)|close|数据查询|否|||
|[关闭的活动(close_maneuver)](module/crm/task/dataset/close_maneuver)|close_maneuver|数据查询|否|||
|[关闭的任务(close_task)](module/crm/task/dataset/close_task)|close_task|数据查询|否|||
|[关闭的任务（关联）(close_task_related)](module/crm/task/dataset/close_task_related)|close_task_related|数据查询|否|||
|[创建者(createman)](module/crm/task/dataset/createman)|createman|数据查询|否|||
|[执行人(executor)](module/crm/task/dataset/executor)|executor|数据查询|否|||
|[活动(关联)(maneuver_related)](module/crm/task/dataset/maneuver_related)|maneuver_related|数据查询|否|||
|[已完成的任务和历史活动(maneuver_task_related)](module/crm/task/dataset/maneuver_task_related)|maneuver_task_related|数据查询|否|||
|[我的所有任务(my_all_task)](module/crm/task/dataset/my_all_task)|my_all_task|数据查询|否|||
|[我已取消的任务(my_canceled_task)](module/crm/task/dataset/my_canceled_task)|my_canceled_task|数据查询|否|||
|[我完成的任务(my_done_task)](module/crm/task/dataset/my_done_task)|my_done_task|数据查询|否|||
|[我的活动(my_maneuver)](module/crm/task/dataset/my_maneuver)|my_maneuver|数据查询|否|||
|[我的待办任务(my_todo_task)](module/crm/task/dataset/my_todo_task)|my_todo_task|数据查询|否|||
|[未关闭的(not_close)](module/crm/task/dataset/not_close)|not_close|数据查询|否|||
|[未关闭的任务(not_close_task)](module/crm/task/dataset/not_close_task)|not_close_task|数据查询|否|||
|[未关闭的任务（关联）(not_close_task_related)](module/crm/task/dataset/not_close_task_related)|not_close_task_related|数据查询|否|||
|[未关联的任务和活动(not_related_task_and_maneuver)](module/crm/task/dataset/not_related_task_and_maneuver)|not_related_task_and_maneuver|数据查询|否|||
|[所有者(owner)](module/crm/task/dataset/owner)|owner|数据查询|否|||
|[周报活动(weeklyActivities)](module/crm/task/dataset/weeklyActivities)|weeklyActivities|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=task-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `UPDATE`
* `CREATE`



##### 全部数据-只读 :id=task-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=task-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/task#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`



##### 执行人-读写 :id=task-EXECUTOR_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[执行人(executor)](module/crm/task#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



##### 所有者-读写 :id=task-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/task#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



## 消息通知

|    中文名col200   | 代码名col150       |  消息队列col200   |  消息模板col200 |  通知目标col150     |  备注col350  |
|------------| -----   |  -------- | -------- |-------- |-------- |
|[活动新建、更新通知](module/crm/task/notify/maneuverChangeNotify)|maneuverChangeNotify|[默认消息队列](index/notify_index)|[活动新建、更新通知模板](index/notify_index#maneuver_change)|销售领导 ||
|[任务新建、更新通知](module/crm/task/notify/taskChangeNotify)|taskChangeNotify|[默认消息队列](index/notify_index)|[任务新建、更新通知模板](index/notify_index#task_change)|销售领导 执行人 ||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_DUE_DATE_GTANDEQ|到期日期|GTANDEQ||
|N_DUE_DATE_IN|到期日期|IN||
|N_DUE_DATE_LTANDEQ|到期日期|LTANDEQ||
|N_ID_EQ|标识|EQ||
|N_IS_THIS_WEEK_EQ|是否本周活动|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_OWNER_ID_EQ|所属数据标识|EQ||
|N_OWNER_TYPE_EQ|所属数据对象|EQ||
|N_PRIORITY_EQ|优先级|EQ||
|N_START_TIME_GTANDEQ|开始时间|GTANDEQ||
|N_START_TIME_IN|开始时间|IN||
|N_START_TIME_LTANDEQ|开始时间|LTANDEQ||
|N_STATUS_EQ|状态|EQ||
|N_SUBJECT_LIKE|主题|LIKE||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 任务编辑（工作任务） | work_task_open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[工作](app/view/task_work_task_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 取消关联（线索） | lead_cancel_relation | 取消关联 |单项数据|<details><summary>后台调用</summary>[lead_cancel_relation](#行为)||
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 创建任务 | create_new_task | 任务 |无数据|<details><summary>打开视图或向导（模态）</summary>[任务](app/view/task_task_edit_view)</details>||
| 周报导出 | toolbar_report_view_toolbar_deuiaction1_click | 周报导出 |无数据|自定义代码||
| 取消关联 | cancel_relation | 取消关联 |单项数据|<details><summary>后台调用</summary>[cancel_relation](#行为)||
| 关闭任务 | closed_task | 关闭任务 |单项数据|<details><summary>后台调用</summary>[closed_task](#行为)||
| 活动设为任务 | change_task | 活动设为任务 |单项数据（主键）|<details><summary>后台调用</summary>[Update](#行为)||
| 打开关联活动任务视图 | open_relation_view | 添加 |无数据|<details><summary>后台调用</summary>[relate_task_and_maneuver](#行为)||
| （通用）创建任务 | create | 任务 |无数据|<details><summary>打开视图或向导（模态）</summary>[任务](app/view/task_simple_edit_view)</details>||
| 创建活动 | create_new_maneuver | 活动 |无数据|<details><summary>打开视图或向导（模态）</summary>[活动](app/view/task_the_maneuver_edit_view)</details>||
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 打开任务主数据视图(工作任务) | work_task_openTaskZsjView | 任务 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[工作信息](app/view/task_work_task_main_view)</details>||
| 新建并打开任务主数据视图 | saveAndOpenTask | 新建并打开任务主数据视图 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 任务设为活动 | change_maneuver | 任务设为活动 |单项数据（主键）|<details><summary>后台调用</summary>[Update](#行为)||
| 任务编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[任务&活动](app/view/task_edit_view)</details>|自动生成|
| 编辑活动 | maneuver_open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[活动](app/view/task_the_maneuver_edit_view)</details>|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 周报导出 | toolbar_weekly_custom_view_toolbar_deuiaction1_click | 周报导出 |无数据|自定义代码||
| 打开活动主数据视图 | openManeuverZsjView | 活动 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[活动信息](app/view/task_maneuver_main_view)</details>||
| 新建并打开活动主数据视图 | saveAndOpenManeuver | 新建并打开活动主数据视图 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 导入数据 | ImportData | 导入任务 |无数据|<details><summary>打开数据导入视图</summary>[导入任务]()</details>|自动生成|
| 取消关联（商机） | deal_cancel_relation | 取消关联 |单项数据|<details><summary>后台调用</summary>[deal_cancel_relation](#行为)||
| 新建并打开任务主数据视图（工作） | work_task_saveAndOpenTask | 新建并打开任务主数据视图 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 打开任务主数据视图 | openTaskZsjView | 任务 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[任务信息](app/view/task_main_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/task/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入任务**


<el-descriptions direction="vertical" :column="37" :size="size" border>
<el-descriptions-item label="所属数据标识">-</el-descriptions-item>
<el-descriptions-item label="所属数据名称">-</el-descriptions-item>
<el-descriptions-item label="所属数据对象">-</el-descriptions-item>
<el-descriptions-item label="所属对象子类型">-</el-descriptions-item>
<el-descriptions-item label="类型">-</el-descriptions-item>
<el-descriptions-item label="费用">-</el-descriptions-item>
<el-descriptions-item label="开始时间">-</el-descriptions-item>
<el-descriptions-item label="结束时间">-</el-descriptions-item>
<el-descriptions-item label="任务&活动日期">-</el-descriptions-item>
<el-descriptions-item label="是否上周新建">-</el-descriptions-item>
<el-descriptions-item label="是否本周新建">-</el-descriptions-item>
<el-descriptions-item label="是否本周活动">-</el-descriptions-item>
<el-descriptions-item label="是否上周活动">-</el-descriptions-item>
<el-descriptions-item label="是否本月活动">-</el-descriptions-item>
<el-descriptions-item label="最近评估时间">-</el-descriptions-item>
<el-descriptions-item label="关联数据">-</el-descriptions-item>
<el-descriptions-item label="执行人">-</el-descriptions-item>
<el-descriptions-item label="到期时间">-</el-descriptions-item>
<el-descriptions-item label="开始时间">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="提醒时间">-</el-descriptions-item>
<el-descriptions-item label="主题">-</el-descriptions-item>
<el-descriptions-item label="优先级">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="状态">-</el-descriptions-item>
<el-descriptions-item label="到期日期">-</el-descriptions-item>
<el-descriptions-item label="发送通知邮件">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="关闭时间">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/task?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=消息通知`">
  消息通知
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/task?id=导入模式`">
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
show_field_group:'field_group_task_field',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>