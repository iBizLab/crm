# 订单(project_edit_view3)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 值规则
* `tax` : [税率值规则](index/value_rule_index)
#### 工具栏(toolbar)

## 视图界面逻辑
* `onMDCtrlNew`
```javascript
setTimeout(() => {
	const scroll = document.getElementsByClassName('ibiz-panel-view-content--scroll_container')[0];
	if (scroll) {
		scroll.scrollTop = scroll.scrollHeight;
	}
}, 0);
```


### 关联界面行为
  * [订单(PROJECT)](module/crm/project) : [编辑界面_保存并退出操作](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [编辑界面_退出操作](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [编辑界面_保存并新建操作](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [保存并打开订单主数据视图](module/crm/project#界面行为)
  * [订单(PROJECT)](module/crm/project) : [打开订单主数据视图](module/crm/project#界面行为)

### 关联视图
  * [客户(account_pickup_view)](app/view/account_pickup_view)
  * [订单信息(project_main_view)](app/view/project_main_view)
  * [订单(project_pickup_view)](app/view/project_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>