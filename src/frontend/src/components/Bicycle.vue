<template>
    <v-container>
        <a>DB에 있는 정보수 : {{ count }}</a>
        <v-card>
            <v-card-title>
                All of Bicycle
                <v-spacer/>
                <v-text-field
                    v-model="search"
                    append-icon="mdi-magnify"
                    label="Search"
                    single-line
                    hide-details
                ></v-text-field>
            </v-card-title>

            <v-data-table
                :headers="headers"
                :items="bikes"
                :search="search">
                <template v-slot:item.image="{item}">
                    <img :src=item.image width="345" height="230"/>
                </template>

            </v-data-table>
        </v-card>
    </v-container>
</template>

<script>
import {mapState} from 'vuex'
    export default {
        data () {
            return {
                OK: true,
                search: '',
                headers: [
                    {
                        text: 'bicycleSeq',
                        value: 'bicycleSeq'
                    },
                    {
                        text: 'image',
                        value: 'image'
                    },
                    {
                        text: 'name',
                        value: 'name'
                    },
                    {
                        text: 'manufacturer',
                        value: 'manufacturer'
                    },
                    {
                        text: 'kind',
                        value: 'kind'
                    },
                    {
                        text: 'price',
                        value: 'price'
                    },
                    {
                        text: 'year',
                        value: 'year'
                    },

                ]
            }
        },
        methods: {
            dataCall() {
                this.$store.dispatch('bicycle/dataCall')
            },
        },
        computed: {
            ...mapState({
                bikes: state => state.bicycle.bicycle,
                count: state => state.bicycle.count
            }),
        },
        mounted() {
            this.$store.dispatch('bicycle/dataCall')
        }
    }
</script>

<style scoped>

</style>