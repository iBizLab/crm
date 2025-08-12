# crmweb(crmweb)  <!-- {docsify-ignore-all} -->

## 菜单

<el-row>
  <el-menu :ellipsis="false" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-menu-item index="menuitem4" @click="itemClick('#/app/view/app_portal_view')"><i class="fa fa-dashboard"></i>我的工作台</el-menu-item>
    <el-menu-item index="menuitem1" @click="itemClick('#/app/view/account_test_tab_search_view')">客户</el-menu-item>
    <el-menu-item index="menuitem2" @click="itemClick('#/app/view/lead_tab_search_view')">线索</el-menu-item>
    <el-menu-item index="menuitem5" @click="itemClick('#/app/view/deal_tab_search_view')">商机</el-menu-item>
    <el-sub-menu index="menuitem26">
      <template #title>订单</template>
    <el-menu-item index="menuitem32" @click="itemClick('#/app/view/project_tab_search_view')">订单</el-menu-item>
    <el-menu-item index="menuitem33" @click="itemClick('#/app/view/payee_tab_search_view')">收款记录</el-menu-item>
    <el-menu-item index="menuitem34" @click="itemClick('#/app/view/payee_plan_tab_search_view')">收款计划</el-menu-item>
    <el-menu-item index="menuitem23" @click="itemClick('#/app/view/project_chart_exp_view')">签单分析</el-menu-item>
    <el-menu-item index="menuitem35" @click="itemClick('#/app/view/payee_statistic_chart_exp_view')">收款分析</el-menu-item>
    <el-menu-item index="menuitem42" @click="itemClick('#/app/view/payee_statistic_chart_exp_view_leader')">收款分析</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="menuitem6">
      <template #title>任务&活动</template>
    <el-menu-item index="menuitem27" @click="itemClick('#/app/view/task_my_todo_tab_search_view')">待办任务</el-menu-item>
    <el-menu-item index="menuitem30" @click="itemClick('#/app/view/task_my_maneuver_tab_search_view')">我的活动</el-menu-item>
    <el-menu-item index="menuitem29" @click="itemClick('#/app/view/task_my_all_tab_search_view')">我的全部任务</el-menu-item>
    <el-menu-item index="menuitem37" @click="itemClick('#/app/view/task_task_tree_exp_view')">全部任务</el-menu-item>
    <el-menu-item index="menuitem31" @click="itemClick('#/app/view/task_maneuver_tree_exp_view')">全部活动</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="menuitem7" @click="itemClick('#/app/view/event_tab_search_view')">会议</el-menu-item>
    <el-menu-item index="menuitem8" @click="itemClick('#/app/view/call_tab_search_view')">通话</el-menu-item>
    <el-menu-item index="menuitem3" @click="itemClick('#/app/view/contact_tab_search_view')">联系人</el-menu-item>
    <el-menu-item index="menuitem11" @click="itemClick('#/app/view/product_tab_search_view')">产品</el-menu-item>
    <el-sub-menu index="menuitem43">
      <template #title>报告</template>
    <el-menu-item index="menuitem39" @click="itemClick('#/app/view/weeklies_grid_view')">个人周报</el-menu-item>
    <el-menu-item index="menuitem40" @click="itemClick('#/app/view/work_progress_menu_grid_view')">工作进展</el-menu-item>
    <el-menu-item index="menuitem41" @click="itemClick('#/app/view/weeklies_grid_view_leader')">销售工作报告</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="menuitem9">
      <template #title>报表</template>
    <el-menu-item index="menuitem28" @click="itemClick('#/app/view/payee_statistic_chart_exp_view')">收款情况统计（导航）</el-menu-item>
    <el-menu-item index="menuitem22" @click="itemClick('#/app/view/payee_statistic_chart_exp_view')">收款情况统计</el-menu-item>
    <el-menu-item index="menuitem36" @click="itemClick('#/app/view/payee_statistic_chart_view')">收款情况统计</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="menuitem10" disabled>数据深度分析</el-menu-item>
    <el-menu-item index="menuitem12" @click="itemClick('#/app/view/quote_tab_search_view')">报价</el-menu-item>
    <el-menu-item index="menuitem13" @click="itemClick('#/app/view/sales_order_tab_search_view')">销售订单</el-menu-item>
    <el-menu-item index="menuitem20" @click="itemClick('#/app/view/purchase_order_tab_search_view')">采购订单</el-menu-item>
    <el-menu-item index="menuitem14" @click="itemClick('#/app/view/invoice_tab_search_view')">发货单</el-menu-item>
    <el-menu-item index="menuitem15" @click="itemClick('#/app/view/campaign_tab_search_view')">市场活动</el-menu-item>
    <el-menu-item index="menuitem16" @click="itemClick('#/app/view/vendor_tab_search_view')">供应商</el-menu-item>
    <el-menu-item index="menuitem17" @click="itemClick('#/app/view/price_book_tab_search_view')">价格表</el-menu-item>
    <el-menu-item index="menuitem18" @click="itemClick('#/app/view/service_case_tab_search_view')">服务支持</el-menu-item>
    <el-menu-item index="menuitem19" @click="itemClick('#/app/view/solution_tab_search_view')">解决方案</el-menu-item>
    <el-sub-menu index="menuitem24">
      <template #title>设置</template>
    <el-menu-item index="setting" @click="itemClick('#/app/view/user_setting_view')">个人设置</el-menu-item>
    <el-menu-item index="menuitem25" @click="itemClick('#/app/view/user_list_exp_view')">用户</el-menu-item>
    <el-menu-item index="menuitem38" @click="itemClick('#/app/view/deal_stage_grid_view')">阶段设置</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="menuitem21" @click="itemClick('#/app/view/task_portal_calendar_view')">测试</el-menu-item>
  </el-menu>
</el-row>


## 视图清单

