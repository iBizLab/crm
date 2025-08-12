# 阶段历史(deal_history)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|金额|AMOUNT|数值||是||
|预计成交日期|CLOSING_DATE|日期型||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|商机标识|DEAL_ID|外键值|100|是||
|预期收益|EXPECTED_REVENUE|数值||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|最近操作时间|LAST_ACTIVITY_TIME|日期时间型||是||
|移动到|MOVED_TO__S|单项选择(文本值)|60|是||
|名称|NAME|文本，可指定长度|200|是||
|可能性|PROBABILITY|整型||是||
|阶段|STAGE|文本，可指定长度|60|是||
|阶段持续时间(日历天数)|STAGE_DURATION_CALENDAR_DAYS|整型||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DEAL_HISTORY_DEAL_DEAL_ID](der/DER1N_DEAL_HISTORY_DEAL_DEAL_ID)|[商机(DEAL)](module/crm/deal)|1:N关系||

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
|[数据查询(DEFAULT)](module/crm/deal_history/query/Default)|DEFAULT|是|否 |否 ||
|[创建者(createman)](module/crm/deal_history/query/createman)|createman|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[所有的历史阶段(ALL)](module/crm/deal_history/dataset/ALL)|ALL|数据查询|否|||
|[数据集(DEFAULT)](module/crm/deal_history/dataset/Default)|DEFAULT|数据查询|是|||
|[创建者(createman)](module/crm/deal_history/dataset/createman)|createman|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_DEAL_ID_EQ|商机标识|EQ||
|N_ID_EQ|标识|EQ||
|N_MOVED_TO__S_EQ|移动到|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STAGE_EQ|阶段|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/deal_history?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal_history?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal_history?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal_history?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal_history?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/deal_history?id=搜索模式`">
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