<template>
  <div id="contant">
    <h2>Contact</h2>
    <p>010-XXXX-XXXX</p>
    <p>hongMan@inha.edu</p>
  </div>

  <div id="gitHub">
    <h2>Github</h2>
    <p>
      <a href="https://github.com/leeyeoninha/inProg">
        Git 으로 이동
      </a>
    </p>
  </div>
</template>

<script>
export default {
  name: 'ContactMe'
}
</script>

<style scoped>
div {
  text-align: left;
  border-bottom: 1px solid gray;
  margin-bottom: 10px;
  height: 180px;
}
#contant{
  width: 50%;
  float: left;
}
#gitHub{
  width: 50%;
  float: right;
}

</style>
