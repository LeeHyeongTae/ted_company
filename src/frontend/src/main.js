import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import {store} from "./store";
import vuetify from "./plugins/vuetify";
import Vuex from "vuex";
import axios from "axios";
import cookies from 'vue-cookies'

Vue.config.productionTip = false;

new Vue({
  cookies,
  router,
  Vuex,
  axios,
  store,
  vuetify,
  render: h => h(App),
  components: {
    //전역적으로 사용된다.
  }
}).$mount("#app");
