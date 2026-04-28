# [Gold I] Concerts - 15393

[문제 링크](https://www.acmicpc.net/problem/15393)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 128 MB

### 통계

제출: 90, 정답: 47, 맞힌 사람: 44, 정답 비율: 53.012%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>John enjoys listening to several bands, which we shall denote using A through Z. He wants to attend several concerts, so he sets out to learn their schedule for the upcoming season. He finds that in each of the following n days (n &le; 10<sup>5</sup>), there is exactly one concert. He decides to show up at exactly k concerts (k &le; 300), in a given order, and he may decide to attend more than one concert of the same band.</p>

<p>However, some bands give more expensive concerts than others, so, after attending a concert given by band b, where b spans the letters A to Z, John decides to stay at home for at least hb days before attending any other concert.</p>

<p>Help John figure out how many ways are there in which he can schedule his attendance, in the desired order. Since this number can be very large, the result will be given modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>The first line contains k and n. The second line contains the 26 hb values, separated by spaces. The third line contains the sequence of k bands whose concerts John wants to attend e.g., AFJAZ, meaning A, then F etc. The fourth line contains the schedule for the following n days, specified in an identical manner.</p>

### 출력

<p>The number of ways in which he can schedule his attendance (mod 10<sup>9</sup> + 7).</p>