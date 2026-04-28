# [Gold V] Bessie's Weight Problem - 5995

[문제 링크](https://www.acmicpc.net/problem/5995)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 169, 정답: 133, 맞힌 사람: 109, 정답 비율: 78.417%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Bessie, like so many of her sisters, has put on a few too many pounds enjoying the delectable grass from Farmer John&#39;s pastures. FJ has put her on a strict diet of no more than H (5 &lt;= H &lt;= 45,000) kilograms of hay per day.</p>

<p>Bessie can eat only complete bales of hay; once she starts she can&#39;t stop. She has a complete list of the N (1 &lt;= N &lt;= 500) haybales available to her for this evening&#39;s dinner and, of course, wants to maximize the total hay she consumes. She can eat each supplied bale only once, naturally (though duplicate weight valuess might appear in the input list; each of them can be eaten one time).</p>

<p>Given the list of haybale weights W_i (1 &lt;= W_i &lt;= H), determine the maximum amount of hay Bessie can consume without exceeding her limit of H kilograms (remember: once she starts on a haybale, she eats it all).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: H and N</li>
	<li>Lines 2..N+1: Line i+1 describes the weight of haybale i with a single integer: W_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of kilograms of hay that Bessie can consume without going over her limit.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Four haybales of weight 15, 19, 20, and 21. Bessie can eat as many as she wishes without exceeding the limit of 56 altogether.</p>

<p>Bessie can eat three bales (15, 20, and 21) and run right up to the limit of 56 kg.</p>