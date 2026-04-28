# [Platinum V] Blackboard Game - 30477

[문제 링크](https://www.acmicpc.net/problem/30477)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 149, 정답: 88, 맞힌 사람: 77, 정답 비율: 65.812%

### 분류

애드 혹, 게임 이론

### 문제 설명

<p>Carlinhos and Equalizer are playing a game. The game begins with 3N elements, which are integer numbers, written on a blackboard. Then, for N rounds, the following two steps are repeated.</p>

<ol>
	<li>Carlinhos, the first player, selects an unchosen element and marks it with a red circle.</li>
	<li>Equalizer, the second player, picks two unchosen elements, marks one of them with a blue square, and erases the other from the blackboard.</li>
</ol>

<p>At the end of these rounds, the blackboard contains N red-marked elements and N bluemarked elements, with no moves left. The game concludes with a clear winner: if the sum of the red-marked elements differs from the sum of the blue-marked elements, Carlinhos emerges victorious; otherwise, Equalizer takes the win.</p>

<p>The figure below depicts the only possible outcome for the first sample. In this case Equalizer wins for sure, no matter how they play both sums will be equal to 25.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30477.%E2%80%85Blackboard%E2%80%85Game/40e75f17.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30477.%E2%80%85Blackboard%E2%80%85Game/40e75f17.png" data-original-src="https://upload.acmicpc.net/6f779e5d-ce45-4b76-94fa-5e014fefb5ba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 253px; height: 146px;" /></p>

<p>Carlinhos, feeling the game is imbalanced, seeks to determine whether he can secure a victory when both players play optimally. Can you help him with this task?</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 1000).</p>

<p>he second line contains 3N integers B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>3N</sub> (-10<sup>5</sup> &le; B<sub>i</sub> &le; 10<sup>5</sup> for i = 1, 2, . . . , 3N), representing the numbers initially written on the blackboard.</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;Y&rdquo; if Carlinhos can win the game and the uppercase letter &ldquo;N&rdquo; otherwise, assuming both players play optimally.</p>