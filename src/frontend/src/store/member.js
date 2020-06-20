import axios from "axios";

const state = {
   context: 'http://localhost:5000',
   auth: false,
   member: {}
}

const actions = {
    async submit({commit}, user){
        console.log('name = '+user.name+' email = '+user.email+' passwd = '+user.password)
        const headers = {
            authorization: 'JWT fefege..',
            Accept: 'application/json',
            'Content-Type':'application/json'
        }
        axios
            .post(`${state.context}/members/join`, user, headers)
            .then(({data})=>{
                console.log('submit server success')
                commit('SUBMIT', data)
            })
            .catch((e)=>{
                console.log('Submit'+e)
            })
    },
    async login({commit}, user) {
        console.log('login action')
        const headers = {
            authorization: 'JWT fefege..',
            Accept: 'application/json',
            'Content-Type':'application/json'
        }
        axios
            .post(`${state.context}/members/login`, user, headers)
            .then(({data})=>{
                commit('LOGIN', data)
            })
            .catch((e)=>{
                console.log('Login'+e)
            })
    }
}

const mutations = {
    SUBMIT(state, data){
      console.log(data)
    },
    LOGIN(state, data){
        console.log(data)
    },
}

export default {
    name: 'member',
    namespaced: true,
    state,
    mutations,
    actions,
}