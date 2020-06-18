import axios from 'axios'

const state = {
    context: 'http://localhost:5000',
    bicycle: [],
    pager: [],
    count: 0,
}

const actions = {
    async trekCrawler({commit}){
        axios.get(`${state.context}/proxy/bicycleCrawler/trek`)
            .then(({data})=>{
                console.log("자바 서버 다녀옴.")
                commit('TREK', data)
            })
            .catch((exception)=>{
                alert('action error'+exception)
            })
    }
}

const mutations = {
    TREK(state, data){
        state.bicycle = []
        state.count = data.count
        data.list.forEach(item => {
            state.bicycle.push({
                bicycleSeq: item.bicycleSeq,
                title: item.title,
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