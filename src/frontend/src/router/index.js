import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Composition from "../components/Composition";
import Member from "../components/Member";
import Weapon from "../components/Weapon";

Vue.use(VueRouter);
export default new VueRouter({
  mode: 'history',
  routes: [
    {
      path: "/",
      component: Home
    },
    {
      path: "/composition",
      component: Composition
    },
    {
      path: "/member",
      component: Member
    },
    {path: "/weapon",
      component: Weapon
    }
  ]
})
