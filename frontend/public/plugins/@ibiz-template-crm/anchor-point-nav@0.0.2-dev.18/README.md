# Editview2视图配置插件增强

该插件基于drbar和form，使得支持点击关系栏时右侧表单页面滚动至对应关系页面。

## 页面展示

![image](./public/assets/images/scene.png)

## 功能说明

- 支持点击关系栏时右侧表单页面滚动至对应关系页面

## 基本使用

1.drbar插件使用，在具体项目中，先通过模型导入前端界面插件，然后在视图上的 drbar 部件中选择“dabar支持锚点”插件

它对应的关系界面组配置为:
![image](./public/assets/images/drbarpeizhi.png)

2.form插件使用，在具体项目中，先通过模型导入前端界面插件，然后在视图上的 编辑表单 部件中选择“form支持锚点”插件

它对应的关系界面组配置为:
![image](./public/assets/images/formpeizhi.png)

## 附录：

### 增强编辑表单绘制插件

```json
[
  {
    "plugintype": "CUSTOM",
    "rtobjectrepo": "@ibiz-template-crm/anchor-point-nav@0.0.1",
    "codename": "UsrPFPlugin0327050941",
    "plugintag": "DRBAR_ANCHOR_STYLE",
    "rtobjectmode": 2,
    "rtobjectname": "IBizDRBarExControl",
    "pssyspfpluginname": "dabar支持锚点"
  }
]
```

### 增强自定义部件绘制插件

```json
[
  {
    "plugintype": "EDITFORM_RENDER",
    "rtobjectrepo": "@ibiz-template-crm/anchor-point-nav@0.0.1",
    "codename": "UsrPFPlugin0327382712",
    "plugintag": "ANCHOR_STYLE",
    "rtobjectmode": 2,
    "rtobjectname": "IBizFromAnchorPointControl",
    "pssyspfpluginname": "form支持锚点"
  }
]
```