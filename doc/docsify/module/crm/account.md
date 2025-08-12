# 客户(account)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|客户名称|ACCOUNT_NAME|文本，可指定长度|200|是||
|客户编号|ACCOUNT_NUMBER|文本，可指定长度|100|是||
|客户所在地|ACCOUNT_SITE|文本，可指定长度|100|是||
|客户类型|ACCOUNT_TYPE|[单项选择(文本值)](index/dictionary_index#account_type "客户类型")|60|是||
|年收入|ANNUAL_REVENUE|货币|200|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|开单地址-城市|BILLING_CITY|文本，可指定长度|100|是||
|开单地址-邮编|BILLING_CODE|文本，可指定长度|30|是||
|开单地址-国家/地区|BILLING_COUNTRY|文本，可指定长度|100|是||
|开单地址-省/市|BILLING_STATE|文本，可指定长度|100|是||
|开单地址-街道|BILLING_STREET|文本，可指定长度|250|是||
|Change_Log_Time|CHANGE_LOG_TIME__S|日期时间型||是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|员工数|EMPLOYEES|整型||是||
|充实状态|ENRICH_STATUS__S|单项选择(文本值)|60|是||
|传真|FAX|文本，可指定长度|30|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|所属行业|INDUSTRY|[单项选择(文本值)](index/dictionary_index#industry "行业")|60|是||
|最近操作时间|LAST_ACTIVITY_TIME|日期时间型||是||
|最后充实时间|LAST_ENRICHED_TIME__S|日期时间型||是||
|Locked|LOCKED__S|[是否逻辑](index/dictionary_index#YesNo "是否")||是||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|公司所有权|OWNERSHIP|[单项选择(文本值)](index/dictionary_index#ownership "公司所有权")|60|是||
|父客户|PACCOUNT_NAME|外键值文本|200|是||
|电话|PHONE|文本，可指定长度|100|是||
|父标识|PID|外键值|100|是||
|等级|RATING|[单项选择(文本值)](index/dictionary_index#Rating "等级")|100|是||
|客户图片|RECORD_LMAGE|图片|200|是||
|发货地址-城市|SHIPPING_CITY|文本，可指定长度|100|是||
|发货地址-邮编|SHIPPING_CODE|文本，可指定长度|30|是||
|发货地址-国家/地区|SHIPPING_COUNTRY|文本，可指定长度|100|是||
|发货地址-省/市|SHIPPING_STATE|文本，可指定长度|100|是||
|发货地址-街道|SHIPPING_STREET|文本，可指定长度|250|是||
|SIC代码|SIC_CODE|整型||是||
|标签|TAG|文本，可指定长度|2000|是||
|股票代码|TICKER_SYMBOL|文本，可指定长度|30|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||
|网站|WEBSITE|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ACCOUNT_ACCOUNT_PID](der/DER1N_ACCOUNT_ACCOUNT_PID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||
|[DER1N_CONTACT_ACCOUNT_ACCOUNT_ID](der/DER1N_CONTACT_ACCOUNT_ACCOUNT_ID)|[联系人(CONTACT)](module/crm/contact)|1:N关系||
|[DER1N_DEAL_ACCOUNT_ACCOUNT_ID](der/DER1N_DEAL_ACCOUNT_ACCOUNT_ID)|[商机(DEAL)](module/crm/deal)|1:N关系||
|[DER1N_LEAD_ACCOUNT_ACCOUNT_ID](der/DER1N_LEAD_ACCOUNT_ACCOUNT_ID)|[线索(LEAD)](module/crm/lead)|1:N关系||
|[DER1N_PROJECT_ACCOUNT_ACCOUNT_ID](der/DER1N_PROJECT_ACCOUNT_ACCOUNT_ID)|[订单(PROJECT)](module/crm/project)|1:N关系||
|[DERCUSTOM_ATTACHMENT_ACCOUNT](der/DERCUSTOM_ATTACHMENT_ACCOUNT)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_ACCOUNT](der/DERCUSTOM_CUSTOM_BUTTON_ACCOUNT)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_ACCOUNT](der/DERCUSTOM_NOTE_ATTACH_ACCOUNT)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|
|[DERCUSTOM_RELATION_USER_ACCOUNT](der/DERCUSTOM_RELATION_USER_ACCOUNT)|[关联(RELATION)](module/crm/relation)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ACCOUNT_ACCOUNT_PID](der/DER1N_ACCOUNT_ACCOUNT_PID)|[客户(ACCOUNT)](module/crm/account)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||[（通用）获取并生成最近访问](index/plugin_index#GetAndCreateRecent)||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|批添加标签|add_tags|用户自定义|默认|不支持||[（通用）添加标签](index/plugin_index#AddTags)|自动生成|
|批更新|batch_update|用户自定义|默认|不支持||[（通用）更新](index/plugin_index#Update)|自动生成|
|批创建任务|create_task|用户自定义|默认|不支持||[（通用）创建任务](index/plugin_index#CreateTask)|自动生成|
|批移除标签|delete_tags|用户自定义|默认|不支持||[（通用）移除标签](index/plugin_index#RemoveTags)|自动生成|
|通过id查询客户信息|find_account|[实体处理逻辑](module/crm/account/logic/findAccount "获取客户信息")|默认|不支持|||反查客户信息|
|main_view_dr计数器|main_view_dr_count|用户自定义|默认|不支持||[（通用）main_view关系计数器](index/plugin_index#UsrSFPlugin0321285737)|自动生成|
|合并客户|merge_account|[实体处理逻辑](module/crm/account/logic/merge_account "合并客户")|默认|不支持|[附加操作](index/action_logic_index#account_merge_account)|||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[删除被合并客户](module/crm/account/logic/delete_marge)|delete_marge|无|||
|[合并客户](module/crm/account/logic/merge_account)|merge_account|无||在填入重复客户的时候将客户合并为一个|
|[获取客户信息](module/crm/account/logic/findAccount)|findAccount|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/crm/account/query/Default)|DEFAULT|否|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/account/query/View)|VIEW|是|否 |否 ||
|[分配的客户(assigned)](module/crm/account/query/assigned)|assigned|否|否 |否 ||
|[创建者(createman)](module/crm/account/query/createman)|createman|否|否 |否 ||
|[当前客户(current)](module/crm/account/query/current)|current|否|否 |否 ||
|[当前客户外其他客户(not_current)](module/crm/account/query/not_current)|not_current|否|否 |否 ||
|[所有者(owner)](module/crm/account/query/owner)|owner|否|否 |否 ||
|[被关联的数据(target_relation)](module/crm/account/query/target_relation)|target_relation|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/account/dataset/Default)|DEFAULT|数据查询|是|||
|[全部客户(all)](module/crm/account/dataset/all)|all|数据查询|否|||
|[分配的客户(assigned)](module/crm/account/dataset/assigned)|assigned|数据查询|否|||
|[创建者(createman)](module/crm/account/dataset/createman)|createman|数据查询|否|||
|[当前客户(current)](module/crm/account/dataset/current)|current|数据查询|否|||
|[当前客户外其他客户(not_current)](module/crm/account/dataset/not_current)|not_current|数据查询|否|||
|[所有者(owner)](module/crm/account/dataset/owner)|owner|数据查询|否|||
|[被关联的数据(target_relation)](module/crm/account/dataset/target_relation)|target_relation|数据查询|否|||

## 数据权限

##### 全部数据-读写 :id=account-ALL_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `CREATE`
* `READ`
* `UPDATE`



##### 全部数据-只读 :id=account-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 分配的客户-只读 :id=account-ASSIGNED_R

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[分配的客户(assigned)](module/crm/account#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 创建者-读写 :id=account-CREATEMAN_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[创建者(createman)](module/crm/account#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `CREATE`
* `UPDATE`



##### 所有者-读写 :id=account-OWNER_CRUD

<p class="panel-title"><b>数据范围</b></p>

* `数据集合` ：[所有者(owner)](module/crm/account#数据集合)

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_NAME_LIKE|客户名称|LIKE||
|N_ACCOUNT_NUMBER_LIKE|客户编号|LIKE||
|N_ACCOUNT_SITE_LIKE|客户所在地|LIKE||
|N_ACCOUNT_TYPE_EQ|客户类型|EQ||
|N_ENRICH_STATUS__S_EQ|充实状态|EQ||
|N_ID_EQ|标识|EQ||
|N_INDUSTRY_EQ|所属行业|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||
|N_OWNERSHIP_EQ|公司所有权|EQ||
|N_PACCOUNT_NAME_EQ|父客户|EQ||
|N_PACCOUNT_NAME_LIKE|父客户|LIKE||
|N_PHONE_LIKE|电话|LIKE||
|N_PID_EQ|父标识|EQ||
|N_RATING_EQ|等级|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[客户](app/view/account_edit_view)</details>|自动生成|
| 保存并打开线索主信息界面 | saveandopenaccount | 保存并打开客户主信息界面 |单项数据|<details><summary>后台调用</summary>[Create](#行为)||
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 打开客户主数据视图 | open_main | 打开主数据视图 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[客户信息](app/view/account_test_main_view)</details>||
| 合并客户 | marge_account | 合并客户 |单项数据|<details><summary>后台调用</summary>[merge_account](#行为)||
| 打开合并编辑视图 | open_marge_view | 打开合并编辑视图 |无数据|<details><summary>打开视图或向导（模态）</summary>[合并编辑视图](app/view/account_marge_edit_view)</details>||
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 过滤 | panel_usr0407652380_button_filter_click | 过滤 |单项数据|用户自定义||
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|
| 过滤 | panel_usr0318980456_button_filter_click | 过滤 |单项数据|用户自定义||
| 导入数据 | ImportData | 导入客户 |无数据|<details><summary>打开数据导入视图</summary>[导入客户]()</details>|自动生成|
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[搜索栏显示切换](module/crm/account/uilogic/filter_trigger)|filter_trigger|搜索栏容器名称必须为view_searchbar|
|[添加附件](module/crm/account/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入客户**


<el-descriptions direction="vertical" :column="42" :size="size" border>
<el-descriptions-item label="开单地址-街道">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="客户图片">-</el-descriptions-item>
<el-descriptions-item label="父客户">-</el-descriptions-item>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="等级">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="传真">-</el-descriptions-item>
<el-descriptions-item label="客户所在地">-</el-descriptions-item>
<el-descriptions-item label="发货地址-城市">-</el-descriptions-item>
<el-descriptions-item label="电话">-</el-descriptions-item>
<el-descriptions-item label="客户名称">-</el-descriptions-item>
<el-descriptions-item label="发货地址-省/市">-</el-descriptions-item>
<el-descriptions-item label="发货地址-街道">-</el-descriptions-item>
<el-descriptions-item label="开单地址-省/市">-</el-descriptions-item>
<el-descriptions-item label="开单地址-城市">-</el-descriptions-item>
<el-descriptions-item label="股票代码">-</el-descriptions-item>
<el-descriptions-item label="发货地址-国家/地区">-</el-descriptions-item>
<el-descriptions-item label="开单地址-国家/地区">-</el-descriptions-item>
<el-descriptions-item label="客户类型">-</el-descriptions-item>
<el-descriptions-item label="发货地址-邮编">-</el-descriptions-item>
<el-descriptions-item label="开单地址-邮编">-</el-descriptions-item>
<el-descriptions-item label="客户编号">-</el-descriptions-item>
<el-descriptions-item label="公司所有权">-</el-descriptions-item>
<el-descriptions-item label="网站">-</el-descriptions-item>
<el-descriptions-item label="所属行业">-</el-descriptions-item>
<el-descriptions-item label="SIC代码">-</el-descriptions-item>
<el-descriptions-item label="充实状态">-</el-descriptions-item>
<el-descriptions-item label="最近操作时间">-</el-descriptions-item>
<el-descriptions-item label="年收入">-</el-descriptions-item>
<el-descriptions-item label="Change_Log_Time">-</el-descriptions-item>
<el-descriptions-item label="员工数">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="最后充实时间">-</el-descriptions-item>
<el-descriptions-item label="Locked">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
<el-descriptions-item label="父标识">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/account?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/account?id=导入模式`">
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