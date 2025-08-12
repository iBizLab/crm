# 工作进展(work_progress)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|操作类型|ACTIONTYPE|[文本，可指定长度](index/dictionary_index#work_progress_cztype "工作进行操作类型")|100|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|关联目标标识|TARGET_ID|文本，可指定长度|100|是||
|关联目标名称|TARGET_NAME|文本，可指定长度|100|是||
|关联目标类型|TARGET_TYPE|[文本，可指定长度](index/dictionary_index#work_progress_type "工作进展对象类型")|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/work_progress/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/work_progress/query/View)|VIEW|否|否 |否 ||
|[创建者(createman)](module/crm/work_progress/query/createman)|createman|否|否 |否 ||
|[根据日期天查询工作进展(findWorkProgressByDate)](module/crm/work_progress/query/findWorkProgressByDate)|findWorkProgressByDate|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[所有的工作进展(ALL)](module/crm/work_progress/dataset/ALL)|ALL|数据查询|否|||
|[数据集(DEFAULT)](module/crm/work_progress/dataset/Default)|DEFAULT|数据查询|是|||
|[创建者(createman)](module/crm/work_progress/dataset/createman)|createman|数据查询|否|||
|[根据天查询工作进展(findWorkProgressByDate)](module/crm/work_progress/dataset/findWorkProgressByDate)|findWorkProgressByDate|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=work_progress-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `READ`
* `UPDATE`



##### 全部数据-只读 :id=work_progress-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读 :id=work_progress-CREATEMAN_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/work_progress#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CREATE_MAN_EQ|建立人|EQ||
|N_CREATE_MAN_LIKE|建立人|LIKE||
|N_CREATE_TIME_GT|建立时间|GT||
|N_CREATE_TIME_GTANDEQ|建立时间|GTANDEQ||
|N_CREATE_TIME_LTANDEQ|建立时间|LTANDEQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_TARGET_NAME_LIKE|关联目标名称|LIKE||
|N_TARGET_TYPE_EQ|关联目标类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开主数据视图 | openzsjst | 主数据视图 |单项数据|<details><summary>打开视图或向导（模态）</summary></details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[根据业务类型打开对应主数据视图](module/crm/work_progress/uilogic/OpenviewBytype)|OpenviewBytype||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/work_progress?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/work_progress?id=界面逻辑`">
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