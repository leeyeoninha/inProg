import Vue from 'vue';
import VueRouter from 'vue-router';

import Home from './components/Home.vue';
import SignUp from './components/SignUp.vue';

// Vue Router 플러그인을 사용하도록 Vue에 알리기
Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    component: Home
  },
  {
    path: '/signup',
    component: SignUp
  },
];

// 라우터 인스턴스 생성
const router = new VueRouter({
  mode: "history", 
  routes,
});

export default router;
