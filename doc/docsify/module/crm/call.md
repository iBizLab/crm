# 通话(call)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|呼叫者ID|CALLER_ID|单项选择(文本值)|30|是||
|通话议程|CALL_AGENDA|文本，可指定长度|255|是||
|通话持续时间|CALL_DURATION|单项选择(文本值)|50|是||
|通话持续时间(秒)|CALL_DURATION_IN_SECONDS|整型||是||
|通话目的|CALL_PURPOSE|单项选择(文本值)|60|是||
|通话结果|CALL_RESULT|单项选择(文本值)|60|是||
|通话开始时间|CALL_START_TIME|日期时间型||是||
|通话类型|CALL_TYPE|单项选择(文本值)|60|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|CTI条目|CTI_ENTRY|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|拨打的号码|DIALLED_NUMBER|单项选择(文本值)|30|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|去电通话状态|OUTGOING_CALL_STATUS|[单项选择(文本值)](index/dictionary_index#outgoing_call_status "去电通话状态")|60|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|提醒|REMINDER|单项选择(文本值)|60|是||
|在CRM中已预定|SCHEDULED_IN_CRM|单项选择(文本值)|60|是||
|主题|SUBJECT|单项选择(文本值)|255|是||
|标签|TAG|文本，可指定长度|2000|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|语音录音|VOICE_RECORDING__S|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_CALL](der/DERCUSTOM_ATTACHMENT_CALL)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CALL](der/DERCUSTOM_CUSTOM_BUTTON_CALL)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CALL](der/DERCUSTOM_NOTE_ATTACH_CALL)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERINDEX_CALL_SCHEDULE](der/DERINDEX_CALL_SCHEDULE)|[日程(SCHEDULE)](module/crm/schedule)|索引关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/call/query/Default)|DEFAULT|是|否 |否 ||
|[关闭的(close)](module/crm/call/query/close)|close|否|否 |否 ||
|[未关闭的(not_close)](module/crm/call/query/not_close)|not_close|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/call/dataset/Default)|DEFAULT|数据查询|是|||
|[关闭的(close)](module/crm/call/dataset/close)|close|数据查询|否|||
|[未关闭的(not_close)](module/crm/call/dataset/not_close)|not_close|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CALLER_ID_EQ|呼叫者ID|EQ||
|N_CALL_DURATION_EQ|通话持续时间|EQ||
|N_CALL_PURPOSE_EQ|通话目的|EQ||
|N_CALL_RESULT_EQ|通话结果|EQ||
|N_CALL_TYPE_EQ|通话类型|EQ||
|N_DIALLED_NUMBER_EQ|拨打的号码|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OUTGOING_CALL_STATUS_EQ|去电通话状态|EQ||
|N_OWNER_ID_EQ|所属数据标识|EQ||
|N_REMINDER_EQ|提醒|EQ||
|N_SCHEDULED_IN_CRM_EQ|在CRM中已预定|EQ||
|N_SUBJECT_EQ|主题|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| （通用）预约通话 | book | 预约通话 |无数据|<details><summary>打开视图或向导（模态）</summary>[通话](app/view/call_simple_edit_view)</details>||
| （通用）记录通话 | record | 记录通话 |无数据|<details><summary>打开视图或向导（模态）</summary>[通话](app/view/call_simple_edit_view)</details>||

## 导入模式

* **导入通话**


<el-descriptions direction="vertical" :column="27" :size="size" border>
<el-descriptions-item label="所属数据标识">-</el-descriptions-item>
<el-descriptions-item label="所属数据对象">-</el-descriptions-item>
<el-descriptions-item label="所属对象子类型">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="通话类型">-</el-descriptions-item>
<el-descriptions-item label="去电通话状态">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="通话结果">-</el-descriptions-item>
<el-descriptions-item label="通话议程">-</el-descriptions-item>
<el-descriptions-item label="通话开始时间">-</el-descriptions-item>
<el-descriptions-item label="通话目的">-</el-descriptions-item>
<el-descriptions-item label="呼叫者ID">-</el-descriptions-item>
<el-descriptions-item label="语音录音">-</el-descriptions-item>
<el-descriptions-item label="主题">-</el-descriptions-item>
<el-descriptions-item label="通话持续时间">-</el-descriptions-item>
<el-descriptions-item label="拨打的号码">-</el-descriptions-item>
<el-descriptions-item label="提醒">-</el-descriptions-item>
<el-descriptions-item label="通话持续时间(秒)">-</el-descriptions-item>
<el-descriptions-item label="在CRM中已预定">-</el-descriptions-item>
<el-descriptions-item label="CTI条目">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/call?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/call?id=导入模式`">
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