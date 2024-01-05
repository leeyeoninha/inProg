<template>
  <div>
    <h2>회원가입</h2>
    <table>
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
    <button @click="signUp">회원가입</button>
    <button @click="goHome">홈으로</button>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'SignUp',
  data() {
    // vue 인스턴스에서 사용할 데이터 정의한다.
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
      if( this.passwd != this.passwd_chk){
        alert("패스워드가 일치하지 않습니다.");
        return false;
      }
      if( this.age <= 0){
        alert("나이를 확인해주세요");
        return false;
      }

      const userData = {
        id: this.id,
        passwd: this.passwd,
        name: this.name,
        age: this.age,
        email: this.email
      };
      
      try {
        
        const response = await axios.post('http://localhost:8080/signup', userData );
        // 회원가입 성공 시 처리 로직
        alert(response.data);
        this.goHome();
        
      }catch (error){
        // 회원가입 실패 시 처리 로직
        alert( error.response.data );
      }
    },
    goHome() {
      this.$router.push('/');
    }
  },
};
</script>
