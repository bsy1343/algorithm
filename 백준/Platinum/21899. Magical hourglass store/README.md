# [Platinum III] Magical hourglass store - 21899

[문제 링크](https://www.acmicpc.net/problem/21899)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 14, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

다이나믹 프로그래밍, 누적 합, 제곱근 분할법

### 문제 설명

<p>Vasya owns a magical hourglass store and he is crazy about hourglasses. Vasya wants everything in his store to work like a clock. Whenever some hourglass in his store becomes empty, Vasya immediately turns it over.</p>

<p>His store has $n$ hourglasses. Hourglass $i$ has sand for exactly $b_i$ minutes and will magically appear in the store $a_i$ minutes after Vasya&#39;s work day starts. Each hourglass appears empty, so Vasya has to turn it over immediately. Vasya is working for $t$ minutes every day.</p>

<p>Vasya is very tired of walking around his store and turning his hourglasses over and over again. So he would like to know how many hourglasses he will have to turn over at every minute from the start of his work day.</p>

### 입력

<p>First line contains two integers $n$ and $t$ --- number of hourglasses in Vasya&#39;s store and number of minutes in Vasya&#39;s work day ($1 \le n, t \le 2 \cdot 10^5$).</p>

<p>Next $n$ lines contain the description of Vasya&#39;s hourglasses: two integers $a_i$ and $b_i$ --- the moment when $i$-th hourglass appears, and the number of minutes it works without turning it over ($1 \le a_i, b_i \le 2 \cdot 10^5$).</p>

### 출력

<p>Output $t$ integers, where $i$-th number is equal to the number of hourglasses Vasya has to turn over after $i$ minutes pass.</p>

### 힌트

<p>In the first sample Vasya has to:</p>

<ul>
	<li>First minute: turn the first hourglass over (first hourglass appears after 1 minute)</li>
	<li>Second minute: turn the second hourglass over (second hourglass appears after 2 minutes)</li>
	<li>Third minute: turn the first hourglass over again (2 minutes passed, so you have to turn it over again)</li>
	<li>Fourth minute: nothing to do (first hourglass still has 1 more minute, second one --- 2 more minutes)</li>
	<li>Fifth minute: turn the first hourglass over (2 minutes passed, turn it over again)</li>
</ul>

<p>In the second sample Vasya has to:</p>

<ul>
	<li>First minute: turn the second hourglass over (second hourglass appears after 1 minute)</li>
	<li>Second minute: turn the first hourglass over (first hourglass appears after 2 minutes)</li>
	<li>Third minute: turn the third hourglass over (third hourglass appears after 3 minutes)</li>
	<li>Fourth minute: turn the first and the second hourglasses over</li>
	<li>Fifth minute: turn the fourth hourglass over (forth hourglass appears after 5 minutes)</li>
	<li>Sixth minute: turn the first hourglass over</li>
	<li>Seventh minute: turn the second and the third hourglasses over</li>
	<li>Eighth minute: turn the first hourglass over</li>
</ul>