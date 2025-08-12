# 收付款(payee_grid_view_multimode)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [收款记录(PAYEE)](module/crm/payee) : [删除](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [表格界面_新建操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [添加标签](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [导入数据](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [移除标签](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [创建任务](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [表格界面_刷新操作](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [批量更新](module/crm/payee#界面行为)
  * [收款记录(PAYEE)](module/crm/payee) : [导入备注](module/crm/payee#界面行为)

### 关联视图
  * [收款记录表格编辑视图(payee_multimode_edit_view)](app/view/payee_multimode_edit_view)
  * [添加标签(tag_add_tag)](app/view/tag_add_tag)
  * [移除标签(tag_remove_tag)](app/view/tag_remove_tag)
  * [批创建(task_batch_create_view)](app/view/task_batch_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>