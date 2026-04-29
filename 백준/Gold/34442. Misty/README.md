# [Gold IV] Misty - 34442

[문제 링크](https://www.acmicpc.net/problem/34442)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 32, 맞힌 사람: 29, 정답 비율: 74.359%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>You have crashed your spaceship into a swampy planet. Luckily, you were rescued by a small 900-year-old green alien who lives at the base of a massive tree. Around the tree are many trails which lead to other alien's houses.</p>

<p>The green alien says he will repair your spaceship if you will help him with a very strange task. "Lots of mist, we have. Hard to see, it is. Help me light up my trails, you will," the alien says.</p>

<p>The green alien hands you a map of the trail system. There are $n$ houses, each labeled with a unique number between $1$ and $n$, inclusive. There are $m$ trails, each of which goes between a pair of alien's houses. Each trail is labeled with a unique number between $1$ and $m$, inclusive. The green alien has also marked the length of each of the $m$ trails.</p>

<p>The green alien shows you a reel of wire and a box of light-bulbs. "Be able to visit everyone else on lighted trails, everyone should. Minimum amount of wire and lights, you should use."</p>

<p>The green alien speaks quite strangely, so it takes a while for you to process this request. Then you realize that the alien wants you to light up the minimum length of trails so that every alien can visit every other alien by travelling only on lighted trails.</p>

<p>Your task is to determine which trails to light up.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ (in that order).</p>

<p>The subsequent $m$ lines specify information about the $m$ trails labeled on the map, in sorted order (that is, information about trail $1$ is on the first line, trail $2$ on the second line, etc.). Each of the lines contain three integers, $h_1$, $h_2$, and $d$ (in that order). $h_1$ and $h_2$ specify the house numbers of the houses on opposite ends of the trail, and $d$ specifies the trail's distance.</p>

### 출력

<p>The first line of the output should contain $k$, the number of trails which you need to light up.</p>

<p>The subsequent $k$ lines should contain the numbers corresponding to the trail labels which you need to light up.</p>

### 제한

<ul>
	<li>All numbers on the same line are space separated.</li>
	<li>$2 \leq n \leq 100$ and $n - 1 \leq m \leq \frac{n(n - 1)}{2}$</li>
	<li>For every $h_1$, $h_2$ pair, $h_1 \neq h_2$.</li>
	<li>All $h_1$ and $h_2$ values are between $1$ and $n$, inclusive.</li>
	<li>Every $d$ is an integer between $1$ and $100\,000$, inclusive.</li>
	<li>You are guaranteed that all of the houses can be connected by a set of trails.</li>
	<li>You are additionally guaranteed that there is at most one trail between any given $h_1$, $h_2$ pair.</li>
</ul>