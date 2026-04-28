# [Platinum IV] Low Effort League - 17805

[문제 링크](https://www.acmicpc.net/problem/17805)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 33, 맞힌 사람: 30, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The teams in your local rugby league aren&rsquo;t particularly good, but they make up for it in enthusiasm. We are going to organise a single-elimination knockout tournament between them, where the 2<sup>n</sup> teams play n rounds. In each round, the 2i + 1th remaining team pairs up with the 2i + 2th team and one or the other team is eliminated.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17805.%E2%80%85Low%E2%80%85Effort%E2%80%85League/4400b042.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17805.%E2%80%85Low%E2%80%85Effort%E2%80%85League/4400b042.png" data-original-src="https://upload.acmicpc.net/9565ff61-5d65-4609-91ae-11496a58ea83/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 222px; height: 245px;" /></p>

<p>Each team has a scalar skill level. In the normal course of things, a team with higher skill level will always beat a team with lower skill level. However, training plays a part too: if one team studies another, learns its techniques, and trains against them, it can win.</p>

<p>The number of hours a team with skill a must train to beat a team with skill b (where a &le; b) is |b &minus; a|<sup>2</sup>. This training only affects that one game (it does not transfer to other teams).</p>

<p>You would quite like your favourite team to win the tournament. If you take complete control over how every team trains, you can always make this happen. What is the minimum number of hours needed, in total across all teams, in order for your team (team 1) to win?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing the integer r (1 &le; r &le; 14), the number of rounds in the tournament.</li>
	<li>one line with 2<sup>r</sup> integers s<sup>1</sup> . . . s<sub>2<sup>s</sup></sub> (0 &le; s<sub>i</sub> &le; 10<sup>6</sup> for each i), where s<sub>i</sub> is the skill level of the ith team.</li>
</ul>

### 출력

<p>Output the smallest number of hours needed for team 1 to win the tournament.</p>