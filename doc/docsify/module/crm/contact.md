# 联系人(contact)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户ID|ACCOUNT_ID|外键值|100|是||
|客户名称|ACCOUNT_NAME|外键值文本|200|是||
|助理|ASSISTANT|文本，可指定长度|50|是||
|助理电话|ASST_PHONE|文本，可指定长度|100|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|Change_Log_Time|CHANGE_LOG_TIME__S|日期时间型||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|生日|DATE_OF_BIRTH|日期型||是||
|部门|DEPARTMENT|文本，可指定长度|50|是||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|电子邮件|EMAIL|文本，可指定长度|100|是||
|不发营销邮件|EMAIL_OPT_OUT|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|充实状态|ENRICH_STATUS__S|单项选择(文本值)|60|是||
|传真|FAX|文本，可指定长度|30|是||
|名字|FIRST_NAME|文本，可指定长度|40|是||
|全名|FULL_NAME|文本，可指定长度|120|是||
|住宅电话|HOME_PHONE|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|最近操作时间|LAST_ACTIVITY_TIME|日期时间型||是||
|最后充实时间|LAST_ENRICHED_TIME__S|日期时间型||是||
|姓氏|LAST_NAME|文本，可指定长度|80|是||
|线索来源|LEAD_SOURCE|[单项选择(文本值)](index/dictionary_index#lead_source "线索来源")|60|是||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|邮寄地址-城市|MAILING_CITY|文本，可指定长度|100|是||
|邮寄地址-国家/地|MAILING_COUNTRY|文本，可指定长度|100|是||
|邮寄地址-省/市|MAILING_STATE|文本，可指定长度|100|是||
|邮寄地址-街道|MAILING_STREET|文本，可指定长度|250|是||
|邮寄地址-邮编|MAILING_ZIP|文本，可指定长度|30|是||
|手机|MOBILE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|其它城市|OTHER_CITY|文本，可指定长度|100|是||
|其它国家/地区|OTHER_COUNTRY|文本，可指定长度|100|是||
|其它省/市|OTHER_STATE|文本，可指定长度|100|是||
|其它街道|OTHER_STREET|文本，可指定长度|250|是||
|其他邮编|OTHER_ZIP|文本，可指定长度|30|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|电话|PHONE|文本，可指定长度|100|是||
|联系人图片|RECORD_IMAGE|文本，可指定长度|100|是||
|称呼|SALUTATION|单项选择(文本值)|60|是||
|备用邮箱|SECONDARY_EMAIL|文本，可指定长度|100|是||
|Skype_ID|SKYPE_ID|文本，可指定长度|50|是||
|标签|TAG|文本，可指定长度|2000|是||
|职位/职称|TITLE|文本，可指定长度|100|是||
|退订的方式|UNSUBSCRIBED_MODE|单项选择(文本值)|60|是||
|退订的时间|UNSUBSCRIBED_TIME|日期时间型||是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DEAL_CONTACT_CONTACT_ID](der/DER1N_DEAL_CONTACT_CONTACT_ID)|[商机(DEAL)](module/crm/deal)|1:N关系||
|[DERCUSTOM_ATTACHMENT_CONTACT](der/DERCUSTOM_ATTACHMENT_CONTACT)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CONTACT](der/DERCUSTOM_CUSTOM_BUTTON_CONTACT)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CONTACT](der/DERCUSTOM_NOTE_ATTACH_CONTACT)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CONTACT_ACCOUNT_ACCOUNT_ID](der/DER1N_CONTACT_ACCOUNT_ACCOUNT_ID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||

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
|[数据查询(DEFAULT)](module/crm/contact/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/contact/query/View)|VIEW|否|否 |否 ||
|[创建者(createman)](module/crm/contact/query/createman)|createman|否|否 |否 ||
|[所有者(owner)](module/crm/contact/query/owner)|owner|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/contact/dataset/Default)|DEFAULT|数据查询|是|||
|[全部联系人(all)](module/crm/contact/dataset/all)|all|数据查询|否|||
|[创建者(createman)](module/crm/contact/dataset/createman)|createman|数据查询|否|||
|[所有者(owner)](module/crm/contact/dataset/owner)|owner|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=contact-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `UPDATE`
* `CREATE`



