# 活动(maneuver)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件|ATTACHMENTS|一对多关系数据集合|1048576|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|所有者|OWNER|单项选择(文本值)|60|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTACHMENT_MANEUVER](der/DERCUSTOM_ATTACHMENT_MANEUVER)|[附件(ATTACHMENT)](module/crm/attachment)|自定义关系|自动生成|
|[DERCUSTOM_CUSTOM_BUTTON_MANEUVER](der/DERCUSTOM_CUSTOM_BUTTON_MANEUVER)|[链接(CUSTOM_BUTTON)](module/crm/custom_button)|自定义关系|自动生成|
|[DERCUSTOM_NOTE_ATTACH_MANEUVER](der/DERCUSTOM_NOTE_ATTACH_MANEUVER)|[备注(NOTE_ATTACH)](module/crm/note_attach)|自定义关系|自动生成|


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
|[数据查询(DEFAULT)](module/crm/maneuver/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/crm/maneuver/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/crm/maneuver/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_EQ|所有者|EQ||

## 导入模式

* **导入活动**


<el-descriptions direction="vertical" :column="8" :size="size" border>
<el-descriptions-item label="名称">-</el-descriptions-item>
<el-descriptions-item label="标识">-</el-descriptions-item>
<el-descriptions-item label="建立时间">-</el-descriptions-item>
<el-descriptions-item label="更新人">-</el-descriptions-item>
<el-descriptions-item label="建立人">-</el-descriptions-item>
<el-descriptions-item label="更新时间">-</el-descriptions-item>
<el-descriptions-item label="所有者">-</el-descriptions-item>
<el-descriptions-item label="附件">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/maneuver?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/maneuver?id=导入模式`">
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