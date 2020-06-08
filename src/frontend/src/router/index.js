import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Composition from "../components/Composition";
import Member from "../components/Member";
import Weapon from "../components/Weapon";
import Join from "../components/Join";
import Login from "../components/Login";

Vue.use(VueRouter);
export default new VueRouter({
  mode: 'history',
  routes: [
    {path: "/", name:'home', component: Home},
    {path: "/join", name:'join', component: Join},
    {path: "/login", name:'login', component: Login},
    {path: "/history", name:'history', component: History},
    {path: "/composition", name:'composition', component: Composition},
    {path: "/member", name:'member', component: Member},
    {path: "/weapon", name:'weapon', component: Weapon}
  ]
})
