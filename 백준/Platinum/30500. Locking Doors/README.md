# [Platinum IV] Locking Doors - 30500

[문제 링크](https://www.acmicpc.net/problem/30500)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 78, 정답: 66, 맞힌 사람: 62, 정답 비율: 86.111%

### 분류

그래프 이론, 강한 연결 요소

### 문제 설명

<p>You just started a new job at a shopping mall, and as it goes, you got the shittiest task of all: closing down at night. The mall consists of many rooms (which can be shops, hallways, or other public spaces) with open doors between them that must be closed. You can walk through a door both ways if it is open, but annoyingly, each door can only be locked from one of the two rooms it connects.</p>

<p>Your supervisor already locked the main entrance of the shopping mall, and left you inside with the task to lock all the doors. In order to do so, you may request additional exits to be installed in some of the rooms. If a room has an exit, then you are able to enter or leave the shopping mall through that room.</p>

<p>What is the minimal number of exits you need to request in order for it to be possible to lock all the doors and then leave the building?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $m$ ($2\leq n \leq 10^5$, $1\leq m \leq 10^6$), the number of rooms and doors, respectively.</li>
	<li>Then follow $m$ lines, each containing two distinct integers $a$ and $b$ ($1 \leq a,b \leq n$, $a \neq b$), indicating a door connecting rooms $a$ and $b$ which can only be locked from room $a$.</li>
</ul>

<p>You may assume that all ordered pairs $(a,b)$ are distinct and that you can walk from any room in the mall to any other room if all the doors are open.</p>

### 출력

<p>Output the minimal number of exits that need to be installed.</p>