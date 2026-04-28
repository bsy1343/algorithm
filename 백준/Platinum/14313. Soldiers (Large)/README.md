# [Platinum II] Soldiers (Large) - 14313

[문제 링크](https://www.acmicpc.net/problem/14313)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 25, 맞힌 사람: 21, 정답 비율: 63.636%

### 분류

그리디 알고리즘, 집합과 맵, 게임 이론

### 문제 설명

<p>General Alice and General Bob are playing a war game. There are&nbsp;N&nbsp;soldiers in the game. Each soldier has two stats: attack and defense.</p>

<p>Before the game starts, General Alice and General Bob will take turns selecting soldiers, with General Alice going first. In each turn, a player can select one soldier, as long as that soldier either has an attack stat greater than each of the attack stats of all soldiers selected so far,&nbsp;or&nbsp;has a defense stat greater than each of the defense stats of all soldiers selected so far. To be precise: let&nbsp;A<sub>i</sub>&nbsp;and&nbsp;D<sub>i</sub>&nbsp;be the attack and defense values for the i-th soldiers, for i from 1 to&nbsp;N, and let S be the set of soldiers that have been selected so far. Then a player can select soldier x if and only if at least one of the following is true:</p>

<ul>
	<li>A<sub>x</sub>&nbsp;&gt;&nbsp;A<sub>s</sub>&nbsp;for all s in S</li>
	<li>D<sub>x</sub>&nbsp;&gt;&nbsp;D<sub>s</sub>&nbsp;for all s in S</li>
</ul>

<p>If no selection can be made, then the selection process ends and the players start playing the game.</p>

<p>General Alice wants to select more soldiers than General Bob, and General Bob wants to avoid that. If both players play optimally to accomplish their goals, can General Alice succeed?</p>

<ul>
</ul>

### 입력

<p>The first line of each case contains a positive integer&nbsp;N, the number of soldiers.&nbsp;N&nbsp;more lines follow; the i-th of these line contains two integers&nbsp;A<sub>i</sub>&nbsp;and&nbsp;D<sub>i</sub>, indicating the attack and defense stats of the i-th soldier.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 10;</li>
	<li>1 &le;&nbsp;A<sub>k</sub>,&nbsp;D<sub>k</sub>&nbsp;&le; 10000.</li>
	<li>1 &le;&nbsp;N&nbsp;&le; 4000.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>YES</code>&nbsp;or&nbsp;<code>NO</code>, indicating whether General Alice can guarantee that she selects more soldiers than General Bob, even if General Bob plays optimally to prevent this.</p>