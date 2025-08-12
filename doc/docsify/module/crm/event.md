# 会议(event)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|全天|ALL_DAY|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|签到地址|CHECK_IN_ADDRES|长文本，没有长度限制|2000|是||
|签到城市|CHECK_IN_CITY|文本，可指定长度|100|是||
|签到评注|CHECK_IN_COMMENT|长文本，没有长度限制|3000|是||
|签到国家|CHECK_IN_COUNTRY|文本，可指定长度|100|是||
|签到省份|CHECK_IN_STATE|文本，可指定长度|100|是||
|签到状态|CHECK_IN_STATUS|文本，可指定长度|30|是||
|签到地区|CHECK_IN_SUB_LOCALITY|文本，可指定长度|250|是||
|签到时间|CHECK_IN_TIME|日期时间型||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|结束日期时间|END_DATETIME|日期时间型||是||
|标题|EVENT_TITLE|文本，可指定长度|255|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|纬度|LATITUDE|数值||是||
|经度|LONGITUDE|数值||是||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|参与者|PARTICIPANTS|大整型|20|是||
|起始日期时间|START_DATETIME|日期时间型||是||
|标签|TAG|文本，可指定长度|2000|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|地点|VENUE|文本，可指定长度|255|是||
|邮政编码|ZIP_CODE|文本，可指定长度|30|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_EVENT](der/DERCUSTOM_ATTACHMENT_EVENT)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_EVENT](der/DERCUSTOM_CUSTOM_BUTTON_EVENT)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_EVENT](der/DERCUSTOM_NOTE_ATTACH_EVENT)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERINDEX_EVENT_SCHEDULE](der/DERINDEX_EVENT_SCHEDULE)|[日程(SCHEDULE)](module/crm/schedule)|索引关系||

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
|[数据查询(DEFAULT)](module/crm/event/query/Default)|DEFAULT|是|否 |否 ||
|[关闭的(close)](module/crm/event/query/close)|close|否|否 |否 ||
|[创建者(createman)](module/crm/event/query/createman)|createman|否|否 |否 ||
|[已邀请的(invited)](module/crm/event/query/invited)|invited|否|否 |否 ||
|[未关闭的(not_close)](module/crm/event/query/not_close)|not_close|否|否 |否 ||
|[所有者(owner)](module/crm/event/query/owner)|owner|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/event/dataset/Default)|DEFAULT|数据查询|是|||
|[关闭的(close)](module/crm/event/dataset/close)|close|数据查询|否|||
|[创建者(createman)](module/crm/event/dataset/createman)|createman|数据查询|否|||
|[已邀请的(invited)](module/crm/event/dataset/invited)|invited|数据查询|否|||
|[未关闭的(not_close)](module/crm/event/dataset/not_close)|not_close|数据查询|否|||
|[所有者(owner)](module/crm/event/dataset/owner)|owner|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=event-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `CREATE`
* `UPDATE`
* `DELETE`



##### 全部数据-只读 :id=event-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=event-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/event#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`



##### 所有者-读写 :id=event-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/event#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `READ`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_OWNER_ID_EQ|所属数据标识|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| （通用）创建会议 | create | 会议 |无数据|<details><summary>打开视图或向导（模态）</summary>[会议](app/view/event_simple_edit_view)</details>||

## 导入模式

* **导入会议**


<el-descriptions direction="vertical" :column="30" :size="size" border>
<el-descriptions-item label="所属数据标识">-</el-descriptions-item>
<el-descriptions-item label="所属数据对象">-</el-descriptions-item>
<el-descriptions-item label="所属对象子类型">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="参与者">-</el-descriptions-item>
<el-descriptions-item label="结束日期时间">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="起始日期时间">-</el-descriptions-item>
<el-descriptions-item label="全天">-</el-descriptions-item>
<el-descriptions-item label="标题">-</el-descriptions-item>
<el-descriptions-item label="地点">-</el-descriptions-item>
<el-descriptions-item label="签到时间">-</el-descriptions-item>
<el-descriptions-item label="纬度">-</el-descriptions-item>
<el-descriptions-item label="签到城市">-</el-descriptions-item>
<el-descriptions-item label="签到评注">-</el-descriptions-item>
<el-descriptions-item label="邮政编码">-</el-descriptions-item>
<el-descriptions-item label="签到国家">-</el-descriptions-item>
<el-descriptions-item label="签到地区">-</el-descriptions-item>
<el-descriptions-item label="经度">-</el-descriptions-item>
<el-descriptions-item label="签到省份">-</el-descriptions-item>
<el-descriptions-item label="签到地址">-</el-descriptions-item>
<el-descriptions-item label="签到状态">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/event?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/event?id=导入模式`">
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