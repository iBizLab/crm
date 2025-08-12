# 产品证书(product_certificate)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|受证单位|ACCREDITED_ORGANIZATION|文本，可指定长度|100|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|颁证机构|AWARDING_ORGANIZATION|文本，可指定长度|100|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|有效期止|END_DATE|日期型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|签发日期|ISSUE_DATE|日期型||是||
|签发人|ISSUE_MAN|文本，可指定长度|100|是||
|证书名称|NAME|文本，可指定长度|200|是||
|证书编号|PC_NUMBER|文本，可指定长度|100|是||
|产品标识|PRODUCT_ID|外键值|100|是||
|认证范围|SCOPE|文本，可指定长度|200|是||
|产品/服务名称及型号|SERVICE_NAME|文本，可指定长度|200|是||
|有效期起|START_DATE|日期型||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_PRODUCT_CERTIFICATE](der/DERCUSTOM_ATTACHMENT_PRODUCT_CERTIFICATE)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系||
|[DERCUSTOM_CUSTOM_BUTTON_PRODUCT_CERTIFICATE](der/DERCUSTOM_CUSTOM_BUTTON_PRODUCT_CERTIFICATE)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_PRODUCT_CERTIFICATE](der/DERCUSTOM_NOTE_ATTACH_PRODUCT_CERTIFICATE)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_PRODUCT_CERTIFICATE_PRODUCT_PRODUCT_ID](der/DER1N_PRODUCT_CERTIFICATE_PRODUCT_PRODUCT_ID)|[产品(PRODUCT)](module/crm/product)|1:N关系||

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
|[数据查询(DEFAULT)](module/crm/product_certificate/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/product_certificate/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/product_certificate/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据(all)](module/crm/product_certificate/dataset/all)|all|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=product_certificate-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`



##### 全部数据-只读 :id=product_certificate-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|证书名称|LIKE||
|N_PRODUCT_ID_EQ|产品标识|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[产品证书](app/view/product_certificate_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/product_certificate/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入产品证书**


<el-descriptions direction="vertical" :column="18" :size="size" border>
<el-descriptions-item label="证书编号">-</el-descriptions-item>
<el-descriptions-item label="颁证机构">-</el-descriptions-item>
<el-descriptions-item label="受证单位">-</el-descriptions-item>
<el-descriptions-item label="认证范围">-</el-descriptions-item>
<el-descriptions-item label="有效期起">-</el-descriptions-item>
<el-descriptions-item label="有效期止">-</el-descriptions-item>
<el-descriptions-item label="签发日期">-</el-descriptions-item>
<el-descriptions-item label="签发人">-</el-descriptions-item>
<el-descriptions-item label="产品/服务名称及型号">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="证书名称">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="产品标识">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/product_certificate?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/product_certificate?id=导入模式`">
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