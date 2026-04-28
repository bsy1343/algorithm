# [Gold II] Baking Cakes - 7671

[문제 링크](https://www.acmicpc.net/problem/7671)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 93, 정답: 39, 맞힌 사람: 27, 정답 비율: 49.091%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Tom&rsquo;s birthday is coming up, and you have been put in charge of baking cakes for his monstrous birthday party. However, you have a great number of cakes to make, and a very short amount of time, so you are not sure that you will even finish before the party!</p>

<p>You have a list of different cakes to make, each requiring a certain amount of time to bake. You also have exactly 3 ovens to bake the cakes in, and each oven can only bake one cake at a time. Assuming that the time required to take a cake out and put another one in is negligible, can you determine the smallest amount of time you will need to spend baking, given the list of cakes to make?</p>

### 입력

<p>The input test file will contain multiple cases, with each case on a single line. The line begins with an integer n (where 1 &le; n &le; 40), the number of cakes to bake. Following are n integers, t1, . . . , tn (where 1 &le; ti &le; 30), indicating the time in minutes required to bake each of your cakes. End-of-input is marked by a single line containing 0; do not process this line.</p>

### 출력

<p>For each test case, output on a single line the smallest amount of time, in minutes, that you need to bake all of your cakes.</p>