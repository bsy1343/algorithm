# [Platinum IV] Family Fares - 20334

[문제 링크](https://www.acmicpc.net/problem/20334)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 106, 정답: 54, 맞힌 사람: 51, 정답 비율: 54.255%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>After a long time apart, your family will gather next year for a reunion in an idyllic village in the centre of the country. Since everybody lives apart, most will need to travel by train.</p>

<p>You are in charge of finding the best deal on tickets. Everyone must take an optimal route, that is to say they may only travel a route if no other route is shorter.</p>

<p>Two types of ticket are available: <em>individual</em> or <em>group</em>. All tickets come with a start and destination between which to travel. Individual tickets are unlimited and the price is equal to the shortest distance in kilometres between stations.</p>

<p>Group tickets are more complicated. First, you may only buy at most one and it must be for a set list of people. There is no limit to the number of people named, but all must be present. The ticket is priced according to the number of named persons.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20334.%E2%80%85Family%E2%80%85Fares/c820e419.png" data-original-src="https://upload.acmicpc.net/462657cc-f173-49cf-8db0-a75e26a15a2d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 295px; height: 140px;" /></p>

<p style="text-align: center;">Figure F.1: Sample 2. Group or individual tickets are shown by thick or thin lines, respectively.</p>

### 입력

<ul>
	<li>One line with four integers: $n$ ($2 \le n \le 1000$), the number of stations, $m$ ($n-1 \le m \le 10^5$), the number of connections between stations, $p$ ($1 \le p \le 100$), the number of family members, and $g$ ($1 \le g \le 10^6$), the cost per person of a group ticket.</li>
	<li>One line with $p$ integers $v_i$ ($1 \le v \le n$), meaning that family member $i$ starts at station $v_i$.</li>
	<li>$m$ further lines, each with three integers $a$, $b$, and $c$ (${1 \le a,b \le n}$, $a\neq b$, and ${1 \le c \le 10^6}$), indicating that there is a bidirectional connection between stations $a$ and $b$ with a length of $c$ kilometres.</li>
</ul>

<p>Each pair of distinct stations has at most one direct connection and every station can be reached from any other station. Station number $1$ serves the idyllic village.</p>

### 출력

<p>Output the total amount you must spend so that every family member can travel from their starting station to the idyllic village.</p>