# [Gold V] Burizon Fort - 23782

[문제 링크](https://www.acmicpc.net/problem/23782)

### 성능 요약

시간 제한: 1.4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 37, 맞힌 사람: 28, 정답 비율: 37.838%

### 분류

수학, 정수론

### 문제 설명

<p>On Mars there is a huge complex of forts. Martians living in these forts are fond of eating Burizons and get very grumpy if they run out of them. Therefore it&rsquo;s quite common task to transport Burizons among these forts when the supplies are running low somewhere.</p>

<p>The transportation of Burizons is not so simple because of all the space debris falling down on the planet. If some space debris hits the transportation vehicle, not only the vehicle gets destroyed, but even all the supplies transported. That&rsquo;s why Martians can transport their Burizon supplies only at very precisely timed moments.</p>

<p>Luckily, Martian scientists developed a way to predict practical times when no space debris will be endangering the transport vehicles. For this matter Martians developed a Martian UNIX timestamp, which is represented as a positive integer. Practical time for transportation is a Martian UNIX timestamp m, such that each positive integer smaller than m can be represented as a sum of distinct divisors of m.</p>

<p>As recognizing practical time for transport is not that easy for Martians, they will need you to help them to figure out which of the given timestamps are practical ones.</p>

### 입력

<p>The first line contains one integer T (1 &le; T &le; 100), the number of timestamps to be checked. Each of the next T lines consists of one integer m (1 &le; m &le; 10<sup>12</sup>), the Martian UNIX timestamp.</p>

### 출력

<p>Output T lines, each with either &ldquo;Yes&rdquo; or &ldquo;No&rdquo;, answering the question whether the i-th timestamp is practical.</p>