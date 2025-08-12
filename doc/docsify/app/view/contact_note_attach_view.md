# 进展评估(contact_note_attach_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 编辑表单(form)


### 关联界面行为
  * [联系人(CONTACT)](module/crm/contact) : [清空评论](module/crm/contact#界面行为)
  * [联系人(CONTACT)](module/crm/contact) : [发送评论](module/crm/contact#界面行为)

### 关联界面逻辑
  * [备注(NOTE_ATTACH)](module/crm/note_attach) : [控制备注按钮隐藏](module/crm/note_attach/uilogic/note_icon_hidden)
  * [备注(NOTE_ATTACH)](module/crm/note_attach) : [控制备注按钮显示](module/crm/note_attach/uilogic/note_icon_show)

### 关联视图
  * [进展评估(note_attach_list_view)](app/view/note_attach_list_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>