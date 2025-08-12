# 界面逻辑 <!-- {docsify-ignore-all} -->

## [客户(ACCOUNT)](module/crm/account.md) :id=account

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[搜索栏显示切换](module/crm/account/uilogic/filter_trigger)|filter_trigger|搜索栏容器名称必须为view_searchbar|
|[添加附件](module/crm/account/uilogic/add_attachment)|add_attachment|自动生成|



## [附件(ATTACHMENT)](module/crm/attachment.md) :id=attachment

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[计算附件是否隐藏逻辑](module/crm/attachment/uilogic/calc_attachment_hidden)|calc_attachment_hidden||
|[附件_删除](module/crm/attachment/uilogic/remove_attachment_sc)|remove_attachment_sc|自动判断为表格或表单附件，按类别删除|



## [市场活动(CAMPAIGN)](module/crm/campaign.md) :id=campaign

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/campaign/uilogic/add_attachment)|add_attachment|自动生成|


## [服务支持(CASE)](module/crm/service_case.md) :id=service_case

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/service_case/uilogic/add_attachment)|add_attachment|自动生成|


## [联系人(CONTACT)](module/crm/contact.md) :id=contact

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/contact/uilogic/add_attachment)|add_attachment|自动生成|



## [商机(DEAL)](module/crm/deal.md) :id=deal

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[导航到表格视图（图表导航）](module/crm/deal/uilogic/exp_to_gridview)|exp_to_gridview||
|[导航（全部商机含查询条件）](module/crm/deal/uilogic/all_deal_with_query)|all_deal_with_query||
|[添加附件](module/crm/deal/uilogic/add_attachment)|add_attachment|自动生成|






## [发货单(INVOICE)](module/crm/invoice.md) :id=invoice

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/invoice/uilogic/add_attachment)|add_attachment|自动生成|



## [线索(LEAD)](module/crm/lead.md) :id=lead

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/lead/uilogic/add_attachment)|add_attachment|自动生成|



## [备注(NOTE_ATTACH)](module/crm/note_attach.md) :id=note_attach

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[发送评论](module/crm/note_attach/uilogic/send_comment)|send_comment||
|[控制备注按钮显示](module/crm/note_attach/uilogic/note_icon_show)|note_icon_show||
|[控制备注按钮隐藏](module/crm/note_attach/uilogic/note_icon_hidden)|note_icon_hidden||
|[清空评论](module/crm/note_attach/uilogic/clear_comment)|clear_comment||
|[编辑备注](module/crm/note_attach/uilogic/edit_note)|edit_note||



## [收款记录(PAYEE)](module/crm/payee.md) :id=payee

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[收款记录保存之前](module/crm/payee/uilogic/before_save_payee)|before_save_payee|从收款计划->新建收款记录时：判断收款记录金额若小于计划金额时，弹出提示|



## [收款计划(PAYEE_PLAN)](module/crm/payee_plan.md) :id=payee_plan

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[拆分前保存检测](module/crm/payee_plan/uilogic/cut_and_save)|cut_and_save|拆分订单时上一订单减掉新订单的金额|


## [收款情况统计(PAYEE_STATISTIC)](module/crm/payee_statistic.md) :id=payee_statistic

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[导航到表格视图(只传搜索表单参数)](module/crm/payee_statistic/uilogic/exp_to_gridview3)|exp_to_gridview3||
|[导航到表格视图（统计图表导航）](module/crm/payee_statistic/uilogic/exp_to_gridview)|exp_to_gridview||
|[界面跳转至记录/计划](module/crm/payee_statistic/uilogic/redirect)|redirect||


## [价格表(PRICE_BOOK)](module/crm/price_book.md) :id=price_book

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/price_book/uilogic/add_attachment)|add_attachment|自动生成|


## [产品(PRODUCT)](module/crm/product.md) :id=product

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/product/uilogic/add_attachment)|add_attachment|自动生成|


## [产品证书(PRODUCT_CERTIFICATE)](module/crm/product_certificate.md) :id=product_certificate

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/product_certificate/uilogic/add_attachment)|add_attachment|自动生成|


## [订单(PROJECT)](module/crm/project.md) :id=project

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/project/uilogic/add_attachment)|add_attachment|自动生成|
|[签单导航到表格视图(只传搜索表单参数)](module/crm/project/uilogic/qd_exp_to_gridview)|qd_exp_to_gridview||


## [采购订单(PURCHASE_ORDER)](module/crm/purchase_order.md) :id=purchase_order

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/purchase_order/uilogic/add_attachment)|add_attachment|自动生成|


## [报价(QUOTE)](module/crm/quote.md) :id=quote

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/quote/uilogic/add_attachment)|add_attachment|自动生成|





## [销售订单(SALES_ORDER)](module/crm/sales_order.md) :id=sales_order

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/sales_order/uilogic/add_attachment)|add_attachment|自动生成|



## [解决方案(SOLUTION)](module/crm/solution.md) :id=solution

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/solution/uilogic/add_attachment)|add_attachment|自动生成|






## [任务&活动(TASK)](module/crm/task.md) :id=task

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/task/uilogic/add_attachment)|add_attachment|自动生成|



## [用户(USER)](module/crm/user.md) :id=user

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[修改密码（表单）](module/crm/user/uilogic/change_pas)|change_pas|修改密码|


## [供应商(VENDOR)](module/crm/vendor.md) :id=vendor

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[添加附件](module/crm/vendor/uilogic/add_attachment)|add_attachment|自动生成|


## [周报(WEEKLIES)](module/crm/weeklies.md) :id=weeklies

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[打开新建周报编辑视图](module/crm/weeklies/uilogic/open_new_edit)|open_new_edit||
|[生成周报附件](module/crm/weeklies/uilogic/generate_attachment)|generate_attachment||



## [工作进展(WORK_PROGRESS)](module/crm/work_progress.md) :id=work_progress

|  中文名col200 | 代码名col200 | 备注col500 |
| --------|--------|------|
|[根据业务类型打开对应主数据视图](module/crm/work_progress/uilogic/OpenviewBytype)|OpenviewBytype||

