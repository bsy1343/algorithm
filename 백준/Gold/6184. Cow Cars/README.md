# [Gold III] Cow Cars - 6184

[문제 링크](https://www.acmicpc.net/problem/6184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 48, 맞힌 사람: 44, 정답 비율: 67.692%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>N (1 &lt;= N &lt;= 50,000) cows conveniently numbered 1..N are driving in separate cars along a highway in Cowtopia. Cow i can drive in any of M different high lanes (1 &lt;= M &lt;= N) and can travel at a maximum speed of S_i (1 &lt;= S_i &lt;= 1,000,000) km/hour.</p>

<p>After their other bad driving experience, the cows hate collisions and take extraordinary measures to avoid them. On this highway, cow i reduces its speed by D (0 &lt;= D &lt;= 5,000) km/hour for each cow in front of it on the highway (though never below 0 km/hour). Thus, if there are K cows in front of cow i, the cow will travel at a speed of max[S_i - D * K, 0]. While a cow might actually travel faster than a cow directly in front of it, the cows are spaced far enough apart so crashes will not occur once cows slow down as described,</p>

<p>Cowtopia has a minimum speed law which requires everyone on the highway to travel at a a minimum speed of L (1 &lt;= L &lt;= 1,000,000) km/hour so sometimes some of the cows will be unable to take the highway if they follow the rules above. Write a program that will find the maximum number of cows that can drive on the highway while obeying the minimum speed limit law.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: N, M, D, and L</li>
	<li>Lines 2..N+1: Line i+1 describes cow i&#39;s initial speed with a single integer: S_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the maximum number of cows that can use the highway</li>
</ul>

### 힌트

<p>There are three cows with one lane to drive on, a speed decrease of 1, and a minimum speed limit of 5.</p>

<p>Two cows are possible, by putting either cow with speed 5 first and the cow with speed 7 second.</p>