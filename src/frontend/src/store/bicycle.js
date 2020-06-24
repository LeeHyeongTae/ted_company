import axios from 'axios'

const state = {
    context: 'http://localhost:5000',
    bicycle: [],
    pager: [],
    count: 0,
}

const actions = {
    async dataCall({commit}){
        axios.get(`${state.context}/proxy/bicycle`)
            .then(({data})=>{
                console.log("자바 서버 다녀옴.")
                commit('BICYCLES', data)
            })
            .catch((exception)=>{
                alert('action error'+exception)
            })
    }
}

const mutations = {
    BICYCLES(state, data){
        state.bicycle = []
        state.count = data.count
        data.list.forEach(item => {
            state.bicycle.push({
                bicycleSeq: item.bicycleSeq,
                name: item.title,
                manufacturer: item.manufacturer,
                kind: item.kind,
                image: item.image,
                year: item.year,
                price: item.price
            })
        })
    }
}

const getters = {}

export default {
    name : 'bicycle',
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}