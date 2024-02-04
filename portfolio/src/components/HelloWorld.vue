<template>
  <div id="app">
    <NameCard></NameCard>
    <Introduction></Introduction>
    <Contact></Contact>
    <Education></Education>
    <Skills></Skills>
    <Project></Project>
  </div>
</template>

<script>
import NameCard from './NameCard.vue'
import Introduction from './Introduction.vue'
import Contact from './Contact.vue'
import Education from './Education.vue'
import Skills from './Skills.vue'
import Project from './Project.vue'

export default {
  name: 'App',
  components: {
    NameCard,
    Contact,
    Introduction,
    Education,
    Skills,
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
