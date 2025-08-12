# 解决方案(solution_grid_view_multimode)  <!-- {docsify-ignore-all} -->


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
  * [解决方案(SOLUTION)](module/crm/solution) : [导入数据](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [导入备注](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [删除](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [移除标签](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [表格界面_新建操作](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [添加标签](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [批量更新](module/crm/solution#界面行为)
  * [解决方案(SOLUTION)](module/crm/solution) : [创建任务](module/crm/solution#界面行为)

### 关联视图
  * [解决方案(solution_edit_view)](app/view/solution_edit_view)
  * [解决方案信息(solution_main_view)](app/view/solution_main_view)
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