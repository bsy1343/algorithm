# [Platinum V] Fear Factoring - 15106

[문제 링크](https://www.acmicpc.net/problem/15106)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 377, 정답: 227, 맞힌 사람: 175, 정답 비율: 61.837%

### 분류

수학, 정수론, 조화수

### 문제 설명

<p>The Slivians are afraid of factoring; it&rsquo;s just, well, difficult.</p>

<p>Really, they don&rsquo;t even care about the factors themselves, just how much they sum to.</p>

<p>We can define F(n) as the sum of all of the factors of n; so F(6) = 12 and F(12) = 28. Your task is, given two integers a and b with a &le; b, to calculate</p>

<p>\[S=\sum_{a \le n \le b}{F(n)}\]</p>

### 입력

<p>The input consists of a single line containing space-separated integers a and b (1 &le; a &le; b &le; 10<sup>12</sup>; b &minus; a &le; 10<sup>6</sup>).</p>

### 출력

<p>Print S on a single line.</p>