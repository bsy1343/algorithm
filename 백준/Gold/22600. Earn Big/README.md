# [Gold I] Earn Big - 22600

[문제 링크](https://www.acmicpc.net/problem/22600)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>A group of&nbsp;<var>N</var>&nbsp;people is trying to challenge the following game to earn big money.</p>

<p>First,&nbsp;<var>N</var>&nbsp;participants are isolated from each other. From this point, they are not allowed to contact each other, or to leave any information for other participants. The game organizer leads each participant, one by one, to a room with&nbsp;<var>N</var>&nbsp;boxes. The boxes are all closed at the beginning of the game, and the game organizer closes all the boxes whenever a participant enters the room. Each box contains a slip of paper on which a name of a distinct participant is written. The order of the boxes do not change during the game. Each participant is allowed to open up to&nbsp;<var>M</var>&nbsp;boxes. If every participant is able to open a box that contains a paper of his/her name, then the group wins the game, and everybody in the group earns big money. If anyone is failed to open a box that contains a paper of his/her name, then the group fails in the game, and nobody in the group gets money.</p>

<p>Obviously, if every participant picks up boxes randomly, the winning probability will be&nbsp;<var>(M/N)<sup>N</sup></var>. However, there is a far more better solution.</p>

<p>Before discussing the solution, let us define some concepts. Let&nbsp;<var>P = {p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>N</sub>}</var>&nbsp;be a set of the participants, and&nbsp;<var>B = {b<sub>1</sub>, b<sub>2</sub>, ..., b<sub>N</sub>}</var>&nbsp;be a set of the boxes. Let us define&nbsp;<var>f</var>, a mapping from&nbsp;<var>B</var>&nbsp;to&nbsp;<var>P</var>, such that&nbsp;<var>f(b)</var>&nbsp;is a participant whose name is written on a paper in a box&nbsp;<var>b</var>.</p>

<p>Here, consider a participant&nbsp;<var>p<sub>i</sub></var>&nbsp;picks up the boxes in the following manner:</p>

<ol>
	<li>Let&nbsp;<var>x := i</var>.</li>
	<li>If&nbsp;<var>p<sub>i</sub></var>&nbsp;has already opened&nbsp;<var>M</var>&nbsp;boxes, then exit as a failure.</li>
	<li><var>p<sub>i</sub></var>&nbsp;opens&nbsp;<var>b<sub>x</sub></var>.
	<ol>
		<li>If&nbsp;<var>f(b<sub>x</sub>) = p<sub>i</sub></var>, then exit as a success.</li>
		<li>If&nbsp;<var>f(b<sub>x</sub>) = p<sub>j</sub></var>&nbsp;(<var>i != j</var>), then let&nbsp;<var>x := j</var>, and go to 2.</li>
	</ol>
	</li>
</ol>

<p>Assuming every participant follows the algorithm above, the result of the game depends only on the initial order of the boxes (i.e. the definition of&nbsp;<var>f</var>). Let us define&nbsp;<var>g</var>&nbsp;to be a mapping from&nbsp;<var>P</var>&nbsp;to&nbsp;<var>B</var>, such that&nbsp;<var>g(p<sub>i</sub>) = b<sub>i</sub></var>. The participants win the game if and only if, for every&nbsp;<var>i &isin; {1, 2, ..., N}</var>, there exists&nbsp;<var>k(&le;M)</var>&nbsp;such that&nbsp;<var>(f○g)<sup>k</sup>&nbsp;(p<sub>i</sub>) = p<sub>i</sub></var>.</p>

<p>Your task is to write a program that calculates the winning probability of this game. You can assume that the boxes are placed randomly.</p>

### 입력

<p>The input consists of one line. It contains two integers&nbsp;<var>N</var>&nbsp;and&nbsp;<var>M</var>&nbsp;(1 &le;&nbsp;<var>M</var>&nbsp;&le;&nbsp;<var>N</var>&nbsp;&le; 1,000) in this order, delimited by a space.</p>

### 출력

<p>For given&nbsp;<var>N</var>&nbsp;and&nbsp;<var>M</var>, your program should print the winning probability of the game. The output value should be printed with eight digits after the decimal point, and should not contain an error greater than&nbsp;<var>10<sup>-8</sup></var>.</p>