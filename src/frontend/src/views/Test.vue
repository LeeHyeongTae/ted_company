<template>
    <div>
        <h1>This is Test Page</h1>
        <v-btn @click="reverseMsg">reverse Message</v-btn>
        <p>{{ message }}</p><br>
        <b>count: {{ this.$store.state.count }}</b><br>
        <b>count^2: {{ this.$store.getters.count }}</b><br>
        <b>weight: {{ this.$store.getters.weight }}</b><br>
        <b>random: {{ this.$store.getters.random }}</b><br>
        <input type="button" @click="increment()" value="increment"/>
        <input type="button" @click="decrement()" value="decrement"/>
        <input type="button" @click="randomNumber()" value="random"/>

    </div>

</template>

<script>
    export default {
        data ()  {
            return {
                cnt: 0,
                count: 7,
                message: '안녕 난 뷰야'
            }

        },
        methods: {
            reverseMsg: function () {
                // 현재 가지고 있는 메세지를 스필릿해서 리버스를 통해서 전부 순서를 뒤집는다. 최종적으로 조인을 통해 다시 결합한다.
                this.message = this.message.split('').reverse().join()
                // $가 붙으면 Vue 내장 함수를 사용하겠다는 의미.
                // 객체가 파괴되면 우리가 어떠한 요청을 넣어도 응답하지 않게 된다.
                this.$destroy()
            },
            increment() {
                this.$store.commit('increment')
                // 먼저 기능을 연동하고 이후 상태값 저장하는 것을 한번 살펴보도록 한다.(F5)
                this.$cookies.set('value', this.$store.state.count)
                console.log(this.$cookies.get('value'))
            },
            decrement() {
                this.$store.commit('decrement')
                this.$cookies.set('value', this.$store.state.count, '24h')
                console.log(this.$cookies.get('value'))
            },
            randomNumber() {
                this.$store.dispatch('generateRandomNumber')
            }
        },
        // Vue의 경우엔 객체에 대한 변경을 감지하면 무조건 Rendering을 수행한다.
        // Rendering이란 화면을 그리는 작업이다.
        beforeCreate() {//객체 생성 전
            //alert('beforeCreate'+this.message)
        },
        created() {//객체 생성
            // this.$cookies에 'value'키값 형태로 값이 저장되어 있다. 하지만 이것을 store에 있는 count에 복원
            // 해주지 않았기 때문에 상태값이 저장되지 않았던 것이다.
            this.$store.state.count = this.$cookies.get('value')
        },
        beforeMount() {
           // alert('beforeMount'+this.message)
        },
        mounted() {
           // alert('mounted'+this.message)
        },
        // 실제 렌더링은 업데이티드가 온전히 끝나는 시점에 진행된다. 이 사이에서 값을 바꿔줄 필요가 있다면 비포 업데이트나 업데이티드에서 수정해주면
        // 렌더링에 적용을 할 수 있다.
        beforeUpdate() {
           // alert('beforeUpdate'+this.message)
        },
        updated() {
           // alert('updated'+this.message)
        },
        beforeDestroy() {
           // alert('beforeDestroy = '+this.message)
        },
        destroyed() {
          //  alert('Destroyed = '+this.message)
            // 동영상, 오디오 같은 대규모 접속 시스템에서 대규모 대용량 스트림들이 지나다니게 되면 객체가 파괴될
            // 가능성이 있다. 객체가 파괴될 가능성이 있다면 destroyed에서 다시 생성시킨다.
        }
    }
</script>

<style scoped>

</style>