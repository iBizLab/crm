# 联系人(contact_grid_view_relation)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [联系人(CONTACT)](module/crm/contact) : [表格界面_编辑操作](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [表格界面_新建操作](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [层级视图](module/crm/contact#界面行为)

### 关联视图
  * [联系人(contact_edit_view)](app/view/contact_edit_view)
  * [联系人层级(contact_tree_view_level)](app/view/contact_tree_view_level)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>