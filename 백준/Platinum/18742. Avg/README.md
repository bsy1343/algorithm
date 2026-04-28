# [Platinum I] Avg - 18742

[문제 링크](https://www.acmicpc.net/problem/18742)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 77, 정답: 26, 맞힌 사람: 25, 정답 비율: 39.683%

### 분류

해 구성하기, 수학

### 문제 설명

<p>Find a sequence of steps of the following kind (if it exists) that would make all elements of any array of real numbers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> equal:</p>

<p>pick k distinct indices b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>k</sub> (1 &le; b<sub>i</sub> &le; n) and change the values of a<sub>b<sub>1</sub></sub>, a<sub>b<sub>2</sub></sub>, . . . , a<sub>b<sub>k</sub></sub> to their arithmetic mean (that is, 1/k (a<sub>b<sub>1</sub></sub> + a<sub>b<sub>2</sub></sub> + . . . + a<sub>b<sub>k</sub></sub>)) simultaneously.</p>

### 입력

<p>The only line contains two integers n and k (2 &le; k &le; n &le; 1000; n is divisible by k).</p>

### 출력

<p>If a required sequence of steps doesn&rsquo;t exist, display a single integer &minus;1.</p>

<p>Otherwise, display the number of steps in your sequence t (1 &le; kt &le; 10<sup>6</sup>), followed by t step descriptions. Each step description must consist of k distinct integers b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>k</sub> (1 &le; b<sub>i</sub> &le; n).</p>

<p>It can be shown that if a valid sequence of steps exists, a sequence satisfying kt &le; 10<sup>6</sup> exists as well.</p>