# 周报明细(weekly_detail)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|关联主体标识|PRINCIPAL_ID|文本，可指定长度|100|是||
|关联主体类型|PRINCIPAL_TYPE|文本，可指定长度|100|是||
|关联目标标识|TARGET_ID|文本，可指定长度|100|是||
|关联目标类型|TARGET_TYPE|文本，可指定长度|100|是||
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
|[周报关联活动(Activities)](module/crm/weekly_detail/query/Activities)|Activities|否|否 |否 ||
|[数据查询(DEFAULT)](module/crm/weekly_detail/query/Default)|DEFAULT|是|否 |否 ||
|[下周任务计划(TodoTask)](module/crm/weekly_detail/query/TodoTask)|TodoTask|否|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/weekly_detail/query/View)|VIEW|否|否 |否 ||
|[周报关联评估(notes)](module/crm/weekly_detail/query/notes)|notes|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[周报关联活动(Activities)](module/crm/weekly_detail/dataset/Activities)|Activities|数据查询|否|||
|[数据集(DEFAULT)](module/crm/weekly_detail/dataset/Default)|DEFAULT|数据查询|是|||
|[周报关联评估(Notes)](module/crm/weekly_detail/dataset/Notes)|Notes|数据查询|否|||
|[下周任务计划(TodoTask)](module/crm/weekly_detail/dataset/TodoTask)|TodoTask|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/weekly_detail?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weekly_detail?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weekly_detail?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weekly_detail?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/weekly_detail?id=搜索模式`">
  搜索模式
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