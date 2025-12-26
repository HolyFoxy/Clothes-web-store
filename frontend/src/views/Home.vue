<script setup>

import ProductCard from "@/components/ProductCard.vue";
</script>

<template>
  <div class="top_block">
    <div class="container">
      <div class="top_block__content">
        <div class="top_block__title">
          Unleash Your Potential
        </div>
        <div class="top_block__description">
          Premium sportswear designed for champions. <br>Elevate your performance with our cutting-edge athletic gear.
        </div>
        <router-link to="/catalog" class="top_block__btn">
          Shop now
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
            <path d="M21 12L16 7M21 12L16 17M21 12H3" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
          </svg>
        </router-link>
        <div class="top_block__image">
          <img src="" alt="">
        </div>
      </div>
    </div>
  </div>

  <div class="container">
    <div class="advantages">
      <div class="advantage">
        <div class="icon blue">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
            <path d="M2.33496 10.3368C2.02171 10.0471 2.19187 9.52339 2.61557 9.47316L8.61914 8.76107C8.79182 8.74059 8.94181 8.63215 9.01465 8.47425L11.5469 2.98446C11.7256 2.59703 12.2764 2.59695 12.4551 2.98439L14.9873 8.47413C15.0601 8.63204 15.2092 8.74077 15.3818 8.76124L21.3857 9.47316C21.8094 9.52339 21.9791 10.0472 21.6659 10.3369L17.2278 14.4419C17.1001 14.56 17.0433 14.7357 17.0771 14.9063L18.255 20.8359C18.3382 21.2544 17.8928 21.5787 17.5205 21.3703L12.2451 18.4166C12.0934 18.3317 11.9091 18.3321 11.7573 18.417L6.48144 21.3695C6.10913 21.5779 5.66294 21.2544 5.74609 20.8359L6.92414 14.9066C6.95803 14.7361 6.90134 14.5599 6.77367 14.4419L2.33496 10.3368Z" stroke="white" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
          </svg>
        </div>
        <div class="info">
          <div class="title">Premium Quality</div>
          <div class="text">High-performance materials <br>for maximum comfort and durability</div>
        </div>
      </div>

      <div class="advantage">
        <div class="icon orange delivery">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
            <path d="M12 21V13M12 21L4.94 16.5875C4.48048 16.3003 4.25072 16.1567 4.12536 15.9305C4 15.7043 4 15.4334 4 14.8915V8M12 21L16 18.5L19.06 16.5875C19.5195 16.3003 19.7493 16.1567 19.8746 15.9305C20 15.7043 20 15.4334 20 14.8915V8M12 13L4 8M12 13L20 8M4 8L10.94 3.6625C11.4555 3.34033 11.7132 3.17925 12 3.17925C12.2868 3.17925 12.5445 3.34033 13.06 3.6625L20 8" stroke-width="2" stroke-linejoin="round"/>
            <path d="M15 14.5C15 15.0523 15.4477 15.5 16 15.5C16.5523 15.5 17 15.0523 17 14.5H15ZM15.8746 10.5695L16.7493 10.0847L15.8746 10.5695ZM7.47 6.348L14.53 10.7605L15.59 9.0645L8.53 4.652L7.47 6.348ZM17 14.5V11.6085H15V14.5H17ZM14.53 10.7605C14.7757 10.9141 14.9004 10.9932 14.9843 11.0575C15.0512 11.1089 15.027 11.1029 15 11.0542L16.7493 10.0847C16.5969 9.80984 16.3951 9.61902 16.201 9.47022C16.0238 9.33438 15.8038 9.19813 15.59 9.0645L14.53 10.7605ZM17 11.6085C17 11.3564 17.0011 11.0976 16.9798 10.8753C16.9565 10.6319 16.9016 10.3596 16.7493 10.0847L15 11.0542C14.973 11.0056 14.9808 10.9818 14.9889 11.0659C14.9989 11.1711 15 11.3187 15 11.6085H17Z"/>
          </svg>
        </div>
        <div class="info">
          <div class="title">Free Shipping</div>
          <div class="text">Free delivery on all orders over $100</div>
        </div>
      </div>

      <div class="advantage">
        <div class="icon blue">
          <svg viewBox="0 0 64 64" xmlns="http://www.w3.org/2000/svg">
            <g data-name="17 quality" id="_17_quality">
              <path d="M40.4,20.57a1.009,1.009,0,0,0-.95-.69H34.48l-1.53-4.72a1,1,0,0,0-1.9,0l-1.53,4.72H24.55a1.009,1.009,0,0,0-.95.69.991.991,0,0,0,.37,1.12l4.01,2.92-1.53,4.72a1,1,0,0,0,.36,1.12,1.022,1.022,0,0,0,1.18,0L32,27.53l4.01,2.92a1.086,1.086,0,0,0,.59.19,1.036,1.036,0,0,0,.59-.19,1,1,0,0,0,.36-1.12l-1.53-4.72,4.01-2.92A.991.991,0,0,0,40.4,20.57Zm-6.14,2.85a1.006,1.006,0,0,0-.37,1.12l.81,2.48-2.11-1.54a1.011,1.011,0,0,0-1.18,0L29.3,27.02l.81-2.48a1.006,1.006,0,0,0-.37-1.12l-2.11-1.54h2.61a.991.991,0,0,0,.95-.69L32,18.71l.81,2.48a.991.991,0,0,0,.95.69h2.61Z"/>
              <path d="M32,10.26a13.239,13.239,0,0,0-1.13,26.43c.38.03.75.05,1.13.05.34,0,.69-.02,1.03-.05h.1v-.01A13.234,13.234,0,0,0,32,10.26Zm9.81,18.72a.01.01,0,0,0-.01.01,11.191,11.191,0,0,1-8.85,5.7l-.01.01h-.01a9.1,9.1,0,0,1-1.88-.01,11.236,11.236,0,1,1,10.76-5.71Z"/>
              <path d="M58.88,52.73,55.12,46.9q-4.035-6.225-8.06-12.47c.21-.08.45-.17.69-.25a4.179,4.179,0,0,0,2.67-1.8,4.179,4.179,0,0,0-.25-3.19,4.06,4.06,0,0,1-.37-1.63,3.96,3.96,0,0,1,1.01-1.25,4.234,4.234,0,0,0,1.64-2.81,4.19,4.19,0,0,0-1.64-2.8,4.091,4.091,0,0,1-1.01-1.26,4.06,4.06,0,0,1,.37-1.63,4.157,4.157,0,0,0,.25-3.18,4.2,4.2,0,0,0-2.67-1.8,4.218,4.218,0,0,1-1.49-.71,4.362,4.362,0,0,1-.36-1.61,4.191,4.191,0,0,0-1.15-3,4.2,4.2,0,0,0-3.17-.45,4.081,4.081,0,0,1-1.65,0,4.051,4.051,0,0,1-1.01-1.27,4.212,4.212,0,0,0-2.37-2.23,4.132,4.132,0,0,0-3.02.96A4.143,4.143,0,0,1,32,5.25a4.143,4.143,0,0,1-1.53-.73,4.122,4.122,0,0,0-3.01-.96,4.2,4.2,0,0,0-2.38,2.23,4.2,4.2,0,0,1-1,1.27,4.136,4.136,0,0,1-1.66,0,4.174,4.174,0,0,0-3.16.45,4.164,4.164,0,0,0-1.16,3.01,3.961,3.961,0,0,1-.37,1.6,3.944,3.944,0,0,1-1.47.7,4.226,4.226,0,0,0-2.68,1.8,4.179,4.179,0,0,0,.25,3.19,4.06,4.06,0,0,1,.37,1.63,4.091,4.091,0,0,1-1.01,1.26,4.19,4.19,0,0,0-1.64,2.8,4.234,4.234,0,0,0,1.64,2.81,3.96,3.96,0,0,1,1.01,1.25,4.06,4.06,0,0,1-.37,1.63,4.157,4.157,0,0,0-.25,3.18,4.142,4.142,0,0,0,2.67,1.8c.23.09.47.17.69.26Q12.905,40.67,8.88,46.9L5.12,52.73a.981.981,0,0,0,.01,1.1.992.992,0,0,0,1.01.42l6.83-1.27,1.66,6.76a1,1,0,0,0,.81.74.875.875,0,0,0,.16.02.985.985,0,0,0,.84-.46L27.22,43.35c.08.02.15.07.23.09a2.2,2.2,0,0,0,.5.06,5.009,5.009,0,0,0,2.52-1.02A4.143,4.143,0,0,1,32,41.75a4.143,4.143,0,0,1,1.53.73,4.1,4.1,0,0,0,3.03.96c.08-.02.15-.07.22-.09L47.56,60.04a.985.985,0,0,0,.84.46.875.875,0,0,0,.16-.02,1,1,0,0,0,.81-.74l1.66-6.76,6.83,1.27a1,1,0,0,0,1.01-.42A.981.981,0,0,0,58.88,52.73ZM16.02,57l-1.33-5.41a1,1,0,0,0-1.15-.75L8.06,51.86l2.5-3.87q3.75-5.82,7.52-11.64a.784.784,0,0,1,.02.14,4.191,4.191,0,0,0,1.15,3,4.205,4.205,0,0,0,3.17.45,4.081,4.081,0,0,1,1.65,0,3.935,3.935,0,0,1,1.01,1.27c.19.29.38.58.58.86ZM36.4,41.29a.7.7,0,0,1-.3.2c-.28.06-1.02-.39-1.5-.7A5.071,5.071,0,0,0,32,39.75a5.071,5.071,0,0,0-2.6,1.04c-.48.31-1.22.77-1.49.71a.828.828,0,0,1-.32-.22,6.488,6.488,0,0,1-.81-1.13,5.026,5.026,0,0,0-1.83-2.01,3.246,3.246,0,0,0-1.45-.29,11.376,11.376,0,0,0-1.3.1c-.62.07-1.46.17-1.7-.02s-.34-1.04-.41-1.66a5.025,5.025,0,0,0-.79-2.64,1.7,1.7,0,0,0-.27-.27,1.249,1.249,0,0,0-.12-.09l-.01-.01h-.01a6.3,6.3,0,0,0-1.98-.97c-.59-.21-1.39-.49-1.53-.79-.14-.28.14-1.07.34-1.65a4.932,4.932,0,0,0,.43-2.73,4.848,4.848,0,0,0-1.55-2.23c-.44-.44-1.05-1.05-1.05-1.39s.61-.95,1.05-1.39a4.848,4.848,0,0,0,1.55-2.23,4.932,4.932,0,0,0-.43-2.73c-.2-.58-.48-1.37-.34-1.66s.95-.57,1.54-.78a4.864,4.864,0,0,0,2.37-1.34,4.91,4.91,0,0,0,.8-2.63c.07-.62.16-1.46.41-1.66s1.08-.1,1.7-.03a5.007,5.007,0,0,0,2.75-.19,4.956,4.956,0,0,0,1.83-2.01c.33-.54.79-1.27,1.12-1.34.28-.07,1.02.4,1.5.7A5.071,5.071,0,0,0,32,7.25a5.071,5.071,0,0,0,2.6-1.04c.48-.3,1.21-.76,1.5-.7.33.07.79.8,1.12,1.34a4.956,4.956,0,0,0,1.83,2.01,5.007,5.007,0,0,0,2.75.19c.62-.07,1.46-.17,1.7.02s.34,1.04.41,1.66a5.025,5.025,0,0,0,.79,2.64,5.024,5.024,0,0,0,2.39,1.35c.59.2,1.39.48,1.53.78.14.28-.14,1.07-.34,1.65a4.932,4.932,0,0,0-.43,2.73,4.848,4.848,0,0,0,1.55,2.23c.44.44,1.05,1.05,1.05,1.39s-.61.95-1.05,1.39a4.848,4.848,0,0,0-1.55,2.23,4.932,4.932,0,0,0,.43,2.73c.2.58.48,1.37.34,1.66s-.95.58-1.53.78a6.074,6.074,0,0,0-2.07,1.02,3.107,3.107,0,0,0-.31.32,4.91,4.91,0,0,0-.8,2.63c-.07.62-.16,1.46-.41,1.66s-1.08.1-1.7.03a4.916,4.916,0,0,0-2.75.19,5.026,5.026,0,0,0-1.83,2.01A6.464,6.464,0,0,1,36.4,41.29Zm14.06,9.55a1,1,0,0,0-1.15.75L47.98,57,38.34,42.07c.2-.28.39-.57.58-.86a4.07,4.07,0,0,1,1-1.27,4.136,4.136,0,0,1,1.66,0,4.174,4.174,0,0,0,3.16-.45,4.157,4.157,0,0,0,1.16-3,.675.675,0,0,1,.02-.14q3.765,5.82,7.52,11.64l2.5,3.87Z"/>
            </g>
          </svg>
        </div>
        <div class="info">
          <div class="title">2-Year Warranty</div>
          <div class="text">Extended warranty on all products</div>
        </div>
      </div>
    </div>
  </div>

  <div class="popular">
    <div class="container">
      <div class="popular__header">
        <div class="title">Featured Products</div>
        <div class="description">Discover our most popular items, handpicked for performance and style</div>
      </div>
      <div class="popular__content">
        <div class="popular__product" v-for="n in 4">
          <product-card
              :dataInfo="{
                id: '0',
                name: 'Cutie kitten',
                category: 'Cute',
                image: '/image/kitten1.jpeg',
                price: 1,
                oldPrice: 200,
                isNew: true,
                discount: 99,
              }"
          />
        </div>
      </div>
      <router-link to="/catalog" class="popular__link">
        View all products
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24">
          <path d="M21 12L16 7M21 12L16 17M21 12H3" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"/>
        </svg>
      </router-link>
    </div>
  </div>
