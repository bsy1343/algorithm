# [Silver IV] MooBuzz - 18265

[문제 링크](https://www.acmicpc.net/problem/18265)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1362, 정답: 567, 맞힌 사람: 491, 정답 비율: 42.511%

### 분류

수학, 이분 탐색, 포함 배제의 원리

### 문제 설명

<p>Farmer John&#39;s cows have recently become fans of playing a simple number game called &quot;FizzBuzz&quot;. The rules of the game are simple: standing in a circle, the cows sequentially count upward from one, each cow saying a single number when it is her turn. If a cow ever reaches a multiple of 3, however, she should say &quot;Fizz&quot; instead of that number. If a cow reaches a multiple of 5, she should say &quot;Buzz&quot; instead of that number. If a cow reaches a multiple of 15, she should say &quot;FizzBuzz&quot; instead of that number. A transcript of the first part of a game is therefore:</p>

<p>1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16</p>

<p>Having a slightly more limited vocabulary, the version of FizzBuzz played by the cows involves saying &quot;Moo&quot; instead of Fizz, Buzz, and FizzBuzz. The beginning of the cow version of the game is therefore</p>

<p>1, 2, Moo, 4, Moo, Moo, 7, 8, Moo, Moo, 11, Moo, 13, 14, Moo, 16</p>

<p>Given $N$ ($1 \leq N \leq 10^9$), please determine the $N$th number spoken in this game.</p>

### 입력

<p>The input consists of a single integer, $N$.</p>

### 출력

<p>Please print out the $N$th number spoken during the game.</p>

### 힌트

<p>The 4th number spoken is 7. The first 4 numbers spoken are 1, 2, 4, 7, since we skip over any time a cow says &quot;Moo&quot;.</p>