import axios from "axios";
import router from "@/router";

const state = {
   context: 'http://localhost:3000'
}

const actions = {
    async login({commit}, user){
        alert(user.email)
        axios
            .get(`${state.context}/members/${user.email}/${user.passwd}`)
            .then(({data})=>{
                router.push('/intro')
                commit('LOGIN', data)
            })
            .catch(()=>{
                alert('통신 에러')
            })
    }
}

const mutations = {
    LOGIN(state, data){
        alert(`${data}`)
    }
}

export default {
    name: 'member',
    namespaced: true,
    state,
    mutations,
    actions,
}