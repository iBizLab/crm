# 发货单(invoice)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|调整|ADJUSTMENT|文本，可指定长度|100|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|开单地址-城市|BILLING_CITY|文本，可指定长度|100|是||
|开单地址-邮编|BILLING_CODE|文本，可指定长度|30|是||
|开单地址-国家/地区|BILLING_COUNTRY|文本，可指定长度|100|是||
|开单地址-省/市|BILLING_STATE|文本，可指定长度|100|是||
|开单地址-街道|BILLING_STREET|文本，可指定长度|250|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|折扣|DISCOUNT|文本，可指定长度|100|是||
|到期日期|DUE_DATE|日期型|100|是||
|消费税|EXCISE_DUTY|文本，可指定长度|100|是||
|累计|GRAND_TOTAL|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|发货单日期|INVOICE_DATE|日期型|100|是||
|发货单编号|INVOICE_NUMBER|文本，可指定长度|100|是||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|名称|NAME|文本，可指定长度|200|是||
|采购订单|PURCHASE_ORDER|文本，可指定长度|120|是||
|销售佣金|SALES_COMMISSIO|文本，可指定长度|100|是||
|发货地址-城市|SHIPPING_CITY|文本，可指定长度|100|是||
|发货地址-邮编|SHIPPING_CODE|文本，可指定长度|30|是||
|发货地址-国家/地区|SHIPPING_COUNTRY|文本，可指定长度|100|是||
|发货地址-省/市|SHIPPING_STATE|文本，可指定长度|100|是||
|发货地址-街道|SHIPPING_STREET|文本，可指定长度|250|是||
|状态|STATUS|单项选择(文本值)|60|是||
|主题|SUBJECT|文本，可指定长度|120|是||
|小计|SUB_TOTAL|文本，可指定长度|100|是||
|标签|TAG|文本，可指定长度|2000|是||
|税|TAX|文本，可指定长度|100|是||
|条款及条件|TERMS_AND_CONDITIONS|长文本，没有长度限制|32000|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_INVOICE](der/DERCUSTOM_ATTACHMENT_INVOICE)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_INVOICE](der/DERCUSTOM_CUSTOM_BUTTON_INVOICE)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_INVOICE](der/DERCUSTOM_NOTE_ATTACH_INVOICE)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


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
|[数据查询(DEFAULT)](module/crm/invoice/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/invoice/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATUS_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[发货单](app/view/invoice_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 导入数据 | ImportData | 导入发货单 |无数据|<details><summary>打开数据导入视图</summary>[导入发货单]()</details>|自动生成|
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/invoice/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入发货单**


<el-descriptions direction="vertical" :column="34" :size="size" border>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="开单地址-街道">-</el-descriptions-item>
<el-descriptions-item label="小计">-</el-descriptions-item>
<el-descriptions-item label="发货地址-城市">-</el-descriptions-item>
<el-descriptions-item label="发货地址-街道">-</el-descriptions-item>
<el-descriptions-item label="开单地址-城市">-</el-descriptions-item>
<el-descriptions-item label="发货单编号">-</el-descriptions-item>
<el-descriptions-item label="折扣">-</el-descriptions-item>
<el-descriptions-item label="主题">-</el-descriptions-item>
<el-descriptions-item label="开单地址-省/市">-</el-descriptions-item>
<el-descriptions-item label="发货地址-省/市">-</el-descriptions-item>
<el-descriptions-item label="累计">-</el-descriptions-item>
<el-descriptions-item label="发货单日期">-</el-descriptions-item>
<el-descriptions-item label="调整">-</el-descriptions-item>
<el-descriptions-item label="采购订单">-</el-descriptions-item>
<el-descriptions-item label="到期日期">-</el-descriptions-item>
<el-descriptions-item label="开单地址-邮编">-</el-descriptions-item>
<el-descriptions-item label="税">-</el-descriptions-item>
<el-descriptions-item label="开单地址-国家/地区">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="发货地址-国家/地区">-</el-descriptions-item>
<el-descriptions-item label="消费税">-</el-descriptions-item>
<el-descriptions-item label="发货地址-邮编">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="状态">-</el-descriptions-item>
<el-descriptions-item label="销售佣金">-</el-descriptions-item>
<el-descriptions-item label="条款及条件">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/invoice?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/invoice?id=导入模式`">
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