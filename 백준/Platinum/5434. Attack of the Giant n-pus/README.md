# [Platinum III] Attack of the Giant n-pus - 5434

[문제 링크](https://www.acmicpc.net/problem/5434)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 76, 정답: 27, 맞힌 사람: 12, 정답 비율: 21.818%

### 분류

이분 탐색, 이분 매칭

### 문제 설명

<p>A pirate ship is being attacked by a giant n-pus<sup>1</sup>. The n tentacles and the head of the creature have pierced the deck and are wreaking havoc on the ship. In an attempt to stop the creature from completely destroying the ship, the captain charges towards the head of the creature. Unfortunately, he quickly gets knocked back by one of the tentacles. The captain realizes he cannot attack the head of the n-pus as long as it can move its tentacles freely.</p>

<p>Luckily the captain is not alone on the ship. There are p (p &ge; n) pirates spread around on the deck, ready to follow the captain&rsquo;s orders. So the captain comes up with the following plan. If each tentacle is attacked by one of the pirates, he can move freely towards the head of the creature and finish it off. To be safe, the captain will start moving only after each of the tentacles is being attacked by a pirate. When the captain reaches the head, he can instantly kill the creature. The captain wants to figure out which pirates to send to which tentacles, such that the creature can be killed as fast as possible. As this happens regularly to pirates, the captain wants you to write a program to solve this problem.</p>

<p><sup>1</sup>An n-pus is like an octopus, but then with n tentacles.</p>

### 입력

<p>The first line of the input contains a single number: the number of test cases to follow. Each test case has the following format:</p>

<ul>
	<li>One line with two integers n and p, satisfying 1 &le; n &le; p &le; 100: the number of tentacles of the n-pus and the number of pirates (excluding the captain), respectively.</li>
	<li>One line with three integers x<sub>c</sub>, y<sub>c</sub> and v<sub>c</sub>: the captain&rsquo;s coordinates and speed, respectively.</li>
	<li>p lines, each with three integers x<sub>i</sub>, y<sub>i</sub> and v<sub>i</sub>: the coordinates and speed, respectively, of each pirate.</li>
	<li>One line with two integers x<sub>h</sub> and y<sub>h</sub>: the coordinates of the head of the n-pus.</li>
	<li>n lines, each with two integers x<sub>j</sub> and y<sub>j</sub> : the coordinates of each tentacle.</li>
</ul>

<p>All coordinates satisfy 0 &le; x, y &le; 10, 000. All speeds satisfy 1 &le; v &le; 100.</p>

<p>The captain, the pirates, the head and the tentacles are all considered to be point-like (i.e. they have no size). Their locations are all distinct.</p>

<p>The captain and all pirates move to their target in a straight line at their given speed and are not hindered by anyone or anything.</p>

### 출력

<p>For every test case in the input, the output should contain one floating point number on a single line: the minimum time it takes for the captain to kill the n-pus. Your answer should have either an absolute or a relative error of at most 10<sup>-6</sup>.</p>