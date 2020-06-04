import { defineConfig } from 'umi';

export default defineConfig({
  nodeModulesTransform: {
    type: 'none',
  },
  layout: {
    name: 'Hippo',
  },
  routes: [
    { path: '/', component: '@/pages/index' },
  ],
});
