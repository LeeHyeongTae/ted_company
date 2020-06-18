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
    },
    decrement (state) {
      state.count--
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
      axios.get('http://localhost:5000/random')
          .then((res) => {
            console.log('res = ' + parseInt(res.data.randNumber))
            commit('successGenerateRandomNumber', parseInt(res.data.randNumber))
          })
    }
  },
  getters: {
    count (state, getters) {
      return Math.pow(state.count, getters.weight)
    },
    weight (state) {
      return state.weight
    },
    random (state) {
      return state.random
    }
  },
  modules: {
    member, bicycle
  }
});
