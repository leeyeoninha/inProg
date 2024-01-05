<template>
  <div>
    <h2>메인 페이지</h2>
    <table>
      <tr>
        <th>아이디</th>
        <th>
          <input type="text">
        </th>
      </tr>
      <tr>
        <th>패스워드</th>
        <th>
          <input type="text">
        </th>
      </tr>
    </table>
    <button>로그인</button>
    <button @click="goSignUp">회원가입</button>
  </div>
</template>


<script>

export default {
  name: 'HomePage',
  data() {
    return {
      name : null,
    };
  },
  
  methods: {
    goSignUp() {
      this.$router.push('/signup');
    }
  },
}
</script>
