# [Silver III] Feed Accounting - 27012

[문제 링크](https://www.acmicpc.net/problem/27012)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 26, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

누적 합

### 문제 설명

<p>Farmer John is trying to figure out when his last shipment of feed arrived. Starting with an empty grain bin, he ordered and received F1 (1 &le; F1 &le; 1,000,000) kilograms of feed. Regrettably, he is not certain exactly when the feed arrived. Of the F1 kilograms, F2 (1 &le; F2 &le; F1) kilograms of feed remain on day D (1 &le; D &le; 2,000). He must determine the most recent day that his shipment could have arrived.</p>

<p>Each of his C (1 &le; C &le; 100) cows eats exactly 1 kilogram of feed each day. For various reasons, cows arrive on a certain day and depart on another, so two days might have very different feed consumption. The input data tells which days each cow was present. Every cow ate feed from Farmer John&#39;s bin on the day she arrived and also on the day she left.</p>

<p>Given that today is day D, determine the minimum number of days that must have passed since his last shipment. The cows have already eaten today, and the shipment arrived before the cows had eaten.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: C, F1, F2, and D</li>
	<li>Lines 2..C+1: Line i+1 contains two space-separated integers describing the presence of a cow. The first integer tells the first day the cow was on the farm; the second tells the final day of the cow&#39;s presence. Each day is in the range 1..2,000.</li>
</ul>

### 출력

<p>The last day that the shipment might have arrived, an integer that will always be positive.</p>

### 힌트

<p>The shipment was 14 kilograms of feed, and Farmer John has 4 kilograms left. He had three cows that ate feed for some amount of time in the last 10 days.</p>

<p>If Farmer John started with 14 kg of feed on day 6, then on days 6 and 7, two kilograms would be eaten each day. On day 8, three kilograms would be eaten. On day 9, two kilograms would be eaten. On day 10, one kilogram would be eaten. Thus, the total eaten would be 2 + 2 + 3 + 2 + 1 = 10, leaving him with 4 kilograms.</p>