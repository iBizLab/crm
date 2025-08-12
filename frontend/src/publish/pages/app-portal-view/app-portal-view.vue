<template>
  <i-biz-portal-view
    :context="props.context"
    :params="props.params"
    :modal="props.modal"
    :model-data="model"
  >
    <template #dashboard="slotProps">
      <i-biz-dashboard-control v-bind="slotProps" />
    </template>
  </i-biz-portal-view>
</template>
<script setup lang="ts">
import { IModal } from '@ibiz-template/runtime';
import { defineProps, withDefaults } from 'vue';

interface Props {
  model: IModel;
  context?: IContext;
  params?: IParams;
  modal?: IModal;
}
const props = withDefaults(defineProps<Props>(), {});
</script>
