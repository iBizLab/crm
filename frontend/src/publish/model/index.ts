import { CodeListService } from '@ibiz-template/runtime';
import {
  IAppCodeList,
  IAppDataEntity,
  IApplication,
  IAppView,
} from '@ibiz/model-core';

export async function registerCodeList(
  codeListService: CodeListService,
): Promise<void> {
  const setCodeList = (model: IData) => {
    codeListService.setCodeList(model as IAppCodeList);
  };
  setCodeList(await import('./code-list/crm-rating').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-sys-operator').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-usr-code-list-0625594962').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/crm-yes-no').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-account-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-activity-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-assessment-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-business-line').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-campaign-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-campaign-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-collection-type').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-dealstage').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-distribution-model').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-industry').then(m => m.default));
  setCodeList(await import('./code-list/crm-lead-source').then(m => m.default));
  setCodeList(await import('./code-list/crm-lead-status').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-manufacturer').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-order-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-outgoing-call-status').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-owner').then(m => m.default));
  setCodeList(await import('./code-list/crm-owner-type').then(m => m.default));
  setCodeList(await import('./code-list/crm-ownership').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-payee-status').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-priority').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-product-category').then(m => m.default),
  );
  setCodeList(await import('./code-list/crm-sysuser').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-task-relation-owner-type').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/crm-task-status').then(m => m.default));
  setCodeList(await import('./code-list/crm-tax').then(m => m.default));
  setCodeList(await import('./code-list/crm-type').then(m => m.default));
  setCodeList(
    await import('./code-list/crm-weeklies-period').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-work-progress-cztype').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-work-progress-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/crm-work-progress-type-task').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/runtime-usr-code-list-0618913512').then(
      m => m.default,
    ),
  );
}

