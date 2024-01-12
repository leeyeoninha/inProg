<template>
  <div class="hello">
    <!-- 사용자 이름을 입력받는 input 요소 -->
    <input v-model="name" type="text" placeholder="Input Your Name">
    <!-- fetchHello 메소드를 실행하는 버튼 -->
    <button v-on:click="fetchHello">Send</button>
    <!-- 응답 메시지를 표시하는 h1 요소 -->
  </div>
</template>


<script>

import axios from 'axios';

export default {
  name: 'HelloWorld',
  data() {
    return {
      // 사용자 이름과 응답 메시지를 저장하는 변수
      name : null,
      msg: null,
    };
  },
  
  methods: {
    fetchHello() {
      // 서버로 부터 데이터를 가져오는 메서드
      axios.get(`http://localhost:8080/hello?name=${this.name}`)
        .then(response => {
          // 응답 데이터를 msg 변수에 저장
          this.msg = response.data;
        })
        .catch(error => {
          console.error(error);
        });
    },
  },
}
</script>

<!-- "scoped" 속성을 추가하여 CSS가 이 컴포넌트에만 적용되도록 함 -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
