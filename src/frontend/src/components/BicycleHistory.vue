<template>
    <v-container>
        <v-timeline>
          <v-timeline-item
               v-for="(year, i) in years"
               :key="i"
               :color="year.color"
               small
          >
           <template v-slot:opposite>
            <span
                :class="`headline font-weight-bold ${year.color}--text`"
                v-text="year.year"
            ></span>
              </template>
                    <div class="py-4">
                        <h2 :class="`headline font-weight-light mb-4 ${year.color}--text`">{{year.title}}</h2>
                        <div>
                            {{ year.content }}
                        </div>
                        <img :src="year.img" height="300" width="500">
                    </div>
        </v-timeline-item>
        </v-timeline>
    </v-container>
</template>

<script>
    export default {
        name: "History",
        data: () => ({
            years: [
                {
                    color: 'cyan',
                    year: '1790',
                    title: '최초의 자전거',
                    content: '셀레리페르(Celerifere), 콩트 드 시브락(Conte de Sivrac)이 발명.',
                    img: 'https://post-phinf.pstatic.net/MjAxOTEyMjBfMTAy/MDAxNTc2ODA5NTM5Nzkw.Nj5xCJ77c-fNB3tZ3VngPsfYnODhENk8RxxlUN27OnIg.x8k0OevJaZnvDNG9UfP_Ps77GSoYgIlyDYBZQshcL4Eg.JPEG/%EC%B5%9C%EC%B4%88%EC%9D%98_%EC%9E%90%EC%A0%84%EA%B1%B0_%EC%85%80%EB%A0%88%EB%A6%AC%ED%8E%98%EB%A6%AC3.jpg?type=w1200'
                },
                {
                    color: 'green',
                    year: '1817',
                    title: '최초의 조향계 부착',
                    content: '드라이지네(Draisienne), 카를 폰 드라이스(Baron Karl von Drais)이 고안하여 부착',
                    img: 'http://myhand.kr/bike2/img/001.jpg'
                },
                {
                    color: 'pink',
                    year: '1839',
                    title: '최초의 페달',
                    content: '커크패트릭 맥밀런(Kirkpatrick MacMillan)이 페달을 발명.',
                    img: 'https://lh3.googleusercontent.com/proxy/I9E8nW78T_jsP9HWb4BH_qr5ib1QY6xoOAGZaESHw6TEKR3EgcXEO_sJZI_BSXg7nPqsUC40AeZwSLGGIYfCqUEJ8YzvPopxJ9Xf4om7ktPIRBAmZvwRo5SKq5_7CW7ux5VqjNAYoiwILaEKoFjeD9rIIGLGF3Jkga72NGV2fVeEdp9N5GPzj9-Pfjis'
                },
                {
                    color: 'amber',
                    year: '1860',
                    title: '크랭크 구동 시스템, 현대식 자전거의 출발점.',
                    content: '벨로시페드(velocipede), 피에리 미쇼, 오늘날의 페달로 바퀴를 돌리는 자전거로 대장간과 마차 제작소를 운영하던 페이르 미쇼는 앞바퀴에 페달을 단 나무자전거를 만들었는데 이를 벨로시페드라 불렀다.',
                    img: 'http://myhand.kr/bike2/img/002.jpg'
                },
                {
                    color: 'orange',
                    year: '1868',
                    title: '고무타이어 개발',
                    content: '클레망 아데르(Clement Ader)가 기존의 나무바퀴가 노면의 진동과 충격이 너무 심하게 전달되어 본 쉐이커(Bone shaker)라는 별명을 얻자, 고무를 씌운 형태로 개량하였다. 최초의 고무타이어. 이후 바퀴에 통고무를 쓰면서 승차감도 좋아지고 속도도 빨라졌다.',
                    img: 'https://lh3.googleusercontent.com/proxy/5kN0TAOq-yonSiqxUzFE_gMQyDv3deyEYjUlXTzXSqy7G2B-mt0qtsudNX54el_k-5PRah1zHDNwvylWKwMQrqxmKK8A7HEzvac-tsv2ILK6xSrh8D9uTxKjz5HmuAjf-3YUinXdA4IUkuvw_Ru_A9dAUnv8fLqGejwN'
                },
                {
                    color: 'green',
                    year: '1871',
                    title: '빅휠 / 오디너',
                    content: '영국의 제임스 스탈리는 앞바퀴가 크고 뒷바퀴는 작은 하이휠, 또는 빅휠, 오디너리라는 자전거를 발명하였고, 속도가 높아져 자전거 경주를 인기 스포츠로 이끌었다.',
                    img: 'http://myhand.kr/bike2/img/003.jpg'
                },
                {
                    color: 'cyan',
                    year: '1885',
                    title: '로버 세이프티(ROVER Safety)',
                    content: '존 캠프 스탈리와 월리엄 힐먼이 기존 빅휠의 위험성을 해결한 안전한 자전거를 개발하여 세이프티 자전거라 불렀다.',
                    img: 'http://myhand.kr/bike2/img/004.jpg'
                },
                {
                    color: 'pink',
                    year: '1885',
                    title: '비앙키(Bianchi)',
                    content: '에두아르도 비앙키(이탈리아)가 체레스테 그린이 잘 어울리는 자전거브랜드를 런칭했다.',
                    img: 'http://bike.chosun.com/site/data/img_dir/2017/01/16/2017011601430_9.jpg'
                },
                {
                    color: 'amber',
                    year: '1896',
                    title: '파리-루베(Paris-Roubaix) 경기',
                    content: '처음에는 파리에서 출발, 루베에서 끝났으나 1966에는 파리 북쪽 50km정도 떨어진 샹띠이(Chantilly)에서, 1977년 부터는 80km 떨어진 꽁삐에뉴(Compiegne)에서 시작, 대략 260km 정도 되는 경기. ',
                    img: 'https://lh3.googleusercontent.com/proxy/nKc_1-NLHYUqDWmZSTSEG-N5XHweZvGC7VAdy1xKmzyXN4VXkpXo6jlM0jxzyVlIjRlwo9u8AOcO73UyrY6FCtZRxBFxErgpNWTpzurWivmcq7C4h0w0L-BMOylaav-x4CHvA-pCmK6vQkJLkMBSEfGe3-F9wpbhY1XKbtugKhJHo-OywjV1jsTSt2RCsfAvOA5avA'
                },
                {
                    color: 'orange',
                    year: '1900',
                    title: 'UCI(Union Cyclitse Internationale)',
                    content: '각 국가 연맹 및 관련 주요 단체들과 협조를 통하여 사이클 모든 분야에 있어 차별없이 발전 및 증진 시키는데 그 목적을 가지고 창설되었다.',
                    img: 'https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F27364547530BD02D2E'
                },
                {
                    color: 'green',
                    year: '1903',
                    title: '투르 드 프랑스(le Tour de France)',
                    content: '3대 그랑 투르(Grand Tour, 투르 드 프랑스, 아래 나오는 지로 디탈리아, 부엘타 에스파냐) 중 가장 오래되고 유명한 대회 시초는 프랑스 스포츠 신문사인 로토(L\'Auto)의 편집장 앙리 데그랑주(Henri Desgrange)가 신문 발행부수를 늘려 보려고 고민하고 있을 때 지오(=조르주 George) 르페브르(Geo Lefevre)가 마드리드 카페(Cafe de Madrid)에서 보르도-파리 경기(르 쁘띠 쥬흐날(Le Petit Journal) 신문사가 후원)를 보고 영감을 얻어 앙리 데그랑주와 만들었다.',
                    img: 'https://roadbikeaction.com/wp-content/uploads/2015/10/tour-de-france-logo-on-france-flag_1920x1080_746-hd.jpg'
                },
                {
                    color: 'cyan',
                    year: '',
                    title: '지로 디 이탈리아(Giro dItalia)',
                    content: '첫 경기는 1909년 5월 13일 개최. 동기는 역시 라 가제타 델로 스포르트의 편집자인 에밀리오 카밀로 코스타마냐(Emilio Camillo Costamagna)가 로토의 성공을 보고 시작.\n' +
                        '\n' +
                        '밀란(Milan)에서 출발해서 이탈리아 전역을 일주하고 다시 돌아오는 8개 스테이지에 총 거리 2448km로 그 첫 시합을 개최, 127명이 출발해서 49명만 최종적으로 골인했다. 출발과 골인지점이 밀란인 이유는 순전히 라 가제타 델로 스포르트가 있는 곳이기 때문 1960년 이후 종종 코스와 종착지가 바뀌었고, 100주년 기념 경기 종착지는 로마였다.\n' +
                        '\n' +
                        '우승저지의 색은 TDF와 마찬가지로 당시 라 가제타 델로 스포르트 신문의 색이었던 분홍색, 말리아 로자(Maglia Rosa. TDF의 경우 노란 저지인 마이요 존느). 최다 포인트 득점자는 말리아 로소 파시오네(Maglia Rosso Passione. 빨간색 저지. TDF의 경우 녹색 저지인 마이요 베르), 산악왕은 말리아 베르데(Maglia Verde, 녹색 저지. TDF는 흰색 바탕에 붉은 무늬가 들어간 마이요 아 푸아 루주), 젊은 최우수 라이더는 말리아 비앙카(Maglia Bianca, 흰색 저지. TDF의 마이요 블랑과 동일한 색이다.)',
                    img: 'https://mblogthumb-phinf.pstatic.net/MjAxODAxMjJfMTkz/MDAxNTE2NTYzNDc1NDM1.0GejjtHvFnN4xLX9IRLxEKR0surmZ32e7z_IRd_ILJgg.Y-tJxUaM3ch_l4VQaEjBEsfhpV3Fci0EXJoebNRoLQ0g.JPEG.doosane/FB_IMG_1516471147616.jpg?type=w800'
                },
            ],
        }),
    }
</script>

<style scoped>

</style>