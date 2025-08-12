# 周报(weeklies)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|活动|ACTIVITIES|一对多动态对象|1048576|是||
|周报文件|ATTACHMENT|文本，可指定长度|1000|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|结束时间|END_DATE|日期型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|链接类型|LINK_TYPE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|否||
|新建数据|NEWS|一对多动态对象（MAP）|1048576|是||
|进展评估|NOTES|一对多关系数据集合|1048576|是||
|销售人员|OWNER|单项选择(文本值)|60|是||
|开始时间|START_DATE|日期型||是||
|开始时间|START_DATE_SORT|整型||是||
|统计期间|STATISTICAL_PERIOD|文本，可指定长度|200|是||
|下周任务计划|TASKS|一对多关系数据集合|1048576|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|本周工作|WORKS|一对多动态对象|1048576|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_NOTE_ATTACH_WEEKLIES](der/DERCUSTOM_NOTE_ATTACH_WEEKLIES)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系||
|[DERCUSTOM_TASK_WEEKLIES](der/DERCUSTOM_TASK_WEEKLIES)|[任务&活动(TASK)](module/crm/task)|自定义关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持|[附加操作](index/action_logic_index#weeklies_Get)|||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#weeklies_GetDraft)|||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|获取链接视图类型|get_link_type|[实体处理逻辑](module/crm/weeklies/logic/get_link_type "获取链接视图类型")|默认|不支持||||
|无操作|nothing|用户自定义|默认|不支持||||
|根据统计时间更新关联信息|updateRelation|[实体处理逻辑](module/crm/weeklies/logic/updateRelation "根据统计时间更新关联信息")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[打开详情页获取关联数据](module/crm/weeklies/logic/openDetail)|openDetail|无||打开详情页获取关联数据|
|[打开详情页获取关联数据2](module/crm/weeklies/logic/openDetail2)|openDetail2|无||临时备份|
|[新建周报时加载关联信息](module/crm/weeklies/logic/relation)|relation|无||新建周报时加载关联信息|
|[根据统计时间更新关联信息](module/crm/weeklies/logic/updateRelation)|updateRelation|无||根据统计时间更新关联信息|
|[获取链接视图类型](module/crm/weeklies/logic/get_link_type)|get_link_type|无||周报编辑页面，链接商机或线索视图时获取类型|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/weeklies/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/weeklies/query/View)|VIEW|否|否 |否 ||
|[创建者(createman)](module/crm/weeklies/query/createman)|createman|否|否 |否 ||
|[周报期间(period)](module/crm/weeklies/query/period)|period|否|否 |是 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[所有的周报(ALL)](module/crm/weeklies/dataset/ALL)|ALL|数据查询|否|||
|[数据集(DEFAULT)](module/crm/weeklies/dataset/Default)|DEFAULT|数据查询|是|||
|[创建者(createman)](module/crm/weeklies/dataset/createman)|createman|数据查询|否|||
|[周报期间(period)](module/crm/weeklies/dataset/period)|period|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=weeklies-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `CREATE`
* `UPDATE`



##### 创建者-读写 :id=weeklies-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/weeklies#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_END_DATE_LTANDEQ|结束时间|LTANDEQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|销售人员|EQ||
|N_START_DATE_GTANDEQ|开始时间|GTANDEQ||
|N_START_DATE_LT|开始时间|LT||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 新建周报 | new | 新建周报 |无数据|<details><summary>打开视图或向导（模态）</summary>[新建周报](app/view/weeklies_quick_create_view)</details>||
| 生成周报附件 | generate_attachment | 生成周报 |单项数据（主键）|用户自定义||
| 新建进展情况 | new_note | 新建进展情况 |无数据|<details><summary>打开视图或向导（模态）</summary>[进展情况](app/view/note_attach_work_edit_view)</details>||
| 新建工作 | new_work | 新建工作 |无数据|<details><summary>打开视图或向导（模态）</summary>[工作](app/view/task_work_report_edit_view)</details>||
| 新建进展评估 | newNote | 新建进展评估 |无数据|<details><summary>打开视图或向导（模态）</summary>[进展评估](app/view/note_attach_weeklies_edit_view)</details>||
| 新建线索 | create_lead | 新建线索 |无数据|<details><summary>打开视图或向导（模态）</summary>[线索](app/view/lead_weeklies_edit_view)</details>||
| 新建商机 | create_plus | 新建商机 |无数据|<details><summary>打开视图或向导（模态）</summary>[商机](app/view/deal_weeklies_edit_view)</details>||
| 周报打印 | Print | 打印 |单项数据|<details><summary>打开打印视图</summary>[PRINT]()</details>||
| 新建任务 | create_tasj | 新建任务 |单项数据|<details><summary>打开视图或向导（模态）</summary>[新建任务](app/view/task_weekly_task_edit_view)</details>||
| 新建下周工作 | new_next_week_work | 新建下周工作 |无数据|<details><summary>打开视图或向导（模态）</summary>[工作](app/view/task_work_report_edit_view)</details>||
| 新建活动 | newManeuver | 新建活动 |无数据|<details><summary>打开视图或向导（模态）</summary>[活动](app/view/task_maneuver_edit_view_for_weekly)</details>||
| 关闭当前视图 | close_cur_view | 关闭当前视图 |单项数据|用户自定义||
| 新建下周任务 | newTask | 新建下周任务 |无数据|<details><summary>打开视图或向导（模态）</summary>[任务](app/view/task_weeklies_edit_view)</details>||
| 打开新建周报编辑视图 | open_create_view | 打开新建周报编辑视图 |单项数据|<details><summary>打开视图或向导（模态）</summary>[周报](app/view/weeklies_edit_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[打开新建周报编辑视图](module/crm/weeklies/uilogic/open_new_edit)|open_new_edit||
|[生成周报附件](module/crm/weeklies/uilogic/generate_attachment)|generate_attachment||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/weeklies?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weeklies?id=界面逻辑`">
  界面逻辑
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