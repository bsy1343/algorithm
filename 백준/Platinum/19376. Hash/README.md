# [Platinum I] Hash - 19376

[문제 링크](https://www.acmicpc.net/problem/19376)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 285, 정답: 155, 맞힌 사람: 25, 정답 비율: 39.683%

### 분류

해 구성하기, 비트마스킹, 무작위화, 해싱, 비둘기집 원리, 생일 문제

### 문제 설명

<p>A HAIKU is a string that consists of at most 50 lowercase English letters. For a HAIKU $s$, you can compute the hash $h$ as follows:</p>

<pre>
h = 0
for i=0,...|s|-1
    h = (h * a + (s[i] - &#39;a&#39; + 1)) % b</pre>

<p>You are given two integers $a$ and $b$. Construct 100 distinct HAIKUs that have the same hash.</p>

### 입력

<p>You are given two space-separated integers $a$ and $b$ ($b \le 10^9$, $26 \le a &lt; b$).</p>

### 출력

<p>Print 100 HAIKUs with the same hash, one per line.</p>

### 힌트

<p>Several HAIKUs are omitted in the printed version of statements; the full version is published in the contest system.</p>