##### 全部数据-只读 :id=contact-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=contact-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/contact#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `READ`
* `CREATE`



##### 所有者-读写 :id=contact-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/contact#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `UPDATE`
* `READ`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_ID_EQ|客户ID|EQ||
|N_ACCOUNT_NAME_EQ|客户名称|EQ||
|N_ACCOUNT_NAME_LIKE|客户名称|LIKE||
|N_ENRICH_STATUS__S_EQ|充实状态|EQ||
|N_FIRST_NAME_LIKE|名字|LIKE||
|N_FULL_NAME_LIKE|全名|LIKE||
|N_ID_EQ|标识|EQ||
|N_LEAD_SOURCE_EQ|线索来源|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_SALUTATION_EQ|称呼|EQ||
|N_UNSUBSCRIBED_MODE_EQ|退订的方式|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[联系人](app/view/contact_edit_view)</details>|自动生成|
| 保存并打开联系人主数据页面 | saveAndOpenContact | 保存并打开联系人主数据页面 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 打开联系人主数据页面 | openContactZsjView | 联系人 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[联系人信息](app/view/contact_main_view)</details>||
| 导入数据 | ImportData | 导入联系人 |无数据|<details><summary>打开数据导入视图</summary>[导入联系人]()</details>|自动生成|
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 层级视图 | panel_usr0422974089_button_openview_click | 联系人层级 |单项数据|<details><summary>打开视图或向导（模态）</summary>[联系人层级](app/view/contact_tree_view_level)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/contact/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入联系人**


<el-descriptions direction="vertical" :column="48" :size="size" border>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="联系人图片">-</el-descriptions-item>
<el-descriptions-item label="邮寄地址-街道">-</el-descriptions-item>
<el-descriptions-item label="其它街道">-</el-descriptions-item>
<el-descriptions-item label="全名">-</el-descriptions-item>
<el-descriptions-item label="名字">-</el-descriptions-item>
<el-descriptions-item label="其它城市">-</el-descriptions-item>
<el-descriptions-item label="线索来源">-</el-descriptions-item>
<el-descriptions-item label="邮寄地址-省/市">-</el-descriptions-item>
<el-descriptions-item label="邮寄地址-城市">-</el-descriptions-item>
<el-descriptions-item label="姓氏">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="其它省/市">-</el-descriptions-item>
<el-descriptions-item label="其他邮编">-</el-descriptions-item>
<el-descriptions-item label="其它国家/地区">-</el-descriptions-item>
<el-descriptions-item label="电子邮件">-</el-descriptions-item>
<el-descriptions-item label="邮寄地址-邮编">-</el-descriptions-item>
<el-descriptions-item label="职位/职称">-</el-descriptions-item>
<el-descriptions-item label="邮寄地址-国家/地">-</el-descriptions-item>
<el-descriptions-item label="助理电话">-</el-descriptions-item>
<el-descriptions-item label="生日">-</el-descriptions-item>
<el-descriptions-item label="住宅电话">-</el-descriptions-item>
<el-descriptions-item label="手机">-</el-descriptions-item>
<el-descriptions-item label="助理">-</el-descriptions-item>
<el-descriptions-item label="传真">-</el-descriptions-item>
<el-descriptions-item label="电话">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="不发营销邮件">-</el-descriptions-item>
<el-descriptions-item label="称呼">-</el-descriptions-item>
<el-descriptions-item label="Skype_ID">-</el-descriptions-item>
<el-descriptions-item label="备用邮箱">-</el-descriptions-item>
<el-descriptions-item label="退订的方式">-</el-descriptions-item>
<el-descriptions-item label="退订的时间">-</el-descriptions-item>
<el-descriptions-item label="Change_Log_Time">-</el-descriptions-item>
<el-descriptions-item label="最近操作时间">-</el-descriptions-item>
<el-descriptions-item label="最后充实时间">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="充实状态">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="客户ID">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/contact?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/contact?id=导入模式`">
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