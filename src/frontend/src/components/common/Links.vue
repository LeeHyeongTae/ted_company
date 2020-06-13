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
                    {title: 'SPECIALIZED',link:'https://www.specialized.com/kr/ko' ,img: 'https://lh3.googleusercontent.com/proxy/7xvVUzrpDEeRkkFSH6b4DmDVmvSYDtjvTxgAi5PA2mL5ymAz2Gv-9l3ML8aD2elk33STbRD9zoUMFE6_VDND-jacS7eSLzF89PvG4knjrgvOHBDauNUOa8dOvYtrucicMf7mXmef3a5OfQHONX4fsdMFeX4uPjf1K3sX-WP0KX8U1_Uyh12iYw5aSnRrYeLKvoqEmVKiWqShgwwb9QhU2u1o3dk'},
                    {title: 'GIANT',link:'https://www.giant-bicycles.com/kr' ,img: 'https://lh3.googleusercontent.com/proxy/NGl32sWRjpItctOHFUN7OWLpEdhLKAsuFiYfJKphM6Vdzct7jDwhXzkkrqmX9bqtis675t77wYvmpNdwrn02hIkAwpG85SYYu3uSWpv9DhbIi_IyaT593ElrzM3CZVLt1ACKWwG3uc-YLuYMuOQFqblfIhfHOWLWwMxCgvqAsWe2MqVm2RsUZHXSoxbwUchuxgayvjV-2z9LaJLc_IoOLgCBqGnQFqUvN21UsZbdBOuE2yoScglIHry59-1UmEjCCcpKAt5MwUcVUGfkbQR3t-8m_3efcmJRv0Rk15oIhxi1jhM'},
                    {title: 'MERIDA',link:'https://www.merida-bikes.com/ko-kr/' ,img: 'https://lh3.googleusercontent.com/proxy/rojKj2pHObPM-LsXtcBfM854w72TiBmv7AFB1BqYCcZ0c6Ku0KC76wWy_o_39xjsfxhfRXaME7aUn2XFTz3KSV3JB1ACZF86xAK2ZiJcgw' },
                    {title: 'SCOTT',link:'https://www.scott-korea.com/main/index.html' ,img: 'https://lh3.googleusercontent.com/proxy/FbjxSOblOrpfnFpwwH30S9uALNJx26rwQB-uLvDPRCHcuVp4pTg-QVN38Mi_SSMyfcBacItn1pmWbReJnFuqOkQwC5kmCAS8uOle14oVWnnHm8hu9OjDW2vCkBrvplt_WOsTKqKfXdzNW_Xx2Ft88a4Ok68TvDXS-j-G9ZYm_W8b' },
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