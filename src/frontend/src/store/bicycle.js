import axios from 'axios'

const state = {
    context: 'http://localhost:5000',
    bicycle: [],
    pager: [],
    count: 0,
}

const actions = {
    async trekCrawler({commmt}){
        axios.get(`${state.context}/proxy/bicycleCrawler/trek`)
            .then(({data})=>{
                console.log("자바 서버 다녀옴.")
                commmt('TREK', data)
            })
            .catch(()=>{
                alert('action error')
            })
    }
}

const mutations = {
    TREK(state, data){
        state.bicycle = data.list
        state.count = data.count
    }
}
const getters = {

}

export default {
    name : 'bicycle',
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}