<template>
  <div>
    <h2>메인 페이지</h2>
    <table>
      <tr>
        <th>아이디</th>
        <th><input type="text" v-model="id"></th><!-- 사용자의 아이디를 입력받는 텍스트 필드입니다. -->
      </tr>
      <tr>
        <th>패스워드</th>
        <th><input type="password" v-model="passwd"></th><!-- 사용자의 비밀번호를 입력받는 텍스트 필드입니다. -->
      </tr>
    </table>
    <button @click="goSignIn">로그인</button> <!-- 로그인 버튼입니다. 클릭하면 goSignIn 함수가 실행됩니다. -->
    <button @click="goSignUp">회원가입</button> <!-- 회원가입 버튼입니다. 클릭하면 goSignUp 함수가 실행됩니다. -->
  </div>
</template>


<script>
import axios from 'axios';


export default {
  name: 'HomePage',
  data() {
    return {
      id: '', // 사용자의 아이디를 저장하는 변수입니다.
      passwd: '', // 사용자의 비밀번호를 저장하는 변수입니다.
    };
  },
  
  methods: {
    async goSignIn(){

      // id 미입력시 경고 메세지 출력
      if(!this.id){
        alert("ID를 입력해주세요");
        return false;
      }

      // 비밀번호 미입력시 경고 메세지 출력
      if(!this.passwd){
        alert("비밀번호를 입력해주세요");
        return false;
      }

      let userData = {
        id: this.id,
        passwd: this.passwd,
      }

      try {
        // axios를 사용하여 백엔드 서버로 로그인 요청을 보냅니다.
        const response = await axios.post('http://localhost:8080/signIn', userData );
        // 요청이 성공하면, 결과를 alert로 사용자에게 알립니다.
        alert(response.data);

        // 성공하면 사용자의 아이디를 로컬 스토리지에 저장합니다.
        localStorage.setItem('userId', this.id);

        // 성공하면 Main 화면으로 이동합니다.
        this.$router.push('/Main');
      }catch (error){
        // 요청이 실패하면, 에러 메시지를 alert로 사용자에게 알립니다.
        alert( error.response.data );
      }

    },
    goSignUp() {
      this.$router.push('/signup');
    },
  },
}
</script>
