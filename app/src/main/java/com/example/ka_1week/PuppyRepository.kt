package com.example.ka_1week

class PuppyRepository {
    fun getRepoList():List<PuppyItem> {
        return listOf(
            PuppyItem(
                puppy_img = R.drawable.dog_1,
                puppy_name = "말티즈",
                puppy_age = "3살 추정",
                puppy_feature = "치석있으며 건강함.",
                puppy_place = "서울시 양천구"

            ),
            PuppyItem(
                puppy_img = R.drawable.dog_2,
                puppy_name = "말티즈",
                puppy_age = "2살 추정",
                puppy_feature = "활발함.",
                puppy_place = "서울시 강남구"

            ),
            PuppyItem(
                puppy_img = R.drawable.dog_3,
                puppy_name = "말티즈",
                puppy_age = "1살 추정",
                puppy_feature = "낯가림.",
                puppy_place = "인천시 연수구"

            ),
            PuppyItem(
                puppy_img = R.drawable.dog_4,
                puppy_name = "말티즈",
                puppy_age = "3살 추정",
                puppy_feature = "활발함.",
                puppy_place = "서울시 은평구"

            ),
            PuppyItem(
                puppy_img = R.drawable.dog_5,
                puppy_name = "말티즈",
                puppy_age = "3살 추정",
                puppy_feature = "치석있으며 건강함.",
                puppy_place = "서울시 양천구"

            ),
            PuppyItem(
                puppy_img = R.drawable.dog_6,
                puppy_name = "말티즈",
                puppy_age = "3살 추정",
                puppy_feature = "치석있으며 건강함.",
                puppy_place = "서울시 양천구"

            )
        )
    }

}