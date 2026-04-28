# [Gold II] Internet Chats - 20784

[문제 링크](https://www.acmicpc.net/problem/20784)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 30, 정답: 21, 맞힌 사람: 16, 정답 비율: 72.727%

### 분류

이분 탐색, 자료 구조, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>While we enjoy chatting with friends on the internet, it is always annoying that we are overwhelmed by lots of messages in various chat groups. A great majority of these messages are actually not interesting to us, but we may miss some important notices if we silence these groups. How many messages do we receive from all online chat groups? Nobody has ever seriously gone into this question.</p>

<p>As an assistant researcher in the school of informatics, you are required to investigate the number of online messages we receive every day. We have already sampled $n$ groups and $m$ students. Every group contains a subset of the $m$ students, which is possibly empty. Also, the members of the groups are constantly evolving; old members may quit, and new members may join in a chat group. Members can send messages in the group; the message is broadcast to all other members currently in the same group.</p>

<p>Now we have collected the log of these chat groups. The log is a sequence of events, which may be a student joining in a group, quitting a group, or sending a message in a group. Your task is to compute the total number of messages received by every student.</p>

### 입력

<p>The first line of the input contains three integers $n, m, s$ $(1 \leq n \leq 100\,000, 1 \leq m \leq 200\,000, 1 \leq s \leq 1\,000\,000)$, denoting the number of groups, the number of students and the number of events in the log.</p>

<p>The next $s$ lines give the events in the log in chronological order. Each of them contains three integers $t, x, y$ $(t \in \{1, 2, 3\}, 1 \leq x \leq m, 1 \leq y \leq n)$ specifying an event, which may fall into one of the following three categories:</p>

<ul>
	<li>If $t = 1$, it means that the $x$-th student joined in the $y$-th group. It is guaranteed that the student was not in the group before.</li>
	<li>If $t = 2$, it means that the $x$-th student quitted the $y$-th group. It is guaranteed that the student was currently in the group.</li>
	<li>If $t = 3$, it means that the $x$-th student sent a message in the $y$-th group. It is guaranteed that the student was in the group now.</li>
</ul>

<p>Initially, all groups were empty.&nbsp;</p>

### 출력

<p>Output $m$ lines. The $i$-th line contains an integer, denoting the total number of messages the $i$-th student received.</p>