# 执行人(executor)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|关联主体标识|PRINCIPAL_ID|文本，可指定长度|100|是||
|关联主体类型|PRINCIPAL_TYPE|文本，可指定长度|100|是||
|sysuserid|SYSUSERID|外键值附加数据|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|用户标识|USER_ID|外键值|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_EXECUTOR_USER_USER_ID](der/DER1N_EXECUTOR_USER_USER_ID)|[用户(USER)](module/crm/user)|1:N关系||
|[DERCUSTOM_EXECUTOR_DEAL](der/DERCUSTOM_EXECUTOR_DEAL)|[商机(DEAL)](module/crm/deal)|自定义关系||
|[DERCUSTOM_EXECUTOR_LEAD](der/DERCUSTOM_EXECUTOR_LEAD)|[线索(LEAD)](module/crm/lead)|自定义关系||
|[DERCUSTOM_EXECUTOR_PROJECT](der/DERCUSTOM_EXECUTOR_PROJECT)|[订单(PROJECT)](module/crm/project)|自定义关系||

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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/executor/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/executor/query/View)|VIEW|否|否 |否 ||
|[线索跟踪人(lead_notify)](module/crm/executor/query/lead_notify)|lead_notify|否|否 |否 ||
|[订单通知对象(project_notify)](module/crm/executor/query/project_notify)|project_notify|否|否 |否 |订单进展、订单创建\更新执行人|

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/executor/dataset/Default)|DEFAULT|数据查询|是|||
|[线索跟踪人(lead_notify)](module/crm/executor/dataset/lead_notify)|lead_notify|数据查询|否||进展通知对象|
|[订单执行人(project_notify)](module/crm/executor/dataset/project_notify)|project_notify|数据查询|否||进展通知、订单更新、订单新建通知对象|

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PRINCIPAL_ID_EQ|关联主体标识|EQ||
|N_SYSUSERID_EQ|sysuserid|EQ||
|N_USER_ID_EQ|用户标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/executor?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/executor?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/executor?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/executor?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/executor?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/executor?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>