# 日程(schedule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|结束日期时间|END_DATETIME|日期时间型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否关闭|IS_CLOSE|是否逻辑|200|是||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|起始日期时间|START_DATETIME|日期时间型||是||
|状态|STATUS|单项选择(文本值)|60|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#schedulet_ype "日程类型")|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERINDEX_CALL_SCHEDULE](der/DERINDEX_CALL_SCHEDULE)|[通话(CALL)](module/crm/call)|索引关系||
|[DERINDEX_EVENT_SCHEDULE](der/DERINDEX_EVENT_SCHEDULE)|[会议(EVENT)](module/crm/event)|索引关系||
|[DERINDEX_RESERVATION_SCHEDULE](der/DERINDEX_RESERVATION_SCHEDULE)|[预留(RESERVATION)](module/crm/reservation)|索引关系||
|[DERINDEX_TASK_SCHEDULE](der/DERINDEX_TASK_SCHEDULE)|[任务&活动(TASK)](module/crm/task)|索引关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||[（通用）获取并生成最近访问](index/plugin_index#GetAndCreateRecent)||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/schedule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/schedule/query/View)|VIEW|否|否 |否 ||
|[已关闭(close)](module/crm/schedule/query/close)|close|否|否 |否 ||
|[创建者(createman)](module/crm/schedule/query/createman)|createman|否|否 |否 ||
|[未关闭的(not_close)](module/crm/schedule/query/not_close)|not_close|否|否 |否 ||
|[所有者(owner)](module/crm/schedule/query/owner)|owner|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/schedule/dataset/Default)|DEFAULT|数据查询|是|||
|[数据集2(IndexDER)](module/crm/schedule/dataset/IndexDER)|IndexDER|索引实体|否|||
|[全部数据(all)](module/crm/schedule/dataset/all)|all|数据查询|否|||
|[已关闭(close)](module/crm/schedule/dataset/close)|close|数据查询|否|||
|[创建者(createman)](module/crm/schedule/dataset/createman)|createman|数据查询|否|||
|[未关闭的(not_close)](module/crm/schedule/dataset/not_close)|not_close|数据查询|否|||
|[所有者(owner)](module/crm/schedule/dataset/owner)|owner|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=schedule-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `UPDATE`
* `CREATE`



##### 全部数据-只读 :id=schedule-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=schedule-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/schedule#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`



##### 所有者-读写 :id=schedule-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/schedule#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `UPDATE`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_OWNER_ID_EQ|所属数据标识|EQ||
|N_STATUS_EQ|状态|EQ||
|N_TYPE_EQ|类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/schedule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/schedule?id=搜索模式`">
  搜索模式
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