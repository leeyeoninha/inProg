<template>
  <div>
    <h2>회원가입</h2>
    <table>
      <!-- 각 필드에 v-model을 사용하여 양방향 데이터 바인딩을 설정합니다. 이를 통해 사용자가 입력한 값이 Vue 인스턴스의 데이터와 동기화됩니다. -->
      <tr>
        <th>아이디</th>
        <th><input type="text" v-model="id"></th>
      </tr>
      <tr>
        <th>패스워드</th>
        <th><input type="password" v-model="passwd"></th>
      </tr>
      <tr>
        <th>패스워드 확인</th>
        <th><input type="password" v-model="passwd_chk"></th>
      </tr>
      <tr>
        <th>이름</th>
        <th><input type="text" v-model="name"></th>
      </tr>
      <tr>
        <th>나이</th>
        <th><input type="number" v-model="age"></th>
      </tr>
      <tr>
        <th>이메일</th>
        <th><input type="email" v-model="email"></th>
      </tr>
    </table>
    <!-- @click 디렉티브를 사용하여 클릭 이벤트 핸들러를 등록합니다. -->
    <button @click="signUp">회원가입</button>
    <button @click="goHome">홈으로</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'SignUp',
  data() {
    // vue 인스턴스에서 사용할 데이터를 정의합니다.
    return {
      id: '',
      passwd: '',
      passwd_chk:'',
      name: '',
      age: null,
      email: ''
    };
  },
  methods: {
    async signUp() {
      // 패스워드 일치 여부를 검증합니다.
      if( this.passwd != this.passwd_chk){
        alert("패스워드가 일치하지 않습니다.");
        return false;
      }
      // 나이의 유효성을 검증합니다.
      if( this.age <= 0){
        alert("나이를 확인해주세요");
        return false;
      }

      // 사용자가 입력한 데이터를 객체로 만듭니다.
      const userData = {
        id: this.id,
        passwd: this.passwd,
        name: this.name,
        age: this.age,
        email: this.email
      };
      
      try {
        // axios를 사용하여 백엔드 서버로 회원가입 요청을 보냅니다.
        const response = await axios.post('http://localhost:8080/signup', userData );

        // 요청이 성공하면, 결과를 alert로 사용자에게 알립니다.
        alert(response.data);
        // 성공하면 홈 화면으로 이동합니다.
        this.goHome();
        
      }catch (error){
        // 요청이 실패하면, 에러 메시지를 alert로 사용자에게 알립니다.
        alert( error.response.data );
      }
    },
    // 홈 화면으로 이동하는 메소드입니다.
    goHome() {
      this.$router.push('/');
    }
  },
};
</script>
