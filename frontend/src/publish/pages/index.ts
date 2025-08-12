import { Component, defineAsyncComponent } from 'vue';

function calcAppViewId(tag: string): string {
  let id = '';
  if (tag.indexOf('.') !== -1) {
    const ids = tag.split('.');
    id = ids[ids.length - 1];
  } else {
    id = tag.toLowerCase();
  }
  return id;
}

export async function getAppViewComponent(
  name: string,
  appId: string,
): Promise<Component> {
  const _name = calcAppViewId(name).toLowerCase();
  // 子应用视图
  if (appId !== ibiz.env.appId) {
    return defineAsyncComponent(
      () => import('../../components/sub-app-view/sub-app-view.vue'),
    );
  }
  switch (_name) {
    case 'task_portal_my_weekend_act_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-portal-my-weekend-act-grid-view/task-portal-my-weekend-act-grid-view.vue'
          ),
      );
    case 'product_main_view':
      return defineAsyncComponent(
        () => import('./product/product-main-view/product-main-view.vue'),
      );
    case 'payee_plan_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-plan/payee-plan-pickup-view/payee-plan-pickup-view.vue'
          ),
      );
    case 'user_info_view':
      return defineAsyncComponent(
        () => import('./user/user-info-view/user-info-view.vue'),
      );
    case 'task_my_tracing_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-tracing-grid-view/task-my-tracing-grid-view.vue'
          ),
      );
    case 'service_case_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-grid-view-multimode/service-case-grid-view-multimode.vue'
          ),
      );
    case 'task_my_todo_grid_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-my-todo-grid-view/task-my-todo-grid-view.vue'),
      );
    case 'task_main_view':
      return defineAsyncComponent(
        () => import('./task/task-main-view/task-main-view.vue'),
      );
    case 'deal_note_attach_view':
      return defineAsyncComponent(
        () => import('./deal/deal-note-attach-view/deal-note-attach-view.vue'),
      );
    case 'contact_pickup_view':
      return defineAsyncComponent(
        () => import('./contact/contact-pickup-view/contact-pickup-view.vue'),
      );
    case 'deal_stage_edit_view':
      return defineAsyncComponent(
        () =>
          import('./deal-stage/deal-stage-edit-view/deal-stage-edit-view.vue'),
      );
    case 'product_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-pickup-grid-view/product-pickup-grid-view.vue'
          ),
      );
    case 'task_deal_re_mpick_up_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-deal-re-mpick-up-view/task-deal-re-mpick-up-view.vue'
          ),
      );
    case 'project_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-attachment-view/project-attachment-view.vue'
          ),
      );
    case 'project_pro_pay_and_plan_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-pro-pay-and-plan-edit-view/project-pro-pay-and-plan-edit-view.vue'
          ),
      );
    case 'payee_statistic_chart_exp_view_leader':
      return defineAsyncComponent(
        () =>
          import(
            './payee-statistic/payee-statistic-chart-exp-view-leader/payee-statistic-chart-exp-view-leader.vue'
          ),
      );
    case 'task_all_task_kanban_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-all-task-kanban-view/task-all-task-kanban-view.vue'
          ),
      );
    case 'service_case_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-main-view/service-case-main-view.vue'
          ),
      );
    case 'task_note_condition_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-note-condition-view/task-note-condition-view.vue'
          ),
      );
    case 'task_all_maneuver_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-all-maneuver-grid-view/task-all-maneuver-grid-view.vue'
          ),
      );
    case 'task_my_activity_kanban_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-activity-kanban-view/task-my-activity-kanban-view.vue'
          ),
      );
    case 'account_edit_view':
      return defineAsyncComponent(
        () => import('./account/account-edit-view/account-edit-view.vue'),
      );
    case 'task_edit_view':
      return defineAsyncComponent(
        () => import('./task/task-edit-view/task-edit-view.vue'),
      );
    case 'account_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-grid-view-multimode/account-grid-view-multimode.vue'
          ),
      );
    case 'payee_plan_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-plan/payee-plan-pickup-grid-view/payee-plan-pickup-grid-view.vue'
          ),
      );
    case 'deal_grid_view_relation':
      return defineAsyncComponent(
        () =>
          import('./deal/deal-grid-view-relation/deal-grid-view-relation.vue'),
      );
    case 'purchase_order_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-main-view/purchase-order-main-view.vue'
          ),
      );
    case 'campaign_main_view':
      return defineAsyncComponent(
        () => import('./campaign/campaign-main-view/campaign-main-view.vue'),
      );
    case 'note_attach_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './note-attach/note-attach-option-view/note-attach-option-view.vue'
          ),
      );
    case 'deal_exp_grid_view':
      return defineAsyncComponent(
        () => import('./deal/deal-exp-grid-view/deal-exp-grid-view.vue'),
      );
    case 'payee_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './payee/payee-grid-view-multimode/payee-grid-view-multimode.vue'
          ),
      );
    case 'weeklies_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './weeklies/weeklies-quick-create-view/weeklies-quick-create-view.vue'
          ),
      );
    case 'vendor_pickup_view':
      return defineAsyncComponent(
        () => import('./vendor/vendor-pickup-view/vendor-pickup-view.vue'),
      );
    case 'product_edit_view':
      return defineAsyncComponent(
        () => import('./product/product-edit-view/product-edit-view.vue'),
      );
    case 'contact_main_view':
      return defineAsyncComponent(
        () => import('./contact/contact-main-view/contact-main-view.vue'),
      );
    case 'project_order_analysis_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-order-analysis-grid-view/project-order-analysis-grid-view.vue'
          ),
      );
    case 'activitiy_list_view':
      return defineAsyncComponent(
        () => import('./activitiy/activitiy-list-view/activitiy-list-view.vue'),
      );
    case 'payee_grid_view':
      return defineAsyncComponent(
        () => import('./payee/payee-grid-view/payee-grid-view.vue'),
      );
    case 'deal_main_view':
      return defineAsyncComponent(
        () => import('./deal/deal-main-view/deal-main-view.vue'),
      );
    case 'vendor_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './vendor/vendor-note-attach-view/vendor-note-attach-view.vue'
          ),
      );
    case 'task_the_maneuver_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-the-maneuver-edit-view/task-the-maneuver-edit-view.vue'
          ),
      );
    case 'task_my_done_grid_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-my-done-grid-view/task-my-done-grid-view.vue'),
      );
    case 'task_my_all_grid_view':
      return defineAsyncComponent(
        () => import('./task/task-my-all-grid-view/task-my-all-grid-view.vue'),
      );
    case 'account_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-data-view-multimode/account-data-view-multimode.vue'
          ),
      );
    case 'sales_order_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-note-attach-view/sales-order-note-attach-view.vue'
          ),
      );
    case 'contact_edit_view':
      return defineAsyncComponent(
        () => import('./contact/contact-edit-view/contact-edit-view.vue'),
      );
    case 'task_all_task_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-all-task-tab-search-view/task-all-task-tab-search-view.vue'
          ),
      );
    case 'quote_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './quote/quote-list-view-multimode/quote-list-view-multimode.vue'
          ),
      );
    case 'vendor_attachment_view':
      return defineAsyncComponent(
        () =>
          import('./vendor/vendor-attachment-view/vendor-attachment-view.vue'),
      );
    case 'project_pickup_view':
      return defineAsyncComponent(
        () => import('./project/project-pickup-view/project-pickup-view.vue'),
      );
    case 'product_certificate_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './product-certificate/product-certificate-edit-view/product-certificate-edit-view.vue'
          ),
      );
    case 'product_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-data-view-multimode/product-data-view-multimode.vue'
          ),
      );
    case 'project_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-note-attach-view/project-note-attach-view.vue'
          ),
      );
    case 'product_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-attachment-view/product-attachment-view.vue'
          ),
      );
    case 'task_maneuver_main_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-maneuver-main-view/task-maneuver-main-view.vue'),
      );
    case 'deal_history_deal_deal_his_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './deal-history/deal-history-deal-deal-his-grid-view/deal-history-deal-deal-his-grid-view.vue'
          ),
      );
    case 'project_main_view':
      return defineAsyncComponent(
        () => import('./project/project-main-view/project-main-view.vue'),
      );
    case 'task_lead_re_mpick_up_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-lead-re-mpick-up-view/task-lead-re-mpick-up-view.vue'
          ),
      );
    case 'invoice_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-data-view-multimode/invoice-data-view-multimode.vue'
          ),
      );
    case 'product_certificate_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './product-certificate/product-certificate-attachment-view/product-certificate-attachment-view.vue'
          ),
      );
    case 'user_edit_view':
      return defineAsyncComponent(
        () => import('./user/user-edit-view/user-edit-view.vue'),
      );
    case 'task_work_task_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-work-task-edit-view/task-work-task-edit-view.vue'
          ),
      );
    case 'product_product_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-product-edit-view/product-product-edit-view.vue'
          ),
      );
    case 'project_redirect_view':
      return defineAsyncComponent(
        () =>
          import('./project/project-redirect-view/project-redirect-view.vue'),
      );
    case 'task_my_maneuver_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-maneuver-tab-search-view/task-my-maneuver-tab-search-view.vue'
          ),
      );
    case 'product_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-list-view-multimode/product-list-view-multimode.vue'
          ),
      );
    case 'task_maneuver_tree_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-maneuver-tree-exp-view/task-maneuver-tree-exp-view.vue'
          ),
      );
    case 'purchase_order_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-note-attach-view/purchase-order-note-attach-view.vue'
          ),
      );
    case 'deal_chart_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './deal/deal-chart-grid-view-multimode/deal-chart-grid-view-multimode.vue'
          ),
      );
    case 'user_grid_view_relation':
      return defineAsyncComponent(
        () =>
          import('./user/user-grid-view-relation/user-grid-view-relation.vue'),
      );
    case 'task_list_view_relation':
      return defineAsyncComponent(
        () =>
          import('./task/task-list-view-relation/task-list-view-relation.vue'),
      );
    case 'user_setting_view':
      return defineAsyncComponent(
        () => import('./user/user-setting-view/user-setting-view.vue'),
      );
    case 'campaign_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-attachment-view/campaign-attachment-view.vue'
          ),
      );
    case 'schedule_index_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-index-pickup-view/schedule-index-pickup-view.vue'
          ),
      );
    case 'account_test_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-test-tab-search-view/account-test-tab-search-view.vue'
          ),
      );
    case 'price_book_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-data-view-multimode/price-book-data-view-multimode.vue'
          ),
      );
    case 'lead_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './lead/lead-list-view-multimode/lead-list-view-multimode.vue'
          ),
      );
    case 'task_attachment_view':
      return defineAsyncComponent(
        () => import('./task/task-attachment-view/task-attachment-view.vue'),
      );
    case 'task_note_attach_view':
      return defineAsyncComponent(
        () => import('./task/task-note-attach-view/task-note-attach-view.vue'),
      );
    case 'deal_edit_view_origin':
      return defineAsyncComponent(
        () => import('./deal/deal-edit-view-origin/deal-edit-view-origin.vue'),
      );
    case 'contact_list_view_relation':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-list-view-relation/contact-list-view-relation.vue'
          ),
      );
    case 'payee_statistic_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-statistic/payee-statistic-edit-view/payee-statistic-edit-view.vue'
          ),
      );
    case 'account_test_main_view':
      return defineAsyncComponent(
        () =>
          import('./account/account-test-main-view/account-test-main-view.vue'),
      );
    case 'weeklies_grid_view':
      return defineAsyncComponent(
        () => import('./weeklies/weeklies-grid-view/weeklies-grid-view.vue'),
      );
    case 'invoice_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-grid-view-multimode/invoice-grid-view-multimode.vue'
          ),
      );
    case 'event_invited_view':
      return defineAsyncComponent(
        () => import('./event/event-invited-view/event-invited-view.vue'),
      );
    case 'user_info_view_work':
      return defineAsyncComponent(
        () => import('./user/user-info-view-work/user-info-view-work.vue'),
      );
    case 'vendor_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './vendor/vendor-grid-view-multimode/vendor-grid-view-multimode.vue'
          ),
      );
    case 'reservation_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './reservation/reservation-edit-view/reservation-edit-view.vue'
          ),
      );
    case 'invoice_edit_view':
      return defineAsyncComponent(
        () => import('./invoice/invoice-edit-view/invoice-edit-view.vue'),
      );
    case 'deal_edit_view':
      return defineAsyncComponent(
        () => import('./deal/deal-edit-view/deal-edit-view.vue'),
      );
    case 'project_edit_view3':
      return defineAsyncComponent(
        () => import('./project/project-edit-view-3/project-edit-view-3.vue'),
      );
    case 'invoice_main_view':
      return defineAsyncComponent(
        () => import('./invoice/invoice-main-view/invoice-main-view.vue'),
      );
    case 'service_case_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-data-view-multimode/service-case-data-view-multimode.vue'
          ),
      );
    case 'solution_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-list-view-multimode/solution-list-view-multimode.vue'
          ),
      );
    case 'task_all_task_grid_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-all-task-grid-view/task-all-task-grid-view.vue'),
      );
    case 'user_list_exp_view':
      return defineAsyncComponent(
        () => import('./user/user-list-exp-view/user-list-exp-view.vue'),
      );
    case 'schedule_not_close_tab_tabs_exp_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-not-close-tab-tabs-exp-view-multimode/schedule-not-close-tab-tabs-exp-view-multimode.vue'
          ),
      );
    case 'lead_pickup_grid_view':
      return defineAsyncComponent(
        () => import('./lead/lead-pickup-grid-view/lead-pickup-grid-view.vue'),
      );
    case 'schedule_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-redirect-view/schedule-redirect-view.vue'
          ),
      );
    case 'project_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-pickup-grid-view/project-pickup-grid-view.vue'
          ),
      );
    case 'deal_stage_grid_view':
      return defineAsyncComponent(
        () =>
          import('./deal-stage/deal-stage-grid-view/deal-stage-grid-view.vue'),
      );
    case 'quote_main_view':
      return defineAsyncComponent(
        () => import('./quote/quote-main-view/quote-main-view.vue'),
      );
    case 'task_lead_re_mpick_up_view_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-lead-re-mpick-up-view-pickup-grid-view/task-lead-re-mpick-up-view-pickup-grid-view.vue'
          ),
      );
    case 'deal_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './deal/deal-grid-view-multimode/deal-grid-view-multimode.vue'
          ),
      );
    case 'user_info_edit_view':
      return defineAsyncComponent(
        () => import('./user/user-info-edit-view/user-info-edit-view.vue'),
      );
    case 'payee_plan_edit_view':
      return defineAsyncComponent(
        () =>
          import('./payee-plan/payee-plan-edit-view/payee-plan-edit-view.vue'),
      );
    case 'event_edit_view':
      return defineAsyncComponent(
        () => import('./event/event-edit-view/event-edit-view.vue'),
      );
    case 'deal_history_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './deal-history/deal-history-edit-view/deal-history-edit-view.vue'
          ),
      );
    case 'deal_list_view_relation':
      return defineAsyncComponent(
        () =>
          import('./deal/deal-list-view-relation/deal-list-view-relation.vue'),
      );
    case 'schedule_not_close_view':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-not-close-view/schedule-not-close-view.vue'
          ),
      );
    case 'user_quick_new_view':
      return defineAsyncComponent(
        () => import('./user/user-quick-new-view/user-quick-new-view.vue'),
      );
    case 'account_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-pickup-grid-view/account-pickup-grid-view.vue'
          ),
      );
    case 'purchase_order_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-attachment-view/purchase-order-attachment-view.vue'
          ),
      );
    case 'service_case_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-edit-view/service-case-edit-view.vue'
          ),
      );
    case 'activitiy_time_line_view':
      return defineAsyncComponent(
        () =>
          import(
            './activitiy/activitiy-time-line-view/activitiy-time-line-view.vue'
          ),
      );
    case 'schedule_index_pickup_dataview':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-index-pickup-dataview/schedule-index-pickup-dataview.vue'
          ),
      );
    case 'contact_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-list-view-multimode/contact-list-view-multimode.vue'
          ),
      );
    case 'price_book_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-grid-view-multimode/price-book-grid-view-multimode.vue'
          ),
      );
    case 'project_tree_grid_view':
      return defineAsyncComponent(
        () =>
          import('./project/project-tree-grid-view/project-tree-grid-view.vue'),
      );
    case 'lead_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './lead/lead-data-view-multimode/lead-data-view-multimode.vue'
          ),
      );
    case 'quote_edit_view':
      return defineAsyncComponent(
        () => import('./quote/quote-edit-view/quote-edit-view.vue'),
      );
    case 'payee_payee_edit_view':
      return defineAsyncComponent(
        () => import('./payee/payee-payee-edit-view/payee-payee-edit-view.vue'),
      );
    case 'schedule_not_close_tab_exp_view9':
      return defineAsyncComponent(
        () =>
          import(
            './schedule/schedule-not-close-tab-exp-view-9/schedule-not-close-tab-exp-view-9.vue'
          ),
      );
    case 'invoice_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-note-attach-view/invoice-note-attach-view.vue'
          ),
      );
    case 'sales_order_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-edit-view/sales-order-edit-view.vue'
          ),
      );
    case 'sales_order_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-attachment-view/sales-order-attachment-view.vue'
          ),
      );
    case 'contact_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-grid-view-multimode/contact-grid-view-multimode.vue'
          ),
      );
    case 'vendor_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './vendor/vendor-list-view-multimode/vendor-list-view-multimode.vue'
          ),
      );
    case 'service_case_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-list-view-multimode/service-case-list-view-multimode.vue'
          ),
      );
    case 'task_deal_re_mpick_up_view_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-deal-re-mpick-up-view-pickup-grid-view/task-deal-re-mpick-up-view-pickup-grid-view.vue'
          ),
      );
    case 'user_redirect_view':
      return defineAsyncComponent(
        () => import('./user/user-redirect-view/user-redirect-view.vue'),
      );
    case 'contact_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-attachment-view/contact-attachment-view.vue'
          ),
      );
    case 'campaign_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-data-view-multimode/campaign-data-view-multimode.vue'
          ),
      );
    case 'task_portal_calendar_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-portal-calendar-view/task-portal-calendar-view.vue'
          ),
      );
    case 'contact_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-pickup-grid-view/contact-pickup-grid-view.vue'
          ),
      );
    case 'note_attach_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './note-attach/note-attach-list-view/note-attach-list-view.vue'
          ),
      );
    case 'deal_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './deal/deal-data-view-multimode/deal-data-view-multimode.vue'
          ),
      );
    case 'sales_order_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-grid-view-multimode/sales-order-grid-view-multimode.vue'
          ),
      );
    case 'solution_main_view':
      return defineAsyncComponent(
        () => import('./solution/solution-main-view/solution-main-view.vue'),
      );
    case 'deal_redirect_view':
      return defineAsyncComponent(
        () => import('./deal/deal-redirect-view/deal-redirect-view.vue'),
      );
    case 'price_book_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-attachment-view/price-book-attachment-view.vue'
          ),
      );
    case 'solution_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-attachment-view/solution-attachment-view.vue'
          ),
      );
    case 'task_task_act_list_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-task-act-list-view/task-task-act-list-view.vue'),
      );
    case 'contact_grid_view_relation':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-grid-view-relation/contact-grid-view-relation.vue'
          ),
      );
    case 'work_progress_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './work-progress/work-progress-redirect-view/work-progress-redirect-view.vue'
          ),
      );
    case 'task_my_all_task_kanban_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-all-task-kanban-view/task-my-all-task-kanban-view.vue'
          ),
      );
    case 'price_book_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-list-view-multimode/price-book-list-view-multimode.vue'
          ),
      );
    case 'task_grid_not_close_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-grid-not-close-view/task-grid-not-close-view.vue'
          ),
      );
    case 'lead_task_list_view':
      return defineAsyncComponent(
        () => import('./lead/lead-task-list-view/lead-task-list-view.vue'),
      );
    case 'event_redirect_view':
      return defineAsyncComponent(
        () => import('./event/event-redirect-view/event-redirect-view.vue'),
      );
    case 'lead_edit_view':
      return defineAsyncComponent(
        () => import('./lead/lead-edit-view/lead-edit-view.vue'),
      );
    case 'solution_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-data-view-multimode/solution-data-view-multimode.vue'
          ),
      );
    case 'product_certificate_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './product-certificate/product-certificate-grid-view/product-certificate-grid-view.vue'
          ),
      );
    case 'account_pickup_view':
      return defineAsyncComponent(
        () => import('./account/account-pickup-view/account-pickup-view.vue'),
      );
    case 'product_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-grid-view-multimode/product-grid-view-multimode.vue'
          ),
      );
    case 'user_m_pickup_view':
      return defineAsyncComponent(
        () => import('./user/user-m-pickup-view/user-m-pickup-view.vue'),
      );
    case 'task_work_task_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-work-task-main-view/task-work-task-main-view.vue'
          ),
      );
    case 'campaign_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-list-view-multimode/campaign-list-view-multimode.vue'
          ),
      );
    case 'payee_plan_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './payee-plan/payee-plan-grid-view-multimode/payee-plan-grid-view-multimode.vue'
          ),
      );
    case 'invoice_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-list-view-multimode/invoice-list-view-multimode.vue'
          ),
      );
    case 'campaign_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-grid-view-multimode/campaign-grid-view-multimode.vue'
          ),
      );
    case 'work_progress_menu_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './work-progress/work-progress-menu-grid-view/work-progress-menu-grid-view.vue'
          ),
      );
    case 'lead_tree_grid_view':
      return defineAsyncComponent(
        () => import('./lead/lead-tree-grid-view/lead-tree-grid-view.vue'),
      );
    case 'task_my_cancelled_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-cancelled-grid-view/task-my-cancelled-grid-view.vue'
          ),
      );
    case 'deal_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './deal/deal-list-view-multimode/deal-list-view-multimode.vue'
          ),
      );
    case 'custom_button_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './custom-button/custom-button-grid-view/custom-button-grid-view.vue'
          ),
      );
    case 'call_edit_view':
      return defineAsyncComponent(
        () => import('./call/call-edit-view/call-edit-view.vue'),
      );
    case 'price_book_edit_view':
      return defineAsyncComponent(
        () =>
          import('./price-book/price-book-edit-view/price-book-edit-view.vue'),
      );
    case 'lead_main_view':
      return defineAsyncComponent(
        () => import('./lead/lead-main-view/lead-main-view.vue'),
      );
    case 'service_case_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-attachment-view/service-case-attachment-view.vue'
          ),
      );
    case 'solution_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-note-attach-view/solution-note-attach-view.vue'
          ),
      );
    case 'vendor_edit_view':
      return defineAsyncComponent(
        () => import('./vendor/vendor-edit-view/vendor-edit-view.vue'),
      );
    case 'deal_history_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './deal-history/deal-history-redirect-view/deal-history-redirect-view.vue'
          ),
      );
    case 'lead_lead_edit_view':
      return defineAsyncComponent(
        () => import('./lead/lead-lead-edit-view/lead-lead-edit-view.vue'),
      );
    case 'user_password_edit_view':
      return defineAsyncComponent(
        () =>
          import('./user/user-password-edit-view/user-password-edit-view.vue'),
      );
    case 'schedule_close_view':
      return defineAsyncComponent(
        () => import('./schedule/schedule-close-view/schedule-close-view.vue'),
      );
    case 'product_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import('./product/product-m-pickup-view/product-m-pickup-view.vue'),
      );
    case 'schedule_edit_view':
      return defineAsyncComponent(
        () => import('./schedule/schedule-edit-view/schedule-edit-view.vue'),
      );
    case 'custom_button_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './custom-button/custom-button-option-view/custom-button-option-view.vue'
          ),
      );
    case 'task_my_todo_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-todo-tab-search-view/task-my-todo-tab-search-view.vue'
          ),
      );
    case 'quote_attachment_view':
      return defineAsyncComponent(
        () => import('./quote/quote-attachment-view/quote-attachment-view.vue'),
      );
    case 'user_pickup_grid_view':
      return defineAsyncComponent(
        () => import('./user/user-pickup-grid-view/user-pickup-grid-view.vue'),
      );
    case 'solution_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-grid-view-multimode/solution-grid-view-multimode.vue'
          ),
      );
    case 'task_batch_create_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-batch-create-view/task-batch-create-view.vue'),
      );
    case 'service_case_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-note-attach-view/service-case-note-attach-view.vue'
          ),
      );
    case 'lead_attachment_view':
      return defineAsyncComponent(
        () => import('./lead/lead-attachment-view/lead-attachment-view.vue'),
      );
    case 'task_re_mpick_up_view':
      return defineAsyncComponent(
        () => import('./task/task-re-mpick-up-view/task-re-mpick-up-view.vue'),
      );
    case 'contact_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-data-view-multimode/contact-data-view-multimode.vue'
          ),
      );
    case 'task_my_maneuver_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-maneuver-grid-view/task-my-maneuver-grid-view.vue'
          ),
      );
    case 'campaign_edit_view':
      return defineAsyncComponent(
        () => import('./campaign/campaign-edit-view/campaign-edit-view.vue'),
      );
    case 'invoice_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-attachment-view/invoice-attachment-view.vue'
          ),
      );
    case 'quote_note_attach_view':
      return defineAsyncComponent(
        () =>
          import('./quote/quote-note-attach-view/quote-note-attach-view.vue'),
      );
    case 'price_book_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-note-attach-view/price-book-note-attach-view.vue'
          ),
      );
    case 'product_grid_view_relation':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-grid-view-relation/product-grid-view-relation.vue'
          ),
      );
    case 'product_certificate_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './product-certificate/product-certificate-main-view/product-certificate-main-view.vue'
          ),
      );
    case 'payee_plan_multimode_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-plan/payee-plan-multimode-edit-view/payee-plan-multimode-edit-view.vue'
          ),
      );
    case 'product_redirect_view':
      return defineAsyncComponent(
        () =>
          import('./product/product-redirect-view/product-redirect-view.vue'),
      );
    case 'account_redirect_view':
      return defineAsyncComponent(
        () =>
          import('./account/account-redirect-view/account-redirect-view.vue'),
      );
    case 'deal_attachment_view':
      return defineAsyncComponent(
        () => import('./deal/deal-attachment-view/deal-attachment-view.vue'),
      );
    case 'weeklies_edit_view':
      return defineAsyncComponent(
        () => import('./weeklies/weeklies-edit-view/weeklies-edit-view.vue'),
      );
    case 'lead_note_attach_view':
      return defineAsyncComponent(
        () => import('./lead/lead-note-attach-view/lead-note-attach-view.vue'),
      );
    case 'work_progress_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './work-progress/work-progress-edit-view/work-progress-edit-view.vue'
          ),
      );
    case 'campaign_note_attach_view':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-note-attach-view/campaign-note-attach-view.vue'
          ),
      );
    case 'weeklies_grid_view_leader':
      return defineAsyncComponent(
        () =>
          import(
            './weeklies/weeklies-grid-view-leader/weeklies-grid-view-leader.vue'
          ),
      );
    case 'task_todo_task_kanban_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-todo-task-kanban-view/task-todo-task-kanban-view.vue'
          ),
      );
    case 'sales_order_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-data-view-multimode/sales-order-data-view-multimode.vue'
          ),
      );
    case 'payee_statistic_chart_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-statistic/payee-statistic-chart-view/payee-statistic-chart-view.vue'
          ),
      );
    case 'purchase_order_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-edit-view/purchase-order-edit-view.vue'
          ),
      );
    case 'project_chart_exp_view':
      return defineAsyncComponent(
        () =>
          import('./project/project-chart-exp-view/project-chart-exp-view.vue'),
      );
    case 'deal_task_list_view':
      return defineAsyncComponent(
        () => import('./deal/deal-task-list-view/deal-task-list-view.vue'),
      );
    case 'price_book_main_view':
      return defineAsyncComponent(
        () =>
          import('./price-book/price-book-main-view/price-book-main-view.vue'),
      );
    case 'vendor_main_view':
      return defineAsyncComponent(
        () => import('./vendor/vendor-main-view/vendor-main-view.vue'),
      );
    case 'payee_wizard_view':
      return defineAsyncComponent(
        () => import('./payee/payee-wizard-view/payee-wizard-view.vue'),
      );
    case 'task_portal_my_todo_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-portal-my-todo-grid-view/task-portal-my-todo-grid-view.vue'
          ),
      );
    case 'deal_tab_exp_view':
      return defineAsyncComponent(
        () => import('./deal/deal-tab-exp-view/deal-tab-exp-view.vue'),
      );
    case 'task_my_all_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-my-all-tab-search-view/task-my-all-tab-search-view.vue'
          ),
      );
    case 'quote_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './quote/quote-grid-view-multimode/quote-grid-view-multimode.vue'
          ),
      );
    case 'solution_edit_view':
      return defineAsyncComponent(
        () => import('./solution/solution-edit-view/solution-edit-view.vue'),
      );
    case 'sales_order_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-list-view-multimode/sales-order-list-view-multimode.vue'
          ),
      );
    case 'payee_plan_grid_view':
      return defineAsyncComponent(
        () =>
          import('./payee-plan/payee-plan-grid-view/payee-plan-grid-view.vue'),
      );
    case 'sales_order_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-main-view/sales-order-main-view.vue'
          ),
      );
    case 'vendor_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './vendor/vendor-pickup-grid-view/vendor-pickup-grid-view.vue'
          ),
      );
    case 'account_attachment_view':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-attachment-view/account-attachment-view.vue'
          ),
      );
    case 'purchase_order_grid_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-grid-view-multimode/purchase-order-grid-view-multimode.vue'
          ),
      );
    case 'task_redirect_view':
      return defineAsyncComponent(
        () => import('./task/task-redirect-view/task-redirect-view.vue'),
      );
    case 'account_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './account/account-list-view-multimode/account-list-view-multimode.vue'
          ),
      );
    case 'weeklies_edit_view_leader':
      return defineAsyncComponent(
        () =>
          import(
            './weeklies/weeklies-edit-view-leader/weeklies-edit-view-leader.vue'
          ),
      );
    case 'task_task_edit_view':
      return defineAsyncComponent(
        () => import('./task/task-task-edit-view/task-task-edit-view.vue'),
      );
    case 'purchase_order_list_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-list-view-multimode/purchase-order-list-view-multimode.vue'
          ),
      );
    case 'task_re_mpick_up_view_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-re-mpick-up-view-pickup-grid-view/task-re-mpick-up-view-pickup-grid-view.vue'
          ),
      );
    case 'task_all_maneuver_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-all-maneuver-tab-search-view/task-all-maneuver-tab-search-view.vue'
          ),
      );
    case 'lead_pickup_view':
      return defineAsyncComponent(
        () => import('./lead/lead-pickup-view/lead-pickup-view.vue'),
      );
    case 'purchase_order_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-data-view-multimode/purchase-order-data-view-multimode.vue'
          ),
      );
    case 'quote_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './quote/quote-data-view-multimode/quote-data-view-multimode.vue'
          ),
      );
    case 'vendor_data_view_multimode':
      return defineAsyncComponent(
        () =>
          import(
            './vendor/vendor-data-view-multimode/vendor-data-view-multimode.vue'
          ),
      );
    case 'sales_order_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './sales-order/sales-order-tab-search-view/sales-order-tab-search-view.vue'
          ),
      );
    case 'call_tab_search_view':
      return defineAsyncComponent(
        () => import('./call/call-tab-search-view/call-tab-search-view.vue'),
      );
    case 'purchase_order_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './purchase-order/purchase-order-tab-search-view/purchase-order-tab-search-view.vue'
          ),
      );
    case 'solution_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './solution/solution-tab-search-view/solution-tab-search-view.vue'
          ),
      );
    case 'payee_plan_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-plan/payee-plan-tab-search-view/payee-plan-tab-search-view.vue'
          ),
      );
    case 'payee_multimode_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee/payee-multimode-edit-view/payee-multimode-edit-view.vue'
          ),
      );
    case 'app_panel_view':
      return defineAsyncComponent(
        () => import('./app-panel-view/app-panel-view.vue'),
      );
    case 'project_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './project/project-tab-search-view/project-tab-search-view.vue'
          ),
      );
    case 'app_portal_view':
      return defineAsyncComponent(
        () => import('./app-portal-view/app-portal-view.vue'),
      );
    case 'deal_tab_search_view':
      return defineAsyncComponent(
        () => import('./deal/deal-tab-search-view/deal-tab-search-view.vue'),
      );
    case 'payee_tab_search_view':
      return defineAsyncComponent(
        () => import('./payee/payee-tab-search-view/payee-tab-search-view.vue'),
      );
    case 'lead_tab_search_view':
      return defineAsyncComponent(
        () => import('./lead/lead-tab-search-view/lead-tab-search-view.vue'),
      );
    case 'user_custom_view':
      return defineAsyncComponent(
        () => import('./user/user-custom-view/user-custom-view.vue'),
      );
    case 'contact_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './contact/contact-tab-search-view/contact-tab-search-view.vue'
          ),
      );
    case 'campaign_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './campaign/campaign-tab-search-view/campaign-tab-search-view.vue'
          ),
      );
    case 'service_case_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './service-case/service-case-tab-search-view/service-case-tab-search-view.vue'
          ),
      );
    case 'quote_tab_search_view':
      return defineAsyncComponent(
        () => import('./quote/quote-tab-search-view/quote-tab-search-view.vue'),
      );
    case 'invoice_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './invoice/invoice-tab-search-view/invoice-tab-search-view.vue'
          ),
      );
    case 'app_login_view':
      return defineAsyncComponent(
        () => import('./app-login-view/app-login-view.vue'),
      );
    case 'product_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './product/product-tab-search-view/product-tab-search-view.vue'
          ),
      );
    case 'payee_statistic_chart_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-statistic/payee-statistic-chart-grid-view/payee-statistic-chart-grid-view.vue'
          ),
      );
    case 'task_task_tree_exp_view':
      return defineAsyncComponent(
        () =>
          import('./task/task-task-tree-exp-view/task-task-tree-exp-view.vue'),
      );
    case 'payee_statistic_chart_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './payee-statistic/payee-statistic-chart-exp-view/payee-statistic-chart-exp-view.vue'
          ),
      );
    case 'price_book_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './price-book/price-book-tab-search-view/price-book-tab-search-view.vue'
          ),
      );
    case 'event_tab_search_view':
      return defineAsyncComponent(
        () => import('./event/event-tab-search-view/event-tab-search-view.vue'),
      );
    case 'vendor_tab_search_view':
      return defineAsyncComponent(
        () =>
          import('./vendor/vendor-tab-search-view/vendor-tab-search-view.vue'),
      );
    case 'task_maneuver_kanban_view':
      return defineAsyncComponent(
        () =>
          import(
            './task/task-maneuver-kanban-view/task-maneuver-kanban-view.vue'
          ),
      );
    case 'task_index_view':
      return defineAsyncComponent(
        () => import('./task-index-view/task-index-view.vue'),
      );
    case 'app_index_view':
      return defineAsyncComponent(
        () => import('./app-index-view/app-index-view.vue'),
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}
