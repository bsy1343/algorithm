# [Silver II] Fair Play - 23380

[문제 링크](https://www.acmicpc.net/problem/23380)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 292, 정답: 140, 맞힌 사람: 132, 정답 비율: 48.000%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Together with your coworker, Larry, you are organizing the exciting Billiards and Pool Competition for your coworkers in your small company. You and Larry are usually on the same page, and surely he will approve of your latest idea. You even bought a nice prize for your coworkers to win and you hope that they are as excited as you are. You want to maximise fun.</p>

<p>It would thus be nice to try to avoid complete walkovers: that is no fun for either player. After some thought, you think it is good to suggest to Larry to divide the players into groups of two. That way, you can compensate for a player&#39;s strength by pairing them with a weaker player. In fact, it would be perfect if every team had the exact same strength! Before you tell Larry your plans, you decide to first figure out whether this is possible.</p>

<p>According to your model, synergy plays a negligible role in determining team strength, and the strength of a team is simply determined by the strength of its individual members. Every coworker has a certain skill level in both billiards and pool, as indicated by two integers. When two coworkers are teamed up, their total skill is the sum of their individual skills. Can you divide everyone into teams of two such that every team has the exact same skill in both pool and billiards?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with an integer $n$ ($2\leq n\leq 10^5$), the number of coworkers you have.</li>
	<li>Then follow $n$ lines containing two integers $b$ and $p$ ($-10^6 \leq b, p \leq 10^6$), the skill in billiards and pool, respectively, of each coworker.</li>
</ul>

### 출력

<p>Output &quot;<code>possible</code>&quot; if it is possible to divide all coworkers into teams of two with equal skill. Output &quot;<code>impossible</code>&quot; otherwise.</p>