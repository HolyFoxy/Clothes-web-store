<script setup>

</script>

<template>
  <div class="personal__header">
    <div class="container">
      <div class="personal__info">
        <div class="personal__image">
          <img src="/image/kitten2.jpeg" alt="">
        </div>
        <div class="personal__credits">
          <div class="personal__name">John Doe</div>
          <div class="personal__mail">john.doe@email.com</div>
        </div>
      </div>
    </div>
  </div>

  <div class="container">
    <div class="personal-data__container">
      <div class="personal-data__selector">

      </div>
      <div class="personal-data__view">

      </div>
    </div>
  </div>
</template>

<style scoped lang="scss">
  .personal {
    &__header {
      background: linear-gradient(90deg,#0077be 0%,#0099e6 60%);
      color: white;
      padding: 4.8rem 0;
    }

    &__info {
      display: flex;
      gap: 2rem;
      height: fit-content;
      width: 100%;
    }

    &__image{
      width: 8rem;
      height: 8rem;
      border-radius: 50%;
      overflow: hidden;
      background-color: white;

      &:has(img){
        background-color: transparent;
      }

      img{
        width: 100%;
        height: 100%;
        object-fit: cover;
        object-position: center center;
      }
    }

    &__credits{
      display: flex;
      height: 100%;
      flex-direction: column;
      justify-content: center;
      align-items: flex-start;
    }

    &__name{
      font-size: 4rem;
      line-height: 4.8rem;
      font-weight: 600;
    }

    &__mail{
      font-size: 1.6rem;
      line-height: 2.4rem;
      color: oklch(93.2% 0.032 255.585);
    }
  }
</style>