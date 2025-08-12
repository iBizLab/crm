# 产品(product)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|佣金比例|COMMISSION_RATE|文本，可指定长度|100|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|制造商|MANUFACTURER|[单项选择(文本值)](index/dictionary_index#manufacturer "制造商")|60|是||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|产品有效|PRODUCT_ACTIVE|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|产品分类|PRODUCT_CATEGORY|[单项选择(文本值)](index/dictionary_index#product_category "产品分类")|60|是||
|产品编码|PRODUCT_CODE|文本，可指定长度|255|是||
|产品名称|PRODUCT_NAME|文本，可指定长度|255|是||
|需求数量|QTY_IN_DEMAND|数值||是||
|库存数量|QTY_IN_STOCK|数值||是||
|订购数量|QTY_ORDERED|数值||是||
|产品图片|RECORD_IMAGE|文本，可指定长度|100|是||
|库存警戒线|REORDER_LEVEL|数值||是||
|销售结束日期|SALES_END_DATE|日期型||是||
|错售开始日期|SALES_START_DATE|日期型||是||
|支持过期日期|SUPPORT_EXPIRY_DATE|日期型||是||
|支持开始日期|SUPPORT_START_DATE|日期型||是||
|标签|TAG|文本，可指定长度|2000|是||
|税|TAX|[多项选择(文本值)](index/dictionary_index#tax "税")|2000|是||
|应纳税|TAXABLE|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|定价|UNIT_PRICE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|使用单位|USAGE_UNIT|单项选择(文本值)|60|是||
|供应商标识|VENDOR_ID|外键值|100|是||
|供应商名称|VENDOR_NAME|外键值文本|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_PRODUCT_CERTIFICATE_PRODUCT_PRODUCT_ID](der/DER1N_PRODUCT_CERTIFICATE_PRODUCT_PRODUCT_ID)|[产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate)|1:N关系||
|[DERCUSTOM_ATTACHMENT_PRODUCT](der/DERCUSTOM_ATTACHMENT_PRODUCT)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_PRODUCT](der/DERCUSTOM_CUSTOM_BUTTON_PRODUCT)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PRODUCT](der/DERCUSTOM_NOTE_ATTACH_PRODUCT)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_TARGET_PRODUCT_RELATION](der/DERCUSTOM_TARGET_PRODUCT_RELATION)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_PRODUCT_VENDOR_VENDOR_ID](der/DER1N_PRODUCT_VENDOR_VENDOR_ID)|[供应商(VENDOR)](module/crm/vendor)|1:N关系||

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
|添加产品|add_product|[实体处理逻辑](module/crm/product/logic/add_product "添加产品")|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|取消关联|unlink|[实体处理逻辑](module/crm/product/logic/unlink "取消关联")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[取消关联](module/crm/product/logic/unlink)|unlink|无|||
|[添加产品](module/crm/product/logic/add_product)|add_product|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/product/query/Default)|DEFAULT|是|否 |否 ||
|[关联的目标产品(relation_target)](module/crm/product/query/relation_target)|relation_target|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/product/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/product/dataset/all)|all|数据查询|否|||
|[关联的目标产品(relation_target)](module/crm/product/dataset/relation_target)|relation_target|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=product-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `UPDATE`
* `CREATE`



##### 全部数据-只读 :id=product-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_MANUFACTURER_EQ|制造商|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_PRODUCT_ACTIVE_EQ|产品有效|EQ||
|N_PRODUCT_CATEGORY_EQ|产品分类|EQ||
|N_PRODUCT_CODE_LIKE|产品编码|LIKE||
|N_PRODUCT_NAME_LIKE|产品名称|LIKE||
|N_USAGE_UNIT_EQ|使用单位|EQ||
|N_VENDOR_ID_EQ|供应商标识|EQ||
|N_VENDOR_NAME_EQ|供应商名称|EQ||
|N_VENDOR_NAME_LIKE|供应商名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加产品 | add_product | 添加产品 |无数据|<details><summary>后台调用</summary>[add_product](#行为)||
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[产品](app/view/product_product_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 取消关联 | unlink | 取消关联 |多项数据（主键）|<details><summary>后台调用</summary>[unlink](#行为)||
| 打开产品主数据视图 | openProductZsjView | 产品 |单项数据（主键）|<details><summary>打开顶级视图</summary>[产品信息](app/view/product_main_view)</details>||
| 导入数据 | ImportData | 导入产品 |无数据|<details><summary>打开数据导入视图</summary>[导入产品]()</details>|自动生成|
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 保存并打开产品主数据界面 | saveAndOpenProduct | 保存并且打开产品主数据界面 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/product/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入产品**


<el-descriptions direction="vertical" :column="32" :size="size" border>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="订购数量">-</el-descriptions-item>
<el-descriptions-item label="佣金比例">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="库存数量">-</el-descriptions-item>
<el-descriptions-item label="定价">-</el-descriptions-item>
<el-descriptions-item label="产品图片">-</el-descriptions-item>
<el-descriptions-item label="应纳税">-</el-descriptions-item>
<el-descriptions-item label="使用单位">-</el-descriptions-item>
<el-descriptions-item label="销售结束日期">-</el-descriptions-item>
<el-descriptions-item label="税">-</el-descriptions-item>
<el-descriptions-item label="产品分类">-</el-descriptions-item>
<el-descriptions-item label="制造商">-</el-descriptions-item>
<el-descriptions-item label="库存警戒线">-</el-descriptions-item>
<el-descriptions-item label="产品编码">-</el-descriptions-item>
<el-descriptions-item label="错售开始日期">-</el-descriptions-item>
<el-descriptions-item label="需求数量">-</el-descriptions-item>
<el-descriptions-item label="产品有效">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="支持过期日期">-</el-descriptions-item>
<el-descriptions-item label="支持开始日期">-</el-descriptions-item>
<el-descriptions-item label="产品名称">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="供应商标识">-</el-descriptions-item>
<el-descriptions-item label="供应商名称">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/product?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product?id=导入模式`">
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