|  中文名     |   代码名  |  视图标题 | 视图类型   |   备注  |
|  --------   |------------| -----------|  -----   |  -----   |
|[附件](app/view/account_attachment_view)|account_attachment_view|附件|实体编辑视图（部件视图）|自动生成|
|[客户](app/view/account_data_view_multimode)|account_data_view_multimode|客户|实体数据视图|自动生成|
|[客户编辑视图](app/view/account_edit_view)|account_edit_view|客户|实体编辑视图|系统自动添加|
|[客户](app/view/account_grid_view_multimode)|account_grid_view_multimode|客户|实体表格视图|自动生成|
|[客户](app/view/account_grid_view_relation)|account_grid_view_relation|客户|实体表格视图||
|[客户](app/view/account_list_view_multimode)|account_list_view_multimode|客户|实体列表视图|自动生成|
|[客户信息](app/view/account_main_view)|account_main_view|客户信息|实体编辑视图（左右关系）|自动生成|
|[合并编辑视图](app/view/account_marge_edit_view)|account_marge_edit_view|合并编辑视图|实体编辑视图||
|[进展评估](app/view/account_note_attach_view)|account_note_attach_view|进展评估|实体编辑视图（部件视图）|自动生成|
|[客户选择表格视图](app/view/account_pickup_grid_view)|account_pickup_grid_view|客户|实体选择表格视图（部件视图）|系统自动添加|
|[客户数据选择视图](app/view/account_pickup_view)|account_pickup_view|客户|实体数据选择视图|系统自动添加|
|[客户数据重定向视图](app/view/account_redirect_view)|account_redirect_view|客户|实体数据重定向视图|系统自动添加|
|[客户](app/view/account_tab_search_view)|account_tab_search_view|客户|实体分页搜索视图|自动生成|
|[客户信息](app/view/account_test_main_view)|account_test_main_view|客户信息|实体编辑视图（左右关系）||
|[客户](app/view/account_test_tab_search_view)|account_test_tab_search_view|客户|实体分页搜索视图|测试视图|
|[操作日志](app/view/activitiy_list_view)|activitiy_list_view|操作日志|实体列表视图||
|[时间轴](app/view/activitiy_time_line_view)|activitiy_time_line_view|时间轴|实体日历视图||
|[客户关系管理系统](app/view/app_index_view)|app_index_view|客户关系管理系统|应用首页视图||
|[应用登录视图](app/view/app_login_view)|app_login_view|应用登录视图|应用登录视图||
|[应用面板视图](app/view/app_panel_view)|app_panel_view|应用面板视图|应用面板视图||
|[我的工作台](app/view/app_portal_view)|app_portal_view|我的工作台|应用看板视图||
|[应用看板视图](app/view/app_portal_view2)|app_portal_view2|条形图看板|应用看板视图||
|[通话编辑视图](app/view/call_edit_view)|call_edit_view|通话|实体编辑视图|系统自动添加|
|[已完成的任务&历史活动（通话）](app/view/call_grid_close_view)|call_grid_close_view|已完成的任务&历史活动（通话）|实体表格视图||
|[待办任务（通话）](app/view/call_grid_not_close_view)|call_grid_not_close_view|待办任务（通话）|实体表格视图||
|[已完成的任务&历史活动（通话）](app/view/call_list_close_view)|call_list_close_view|已完成的任务&历史活动（通话）|实体列表视图||
|[待办任务](app/view/call_list_not_close_view)|call_list_not_close_view|待办任务|实体列表视图||
|[通话数据重定向视图](app/view/call_redirect_view)|call_redirect_view|通话|实体数据重定向视图|系统自动添加|
|[通话](app/view/call_simple_edit_view)|call_simple_edit_view|通话|实体选项操作视图||
|[通话](app/view/call_tab_search_view)|call_tab_search_view|通话|实体分页搜索视图|自动生成|
|[附件](app/view/campaign_attachment_view)|campaign_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[市场活动](app/view/campaign_data_view_multimode)|campaign_data_view_multimode|市场活动|实体数据视图|系统自动添加|
|[市场活动编辑视图](app/view/campaign_edit_view)|campaign_edit_view|市场活动|实体编辑视图|系统自动添加|
|[市场活动](app/view/campaign_grid_view_multimode)|campaign_grid_view_multimode|市场活动|实体表格视图|系统自动添加|
|[市场活动](app/view/campaign_list_view_multimode)|campaign_list_view_multimode|市场活动|实体列表视图|系统自动添加|
|[市场活动信息](app/view/campaign_main_view)|campaign_main_view|市场活动信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/campaign_note_attach_view)|campaign_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[市场活动](app/view/campaign_tab_search_view)|campaign_tab_search_view|市场活动|实体分页搜索视图|自动生成|
|[附件](app/view/contact_attachment_view)|contact_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[联系人](app/view/contact_data_view_multimode)|contact_data_view_multimode|联系人|实体数据视图|系统自动添加|
|[联系人编辑视图](app/view/contact_edit_view)|contact_edit_view|联系人|实体编辑视图|系统自动添加|
|[联系人](app/view/contact_grid_view_multimode)|contact_grid_view_multimode|联系人|实体表格视图|系统自动添加|
|[联系人](app/view/contact_grid_view_relation)|contact_grid_view_relation|联系人|实体表格视图||
|[联系人](app/view/contact_list_view_multimode)|contact_list_view_multimode|联系人|实体列表视图|系统自动添加|
|[联系人](app/view/contact_list_view_relation)|contact_list_view_relation|联系人|实体列表视图（部件视图）||
|[联系人信息](app/view/contact_main_view)|contact_main_view|联系人信息|实体编辑视图（左右关系）|系统自动添加|
|[进展评估](app/view/contact_note_attach_view)|contact_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[联系人选择表格视图](app/view/contact_pickup_grid_view)|contact_pickup_grid_view|联系人|实体选择表格视图（部件视图）|系统自动添加|
|[联系人数据选择视图](app/view/contact_pickup_view)|contact_pickup_view|联系人|实体数据选择视图|系统自动添加|
|[联系人](app/view/contact_tab_search_view)|contact_tab_search_view|联系人|实体分页搜索视图|自动生成|
|[联系人层级](app/view/contact_tree_view_level)|contact_tree_view_level|联系人层级|实体树视图||
|[链接表格视图](app/view/custom_button_grid_view)|custom_button_grid_view|链接|实体表格视图|系统自动添加|
|[创建链接](app/view/custom_button_option_view)|custom_button_option_view|创建链接|实体选项操作视图||
|[附件](app/view/deal_attachment_view)|deal_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[商机多模式图表表格导航视图](app/view/deal_chart_grid_view_multimode)|deal_chart_grid_view_multimode|商机多模式图表表格导航视图|实体图表导航视图||
|[商机](app/view/deal_data_view_multimode)|deal_data_view_multimode|商机|实体数据视图|系统自动添加|
|[商机编辑视图](app/view/deal_edit_view)|deal_edit_view|商机|实体编辑视图|系统自动添加|
|[商机编辑视图](app/view/deal_edit_view_origin)|deal_edit_view_origin|商机|实体编辑视图|系统自动添加|
|[商机](app/view/deal_exp_grid_view)|deal_exp_grid_view|商机|实体表格视图||
|[商机](app/view/deal_grid_view_multimode)|deal_grid_view_multimode|商机|实体表格视图|系统自动添加|
|[商机](app/view/deal_grid_view_relation)|deal_grid_view_relation|商机|实体表格视图||
|[阶段历史](app/view/deal_history_deal_deal_his_grid_view)|deal_history_deal_deal_his_grid_view|阶段历史|实体表格视图||
|[阶段历史编辑视图](app/view/deal_history_edit_view)|deal_history_edit_view|阶段历史|实体编辑视图|系统自动添加|
|[阶段历史数据重定向视图](app/view/deal_history_redirect_view)|deal_history_redirect_view|阶段历史|实体数据重定向视图|系统自动添加|
|[商机](app/view/deal_list_view_multimode)|deal_list_view_multimode|商机|实体列表视图|系统自动添加|
|[商机](app/view/deal_list_view_relation)|deal_list_view_relation|商机|实体列表视图（部件视图）||
|[商机数据多项选择视图](app/view/deal_m_pickup_view)|deal_m_pickup_view|商机|实体数据多项选择视图||
|[商机信息](app/view/deal_main_view)|deal_main_view|商机信息|实体编辑视图（左右关系）|系统自动添加|
|[进展评估](app/view/deal_note_attach_view)|deal_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[商机选择表格视图](app/view/deal_pickup_grid_view)|deal_pickup_grid_view|商机|实体选择表格视图（部件视图）|系统自动添加|
|[商机数据重定向视图](app/view/deal_redirect_view)|deal_redirect_view|商机|实体数据重定向视图|系统自动添加|
|[阶段维护](app/view/deal_stage_edit_view)|deal_stage_edit_view|阶段维护|实体编辑视图||
|[阶段管理](app/view/deal_stage_grid_view)|deal_stage_grid_view|阶段管理|实体表格视图||
|[商机阶段选择表格视图](app/view/deal_stage_pickup_grid_view)|deal_stage_pickup_grid_view|商机阶段|实体选择表格视图（部件视图）|系统自动添加|
|[商机阶段数据选择视图](app/view/deal_stage_pickup_view)|deal_stage_pickup_view|商机阶段|实体数据选择视图|系统自动添加|
|[工作台商机分页导航视图](app/view/deal_tab_exp_view)|deal_tab_exp_view|商机|实体分页导航视图||
|[商机](app/view/deal_tab_search_view)|deal_tab_search_view|商机|实体分页搜索视图|自动生成|
|[已完成的任务&历史活动](app/view/deal_task_list_view)|deal_task_list_view|已完成的任务&历史活动|实体列表视图||
|[商机](app/view/deal_tree_exp_view)|deal_tree_exp_view|商机|实体树导航视图||
|[商机](app/view/deal_weeklies_edit_view)|deal_weeklies_edit_view|商机|实体编辑视图||
|[会议编辑视图](app/view/event_edit_view)|event_edit_view|会议|实体编辑视图|系统自动添加|
|[已完成的任务&历史活动（会议）](app/view/event_grid_close_view)|event_grid_close_view|已完成的任务&历史活动（会议）|实体表格视图||
|[待办任务（会议）](app/view/event_grid_not_close_view)|event_grid_not_close_view|待办任务（会议）|实体表格视图||
|[已邀请的会议](app/view/event_invited_view)|event_invited_view|已邀请的会议|实体表格视图||
|[已完成的任务&历史活动（会议）](app/view/event_list_close_view)|event_list_close_view|已完成的任务&历史活动（会议）|实体列表视图||
|[待办任务（会议）](app/view/event_list_not_close_view)|event_list_not_close_view|待办任务（会议）|实体列表视图||
|[会议数据重定向视图](app/view/event_redirect_view)|event_redirect_view|会议|实体数据重定向视图|系统自动添加|
|[会议](app/view/event_simple_edit_view)|event_simple_edit_view|会议|实体选项操作视图||
|[会议](app/view/event_tab_search_view)|event_tab_search_view|会议|实体分页搜索视图|自动生成|
|[附件](app/view/invoice_attachment_view)|invoice_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[发货单](app/view/invoice_data_view_multimode)|invoice_data_view_multimode|发货单|实体数据视图|系统自动添加|
|[发货单编辑视图](app/view/invoice_edit_view)|invoice_edit_view|发货单|实体编辑视图|系统自动添加|
|[发货单](app/view/invoice_grid_view_multimode)|invoice_grid_view_multimode|发货单|实体表格视图|系统自动添加|
|[发货单](app/view/invoice_list_view_multimode)|invoice_list_view_multimode|发货单|实体列表视图|系统自动添加|
|[发货单信息](app/view/invoice_main_view)|invoice_main_view|发货单信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/invoice_note_attach_view)|invoice_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[发货单](app/view/invoice_tab_search_view)|invoice_tab_search_view|发货单|实体分页搜索视图|自动生成|
|[附件](app/view/lead_attachment_view)|lead_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[线索](app/view/lead_data_view_multimode)|lead_data_view_multimode|线索|实体数据视图|系统自动添加|
|[线索编辑视图](app/view/lead_edit_view)|lead_edit_view|线索|实体编辑视图|系统自动添加|
|[线索](app/view/lead_grid_view_multimode)|lead_grid_view_multimode|线索|实体表格视图|系统自动添加|
|[线索](app/view/lead_grid_view_relation)|lead_grid_view_relation|线索|实体表格视图||
|[线索编辑视图](app/view/lead_lead_edit_view)|lead_lead_edit_view|线索|实体编辑视图|系统自动添加|
|[线索](app/view/lead_list_view_multimode)|lead_list_view_multimode|线索|实体列表视图|系统自动添加|
|[线索信息](app/view/lead_main_view)|lead_main_view|线索信息|实体编辑视图（左右关系）|系统自动添加|
|[进展评估](app/view/lead_note_attach_view)|lead_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[线索选择表格视图](app/view/lead_pickup_grid_view)|lead_pickup_grid_view|线索|实体选择表格视图（部件视图）|系统自动添加|
|[线索数据选择视图](app/view/lead_pickup_view)|lead_pickup_view|线索|实体数据选择视图|系统自动添加|
|[线索](app/view/lead_tab_search_view)|lead_tab_search_view|线索|实体分页搜索视图|自动生成|
|[已完成的任务&历史活动](app/view/lead_task_list_view)|lead_task_list_view|已完成的任务&历史活动|实体列表视图||
|[线索树表格视图](app/view/lead_tree_grid_view)|lead_tree_grid_view|线索树表格视图|实体树表格视图||
|[线索](app/view/lead_weeklies_edit_view)|lead_weeklies_edit_view|线索|实体编辑视图||
|[进展评估](app/view/note_attach_common_edit_view)|note_attach_common_edit_view|进展评估|实体编辑视图||
|[备注列表视图](app/view/note_attach_list_view)|note_attach_list_view|进展评估|实体列表视图|系统自动添加|
|[进展评估](app/view/note_attach_option_view)|note_attach_option_view|进展评估|实体选项操作视图||
|[进展评估](app/view/note_attach_weeklies_edit_view)|note_attach_weeklies_edit_view|进展评估|实体编辑视图||
|[进展情况](app/view/note_attach_work_edit_view)|note_attach_work_edit_view|进展情况|实体编辑视图|系统自动添加|
|[收付款编辑视图](app/view/payee_edit_view)|payee_edit_view|收款记录|实体编辑视图|系统自动添加|
|[收款记录](app/view/payee_grid_view)|payee_grid_view|收款记录|实体表格视图||
|[收付款表格视图](app/view/payee_grid_view2)|payee_grid_view2|收款记录|实体表格视图||
|[收付款](app/view/payee_grid_view_multimode)|payee_grid_view_multimode|收付款|实体表格视图|系统自动添加|
|[收款记录表格编辑视图](app/view/payee_multimode_edit_view)|payee_multimode_edit_view|收款记录表格编辑视图|实体编辑视图||
|[收付款编辑视图](app/view/payee_payee_edit_view)|payee_payee_edit_view|收款记录|实体编辑视图|系统自动添加|
|[收款计划编辑视图](app/view/payee_plan_edit_view)|payee_plan_edit_view|收款计划|实体编辑视图|系统自动添加|
|[收款计划](app/view/payee_plan_grid_view)|payee_plan_grid_view|收款计划|实体表格视图||
|[收款计划表格视图](app/view/payee_plan_grid_view2)|payee_plan_grid_view2|收款计划|实体表格视图||
|[收款计划](app/view/payee_plan_grid_view_multimode)|payee_plan_grid_view_multimode|收款计划|实体表格视图|系统自动添加|
|[收款计划编辑视图](app/view/payee_plan_multimode_edit_view)|payee_plan_multimode_edit_view|收款计划编辑视图|实体编辑视图||
|[收款计划编辑视图](app/view/payee_plan_payee_plan_edit_view)|payee_plan_payee_plan_edit_view|收款计划|实体编辑视图|系统自动添加|
|[收款计划选择表格视图](app/view/payee_plan_pickup_grid_view)|payee_plan_pickup_grid_view|收款计划|实体选择表格视图（部件视图）|系统自动添加|
|[收款计划数据选择视图](app/view/payee_plan_pickup_view)|payee_plan_pickup_view|收款计划|实体数据选择视图|系统自动添加|
|[收款计划数据重定向视图](app/view/payee_plan_redirect_view)|payee_plan_redirect_view|收款计划|实体数据重定向视图|系统自动添加|
|[计划反查表格](app/view/payee_plan_reverse_grid_view)|payee_plan_reverse_grid_view|计划反查表格|实体表格视图||
|[收款计划](app/view/payee_plan_tab_search_view)|payee_plan_tab_search_view|收款计划|实体分页搜索视图|自动生成|
|[收付款数据重定向视图](app/view/payee_redirect_view)|payee_redirect_view|收款记录|实体数据重定向视图|系统自动添加|
|[收款统计图表导航视图](app/view/payee_statistic_chart_exp_view)|payee_statistic_chart_exp_view|收款统计|实体图表导航视图||
|[收款统计](app/view/payee_statistic_chart_exp_view_leader)|payee_statistic_chart_exp_view_leader|收款统计|实体图表导航视图||
|[收款统计](app/view/payee_statistic_chart_grid_view)|payee_statistic_chart_grid_view|收款统计表格|实体表格视图||
|[收款情况统计](app/view/payee_statistic_chart_view)|payee_statistic_chart_view|收款情况统计|实体图表视图||
|[收款情况统计编辑视图](app/view/payee_statistic_edit_view)|payee_statistic_edit_view|收款情况统计|实体编辑视图|系统自动添加|
|[统计看板](app/view/payee_statistic_kanban_view)|payee_statistic_kanban_view|统计看板|实体看板视图||
|[计划/记录重定向视图](app/view/payee_statistic_redirect_view)|payee_statistic_redirect_view|计划/记录重定向视图|实体数据重定向视图||
|[计划/记录重定向视图](app/view/payee_statistic_redirect_view)|payee_statistic_redirect_view|计划/记录重定向视图|实体数据重定向视图||
|[收款记录](app/view/payee_tab_search_view)|payee_tab_search_view|收款记录|实体分页搜索视图|自动生成|
|[记录反查表格](app/view/payee_usr06216630_grid_view)|payee_usr06216630_grid_view|记录反查表格|实体表格视图||
|[收款记录](app/view/payee_wizard_view)|payee_wizard_view|收款记录|实体向导视图||
|[附件](app/view/price_book_attachment_view)|price_book_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[价格表](app/view/price_book_data_view_multimode)|price_book_data_view_multimode|价格表|实体数据视图|系统自动添加|
|[价格表编辑视图](app/view/price_book_edit_view)|price_book_edit_view|价格表|实体编辑视图|系统自动添加|
|[价格表](app/view/price_book_grid_view_multimode)|price_book_grid_view_multimode|价格表|实体表格视图|系统自动添加|
|[价格表](app/view/price_book_list_view_multimode)|price_book_list_view_multimode|价格表|实体列表视图|系统自动添加|
|[价格表信息](app/view/price_book_main_view)|price_book_main_view|价格表信息|实体编辑视图（左右关系）|系统自动添加|
|[进展评估](app/view/price_book_note_attach_view)|price_book_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[价格表](app/view/price_book_tab_search_view)|price_book_tab_search_view|价格表|实体分页搜索视图|自动生成|
|[附件](app/view/product_attachment_view)|product_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[附件](app/view/product_certificate_attachment_view)|product_certificate_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[产品证书编辑视图](app/view/product_certificate_edit_view)|product_certificate_edit_view|产品证书|实体编辑视图|系统自动添加|
|[产品证书表格视图](app/view/product_certificate_grid_view)|product_certificate_grid_view|产品证书|实体表格视图|系统自动添加|
|[产品证书信息](app/view/product_certificate_main_view)|product_certificate_main_view|产品证书信息|实体编辑视图（左右关系）|系统自动添加|
|[产品](app/view/product_data_view_multimode)|product_data_view_multimode|产品|实体数据视图|系统自动添加|
|[产品编辑视图](app/view/product_edit_view)|product_edit_view|产品|实体编辑视图|系统自动添加|
|[产品](app/view/product_grid_view_multimode)|product_grid_view_multimode|产品|实体表格视图|系统自动添加|
|[关联商品](app/view/product_grid_view_relation)|product_grid_view_relation|关联商品|实体表格视图||
|[产品](app/view/product_list_view_multimode)|product_list_view_multimode|产品|实体列表视图|系统自动添加|
|[产品数据多项选择视图](app/view/product_m_pickup_view)|product_m_pickup_view|产品|实体数据多项选择视图|系统自动添加|
|[产品信息](app/view/product_main_view)|product_main_view|产品信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/product_note_attach_view)|product_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[产品选择表格视图](app/view/product_pickup_grid_view)|product_pickup_grid_view|产品|实体选择表格视图（部件视图）|系统自动添加|
|[产品编辑视图](app/view/product_product_edit_view)|product_product_edit_view|产品|实体编辑视图|系统自动添加|
|[产品数据重定向视图](app/view/product_redirect_view)|product_redirect_view|产品|实体数据重定向视图|系统自动添加|
|[产品](app/view/product_tab_search_view)|product_tab_search_view|产品|实体分页搜索视图|自动生成|
|[附件](app/view/project_attachment_view)|project_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[签单情况统计](app/view/project_chart_exp_view)|project_chart_exp_view|签单情况统计|实体图表导航视图||
|[订单编辑视图](app/view/project_edit_view)|project_edit_view|订单|实体编辑视图|系统自动添加|
|[订单编辑视图](app/view/project_edit_view3)|project_edit_view3|订单|实体编辑视图|系统自动添加|
|[订单表格视图](app/view/project_grid_view)|project_grid_view|订单|实体表格视图|系统自动添加|
|[订单](app/view/project_grid_view_multimode)|project_grid_view_multimode|订单|实体表格视图|系统自动添加|
|[订单信息](app/view/project_main_view)|project_main_view|订单信息|实体编辑视图（左右关系）|系统自动添加|
|[进展评估](app/view/project_note_attach_view)|project_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[签单分析](app/view/project_order_analysis_grid_view)|project_order_analysis_grid_view|签单分析|实体表格视图||
|[订单选择表格视图](app/view/project_pickup_grid_view)|project_pickup_grid_view|订单|实体选择表格视图（部件视图）|系统自动添加|
|[订单数据选择视图](app/view/project_pickup_view)|project_pickup_view|订单|实体数据选择视图|系统自动添加|
|[订单详情收款计划和记录](app/view/project_pro_pay_and_plan_edit_view)|project_pro_pay_and_plan_edit_view|订单详情收款计划和记录|实体编辑视图||
|[订单数据重定向视图](app/view/project_redirect_view)|project_redirect_view|订单|实体数据重定向视图|系统自动添加|
|[订单](app/view/project_tab_search_view)|project_tab_search_view|订单|实体分页搜索视图|自动生成|
|[订单](app/view/project_tree_grid_view)|project_tree_grid_view|订单|实体树表格视图||
|[附件](app/view/purchase_order_attachment_view)|purchase_order_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[采购订单](app/view/purchase_order_data_view_multimode)|purchase_order_data_view_multimode|采购订单|实体数据视图|系统自动添加|
|[采购订单编辑视图](app/view/purchase_order_edit_view)|purchase_order_edit_view|采购订单|实体编辑视图|系统自动添加|
|[采购订单](app/view/purchase_order_grid_view_multimode)|purchase_order_grid_view_multimode|采购订单|实体表格视图|系统自动添加|
|[采购订单](app/view/purchase_order_list_view_multimode)|purchase_order_list_view_multimode|采购订单|实体列表视图|系统自动添加|
|[采购订单信息](app/view/purchase_order_main_view)|purchase_order_main_view|采购订单信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/purchase_order_note_attach_view)|purchase_order_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[采购订单](app/view/purchase_order_tab_search_view)|purchase_order_tab_search_view|采购订单|实体分页搜索视图|自动生成|
|[附件](app/view/quote_attachment_view)|quote_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[报价](app/view/quote_data_view_multimode)|quote_data_view_multimode|报价|实体数据视图|系统自动添加|
|[报价编辑视图](app/view/quote_edit_view)|quote_edit_view|报价|实体编辑视图|系统自动添加|
|[报价](app/view/quote_grid_view_multimode)|quote_grid_view_multimode|报价|实体表格视图|系统自动添加|
|[报价](app/view/quote_list_view_multimode)|quote_list_view_multimode|报价|实体列表视图|系统自动添加|
|[报价信息](app/view/quote_main_view)|quote_main_view|报价信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/quote_note_attach_view)|quote_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[报价](app/view/quote_tab_search_view)|quote_tab_search_view|报价|实体分页搜索视图|自动生成|
|[预留编辑视图](app/view/reservation_edit_view)|reservation_edit_view|预留|实体编辑视图|系统自动添加|
|[附件](app/view/sales_order_attachment_view)|sales_order_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[销售订单](app/view/sales_order_data_view_multimode)|sales_order_data_view_multimode|销售订单|实体数据视图|系统自动添加|
|[销售订单编辑视图](app/view/sales_order_edit_view)|sales_order_edit_view|销售订单|实体编辑视图|系统自动添加|
|[销售订单](app/view/sales_order_grid_view_multimode)|sales_order_grid_view_multimode|销售订单|实体表格视图|系统自动添加|
|[销售订单](app/view/sales_order_list_view_multimode)|sales_order_list_view_multimode|销售订单|实体列表视图|系统自动添加|
|[销售订单信息](app/view/sales_order_main_view)|sales_order_main_view|销售订单信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/sales_order_note_attach_view)|sales_order_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[销售订单](app/view/sales_order_tab_search_view)|sales_order_tab_search_view|销售订单|实体分页搜索视图|自动生成|
|[历史活动](app/view/schedule_close_tab_exp_view9)|schedule_close_tab_exp_view9|历史活动|实体分页导航视图（部件视图）||
|[已完成的任务](app/view/schedule_close_tab_exp_view91)|schedule_close_tab_exp_view91|已完成的任务|实体分页导航视图（部件视图）||
|[已完成的任务&历史活动](app/view/schedule_close_tab_lists_exp_view_multimode)|schedule_close_tab_lists_exp_view_multimode|已完成的任务&历史活动|实体分页导航视图（部件视图）||
|[已完成的任务&历史活动](app/view/schedule_close_tab_tabs_exp_view1_multimode)|schedule_close_tab_tabs_exp_view1_multimode|已完成的任务|实体分页导航视图（部件视图）|系统自动添加|
|[历史活动](app/view/schedule_close_tab_tabs_exp_view_multimode)|schedule_close_tab_tabs_exp_view_multimode|历史活动|实体分页导航视图（部件视图）||
|[已完成的任务&历史活动](app/view/schedule_close_view)|schedule_close_view|已完成的任务&历史活动|实体表格视图|系统自动添加|
|[日程编辑视图](app/view/schedule_edit_view)|schedule_edit_view|日程|实体编辑视图|系统自动添加|
|[日程索引关系选择数据视图](app/view/schedule_index_pickup_dataview)|schedule_index_pickup_dataview|日程|实体索引关系选择数据视图（部件视图）|系统自动添加|
|[日程数据选择视图](app/view/schedule_index_pickup_view)|schedule_index_pickup_view|日程|实体数据选择视图|系统自动添加|
|[待办任务](app/view/schedule_not_close_tab_exp_view9)|schedule_not_close_tab_exp_view9|待办任务|实体分页导航视图（部件视图）||
|[待办任务](app/view/schedule_not_close_tab_lists_exp_view_multimode)|schedule_not_close_tab_lists_exp_view_multimode|待办任务|实体分页导航视图（部件视图）||
|[待办任务](app/view/schedule_not_close_tab_tabs_exp_view_multimode)|schedule_not_close_tab_tabs_exp_view_multimode|待办任务|实体分页导航视图（部件视图）||
|[待办任务](app/view/schedule_not_close_view)|schedule_not_close_view|待办任务|实体表格视图||
|[日程数据重定向视图](app/view/schedule_redirect_view)|schedule_redirect_view|日程|实体数据重定向视图|系统自动添加|
|[附件](app/view/service_case_attachment_view)|service_case_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[服务支持](app/view/service_case_data_view_multimode)|service_case_data_view_multimode|服务支持|实体数据视图|系统自动添加|
|[服务支持编辑视图](app/view/service_case_edit_view)|service_case_edit_view|服务支持|实体编辑视图|系统自动添加|
|[服务支持](app/view/service_case_grid_view_multimode)|service_case_grid_view_multimode|服务支持|实体表格视图|系统自动添加|
|[服务支持](app/view/service_case_list_view_multimode)|service_case_list_view_multimode|服务支持|实体列表视图|系统自动添加|
|[服务支持信息](app/view/service_case_main_view)|service_case_main_view|服务支持信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/service_case_note_attach_view)|service_case_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[服务支持](app/view/service_case_tab_search_view)|service_case_tab_search_view|服务支持|实体分页搜索视图|自动生成|
|[附件](app/view/solution_attachment_view)|solution_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[解决方案](app/view/solution_data_view_multimode)|solution_data_view_multimode|解决方案|实体数据视图|系统自动添加|
|[解决方案编辑视图](app/view/solution_edit_view)|solution_edit_view|解决方案|实体编辑视图|系统自动添加|
|[解决方案](app/view/solution_grid_view_multimode)|solution_grid_view_multimode|解决方案|实体表格视图|系统自动添加|
|[解决方案](app/view/solution_list_view_multimode)|solution_list_view_multimode|解决方案|实体列表视图|系统自动添加|
|[解决方案信息](app/view/solution_main_view)|solution_main_view|解决方案信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/solution_note_attach_view)|solution_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[解决方案](app/view/solution_tab_search_view)|solution_tab_search_view|解决方案|实体分页搜索视图|自动生成|
|[添加标签](app/view/tag_add_tag)|tag_add_tag|添加标签|实体选项操作视图||
|[添加标签](app/view/tag_mgr_edit_view)|tag_mgr_edit_view|添加标签|实体选项操作视图||
|[标签管理](app/view/tag_mgr_grid_view)|tag_mgr_grid_view|标签管理|实体表格视图||
|[移除标签](app/view/tag_remove_tag)|tag_remove_tag|移除标签|实体选项操作视图||
|[全部活动](app/view/task_all_maneuver_grid_view)|task_all_maneuver_grid_view|全部活动|实体表格视图|系统自动添加|
|[全部活动](app/view/task_all_maneuver_tab_search_view)|task_all_maneuver_tab_search_view|全部活动|实体分页搜索视图|系统自动添加|
|[全部任务](app/view/task_all_task_grid_view)|task_all_task_grid_view|全部任务|实体表格视图||
|[全部任务](app/view/task_all_task_kanban_view)|task_all_task_kanban_view|全部任务|实体看板视图||
|[全部任务](app/view/task_all_task_tab_search_view)|task_all_task_tab_search_view|全部任务|实体分页搜索视图||
|[附件](app/view/task_attachment_view)|task_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[批创建](app/view/task_batch_create_view)|task_batch_create_view|批创建|实体选项操作视图||
|[任务](app/view/task_data_view_multimode)|task_data_view_multimode|任务|实体数据视图|自动生成|
|[deal_re_mpick_up_view](app/view/task_deal_re_mpick_up_view)|task_deal_re_mpick_up_view|任务&活动|实体多项数据选择视图（左右关系）||
|[任务活动多项数据选择视图_选择数据视图(商机)](app/view/task_deal_re_mpick_up_view_pickup_grid_view)|task_deal_re_mpick_up_view_pickup_grid_view|任务&活动|实体选择表格视图（部件视图）||
|[任务编辑视图](app/view/task_edit_view)|task_edit_view|任务&活动|实体编辑视图|系统自动添加|
|[已完成的任务](app/view/task_grid_close_view)|task_grid_close_view|已完成的任务|实体表格视图||
|[历史活动](app/view/task_grid_maneuver_close_view)|task_grid_maneuver_close_view|历史活动|实体表格视图||
|[待办任务（任务）](app/view/task_grid_not_close_view)|task_grid_not_close_view|待办任务（任务）|实体表格视图||
|[任务](app/view/task_grid_view_multimode)|task_grid_view_multimode|任务|实体表格视图|系统自动添加|
|[活动与任务](app/view/task_index_view)|task_index_view|活动与任务|应用首页视图||
|[lead_re_mpick_up_view](app/view/task_lead_re_mpick_up_view)|task_lead_re_mpick_up_view|任务&活动|实体多项数据选择视图（左右关系）||
|[任务活动多项数据选择视图_选择数据视图(线索)](app/view/task_lead_re_mpick_up_view_pickup_grid_view)|task_lead_re_mpick_up_view_pickup_grid_view|任务&活动|实体选择表格视图（部件视图）||
|[已完成的任务&历史活动（任务）](app/view/task_list_close_view)|task_list_close_view|已完成的任务&历史活动（任务）|实体列表视图||
|[待办任务（任务）](app/view/task_list_not_close_view)|task_list_not_close_view|待办任务（任务）|实体列表视图||
|[下一个活动](app/view/task_list_view_relation)|task_list_view_relation|下一个活动|实体列表视图（部件视图）||
|[任务信息](app/view/task_main_view)|task_main_view|任务信息|实体编辑视图（左右关系）|自动生成|
|[活动](app/view/task_maneuver_edit_view_for_weekly)|task_maneuver_edit_view_for_weekly|活动|实体编辑视图||
|[全部活动](app/view/task_maneuver_kanban_view)|task_maneuver_kanban_view|全部活动|实体看板视图||
|[活动信息](app/view/task_maneuver_main_view)|task_maneuver_main_view|活动信息|实体编辑视图（左右关系）|系统自动添加|
|[全部活动](app/view/task_maneuver_tree_exp_view)|task_maneuver_tree_exp_view|全部活动|实体树导航视图||
|[我的活动看板视图](app/view/task_my_activity_kanban_view)|task_my_activity_kanban_view|任务&活动|实体看板视图||
|[我的全部任务](app/view/task_my_all_grid_view)|task_my_all_grid_view|我的全部任务|实体表格视图||
|[我的全部任务](app/view/task_my_all_tab_search_view)|task_my_all_tab_search_view|我的全部任务|实体分页搜索视图||
|[我得全部任务看板](app/view/task_my_all_task_kanban_view)|task_my_all_task_kanban_view|我得全部任务|实体看板视图||
|[已取消任务](app/view/task_my_cancelled_grid_view)|task_my_cancelled_grid_view|已取消任务|实体表格视图||
|[已取消的任务](app/view/task_my_cancelled_tab_search_view)|task_my_cancelled_tab_search_view|已取消的任务|实体分页搜索视图||
|[已完成的任务](app/view/task_my_done_grid_view)|task_my_done_grid_view|已完成的任务|实体表格视图||
|[已完成的任务](app/view/task_my_done_tab_search_view)|task_my_done_tab_search_view|已完成的任务|实体分页搜索视图||
|[我的活动](app/view/task_my_maneuver_grid_view)|task_my_maneuver_grid_view|我的活动|实体表格视图||
|[我的活动](app/view/task_my_maneuver_tab_search_view)|task_my_maneuver_tab_search_view|我的活动|实体分页搜索视图||
|[待办任务](app/view/task_my_todo_grid_view)|task_my_todo_grid_view|待办任务|实体表格视图||
|[待办任务](app/view/task_my_todo_tab_search_view)|task_my_todo_tab_search_view|待办任务|实体分页搜索视图||
|[追踪中的任务](app/view/task_my_tracing_grid_view)|task_my_tracing_grid_view|追踪中的任务|实体表格视图||
|[本周活动](app/view/task_my_weekend_act)|task_my_weekend_act|本周活动|实体表格视图||
|[进展评估](app/view/task_note_attach_view)|task_note_attach_view|进展评估|实体编辑视图（部件视图）|系统自动添加|
|[进展情况](app/view/task_note_condition_view)|task_note_condition_view|进展情况|实体编辑视图（部件视图）|系统自动添加|
|[我的本周活动](app/view/task_portal_calendar_view)|task_portal_calendar_view|我的本周活动|实体日历视图||
|[门户_我的待办任务](app/view/task_portal_my_todo_grid_view)|task_portal_my_todo_grid_view|门户_我的待办任务|实体表格视图||
|[门户_我的本周活动](app/view/task_portal_my_weekend_act_grid_view)|task_portal_my_weekend_act_grid_view|门户_我的本周活动|实体表格视图||
|[re_mpick_up_view](app/view/task_re_mpick_up_view)|task_re_mpick_up_view|任务&活动|实体多项数据选择视图（左右关系）||
|[任务活动多项数据选择视图_选择数据视图](app/view/task_re_mpick_up_view_pickup_grid_view)|task_re_mpick_up_view_pickup_grid_view|任务&活动|实体选择表格视图（部件视图）||
|[任务数据重定向视图](app/view/task_redirect_view)|task_redirect_view|任务&活动|实体数据重定向视图|系统自动添加|
|[销售报告](app/view/task_report_view)|task_report_view|销售报告|实体编辑视图（上下关系）||
|[任务](app/view/task_simple_edit_view)|task_simple_edit_view|任务|实体选项操作视图||
|[任务&活动](app/view/task_tab_search_view)|task_tab_search_view|任务&活动|实体分页搜索视图|自动生成|
|[已完成的任务&历史活动](app/view/task_task_act_list_view)|task_task_act_list_view|已完成的任务&历史活动|实体列表视图||
|[任务编辑视图](app/view/task_task_edit_view)|task_task_edit_view|任务|实体编辑视图|自动生成|
|[任务](app/view/task_task_edit_view_for_weekly)|task_task_edit_view_for_weekly|任务|实体编辑视图||
|[任务看板](app/view/task_task_kanban_view)|task_task_kanban_view|任务&活动|实体看板视图||
|[全部任务](app/view/task_task_tree_exp_view)|task_task_tree_exp_view|全部任务|实体树导航视图||
|[活动编辑视图](app/view/task_the_maneuver_edit_view)|task_the_maneuver_edit_view|活动|实体编辑视图||
|[待办任务看板视图](app/view/task_todo_task_kanban_view)|task_todo_task_kanban_view|待办任务看板视图|实体看板视图||
|[任务](app/view/task_weeklies_edit_view)|task_weeklies_edit_view|任务|实体编辑视图||
|[销售周报](app/view/task_weekly_custom_view)|task_weekly_custom_view|销售周报|实体自定义视图||
|[新建任务](app/view/task_weekly_task_edit_view)|task_weekly_task_edit_view|新建任务|实体编辑视图||
|[工作](app/view/task_work_report_edit_view)|task_work_report_edit_view|工作|实体编辑视图|系统自动添加|
|[任务编辑视图](app/view/task_work_task_edit_view)|task_work_task_edit_view|工作|实体编辑视图|系统自动添加|
|[工作信息](app/view/task_work_task_main_view)|task_work_task_main_view|工作信息|实体编辑视图（左右关系）|系统自动添加|
|[个人实时绩效情况](app/view/user_custom_view)|user_custom_view|个人实时绩效情况|实体自定义视图||
|[用户编辑视图](app/view/user_edit_view)|user_edit_view|用户|实体编辑视图|系统自动添加|
|[关联销售人员](app/view/user_grid_view_relation)|user_grid_view_relation|关联销售人员|实体表格视图||
|[个人信息编辑](app/view/user_info_edit_view)|user_info_edit_view|个人信息编辑|实体编辑视图||
|[个人详情信息](app/view/user_info_view)|user_info_view|个人详情信息|实体编辑视图||
|[个人详情信息](app/view/user_info_view_work)|user_info_view_work|个人详情信息|实体编辑视图|系统自动添加|
|[用户管理](app/view/user_list_exp_view)|user_list_exp_view|用户管理|实体列表导航视图||
|[用户数据多项选择视图](app/view/user_m_pickup_view)|user_m_pickup_view|用户|实体数据多项选择视图|系统自动添加|
|[个人信息编辑](app/view/user_option_view)|user_option_view|个人信息编辑|实体选项操作视图||
|[密码变更](app/view/user_password_edit_view)|user_password_edit_view|密码变更|实体编辑视图||
|[用户选择表格视图](app/view/user_pickup_grid_view)|user_pickup_grid_view|用户|实体选择表格视图（部件视图）|系统自动添加|
|[用户数据选择视图](app/view/user_pickup_view)|user_pickup_view|用户|实体数据选择视图|系统自动添加|
|[新建用户](app/view/user_quick_new_view)|user_quick_new_view|新建用户|实体编辑视图||
|[用户数据重定向视图](app/view/user_redirect_view)|user_redirect_view|用户|实体数据重定向视图|系统自动添加|
|[个人信息设置](app/view/user_setting_view)|user_setting_view|个人信息设置|实体编辑视图（左右关系）||
|[tab_exp_view](app/view/user_tab_exp_view)|user_tab_exp_view|tab_exp_view|实体分页导航视图||
|[个人信息编辑](app/view/user_work_user_option_view)|user_work_user_option_view|个人信息编辑|实体选项操作视图|系统自动添加|
|[附件](app/view/vendor_attachment_view)|vendor_attachment_view|附件|实体编辑视图（部件视图）|系统自动添加|
|[供应商](app/view/vendor_data_view_multimode)|vendor_data_view_multimode|供应商|实体数据视图|系统自动添加|
|[供应商编辑视图](app/view/vendor_edit_view)|vendor_edit_view|供应商|实体编辑视图|系统自动添加|
|[供应商](app/view/vendor_grid_view_multimode)|vendor_grid_view_multimode|供应商|实体表格视图|系统自动添加|
|[供应商](app/view/vendor_list_view_multimode)|vendor_list_view_multimode|供应商|实体列表视图|系统自动添加|
|[供应商信息](app/view/vendor_main_view)|vendor_main_view|供应商信息|实体编辑视图（左右关系）|系统自动添加|
|[备注](app/view/vendor_note_attach_view)|vendor_note_attach_view|备注|实体编辑视图（部件视图）|系统自动添加|
|[供应商选择表格视图](app/view/vendor_pickup_grid_view)|vendor_pickup_grid_view|供应商|实体选择表格视图（部件视图）|系统自动添加|
|[供应商数据选择视图](app/view/vendor_pickup_view)|vendor_pickup_view|供应商|实体数据选择视图|系统自动添加|
|[供应商](app/view/vendor_tab_search_view)|vendor_tab_search_view|供应商|实体分页搜索视图|自动生成|
|[周报编辑视图](app/view/weeklies_edit_view)|weeklies_edit_view|周报|实体编辑视图|系统自动添加|
|[销售工作报告详情](app/view/weeklies_edit_view_leader)|weeklies_edit_view_leader|销售工作报告详情|实体编辑视图||
|[周报表格视图](app/view/weeklies_grid_view)|weeklies_grid_view|周报|实体表格视图||
|[销售工作报告](app/view/weeklies_grid_view_leader)|weeklies_grid_view_leader|销售工作报告|实体表格视图||
|[销售工作报告](app/view/weeklies_kanban_view)|weeklies_kanban_view|销售工作报告|实体看板视图||
|[新建周报](app/view/weeklies_quick_create_view)|weeklies_quick_create_view|新建周报|实体选项操作视图||
|[周报数据重定向视图](app/view/weeklies_redirect_view)|weeklies_redirect_view|周报|实体数据重定向视图||
|[周报编辑视图](app/view/weeklies_weekly_edit_view)|weeklies_weekly_edit_view|周报编辑视图|实体编辑视图||
|[工作报告](app/view/weeklies_work_edit_view)|weeklies_work_edit_view|工作报告|实体编辑视图|系统自动添加|
|[工作进展编辑视图](app/view/work_progress_edit_view)|work_progress_edit_view|工作进展|实体编辑视图|系统自动添加|
|[工作进展](app/view/work_progress_menu_grid_view)|work_progress_menu_grid_view|工作进展|实体表格视图||
|[工作进展数据重定向视图](app/view/work_progress_redirect_view)|work_progress_redirect_view|工作进展|实体数据重定向视图|系统自动添加|

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {
      itemClick(url) {
        location.href = url
      }
    }
  }).use(ElementPlus).mount('#app')
</script>