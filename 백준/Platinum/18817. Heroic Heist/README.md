# [Platinum III] Heroic Heist - 18817

[문제 링크](https://www.acmicpc.net/problem/18817)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 31, 맞힌 사람: 25, 정답 비율: 40.984%

### 분류

이분 탐색, 매개 변수 탐색, 이분 매칭

### 문제 설명

<p>It is the night before the grand opening of a new art gallery. The gallery consists of n rooms, numbered from 1 to n. The rooms are organized sequentially, with room 1 being connected by a door to room 2, and room 2 being connected to room 3, and so on. Each room has a door that leads into it from the preceding room. That door is either locked or unlocked. If the door is unlocked, the room will contain a key. Otherwise, it will not contain a key.</p>

<p>To enter a room with a locked door, you must use a key that is compatible. Each key can open a subset of the doors. The gallery uses a special lock and key system to deter thieves. A key can only be used once, since a locked door will consume any key used to open it.</p>

<p>You start in the first room, which is guaranteed to contain a key, and would like to enter as many rooms as possible. The more rooms you can enter, the more paintings you can. . . admire.</p>

<p>Assuming you use keys optimally, what is the maximum number of rooms you can enter?</p>

### 입력

<p>The first line contains a single integer n (2 &le; n &le; 300), which is the number of rooms.</p>

<p>The next n lines describe the rooms in the gallery in order. Each of these lines contains either:</p>

<ul>
	<li>A single integer, 0 &lt; x &lt; n, if that room contains a key. Then, x integers, listing the numbers of rooms that contain locked doors that the key can open. No room will appear more than once in this list.</li>
	<li>A single integer, 0, if that room has a locked door from the preceding room.</li>
</ul>

<p>The first room is guaranteed to have x &gt; 0.</p>

### 출력

<p>Display the maximum number of rooms you can enter.</p>