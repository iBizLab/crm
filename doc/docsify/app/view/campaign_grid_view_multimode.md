# 市场活动(campaign_grid_view_multimode)  <!-- {docsify-ignore-all} -->


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
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [移除标签](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [导入数据](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [导入备注](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [删除](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [管理标签](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [批量更新](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [表格界面_新建操作](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [创建任务](module/crm/campaign#界面行为)
  * [市场活动(CAMPAIGN)](module/crm/campaign) : [添加标签](module/crm/campaign#界面行为)

### 关联视图
  * [市场活动(campaign_edit_view)](app/view/campaign_edit_view)
  * [市场活动信息(campaign_main_view)](app/view/campaign_main_view)
  * [添加标签(tag_add_tag)](app/view/tag_add_tag)
  * [标签管理(tag_mgr_grid_view)](app/view/tag_mgr_grid_view)
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