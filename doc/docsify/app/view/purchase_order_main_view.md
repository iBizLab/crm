# 采购订单信息(purchase_order_main_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 编辑表单(miniform)
#### 工具栏(toolbar)


### 关联界面行为
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑界面_上一个记录](module/crm/purchase_order#界面行为)
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑界面_下一个记录](module/crm/purchase_order#界面行为)
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑界面_删除并退出操作](module/crm/purchase_order#界面行为)
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑](module/crm/purchase_order#界面行为)
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑界面_拷贝操作](module/crm/purchase_order#界面行为)
  * [采购订单(PURCHASE_ORDER)](module/crm/purchase_order) : [编辑界面_退出操作](module/crm/purchase_order#界面行为)

### 关联视图
  * [时间轴(activitiy_time_line_view)](app/view/activitiy_time_line_view)
  * [链接(custom_button_grid_view)](app/view/custom_button_grid_view)
  * [已邀请的会议(event_invited_view)](app/view/event_invited_view)
  * [附件(purchase_order_attachment_view)](app/view/purchase_order_attachment_view)
  * [采购订单(purchase_order_edit_view)](app/view/purchase_order_edit_view)
  * [备注(purchase_order_note_attach_view)](app/view/purchase_order_note_attach_view)
  * [已完成的任务&历史活动(schedule_close_view)](app/view/schedule_close_view)
  * [待办任务(schedule_not_close_view)](app/view/schedule_not_close_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>