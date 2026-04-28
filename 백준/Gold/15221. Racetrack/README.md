# [Gold I] Racetrack - 15221

[문제 링크](https://www.acmicpc.net/problem/15221)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

자료 구조, 우선순위 큐

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15221.%E2%80%85Racetrack/a19f26a2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15221/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:160px; width:149px" />There is a racetrack where n players complete laps. Each player has their own maximum speed. In this racetrack, overtaking is only possible near the finish line at every lap: when a player approaches a slower player, she will stay behind him until at the finish line. At the finish line, all players crossing the line at the same time resume driving at their maximum speed (so faster players overtake slower ones). Initially, all players start at the finish line. Given the lap time and the number of laps to complete for each player, calculate the times they complete the race in.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 5 000), the number of players. The following n lines contain the players&rsquo; lap time and number of laps to complete: the i-th line contains two integers t<sub>i</sub> and c<sub>i</sub> (1 &le; t<sub>i</sub> &le; 10<sup>6</sup>, 1 &le; c<sub>i</sub> &le; 1 000), the lap time and the number of laps to complete for player i. The players are sorted in decreasing order of speed, that is, t<sub>1</sub> &le; t<sub>2</sub> &le; . . . &le; t<sub>n</sub>.</p>

### 출력

<p>Output n lines; the i&rsquo;th line must contain the time that player i completes the race.</p>