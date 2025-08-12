# 附件(attachment)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|文件标识|FILE_ID|文件|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|所属数据标识|OWNER_ID|文本，可指定长度|100|是||
|所属对象子类型|OWNER_SUBTYPE|文本，可指定长度|100|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|标题|TITLE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_ATTACHMENT_ACCOUNT](der/DERCUSTOM_ATTACHMENT_ACCOUNT)|[客户(ACCOUNT)](module/crm/account)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_CALL](der/DERCUSTOM_ATTACHMENT_CALL)|[通话(CALL)](module/crm/call)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_CAMPAIGN](der/DERCUSTOM_ATTACHMENT_CAMPAIGN)|[市场活动(CAMPAIGN)](module/crm/campaign)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_CASE](der/DERCUSTOM_ATTACHMENT_CASE)|[服务支持(CASE)](module/crm/service_case)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_CONTACT](der/DERCUSTOM_ATTACHMENT_CONTACT)|[联系人(CONTACT)](module/crm/contact)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_DEAL](der/DERCUSTOM_ATTACHMENT_DEAL)|[商机(DEAL)](module/crm/deal)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_EVENT](der/DERCUSTOM_ATTACHMENT_EVENT)|[会议(EVENT)](module/crm/event)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_INVOICE](der/DERCUSTOM_ATTACHMENT_INVOICE)|[发货单(INVOICE)](module/crm/invoice)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_ITEM](der/DERCUSTOM_ATTACHMENT_ITEM)|[货品(ITEM)](module/crm/item)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_LEAD](der/DERCUSTOM_ATTACHMENT_LEAD)|[线索(LEAD)](module/crm/lead)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_MANEUVER](der/DERCUSTOM_ATTACHMENT_MANEUVER)|[活动(MANEUVER)](module/crm/maneuver)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PAYEE](der/DERCUSTOM_ATTACHMENT_PAYEE)|[收款记录(PAYEE)](module/crm/payee)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PAYEE_PLAN](der/DERCUSTOM_ATTACHMENT_PAYEE_PLAN)|[收款计划(PAYEE_PLAN)](module/crm/payee_plan)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PRICE_BOOK](der/DERCUSTOM_ATTACHMENT_PRICE_BOOK)|[价格表(PRICE_BOOK)](module/crm/price_book)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PRODUCT](der/DERCUSTOM_ATTACHMENT_PRODUCT)|[产品(PRODUCT)](module/crm/product)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PRODUCT_CERTIFICATE](der/DERCUSTOM_ATTACHMENT_PRODUCT_CERTIFICATE)|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|自定义关系||
|[DERCUSTOM_ATTACHMENT_PROJECT](der/DERCUSTOM_ATTACHMENT_PROJECT)|[订单(PROJECT)](module/crm/project)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_PURCHASE_ORDER](der/DERCUSTOM_ATTACHMENT_PURCHASE_ORDER)|[采购订单(PURCHASE_ORDER)](module/crm/purchase_order)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_QUOTE](der/DERCUSTOM_ATTACHMENT_QUOTE)|[报价(QUOTE)](module/crm/quote)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_SALES_ORDER](der/DERCUSTOM_ATTACHMENT_SALES_ORDER)|[销售订单(SALES_ORDER)](module/crm/sales_order)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_SOLUTION](der/DERCUSTOM_ATTACHMENT_SOLUTION)|[解决方案(SOLUTION)](module/crm/solution)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_TASK](der/DERCUSTOM_ATTACHMENT_TASK)|[任务&活动(TASK)](module/crm/task)|自定义关系|自动生成|
|[DERCUSTOM_ATTACHMENT_VENDOR](der/DERCUSTOM_ATTACHMENT_VENDOR)|[供应商(VENDOR)](module/crm/vendor)|自定义关系|自动生成|

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
|[数据查询(DEFAULT)](module/crm/attachment/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/attachment/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/attachment/dataset/all)|all|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_ID_EQ|所属数据标识|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 附件下载 | download | 下载 |单项数据|用户自定义||
| 附件删除 | delete | 删除 |单项数据（主键）|用户自定义||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[计算附件是否隐藏逻辑](module/crm/attachment/uilogic/calc_attachment_hidden)|calc_attachment_hidden||
|[附件_删除](module/crm/attachment/uilogic/remove_attachment_sc)|remove_attachment_sc|自动判断为表格或表单附件，按类别删除|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/attachment?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/attachment?id=界面逻辑`">
  界面逻辑
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