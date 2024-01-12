import { createRouter, createWebHistory } from 'vue-router';
import Home from './components/Home.vue';
import SignUp from './components/SignUp.vue';
import Main from './components/Main.vue';

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/signup',
    name: 'SignUp',
    component: SignUp
  },
  {
    path: '/main',
    name: 'Main',
    component: Main
  },
];

const router = createRouter({
  history: createWebHistory(),
  routes
});


export default router;
