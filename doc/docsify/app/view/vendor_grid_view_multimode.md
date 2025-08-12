# 供应商(vendor_grid_view_multimode)  <!-- {docsify-ignore-all} -->


系统自动添加



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
  * [供应商(VENDOR)](module/crm/vendor) : [批量更新](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [移除标签](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [导入备注](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [创建任务](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [添加标签](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [表格界面_新建操作](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [导入数据](module/crm/vendor#界面行为)
  * [供应商(VENDOR)](module/crm/vendor) : [删除](module/crm/vendor#界面行为)

### 关联视图
  * [添加标签(tag_add_tag)](app/view/tag_add_tag)
  * [移除标签(tag_remove_tag)](app/view/tag_remove_tag)
  * [批创建(task_batch_create_view)](app/view/task_batch_create_view)
  * [供应商(vendor_edit_view)](app/view/vendor_edit_view)
  * [供应商信息(vendor_main_view)](app/view/vendor_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>