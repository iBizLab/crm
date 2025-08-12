# 用户(user_m_pickup_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 选择视图面板(pickupviewpanel)
#### 列表(simplelist)

## 视图界面逻辑
* `onViewMounted`
```javascript
const panelItems = view.layoutPanel.panelItems;
if (panelItems.pickupname) {
    panelItems.pickupname.setDataValue(viewParam.pickupname);
}
```


### 关联界面行为
  * [用户(USER)](module/crm/user) : [视图_取消](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [添加选中数据（数据选择）](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [移除选中数据（数据选择）](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [添加全部数据（数据选择）](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [视图_确定](module/crm/user#界面行为)
  * [用户(USER)](module/crm/user) : [移除全部数据（数据选择）](module/crm/user#界面行为)

### 关联视图
  * [用户(user_pickup_grid_view)](app/view/user_pickup_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>