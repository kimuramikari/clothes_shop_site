# clothes_shop_site
洋服屋のECサイト

**ログインしていない人が使える機能**
- 商品の検索(shop/search)
- 商品の閲覧(shop/detail)
- ユーザー登録(shop/sinin)

**アカウントを持っている顧客が使える機能**
- ログイン(shop/login)
- ログアウト(shop/logout)
- 商品の購入(user/buy)
- 購入履歴(user/list)
- アカウント情報の編集(user/edit)

**アカウントを持っている管理者が使える機能**
- ログイン(shop/login)
- ログアウト(shop/logout)
- 商品の追加(clothes/add)
- 商品の編集(clothes/edit)
- 商品の削除(clothes/delete)
- 商品の在庫確認(clothes/detail)
- アカウント編集(admin/edit)

**必要なDBテーブル**
- **認可用のテーブル(authorities)**
- id authority

- **商品のテーブル**
- id clothes_name price category_id detail
 
- **商品の画像のテーブル**
- id url

- **商品のカテゴリーのテーブル**
- id category_name 

- **ユーザーのテーブル**
- id username password name authority_id

- **商品とカテゴリーを紐づけるテーブル**
- clothes_id category_id

- **商品と画像を紐づけるテーブル**
- clothes_id image_id

- **ユーザーと商品を紐づけるテーブル**
- user_id clothes_id
