<template>
  <div id="app">
    <NameCard></NameCard>
    <AboutMe></AboutMe>
    <Info></Info>
    <Contact></Contact>
    <Education></Education>
    <Project></Project>
  </div>
</template>

<script>
// 포트폴리오 제목 컴포넌트
import NameCard from './NameCard.vue'
// 자기 소개 컴포넌트
import AboutMe from './AboutMe.vue'
// 정보 컴포넌트
import Info from './Info.vue'
// 연락처 컴포넌트
import Contact from './Contact.vue'
// 학교 정보 컴포넌트
import Education from './Education.vue'
// 프로젝트 컴포넌트
import Project from './Project.vue'

export default {
  name: 'App',
  components: {
    NameCard,
    Info,
    Contact,
    AboutMe,
    Education,
    Project
  }
}
</script>

<style>
#app {
  /* 가로 너비 설정 */
  max-width: 80%;
  /* 양옆 margin 설정 & 가운데정렬 */
  margin: 60px auto;

  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

h1, h2, p {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
}

li {
  margin: 10
}
</style>
