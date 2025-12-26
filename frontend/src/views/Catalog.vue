<script setup>

import ProductCard from "@/components/ProductCard.vue";
</script>

<template>
  <div class="catalog__header">
    <div class="container">
      <div class="title">Product catalog</div>
      <div class="subtitle">Showing 6 items</div>
    </div>
  </div>
  <div class="catalog">
    <div class="container">
      <div class="catalog__container">
        <div class="catalog__filters">
          <div class="catalog__filters__title">Filters</div>
          <div class="catalog__filters__group">
            <div class="group__title">
              Sizes
            </div>
            <div class="group__content">
              <label class="box">
                <input type="radio" name="size" value="xs">
                XS
              </label>
              <label class="box">
                <input type="radio" name="size" value="s">
                S
              </label>
              <label class="box">
                <input type="radio" name="size" value="m">
                M
              </label>
              <label class="box">
                <input type="radio" name="size" value="l">
                L
              </label>
              <label class="box">
                <input type="radio" name="size" value="xl">
                XL
              </label>
            </div>
          </div>
        </div>
        <div class="catalog__inner-container">
          <div class="catalog__sort_line">
            <div class="catalog__sort_line__title">
              Sort by:
            </div>
            <div class="catalog__sort_line__select">
              <select name="sort" id="sort">
                <option value="featured">Featured</option>
                <option value="sale">Sale</option>
                <option value="price">Price</option>
              </select>
            </div>
          </div>
          <div class="catalog__resutls">
            <div class="catalog__cards">
              <div class="wrapper" v-for="item in 6">
                <product-card
                    :data-info="{
                    id: '0',
                    name: 'Cutie kitten',
                    category: 'Cute',
                    image: '/image/kitten1.jpeg',
                    price: 1,
                    oldPrice: 200,
                    isNew: true,
                    discount: 99,
                  }"
                ></product-card>
              </div>
            </div>
            <div class="catalog__pagination">

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped lang="scss">
  .catalog{
    padding: 3.2rem 0;
    background: rgb(234, 234, 234);
    border-top: 1px solid oklch(.992 0 0);

    &__header{
      background: #fff;
      width: 100%;
      padding: 3.2rem 0;

      .title{
        font-weight: 600;
        font-size: 4rem;
        line-height: 4.8rem;
        margin-bottom: .8rem;
      }

      .subtitle{
        font-size: 1.6rem;
        line-height: 1.6;
        color: oklch(.446 .03 256.802)
      }
    }

    &__container {
      position: relative;
      display: flex;
      gap: 3.2rem
    }

    &__filters{
      flex: none;
      background: #fff;
      padding: 2.4rem;
      border-radius: 1rem;
      width: 25.6rem;
      height: fit-content;
      display: flex;
      flex-direction: column;
      gap: 2rem;
      box-shadow: rgba(0, 0, 0, 0.1) 0px 1px 3px 0px, rgba(0, 0, 0, 0.1) 0px 1px 2px -1px;

      &__title{
        font-size: 2.4rem;
        line-height: 1.4;
        font-weight: 600;
        color: oklch(.278 .033 256.848);
      }

      &__group{
        width: 100%;
        display: flex;
        flex-direction: column;
        gap: 1.2rem;


        .group{
          &__title{
            font-weight: 500;
            font-size: 1.8rem;
            line-height: 2.6rem;
          }

          &__content{
            display: flex;
            gap: .8rem;
            flex-wrap: wrap;
            width: 100%;
            justify-content: center;

            .box{
              width: calc((100% - 1.6rem)/3);
              height: 4.2rem;
              display: flex;
              align-items: center;
              justify-content: center;

              font-size: 1.6rem;
              line-height: 2.4rem;

              border: 1px solid oklch(0.872 0.01 258.338);

              box-shadow: 0 2px 8px 0 rgba(68,83,113,.078),0 0 6px 0 rgba(68,83,113,.039);

              transition: 0.3s ease-out;

              border-radius: 1.6rem;

              &:hover{
                cursor: pointer;
                box-shadow: 0 0 0 0 transparent, 0 0 0 0 transparent;

                border-color: #fd7645;
              }

              input[type='radio']{
                display: none;
              }

              &:has(input:checked){
                box-shadow: 0 0 0 0 transparent, 0 0 0 0 transparent;

                border-color: #fd7645;
              }
            }
          }
        }
      }
    }

    &__inner-container{
      width: 100%;
      display: flex;
      flex-direction: column;
      gap: 2.4rem;
    }
    &__sort_line{
      width: 100%;
      padding: 1.6rem;
      display: flex;
      justify-content: space-between;
      align-items: center;
      background: white;
      box-shadow: rgba(0, 0, 0, 0.1) 0px 1px 3px 0px, rgba(0, 0, 0, 0.1) 0px 1px 2px -1px;
      border-radius: 1rem;

      &__title{
        color: oklch(.373 .034 259.733);
        font-size: 1.6rem;
        line-height: 2.4rem;
      }

      #sort{
        font-size: 1.6rem;
        line-height: 2.4rem;
        padding: 0.3rem 1rem;
        background: transparent;
        border-radius: 1rem;
        border: 1px solid #fd7645;

        transition: box-shadow 0.3s ease-out;

        &:hover{
          cursor: pointer;
          box-shadow: rgba(0, 0, 0, 0.1) 0px 1px 3px 0px, rgba(0, 0, 0, 0.1) 0px 1px 2px -1px;
        }
      }
    }

    &__results{
      display: flex;
      flex-direction: column;
      gap: 2.4rem;
    }

    &__cards{
      display: flex;
      flex-wrap: wrap;
      gap: 2.4rem;
      width: 100%;
      height: fit-content;

      .wrapper{
        width: calc((100% - 4.8rem)/3);
      }
    }
  }
</style>