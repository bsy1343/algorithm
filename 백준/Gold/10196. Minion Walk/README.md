# [Gold V] Minion Walk - 10196

[문제 링크](https://www.acmicpc.net/problem/10196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 237, 정답: 89, 맞힌 사람: 69, 정답 비율: 36.316%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 격자 그래프

### 문제 설명

<p>Doctor Nefario is leaving Gru because he misses being evil. While he is packing and preparing to leave, boxes become scattered all over the laboratory floor. In fact, there are so many boxes that minions may no longer be able to cross the room!</p>

<p>Your goal is to determine which parts of the lab minions can still reach. In particular you want to find whether minions can cross the room from the top left corner to the bottom right corner. Minions can only make 90 degree turns. I.e., they may move up, down, left, or right one location at a time, but not diagonally.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10196.%E2%80%85Minion%E2%80%85Walk/1abf57f5.png" data-original-src="https://upload.acmicpc.net/3ae451e6-aaf6-4457-979f-d425ec6b6ac3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 662px; height: 310px;" /></p>

<p>In the example above, minions need to cross a room of height 4 and width 3. Three boxes are scattered in the room. Minions start from the top left corner and try to reach the bottom right corner, making only 90 degree turns. It turns out that minions can reach every part of the room except the top right corner.</p>

### 입력

<p>The first line of the input file contains the number of test cases. Each case has the following format. First, a line containing the height H and width W of the room. Next, a sequence of H lines, each of containing W characters. Each character is either &lsquo;X&rsquo; (occupied) or &lsquo;O&rsquo; (clear).</p>

### 출력

<p>The output is the layout of the room for each test case, where locations are marked as &lsquo;M&rsquo; if it can be reached by minions, followed by one of the the following lines: &rdquo;Minions can cross the room&rdquo; or &rdquo;Minions cannot cross the room&rdquo;.</p>

### 제한

<ul>
	<li>1 &le; H, W &le; 20</li>
</ul>