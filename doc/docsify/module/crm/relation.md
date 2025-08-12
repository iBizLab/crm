# 关联(relation)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|关联主体标识|PRINCIPAL_ID|文本，可指定长度|100|否||
|关联主体类型|PRINCIPAL_TYPE|文本，可指定长度|100|否||
|关联目标标识|TARGET_ID|文本，可指定长度|100|否||
|关联目标类型|TARGET_TYPE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||

<p class="panel-title"><b>联合主键</b></p>

  * `关联主体标识(PRINCIPAL_ID)`
  * `关联目标标识(TARGET_ID)`
  * `关联主体类型(PRINCIPAL_TYPE)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_DEAL_RELATION](der/DERCUSTOM_DEAL_RELATION)|[商机(DEAL)](module/crm/deal)|自定义关系||
|[DERCUSTOM_RELATION_LEAD](der/DERCUSTOM_RELATION_LEAD)|[线索(LEAD)](module/crm/lead)|自定义关系||
|[DERCUSTOM_RELATION_USER_ACCOUNT](der/DERCUSTOM_RELATION_USER_ACCOUNT)|[客户(ACCOUNT)](module/crm/account)|自定义关系||
|[DERCUSTOM_TAGET_RELATION_TASK](der/DERCUSTOM_TAGET_RELATION_TASK)|[任务&活动(TASK)](module/crm/task)|自定义关系||
|[DERCUSTOM_TARGET_DEAL_RELATION](der/DERCUSTOM_TARGET_DEAL_RELATION)|[商机(DEAL)](module/crm/deal)|自定义关系||
|[DERCUSTOM_TARGET_PRODUCT_RELATION](der/DERCUSTOM_TARGET_PRODUCT_RELATION)|[产品(PRODUCT)](module/crm/product)|自定义关系||
|[DERCUSTOM_TARGET_RELATION_USER](der/DERCUSTOM_TARGET_RELATION_USER)|[用户(USER)](module/crm/user)|自定义关系||

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
|[数据查询(DEFAULT)](module/crm/relation/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/relation/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/relation/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/relation/dataset/all)|all|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PRINCIPAL_ID_EQ|关联主体标识|EQ||
|N_PRINCIPAL_TYPE_EQ|关联主体类型|EQ||
|N_TARGET_ID_EQ|关联目标标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/relation?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/relation?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/relation?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/relation?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/relation?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/relation?id=搜索模式`">
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