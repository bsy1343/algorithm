# [Gold I] Vepar - 20661

[문제 링크](https://www.acmicpc.net/problem/20661)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 512 MB

### 통계

제출: 136, 정답: 75, 맞힌 사람: 53, 정답 비율: 50.962%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Two intervals of positive integers {a, a + 1, . . . , b} and {c, c + 1, . . . , d} are given. Determine whether the product c&middot;(c+1)&middot; &middot; &middot; d is divisible by the product a&middot;(a+1)&middot; &middot; &middot; b.</p>

### 입력

<p>The first line contains a single integer t (1 &le; t &le; 10), the number of independent test cases.</p>

<p>Each of the following t lines contains four positive integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub> (1 &le; a<sub>i</sub> &le; b<sub>i</sub> &le; 10<sup>7</sup>, 1 &le; c<sub>i</sub> &le; d<sub>i</sub> &le; 10<sup>7</sup>).</p>

### 출력

<p>Output t lines in total. For the i-th test case, output <code>DA</code> (Croatian for yes) if a<sub>i</sub> &middot; (a<sub>i</sub> + 1) &middot; &middot; &middot; b<sub>i</sub> divides c<sub>i</sub> &middot; (c<sub>i</sub> + 1)&middot; &middot; &middot; d<sub>i</sub>, and output <code>NE</code> (Croatian for no) otherwise.</p>

### 힌트

<p>We have 9 &middot; 10 = 90 and 3 &middot; 4 &middot; 5 &middot; 6 = 360. The answer is <code>DA</code> because 90 divides 360.</p>

<p>We calculate 2 &middot; 3 &middot; 4 &middot; 5 = 120, which doesn&rsquo;t divide 7 &middot; 8 &middot; 9 = 504. Thus the second answer is <code>NE</code>.</p>