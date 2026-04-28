# [Platinum III] Baklawa - 18689

[문제 링크](https://www.acmicpc.net/problem/18689)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 80, 정답: 30, 맞힌 사람: 27, 정답 비율: 36.486%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Baklawa or baklava, is a sweet middle eastern dessert, mainly made from phyllo dough sheets, walnuts, and sugar syrup cut into small cubic pieces and served in cuboid boxes containing multiple layers.</p>

<p>Alice and Bob love to play what they call the last Baklawa game, The rules are as follows:</p>

<ul>
	<li>They choose a cuboid containing X by Y by Z cells of Baklawa to play with.</li>
	<li>There are N poisonous cells both players know them.</li>
	<li>Alice plays first, and the two players alternate.</li>
	<li>In his/her turn the player has to cut the cuboid into two cuboids at least one of which is safe (doesn&rsquo;t contain a poisonous cube) and eats the safe part. The game continues with the other part.</li>
	<li>A cut is made by slicing along one of the axis X, Y or Z.</li>
	<li>The person who cannot make a move in his/her turn losses the game.</li>
</ul>

<p>Assuming both players play optimally, you are asked the following question: who wins the game?</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100).</p>

<p>Each test case starts with a line containing four space separated integers:</p>

<ul>
	<li>X: The length of the cuboid (1 &le; X &le; 1, 000, 000, 000)</li>
	<li>Y : The width of the cuboid (1 &le; Y &le; 1, 000, 000, 000)</li>
	<li>Z: The height of the cuboid (1 &le; Z &le; 1, 000, 000, 000)</li>
	<li>N: The number of poisonous cells. (0 &le; N &le; 100)</li>
</ul>

<p>Followed by N lines each containing three space separated integers:</p>

<ul>
	<li>x<sub>i</sub>: The x-coordinate of the i-th cube. (1 &le; x<sub>i</sub> &le; X)</li>
	<li>y<sub>i</sub>: The y-coordinate of the i-th cube. (1 &le; y<sub>i</sub> &le; Y )</li>
	<li>z<sub>i</sub>: The z-coordinate of the i-th cube. (1 &le; z<sub>i</sub> &le; Z)</li>
</ul>

### 출력

<p>For each test case, print a single line containing &lsquo;Alice&rsquo; if Alice wins the game, or &lsquo;Bob&rsquo; otherwise.</p>

### 힌트

<p>The figure below is an example of the first test case:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18689.%E2%80%85Baklawa/1e9b9ff0.png" data-original-src="https://upload.acmicpc.net/e8b9b784-c796-4a2c-8fea-9d65f393dd0e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 490px; height: 504px;" /></p>