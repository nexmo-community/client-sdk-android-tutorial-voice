package com.vonage.tutorial.voice

data class User(
    val name: String,
    val jwt: String
)

object Config {

    val alice = User(
        "Alice",
        "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE1ODk4MDE0NTcsImp0aSI6IjBhZDljYTgwLTk4ZmItMTFlYS04N2UzLTVkNGZhYjc5OGFiZCIsImV4cCI6MTU4OTg4Nzg1NywiYWNsIjp7InBhdGhzIjp7Ii8qL3VzZXJzLyoqIjp7fSwiLyovY29udmVyc2F0aW9ucy8qKiI6e30sIi8qL3Nlc3Npb25zLyoqIjp7fSwiLyovZGV2aWNlcy8qKiI6e30sIi8qL2ltYWdlLyoqIjp7fSwiLyovbWVkaWEvKioiOnt9LCIvKi9hcHBsaWNhdGlvbnMvKioiOnt9LCIvKi9wdXNoLyoqIjp7fSwiLyova25vY2tpbmcvKioiOnt9fX0sImFwcGxpY2F0aW9uX2lkIjoiYmZlZTUyMzItODJlMy00NmUwLTllNGQtOThiZjZjOTE3NjYxIiwic3ViIjoiQWxpY2UifQ.q-stEsZYNQkK4iZvsulC5G1cRHtpiwSclrBXeU2y0ySpHOLMnpkbK815S22mHBiWShCvnyIPnuMzqX01-1vsBKfg8vfa-dJq2yGFuTE0-TBAUH96Rts5vHnHaU_iBqb2X3AiKWidwaEFtgt7s31foh29cJI6TZv0kt_C93j7WBw9-6QRxmEC2SKaxiKba03443AOVrdnnfZl0HkC4Gb7uM6tBs4K0u23FUk6SHBPZ7dsOda4rVWb8mM2psXEG5DJGpKxvci3CGl6WC2DFDO1TwXxcT7nySl1sJbgkHy8yC9llEmYJBWcTuVqpA0l5lfwslzh_1rzZ1lZyJVqDjNS0Q"
    )
    val bob = User(
        "Bob",
        "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE1OTI1NTY0NTAsImp0aSI6IjgyYjc5MmUwLWIyMDktMTFlYS05OTllLTZmOTI3MzgwMDg5NyIsImV4cCI6MTU5MjY0Mjg0OSwiYWNsIjp7InBhdGhzIjp7Ii8qL3VzZXJzLyoqIjp7fSwiLyovY29udmVyc2F0aW9ucy8qKiI6e30sIi8qL3Nlc3Npb25zLyoqIjp7fSwiLyovZGV2aWNlcy8qKiI6e30sIi8qL2ltYWdlLyoqIjp7fSwiLyovbWVkaWEvKioiOnt9LCIvKi9hcHBsaWNhdGlvbnMvKioiOnt9LCIvKi9wdXNoLyoqIjp7fSwiLyova25vY2tpbmcvKioiOnt9fX0sImFwcGxpY2F0aW9uX2lkIjoiYmZlZTUyMzItODJlMy00NmUwLTllNGQtOThiZjZjOTE3NjYxIiwic3ViIjoiQm9iIn0.JiOJMYzkdZZtriTofFfAxjmOX4E-N2HZ6H1_TsQ7sfIz8gccn-QflhB0IPu0Ibtn56T5is9lGVbMdjbSmHlzT7rrlFDLd18i-Qnx2rTb7NqF0OHG56B8zYfFYgPgkpUojbkKzUVKiPcedFl1exF13G7IJ6PLdz0K1-pEpSqv-2rCSNAyARBsYBsfynLIktBUut1_MMxCnNlEpk37AcjhifSvZr4RuYjxJY1l_IChC1bFuMvYkKhe6AgC04ISyWdo9KlDXvktE6ZL985IzEvSXE4dBNnDDJAq8uk9vDqzKK_GYDrZiEiEwIAZsgNprW6PbRx7nXxMQK-eUnr-rn0G0w"
    )

    fun getOtherUser(userName: String) = if (userName == alice.name) alice else bob
}