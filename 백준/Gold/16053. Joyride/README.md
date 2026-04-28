# [Gold II] Joyride - 16053

[문제 링크](https://www.acmicpc.net/problem/16053)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 33, 맞힌 사람: 27, 정답 비율: 58.696%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프

### 문제 설명

<p>It is another wonderful sunny day in July &ndash; and you decided to spend your day together with your little daughter Joy. Since she really likes the fairy-park in the next town, you decided to go there for the day. Your wife (unfortunately she has to work) agreed to drive you to the park and pick you up again. Alas, she is very picky about being on time, so she told you exactly when she will be at the park&rsquo;s front entrance to pick you up and you have to be there at exactly that time. You clearly also don&rsquo;t want to wait outside, since this would make your little daughter sad &ndash; she could have spent more time in the park!</p>

<p>Now you have to plan your stay at the park. You know when you will arrive and when you will have to depart. The park consists of several rides, interconnected by small pavements. The entry into the park is free, but you have to pay for every use of every ride in the park. Since it is Joy&rsquo;s favorite park, you already know how long using each ride takes and how much each ride costs. When walking through the park, you obviously must not skip a ride when walking along it (even if Joy has already used it), or else Joy would be very sad. Since Joy likes the park very much, she will gladly use rides more than once. Walking between two rides takes a given amount of time.</p>

<p>Since you are a provident parent you want to spend as little as possible when being at the park. Can you compute how much is absolutely necessary?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with an integer x (1 &le; x &le; 1 000) denoting the time between your arrival and the time you will be picked up (in minutes);</li>
	<li>one line with with three integers n, m, and t, where
	<ul>
		<li>n (1 &le; n &le; 1 000) is the number of rides in the park;</li>
		<li>m (1 &le; m &le; 1 000) is the number of pavements;</li>
		<li>t (1 &le; t &le; 1 000) is the number of minutes needed to pass over a pavement from one ride to another.</li>
	</ul>
	</li>
	<li>m lines each containing two integers a and b (1 &le; a, b &le; n) stating that there is a pavement between the rides a and b.</li>
	<li>n lines each containing two integers t and p (1 &le; t, p &le; 10<sup>6</sup>) stating that the corresponding ride takes t minutes and costs p Euro.</li>
</ul>

<p>You always start at ride 1 and have to return to ride 1 at the end of your stay, since the entry is located there. This means that you have to use the ride 1 at least twice (once upon entry and once upon exit). You can take a ride more than once, if you have arrived at it.</p>

### 출력

<p>Output one line containing either a single integer, the minimum amount necessary to stay x minutes in the park, or It is a trap. (including the period) if it is not possible to stay exactly x minutes.</p>