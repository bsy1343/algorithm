# [Gold V] Give-a-Gnocchi - 25862

[문제 링크](https://www.acmicpc.net/problem/25862)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 120, 정답: 44, 맞힌 사람: 34, 정답 비율: 33.333%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Your favorite Italian restaurant is having a promotion. The restaurant is giving away &ldquo;free&rdquo; gnocchi soups. The only cost is to provide them with a prime number. But the restaurant does not want to go out of business; they will only accept a prime number if it is not already in their database. Once a prime number is accepted, they add it to their database. As it turns out, every time you have tried to give them a prime number, no matter how large, they already have it in their database, so you end up having to pay for your meal.</p>

<p>Your friend, Euler, noticed something odd about the verification program. Euler gave the restaurant the number 24,990,001, and they accepted it. Euler realized this value was not prime after he checked it at home, so he did some analysis to determine what happened. It turns out the restaurant&rsquo;s database accepts any number (even a composite number!) that is not divisible by a prime lower than or equal to some value n; which means you can easily get your gnocchi soup (albeit a little dishonestly) by finding a number (even a composite) the restaurant will accept. Basically, on the first day, you could give the first composite number that is not divisible by a prime lower than or equal to n; on the second day, you would give the next composite number that is not divisible by a prime lower than or equal to n, etc.</p>

<p>Since the restaurant keeps track of the numbers given to them, it is difficult to find what number to give to the restaurant next. Your other friend, Fermat, suggests that you write a program that will take in a value n and a day k, and it will output the k<sup>th</sup> (1-indexed) composite number that is not divisible by a prime less than n.</p>

### 입력

<p>The input consists of a single line providing two positive integers: n (n &le; 1000), representing the highest possible value for checking for primality, and k (k &le; 1000), indicating the index of the desired composite number.</p>

### 출력

<p>Print the k<sup>th</sup> (1-indexed) composite number satisfying the given constraints.</p>

### 힌트

<p>In the first sample case, the smallest composite numbers not divisible by a value less than or equal to 10 are 121, 132, 169, 189, 221. On the first day we could give 121. The second day we would use 132. On the third day (when k = 3) we would use 169.</p>

<p>For the second sample case, the answer is 4, since it is both the 1st composite number and the first number not divisible by any prime less than or equal to 1.</p>

<p>For the last case, the smallest composite numbers not divisible by a prime less than or equal to 19 include 529, 667, 713, 841, 851, 899, 943, 961, and 989. The 7th value in the list is 943, which will be the value given on the 7th day</p>