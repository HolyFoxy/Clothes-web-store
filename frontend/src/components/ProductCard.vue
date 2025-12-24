<script setup>

  // id: String,
  // name: String,
  // category: String,
  // image: String,
  // price: Number,
  // oldPrice: Number,
  // isNew: Boolean,
  // discount: Number,

const { dataInfo } = defineProps({
  dataInfo: {
    type: Object,
    required: true
  }
})
</script>

<template>
  <div class="card">
    <div class="card__image">
      <div class="card__tags">
        <div class="card__tag new" v-if="dataInfo?.isNew">New</div>
        <div class="card__tag discount" v-if="dataInfo?.discount">-{{dataInfo?.discount}}%</div>
      </div>
      <img :src="dataInfo?.image" alt="">

      <div class="cart-button">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 100 100">
          <path id="XMLID_1732_" d="M91.8,27.3L81.1,61c-0.8,2.4-2.9,4-5.4,4H34.4c-2.4,0-4.7-1.5-5.5-3.7L13.1,19H4c-2.2,0-4-1.8-4-4
                s1.8-4,4-4h11.9c1.7,0,3.2,1.1,3.8,2.7L36,57h38l8.5-27H35.4c-2.2,0-4-1.8-4-4s1.8-4,4-4H88c1.3,0,2.5,0.7,3.2,1.7
                C92,24.7,92.2,26.1,91.8,27.3z M36.4,70.3c-1.7,0-3.4,0.7-4.6,1.9c-1.2,1.2-1.9,2.9-1.9,4.6c0,1.7,0.7,3.4,1.9,4.6
                c1.2,1.2,2.9,1.9,4.6,1.9s3.4-0.7,4.6-1.9c1.2-1.2,1.9-2.9,1.9-4.6c0-1.7-0.7-3.4-1.9-4.6C39.8,71,38.1,70.3,36.4,70.3z M72.3,70.3
                c-1.7,0-3.4,0.7-4.6,1.9s-1.9,2.9-1.9,4.6c0,1.7,0.7,3.4,1.9,4.6c1.2,1.2,2.9,1.9,4.6,1.9c1.7,0,3.4-0.7,4.6-1.9
                c1.2-1.2,1.9-2.9,1.9-4.6c0-1.7-0.7-3.4-1.9-4.6S74,70.3,72.3,70.3z"/>
        </svg>
      </div>
    </div>
    <div class="card__description">
      <div class="card__category" v-if="dataInfo?.category">{{dataInfo?.category}}</div>
      <div class="card__title">{{dataInfo?.name}}</div>
      <div class="card__price" v-if="dataInfo?.price">${{dataInfo?.price}} <div class="card__price old" v-if="dataInfo?.oldPrice">${{dataInfo?.oldPrice}}</div></div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
  .card{
    width: 100%;
    min-height: 40rem;

    border-radius: 1.6rem;
    overflow: hidden;

    position: relative;
    background: white;
    transition: all 0.5s ease-in-out;

    .cart-button{
      position: absolute;
      border-radius: 50%;
      background: #0077be;
      transition: opacity 0.5s ease-in-out, background-color 0.2s ease-in-out, box-shadow 0.2s ease-in-out;
      opacity: 0;
      pointer-events: none;

      right: 1.2rem;
      bottom: 1.2rem;

      display: flex;
      justify-content: center;
      align-items: center;

      width: 4.4rem;
      height: 4.4rem;

      svg{
        fill: white;
        width: 2rem;
        height: 2rem;
      }

      &:hover{
        background: #0099e6;
        cursor: pointer;
        box-shadow: 0 2px 8px 0 rgba(68,83,113,.078),0 0 6px 0 rgba(68,83,113,.039);
      }
    }

    &:hover{
      box-shadow: 0 2px 32px 0 rgba(52,79,104,.051),0 32px 32px 0 rgba(49,72,98,.102);

      .cart-button{
        opacity: 1;
        pointer-events: auto;
      }

      .card__image img{
        scale: 1.1;
      }
    }


    &__image {
      width: 100%;
      height: 28.6rem;
      background: whitesmoke;
      overflow: hidden;
      border-top-left-radius: inherit;
      border-top-right-radius: inherit;

      img{
        width: 100%;
        height: 100%;
        object-fit: cover;
        transition: scale 0.5s ease-in-out;
      }
    }

    &__tags{
      position: absolute;
      top: 1.2rem;
      left: 1.2rem;

      width: fit-content;
      display: flex;

      max-width: calc(100% - 2.4rem);
      gap: 1rem;

      z-index: 1;
    }

    &__tag{
      padding: .4rem 1.2rem;
      border-radius: .8rem;
      width: fit-content;

      color: white;
      font-size: 1.2rem;
      line-height: 1.4rem;

      &.new{
        background: #0077be;
      }

      &.discount{
        background: #ff6b35;
      }
    }

    &__description{
      height: 100%;
      width: 100%;
      padding: 1.6rem;
      display: flex;
      flex-direction: column;
      justify-content: end;
      gap: 0.6rem;
    }

    &__category{
      font-size: 1.6rem;
      line-height: 1.6;
      color: oklch(55.1% 0.027 264.364);
    }

    &__title{
      font-size: 2rem;
      line-height: 1.4;
      font-weight: 600;
    }

    &__price{
      color: #ff6b35;
      font-size: 1.6rem;
      line-height: 2.4rem;

      &:has(.old){
        display: flex;
      }

      &.old{
        color: #6A7282FF;
        text-decoration: line-through;
        margin-left: 0.5rem;
      }
    }
  }
</style>