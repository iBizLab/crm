# 链接(custom_button)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|URL|URL|长文本，长度1000|2000|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_CUSTOM_BUTTON_ACCOUNT](der/DERCUSTOM_CUSTOM_BUTTON_ACCOUNT)|[客户(ACCOUNT)](module/crm/account)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CALL](der/DERCUSTOM_CUSTOM_BUTTON_CALL)|[通话(CALL)](module/crm/call)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CAMPAIGN](der/DERCUSTOM_CUSTOM_BUTTON_CAMPAIGN)|[市场活动(CAMPAIGN)](module/crm/campaign)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CASE](der/DERCUSTOM_CUSTOM_BUTTON_CASE)|[服务支持(CASE)](module/crm/service_case)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CONTACT](der/DERCUSTOM_CUSTOM_BUTTON_CONTACT)|[联系人(CONTACT)](module/crm/contact)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_DEAL](der/DERCUSTOM_CUSTOM_BUTTON_DEAL)|[商机(DEAL)](module/crm/deal)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_EVENT](der/DERCUSTOM_CUSTOM_BUTTON_EVENT)|[会议(EVENT)](module/crm/event)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_INVOICE](der/DERCUSTOM_CUSTOM_BUTTON_INVOICE)|[发货单(INVOICE)](module/crm/invoice)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_ITEM](der/DERCUSTOM_CUSTOM_BUTTON_ITEM)|[货品(ITEM)](module/crm/item)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_LEAD](der/DERCUSTOM_CUSTOM_BUTTON_LEAD)|[线索(LEAD)](module/crm/lead)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_MANEUVER](der/DERCUSTOM_CUSTOM_BUTTON_MANEUVER)|[活动(MANEUVER)](module/crm/maneuver)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PAYEE](der/DERCUSTOM_CUSTOM_BUTTON_PAYEE)|[收款记录(PAYEE)](module/crm/payee)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PAYEE_PLAN](der/DERCUSTOM_CUSTOM_BUTTON_PAYEE_PLAN)|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PRICE_BOOK](der/DERCUSTOM_CUSTOM_BUTTON_PRICE_BOOK)|[价格表(PRICE_BOOK)](module/crm/price_book)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PRODUCT](der/DERCUSTOM_CUSTOM_BUTTON_PRODUCT)|[产品(PRODUCT)](module/crm/product)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PRODUCT_CERTIFICATE](der/DERCUSTOM_CUSTOM_BUTTON_PRODUCT_CERTIFICATE)|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PROJECT](der/DERCUSTOM_CUSTOM_BUTTON_PROJECT)|[订单(PROJECT)](module/crm/project)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PURCHASE_ORDER](der/DERCUSTOM_CUSTOM_BUTTON_PURCHASE_ORDER)|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_QUOTE](der/DERCUSTOM_CUSTOM_BUTTON_QUOTE)|[报价(QUOTE)](module/crm/quote)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_SALES_ORDER](der/DERCUSTOM_CUSTOM_BUTTON_SALES_ORDER)|[销售订单(SALES_ORDER)](module/crm/sales_order)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_SOLUTION](der/DERCUSTOM_CUSTOM_BUTTON_SOLUTION)|[解决方案(SOLUTION)](module/crm/solution)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_TASK](der/DERCUSTOM_CUSTOM_BUTTON_TASK)|[任务&活动(TASK)](module/crm/task)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_VENDOR](der/DERCUSTOM_CUSTOM_BUTTON_VENDOR)|[供应商(VENDOR)](module/crm/vendor)|自定义关系|自动生成|

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
|[数据查询(DEFAULT)](module/crm/custom_button/query/Default)|DEFAULT|是|否 |否 ||
|[创建者(createman)](module/crm/custom_button/query/createman)|createman|否|否 |否 ||
|[所有者(owner)](module/crm/custom_button/query/owner)|owner|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/custom_button/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/custom_button/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/custom_button/dataset/createman)|createman|数据查询|否|||
|[所有者(owner)](module/crm/custom_button/dataset/owner)|owner|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=custom_button-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `DELETE`
* `READ`



##### 全部数据-只读 :id=custom_button-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=custom_button-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/custom_button#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `DELETE`
* `CREATE`



##### 所有者-读写 :id=custom_button-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/custom_button#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `READ`
* `CREATE`




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
| 创建链接 | create | 创建链接 |无数据|<details><summary>打开视图或向导（模态）</summary>[创建链接](app/view/custom_button_option_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/custom_button?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/custom_button?id=界面行为`">
  界面行为
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