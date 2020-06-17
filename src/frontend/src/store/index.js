import Vue from "vue";
import Vuex from "vuex";
import member from "./member";
import bicycle from "./bicycle";
Vue.use(Vuex);

export const store = new Vuex.Store({
  modules: {
    member, bicycle
  }
});