export async function getAppDataEntityModel(
  name: string,
): Promise<IAppDataEntity> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'crmweb.price_book':
    case 'price_book':
      return import('./entities/price-book').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.sales_order':
    case 'sales_order':
      return import('./entities/sales-order').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.payee':
    case 'payee':
      return import('./entities/payee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.sys_person':
    case 'sys_person':
      return import('./entities/sys-person').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.purchase_order':
    case 'purchase_order':
      return import('./entities/purchase-order').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.vendor':
    case 'vendor':
      return import('./entities/vendor').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.deal':
    case 'deal':
      return import('./entities/deal').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.relation':
    case 'relation':
      return import('./entities/relation').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.campaign':
    case 'campaign':
      return import('./entities/campaign').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.attachment':
    case 'attachment':
      return import('./entities/attachment').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.service_case':
    case 'service_case':
      return import('./entities/service-case').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.quote':
    case 'quote':
      return import('./entities/quote').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.activitiy':
    case 'activitiy':
      return import('./entities/activitiy').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.schedule':
    case 'schedule':
      return import('./entities/schedule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.task_executor':
    case 'task_executor':
      return import('./entities/task-executor').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.deal_history':
    case 'deal_history':
      return import('./entities/deal-history').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.lead':
    case 'lead':
      return import('./entities/lead').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.user':
    case 'user':
      return import('./entities/user').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.product_certificate':
    case 'product_certificate':
      return import('./entities/product-certificate').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.invoice':
    case 'invoice':
      return import('./entities/invoice').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.weekly_detail':
    case 'weekly_detail':
      return import('./entities/weekly-detail').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.weeklies':
    case 'weeklies':
      return import('./entities/weeklies').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.payee_plan':
    case 'payee_plan':
      return import('./entities/payee-plan').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.payee_statistic':
    case 'payee_statistic':
      return import('./entities/payee-statistic').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.reservation':
    case 'reservation':
      return import('./entities/reservation').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.deal_stage':
    case 'deal_stage':
      return import('./entities/deal-stage').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.call':
    case 'call':
      return import('./entities/call').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.product':
    case 'product':
      return import('./entities/product').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.order_allocate':
    case 'order_allocate':
      return import('./entities/order-allocate').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.project':
    case 'project':
      return import('./entities/project').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.work_progress':
    case 'work_progress':
      return import('./entities/work-progress').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.payee_allocate':
    case 'payee_allocate':
      return import('./entities/payee-allocate').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.executor':
    case 'executor':
      return import('./entities/executor').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.solution':
    case 'solution':
      return import('./entities/solution').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.account':
    case 'account':
      return import('./entities/account').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.custom_button':
    case 'custom_button':
      return import('./entities/custom-button').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.tag':
    case 'tag':
      return import('./entities/tag').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.contact':
    case 'contact':
      return import('./entities/contact').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.event':
    case 'event':
      return import('./entities/event').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.task':
    case 'task':
      return import('./entities/task').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'crmweb.note_attach':
    case 'note_attach':
      return import('./entities/note-attach').then(
        m => m.default as unknown as IAppDataEntity,
      );
    default:
      throw new Error(`无法找到实体模型：${name}`);
  }
}
export async function getAppViewModel(name: string): Promise<IAppView> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'task_portal_my_weekend_act_grid_view':
      return import('./views/task-portal-my-weekend-act-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_main_view':
      return import('./views/product-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_pickup_view':
      return import('./views/payee-plan-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_info_view':
      return import('./views/user-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_tracing_grid_view':
      return import('./views/task-my-tracing-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_grid_view_multimode':
      return import('./views/service-case-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_todo_grid_view':
      return import('./views/task-my-todo-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_main_view':
      return import('./views/task-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_note_attach_view':
      return import('./views/deal-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_pickup_view':
      return import('./views/contact-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_stage_edit_view':
      return import('./views/deal-stage-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_pickup_grid_view':
      return import('./views/product-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_deal_re_mpick_up_view':
      return import('./views/task-deal-re-mpick-up-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_attachment_view':
      return import('./views/project-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_pro_pay_and_plan_edit_view':
      return import('./views/project-pro-pay-and-plan-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_statistic_chart_exp_view_leader':
      return import('./views/payee-statistic-chart-exp-view-leader').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_all_task_kanban_view':
      return import('./views/task-all-task-kanban-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_main_view':
      return import('./views/service-case-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_note_condition_view':
      return import('./views/task-note-condition-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_all_maneuver_grid_view':
      return import('./views/task-all-maneuver-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_activity_kanban_view':
      return import('./views/task-my-activity-kanban-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_edit_view':
      return import('./views/account-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_edit_view':
      return import('./views/task-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_grid_view_multimode':
      return import('./views/account-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_pickup_grid_view':
      return import('./views/payee-plan-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_grid_view_relation':
      return import('./views/deal-grid-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_main_view':
      return import('./views/purchase-order-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_main_view':
      return import('./views/campaign-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'note_attach_option_view':
      return import('./views/note-attach-option-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_exp_grid_view':
      return import('./views/deal-exp-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_grid_view_multimode':
      return import('./views/payee-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'weeklies_quick_create_view':
      return import('./views/weeklies-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_pickup_view':
      return import('./views/vendor-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_edit_view':
      return import('./views/product-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_main_view':
      return import('./views/contact-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_order_analysis_grid_view':
      return import('./views/project-order-analysis-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'activitiy_list_view':
      return import('./views/activitiy-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_grid_view':
      return import('./views/payee-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_main_view':
      return import('./views/deal-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_note_attach_view':
      return import('./views/vendor-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_the_maneuver_edit_view':
      return import('./views/task-the-maneuver-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_done_grid_view':
      return import('./views/task-my-done-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_all_grid_view':
      return import('./views/task-my-all-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_data_view_multimode':
      return import('./views/account-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_note_attach_view':
      return import('./views/sales-order-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_edit_view':
      return import('./views/contact-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_all_task_tab_search_view':
      return import('./views/task-all-task-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_list_view_multimode':
      return import('./views/quote-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_attachment_view':
      return import('./views/vendor-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_pickup_view':
      return import('./views/project-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_certificate_edit_view':
      return import('./views/product-certificate-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_data_view_multimode':
      return import('./views/product-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_note_attach_view':
      return import('./views/project-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_attachment_view':
      return import('./views/product-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_maneuver_main_view':
      return import('./views/task-maneuver-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_history_deal_deal_his_grid_view':
      return import('./views/deal-history-deal-deal-his-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_main_view':
      return import('./views/project-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_lead_re_mpick_up_view':
      return import('./views/task-lead-re-mpick-up-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_data_view_multimode':
      return import('./views/invoice-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_certificate_attachment_view':
      return import('./views/product-certificate-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_edit_view':
      return import('./views/user-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_work_task_edit_view':
      return import('./views/task-work-task-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_product_edit_view':
      return import('./views/product-product-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_redirect_view':
      return import('./views/project-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_maneuver_tab_search_view':
      return import('./views/task-my-maneuver-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_list_view_multimode':
      return import('./views/product-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_maneuver_tree_exp_view':
      return import('./views/task-maneuver-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_note_attach_view':
      return import('./views/purchase-order-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_chart_grid_view_multimode':
      return import('./views/deal-chart-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_grid_view_relation':
      return import('./views/user-grid-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_list_view_relation':
      return import('./views/task-list-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_setting_view':
      return import('./views/user-setting-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_attachment_view':
      return import('./views/campaign-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_index_pickup_view':
      return import('./views/schedule-index-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_test_tab_search_view':
      return import('./views/account-test-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_data_view_multimode':
      return import('./views/price-book-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_list_view_multimode':
      return import('./views/lead-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_attachment_view':
      return import('./views/task-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_note_attach_view':
      return import('./views/task-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_edit_view_origin':
      return import('./views/deal-edit-view-origin').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_list_view_relation':
      return import('./views/contact-list-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_statistic_edit_view':
      return import('./views/payee-statistic-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_test_main_view':
      return import('./views/account-test-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'weeklies_grid_view':
      return import('./views/weeklies-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_grid_view_multimode':
      return import('./views/invoice-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'event_invited_view':
      return import('./views/event-invited-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_info_view_work':
      return import('./views/user-info-view-work').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_grid_view_multimode':
      return import('./views/vendor-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'reservation_edit_view':
      return import('./views/reservation-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_edit_view':
      return import('./views/invoice-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_edit_view':
      return import('./views/deal-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_edit_view3':
      return import('./views/project-edit-view-3').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_main_view':
      return import('./views/invoice-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_data_view_multimode':
      return import('./views/service-case-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_list_view_multimode':
      return import('./views/solution-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_all_task_grid_view':
      return import('./views/task-all-task-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_list_exp_view':
      return import('./views/user-list-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_not_close_tab_tabs_exp_view_multimode':
      return import(
        './views/schedule-not-close-tab-tabs-exp-view-multimode'
      ).then(m => m.default as unknown as IAppView);
    case 'lead_pickup_grid_view':
      return import('./views/lead-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_redirect_view':
      return import('./views/schedule-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_pickup_grid_view':
      return import('./views/project-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_stage_grid_view':
      return import('./views/deal-stage-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_main_view':
      return import('./views/quote-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_lead_re_mpick_up_view_pickup_grid_view':
      return import('./views/task-lead-re-mpick-up-view-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_grid_view_multimode':
      return import('./views/deal-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_info_edit_view':
      return import('./views/user-info-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_edit_view':
      return import('./views/payee-plan-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'event_edit_view':
      return import('./views/event-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_history_edit_view':
      return import('./views/deal-history-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_list_view_relation':
      return import('./views/deal-list-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_not_close_view':
      return import('./views/schedule-not-close-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_quick_new_view':
      return import('./views/user-quick-new-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_pickup_grid_view':
      return import('./views/account-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_attachment_view':
      return import('./views/purchase-order-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_edit_view':
      return import('./views/service-case-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'activitiy_time_line_view':
      return import('./views/activitiy-time-line-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_index_pickup_dataview':
      return import('./views/schedule-index-pickup-dataview').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_list_view_multimode':
      return import('./views/contact-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_grid_view_multimode':
      return import('./views/price-book-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_tree_grid_view':
      return import('./views/project-tree-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_data_view_multimode':
      return import('./views/lead-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_edit_view':
      return import('./views/quote-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_payee_edit_view':
      return import('./views/payee-payee-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_not_close_tab_exp_view9':
      return import('./views/schedule-not-close-tab-exp-view-9').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_note_attach_view':
      return import('./views/invoice-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_edit_view':
      return import('./views/sales-order-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_attachment_view':
      return import('./views/sales-order-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_grid_view_multimode':
      return import('./views/contact-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_list_view_multimode':
      return import('./views/vendor-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_list_view_multimode':
      return import('./views/service-case-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_deal_re_mpick_up_view_pickup_grid_view':
      return import('./views/task-deal-re-mpick-up-view-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_redirect_view':
      return import('./views/user-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_attachment_view':
      return import('./views/contact-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_data_view_multimode':
      return import('./views/campaign-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_portal_calendar_view':
      return import('./views/task-portal-calendar-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_pickup_grid_view':
      return import('./views/contact-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'note_attach_list_view':
      return import('./views/note-attach-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_data_view_multimode':
      return import('./views/deal-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_grid_view_multimode':
      return import('./views/sales-order-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_main_view':
      return import('./views/solution-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_redirect_view':
      return import('./views/deal-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_attachment_view':
      return import('./views/price-book-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_attachment_view':
      return import('./views/solution-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_task_act_list_view':
      return import('./views/task-task-act-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_grid_view_relation':
      return import('./views/contact-grid-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'work_progress_redirect_view':
      return import('./views/work-progress-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_all_task_kanban_view':
      return import('./views/task-my-all-task-kanban-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_list_view_multimode':
      return import('./views/price-book-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_grid_not_close_view':
      return import('./views/task-grid-not-close-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_task_list_view':
      return import('./views/lead-task-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'event_redirect_view':
      return import('./views/event-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_edit_view':
      return import('./views/lead-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_data_view_multimode':
      return import('./views/solution-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_certificate_grid_view':
      return import('./views/product-certificate-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_pickup_view':
      return import('./views/account-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_grid_view_multimode':
      return import('./views/product-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_m_pickup_view':
      return import('./views/user-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_work_task_main_view':
      return import('./views/task-work-task-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_list_view_multimode':
      return import('./views/campaign-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_grid_view_multimode':
      return import('./views/payee-plan-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_list_view_multimode':
      return import('./views/invoice-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_grid_view_multimode':
      return import('./views/campaign-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'work_progress_menu_grid_view':
      return import('./views/work-progress-menu-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_tree_grid_view':
      return import('./views/lead-tree-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_cancelled_grid_view':
      return import('./views/task-my-cancelled-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_list_view_multimode':
      return import('./views/deal-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'custom_button_grid_view':
      return import('./views/custom-button-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'call_edit_view':
      return import('./views/call-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_edit_view':
      return import('./views/price-book-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_main_view':
      return import('./views/lead-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_attachment_view':
      return import('./views/service-case-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_note_attach_view':
      return import('./views/solution-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_edit_view':
      return import('./views/vendor-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_history_redirect_view':
      return import('./views/deal-history-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_lead_edit_view':
      return import('./views/lead-lead-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_password_edit_view':
      return import('./views/user-password-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_close_view':
      return import('./views/schedule-close-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_m_pickup_view':
      return import('./views/product-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'schedule_edit_view':
      return import('./views/schedule-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'custom_button_option_view':
      return import('./views/custom-button-option-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_todo_tab_search_view':
      return import('./views/task-my-todo-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_attachment_view':
      return import('./views/quote-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_pickup_grid_view':
      return import('./views/user-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_grid_view_multimode':
      return import('./views/solution-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_batch_create_view':
      return import('./views/task-batch-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_note_attach_view':
      return import('./views/service-case-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_attachment_view':
      return import('./views/lead-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_re_mpick_up_view':
      return import('./views/task-re-mpick-up-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_data_view_multimode':
      return import('./views/contact-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_maneuver_grid_view':
      return import('./views/task-my-maneuver-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_edit_view':
      return import('./views/campaign-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_attachment_view':
      return import('./views/invoice-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_note_attach_view':
      return import('./views/quote-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_note_attach_view':
      return import('./views/price-book-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_grid_view_relation':
      return import('./views/product-grid-view-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_certificate_main_view':
      return import('./views/product-certificate-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_multimode_edit_view':
      return import('./views/payee-plan-multimode-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_redirect_view':
      return import('./views/product-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_redirect_view':
      return import('./views/account-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_attachment_view':
      return import('./views/deal-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'weeklies_edit_view':
      return import('./views/weeklies-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_note_attach_view':
      return import('./views/lead-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'work_progress_edit_view':
      return import('./views/work-progress-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_note_attach_view':
      return import('./views/campaign-note-attach-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'weeklies_grid_view_leader':
      return import('./views/weeklies-grid-view-leader').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_todo_task_kanban_view':
      return import('./views/task-todo-task-kanban-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_data_view_multimode':
      return import('./views/sales-order-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_statistic_chart_view':
      return import('./views/payee-statistic-chart-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_edit_view':
      return import('./views/purchase-order-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_chart_exp_view':
      return import('./views/project-chart-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_task_list_view':
      return import('./views/deal-task-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_main_view':
      return import('./views/price-book-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_main_view':
      return import('./views/vendor-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_wizard_view':
      return import('./views/payee-wizard-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_portal_my_todo_grid_view':
      return import('./views/task-portal-my-todo-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_tab_exp_view':
      return import('./views/deal-tab-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_my_all_tab_search_view':
      return import('./views/task-my-all-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_grid_view_multimode':
      return import('./views/quote-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_edit_view':
      return import('./views/solution-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_list_view_multimode':
      return import('./views/sales-order-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_grid_view':
      return import('./views/payee-plan-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_main_view':
      return import('./views/sales-order-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_pickup_grid_view':
      return import('./views/vendor-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_attachment_view':
      return import('./views/account-attachment-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_grid_view_multimode':
      return import('./views/purchase-order-grid-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_redirect_view':
      return import('./views/task-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'account_list_view_multimode':
      return import('./views/account-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'weeklies_edit_view_leader':
      return import('./views/weeklies-edit-view-leader').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_task_edit_view':
      return import('./views/task-task-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_list_view_multimode':
      return import('./views/purchase-order-list-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_re_mpick_up_view_pickup_grid_view':
      return import('./views/task-re-mpick-up-view-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_all_maneuver_tab_search_view':
      return import('./views/task-all-maneuver-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_pickup_view':
      return import('./views/lead-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_data_view_multimode':
      return import('./views/purchase-order-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_data_view_multimode':
      return import('./views/quote-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_data_view_multimode':
      return import('./views/vendor-data-view-multimode').then(
        m => m.default as unknown as IAppView,
      );
    case 'sales_order_tab_search_view':
      return import('./views/sales-order-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'call_tab_search_view':
      return import('./views/call-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'purchase_order_tab_search_view':
      return import('./views/purchase-order-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'solution_tab_search_view':
      return import('./views/solution-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_plan_tab_search_view':
      return import('./views/payee-plan-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_multimode_edit_view':
      return import('./views/payee-multimode-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'app_panel_view':
      return import('./views/app-panel-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'project_tab_search_view':
      return import('./views/project-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'app_portal_view':
      return import('./views/app-portal-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'deal_tab_search_view':
      return import('./views/deal-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_tab_search_view':
      return import('./views/payee-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'lead_tab_search_view':
      return import('./views/lead-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_custom_view':
      return import('./views/user-custom-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'contact_tab_search_view':
      return import('./views/contact-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'campaign_tab_search_view':
      return import('./views/campaign-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'service_case_tab_search_view':
      return import('./views/service-case-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'quote_tab_search_view':
      return import('./views/quote-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'invoice_tab_search_view':
      return import('./views/invoice-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'app_login_view':
      return import('./views/app-login-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'product_tab_search_view':
      return import('./views/product-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_statistic_chart_grid_view':
      return import('./views/payee-statistic-chart-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_task_tree_exp_view':
      return import('./views/task-task-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'payee_statistic_chart_exp_view':
      return import('./views/payee-statistic-chart-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'price_book_tab_search_view':
      return import('./views/price-book-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'event_tab_search_view':
      return import('./views/event-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'vendor_tab_search_view':
      return import('./views/vendor-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_maneuver_kanban_view':
      return import('./views/task-maneuver-kanban-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'task_index_view':
      return import('./views/task-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'app_index_view':
      return import('./views/app-index-view').then(
        m => m.default as unknown as IAppView,
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}

export async function getAppModel(): Promise<IApplication> {
  ibiz.hub.defaultAppIndexViewName = 'app_index_view';
  return import('./app/app').then(m => {
    const app = m.default as IData;
    app.appUtils?.forEach((util: IData) => {
      util.appId = app.appId;
    });
    // app.appId = undefined;
    return app as IApplication;
  });
}
