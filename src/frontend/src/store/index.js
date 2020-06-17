import Vue from "vue";
import Vuex from "vuex";
import member from "./member";
import bicycle from "./bicycle";
import axios from 'axios'
Vue.use(Vuex);

export const store = new Vuex.Store({
  state: {
    count: 0,
    weight: 2,
    random: 0
  },
  mutations: {
    increment (state) {
      state.count++
      this.$cookies.set('value', this.$store.state.count)
    },
    decrement (state) {
      state.count--
      this.$cookies.set('', this.$store.state.count)
    },
    successGenerateRandomNumber (state, payload) {
      state.random = payload
    },
    failGenerateRandomNumber () {
      console.log('Error')
    }
  },
  // Mutex(뮤텍스)
  actions: {
    generateRandomNumber ({commit}) {
      axios.get('http://localhost:3000/random')
          .then((res) => {
            console.log(res)
            commit('successGenerateRandomNumber', res.data.randNumber)
          })
    }
  },
  getters: {},
  modules: {
    member, bicycle
  }
});
