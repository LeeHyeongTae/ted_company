<template>
    <v-container class="pa-4 text-center">
        <v-row class="fill-height" align="center" justify="center">
            <template v-for="(item, i) in items">
                <v-col
                  :key="i"
                   cols="12"
                   md="4"
                >
                    <v-hover v-slot:default="{ hover }">
                        <v-card
                           :elevation="hover ? 12 : 2"
                           :class="{ 'on-hover': hover }"
                           :href= item.link
                        >
                            <v-img
                                    :src="item.img"
                                    height="225px"
                            >
                              <v-card-title class="title white--text">
                                  <v-row
                                          class="fill-height flex-column"
                                          justify="space-between"
                                  >{{ item.title }}
                                  </v-row>
                              </v-card-title>
                            </v-img>
                        </v-card>
                    </v-hover>
                </v-col>
            </template>
        </v-row>
    </v-container>
</template>

<script>
    export default {
        name: "Links",
        data () {
            return {
                items: [
                    {title: 'TREK',link:'https://www.trekbikes.com/kr/ko_KR/' ,img: 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTctM4fgbGW2tVXZsibt8InPVEdD-uPQl8bdQAdMAoabV4OxvHD&usqp=CAU'},
                    {title: 'SPECIALIZED',link:'https://www.specialized.com/kr/ko' ,img: 'https://bicigrino.com/images/rocketlauncher/frontpage/sidebar-a/specialized_movil.jpg'},
                    {title: 'GIANT',link:'https://www.giant-bicycles.com/kr' ,img: 'https://4.bp.blogspot.com/-RQh2Ux8zGOE/VzxpU8BmJ9I/AAAAAAAAEd4/wP-7C-Txfr8i4EE5dNaA3H8EWrUxywrowCLcB/s1600/Giant%2BBicycles%2BLogo.png'},
                    {title: 'MERIDA',link:'https://www.merida-bikes.com/ko-kr/' ,img: 'https://lh3.googleusercontent.com/proxy/H4Meov-nzpDA2AEgSqmVO3mwuJzbD-GBwIlIEaJu6-9y8Urk1aclZoE_hBMx9aY3nRHf-3np0MAAyE5Q8XobctACcqeosGk2iZ4wIvrTTFJR3zPo5Ygk-aY1m4VYyTJsr4TFSclCdBp0O406YG57Pqg' },
                    {title: 'SCOTT',link:'https://www.scott-korea.com/main/index.html' ,img: 'https://www.ilbe.com/file/download/5131834259' },
                ]
            }
        }
    }
</script>

<style scoped>
    .v-card {
        transition: opacity .4s ease-in-out;
    }

    .v-card:not(.on-hover) {
        opacity: 0.6;
    }
</style>