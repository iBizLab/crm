# 新建周报(weeklies_quick_create_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onChange`
```
var start_date = ctrl.details.start_date.value;
var end_date = ctrl.details.end_date.value;
ctrl.details.name.setDataValue(context.srfusername + start_date + '至' + end_date + '周报');

```


### 关联界面行为
  * [周报(WEEKLIES)](module/crm/weeklies) : [关闭当前视图](module/crm/weeklies#界面行为)
  * [周报(WEEKLIES)](module/crm/weeklies) : [视图_取消](module/crm/weeklies#界面行为)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>