</template>

<style lang="scss" scoped>
  .top_block {
    background: linear-gradient(90deg,#0077be 0%,#0099e6 60%);
    padding-block: 14rem;
    color: white;

    &__content{
      display: flex;
      flex-direction: column;
      align-items: center;

      gap: 2.4rem;
      position: relative;
      width: 100%;
      text-align: center;
    }

    &__title {
      font-size: 4.8rem;
      font-weight: bold;
      line-height: 1.1;
    }

    &__description{
      font-size: 1.6rem;
      line-height: 1.1;
    }

    &__btn{
      font-size: 1.8rem;
      line-height: 1.1;

      padding: 1.2rem 2.4rem;
      border-radius: 0.8rem;

      display: flex;
      align-items: center;
      gap: 1.6rem;

      width: fit-content;
      background: #ff6b35;

      color: #fff;

      transition: all 0.2s ease-out;

      svg{
        stroke: white;
        width: 2.4rem;
        height: 2.4rem;
      }

      &:hover{
        background: #fd7645;
        box-shadow: 0 2px 8px 0 rgba(68,83,113,.078),0 0 6px 0 rgba(68,83,113,.039);
      }
    }

    &__image{
      position: absolute;
      inset: 0 0 0 auto;
    }
  }

  .advantage{
    display: flex;
    gap: 1rem;
    max-width: calc((100% - 4rem)/3);

    &s{
      padding-block: 6rem;
      display: flex;
      justify-content: space-between;
      gap: 1rem;

      align-items: flex-start;
    }

    .icon{
      width: 4rem;
      height: 4rem;
      border-radius: 0.8rem;
      padding: 0.8rem;

      flex: none;

      svg{
        width: 2.4rem;
        height: 2.4rem;
        fill: #fff;
        stroke: white;
      }

      &.blue{
        background: #0077be;
      }

      &.orange{
        background: #ff6b35;
      }

      &.delivery svg{
        fill: transparent;
      }
    }

    .info{
      .title{
        font-size: 2rem;
        line-height: 2.4rem;
        font-weight: bold;

        margin-bottom: 0.5rem;
      }

      .text{
        font-size: 1.4rem;
        line-height: 1.6rem;
      }
    }
  }

  .popular{
    background: #374151;
    padding-block: 6rem;

    .container{
      display: flex;
      flex-direction: column;
      align-items: center;
      gap: 4.8rem;
    }

    &__header{
      text-align: center;
      color: white;

      .title{
        font-size: 3.2rem;
        line-height: 4.8rem;
        margin-bottom: 1.6rem;
      }

      .description{
        font-size: 1.6rem;
        line-height: 2.4rem;
      }
    }

    &__content{
      display: flex;
      gap: 2.4rem;

      justify-content: center;
      width: 100%;
    }

    &__product{
      width: calc((100% - 7.2rem)/4);
    }

    &__link{
      width: fit-content;
      margin: 0 auto;
      display: flex;
      gap: 1rem;
      align-items: center;

      background: #0077be;
      color: white;
      padding: 1.2rem 3.2rem;
      transition: all 0.2s ease-out;

      border-radius: 1.2rem;
      font-size: 1.6rem;

      &:hover{
        background: #0099e6;
        box-shadow: 0 2px 8px 0 rgba(68,83,113,.078),0 0 6px 0 rgba(68,83,113,.039);
      }

      svg{
        width: 2.4rem;
        height: 2.4rem;
        stroke: white;
      }
    }
  }
</style>