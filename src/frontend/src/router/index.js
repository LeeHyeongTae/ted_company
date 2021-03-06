import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
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
    {path: "/mypage", name:'myPage', component: MyPage},
    {path: "/history", name:'history', component: BicycleHistory},
    {path: "/bicycle", name:'bicycle', component: Bicycle},
  ]
})
