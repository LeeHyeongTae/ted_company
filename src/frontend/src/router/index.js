import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Composition from "../components/Composition";
import Join from "../components/common/Join";
import Login from "../components/common/Login";
import BicycleHistory from "../components/BicycleHistory";
import Intro from "../components/Intro";
import MyPage from "../components/common/MyPage";
import Information from "../components/Information";
import Bicycle from "../components/Bicycle";
import Links from "../components/common/Links";

Vue.use(VueRouter);
export default new VueRouter({
  mode: 'history',
  routes: [
    {path: "/", name:'home', component: Home},
    {path: "/links", name:'links', component: Links},
    {path: "/info", name:'information', component: Information},
    {path: "/intro", name:'intro', component: Intro},
    {path: "/join", name:'join', component: Join},
    {path: "/login", name:'login', component: Login},
    {path: "/mypage", name:'myPage', component: MyPage},
    {path: "/history", name:'history', component: BicycleHistory},
    {path: "/composition", name:'composition', component: Composition},
    {path: "/bicycle", name:'bicycle', component: Bicycle},
  ]
})
