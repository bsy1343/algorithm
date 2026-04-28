# [Gold IV] Deposits - 3574

[문제 링크](https://www.acmicpc.net/problem/3574)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

수학, 브루트포스 알고리즘, 정수론, 조합론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Financial crisis forced many central banks deposit large amounts of cash to accounts of investment and savings banks in order to provide liquidity and save credit markets.</p>

<p>Central bank of Flatland is planning to put n deposits to the market. Each deposit is characterized by its amount ai.</p>

<p>The banks provide requests for deposits to the market. Currently there are m requests for deposits. Each request is characterized by its length bi days.</p>

<p>The regulations of Flatland&rsquo;s market authorities require each deposit to be refinanced by equal integer amount each day. That means that a deposit with amount a and a request with length b match each other if and only if a is divisible by b.</p>

<p>Given information about deposits and requests, find the number of deposit-request pairs that match each other.</p>

### 입력

<p>The first line of the input file contains n &mdash; the number of deposits (1 &le; n &le; 100 000). The second line contains n integer numbers: a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>).</p>

<p>The third line of the input file contains m &mdash; the number of requests (1 &le; m &le; 100 000). The forth line contains m integer numbers: b<sub>1</sub>, b<sub>2</sub>, . . . , b<sub>m</sub> (1 &le; b<sub>i</sub> &le; 10<sup>6</sup>).</p>

### 출력

<p>Output one number &mdash; the number of matching pairs.</p>

### 힌트

<p>The following pairs match each other: (3, 1) twice (as (a1, b1) and as (a1, b2)), (3, 3), (4, 1) twice, (4, 2), (5, 1) twice, (6, 1) twice, (6, 2), and (6, 3).</p>