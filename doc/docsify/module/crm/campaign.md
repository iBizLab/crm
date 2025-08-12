# 市场活动(campaign)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|实际成本|ACTUAL_COST|货币|200|是||
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|预算成本|BUDGETED_COST|货币|200|是||
|市场活动名称|CAMPAIGN_NAME|文本，可指定长度|255|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|32000|是||
|结束日期|END_DATE|日期型||是||
|期望成功率(%)|EXPECTED_RESPONSE|大整型|20|是||
|预期收益|EXPECTED_REVENUE|货币|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|部门ID|NATIVE_SURVEY__EXTN__DEPARTMENT_ID|文本，可指定长度|255|是||
|调查|NATIVE__SURVEY__EXTN__SURVEY|文本，可指定长度|255|是||
|调查类型|NATIVE__SURVEY__EXTN__SURVEY_TYPE|单项选择(文本值)|60|是||
|调查URL|NATIVE__SURVEY__EXTN__SURVEY_URL|文本，可指定长度|100|是||
|调查部门|NATIVE__SURVEY__EXTN__SURVEY__DEPARTMENT|文本，可指定长度|255|是||
|网络研讨会启动URL|NATIVE__WEBINAR__EXTN__WEBINAR_LAUNCH_URL|文本，可指定长度|100|是||
|网络研讨会注册URL|NATIVE__WEBINAR__EXTN__WEBINAR_REGISTRATION_URL|文本，可指定长度|100|是||
|网络研讨会持续时间|NATIVE__WEBINAR__EXTN__WEBINAR__DURATION|单项选择(文本值)|60|是||
|网络研讨会时间表|NATIVE__WEBINAR__EXTN__WEBINAR__SCHEDULE|日期时间型||是||
|发出数量|NUM_SENT|大整型|20|是||
|开始日期|START_DATE|日期型||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#campaign_status "活动状态")|60|是||
|标签|TAG|文本，可指定长度|2000|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#campaign_type "市场活动类型")|60|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_CAMPAIGN](der/DERCUSTOM_ATTACHMENT_CAMPAIGN)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_CAMPAIGN](der/DERCUSTOM_CUSTOM_BUTTON_CAMPAIGN)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_CAMPAIGN](der/DERCUSTOM_NOTE_ATTACH_CAMPAIGN)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


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
|[数据查询(DEFAULT)](module/crm/campaign/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/campaign/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_NATIVE__SURVEY__EXTN__SURVEY_TYPE_EQ|调查类型|EQ||
|N_NATIVE__WEBINAR__EXTN__WEBINAR__DURATION_EQ|网络研讨会持续时间|EQ||
|N_STATUS_EQ|状态|EQ||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加标签 | add_tags | 添加标签 |多项数据（主键）|<details><summary>后台调用</summary>[add_tags](#行为)|自动生成|
| 编辑 | open_edit_view | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[市场活动](app/view/campaign_edit_view)</details>|自动生成|
| 添加附件 | add_attachments | 添加附件 |无数据|用户自定义|自动生成|
| 导入数据 | ImportData | 导入市场活动 |无数据|<details><summary>打开数据导入视图</summary>[导入市场活动]()</details>|自动生成|
| 管理标签 | mgr_tags | 管理标签 |无数据|<details><summary>打开顶级视图</summary>[标签管理](app/view/tag_mgr_grid_view)</details>|自动生成|
| 创建任务 | create_task | 创建任务 |多项数据（主键）|<details><summary>后台调用</summary>[create_task](#行为)|自动生成|
| 删除 | remove | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)|自动生成|
| 批量更新 | batch_update | 批量更新 |多项数据（主键）|<details><summary>后台调用</summary>[batch_update](#行为)|自动生成|
| 移除标签 | delete_tags | 移除标签 |多项数据（主键）|<details><summary>后台调用</summary>[delete_tags](#行为)|自动生成|
| 上传附件 | upload_attachment | 上传 |无数据|用户自定义|自动生成|

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[添加附件](module/crm/campaign/uilogic/add_attachment)|add_attachment|自动生成|

## 导入模式

* **导入市场活动**


<el-descriptions direction="vertical" :column="28" :size="size" border>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="网络研讨会时间表">-</el-descriptions-item>
<el-descriptions-item label="调查部门">-</el-descriptions-item>
<el-descriptions-item label="市场活动名称">-</el-descriptions-item>
<el-descriptions-item label="调查类型">-</el-descriptions-item>
<el-descriptions-item label="状态">-</el-descriptions-item>
<el-descriptions-item label="网络研讨会注册URL">-</el-descriptions-item>
<el-descriptions-item label="描述">-</el-descriptions-item>
<el-descriptions-item label="类型">-</el-descriptions-item>
<el-descriptions-item label="网络研讨会启动URL">-</el-descriptions-item>
<el-descriptions-item label="网络研讨会持续时间">-</el-descriptions-item>
<el-descriptions-item label="开始日期">-</el-descriptions-item>
<el-descriptions-item label="部门ID">-</el-descriptions-item>
<el-descriptions-item label="预期收益">-</el-descriptions-item>
<el-descriptions-item label="调查URL">-</el-descriptions-item>
<el-descriptions-item label="实际成本">-</el-descriptions-item>
<el-descriptions-item label="期望成功率(%)">-</el-descriptions-item>
<el-descriptions-item label="预算成本">-</el-descriptions-item>
<el-descriptions-item label="结束日期">-</el-descriptions-item>
<el-descriptions-item label="调查">-</el-descriptions-item>
<el-descriptions-item label="标签">-</el-descriptions-item>
<el-descriptions-item label="发出数量">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/campaign?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/campaign?id=导入模式`">
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