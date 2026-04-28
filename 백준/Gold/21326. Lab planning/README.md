# [Gold IV] Lab planning - 21326

[문제 링크](https://www.acmicpc.net/problem/21326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Ah, university. A bastion of knowledge, the Mecca of education, and the core of bureaucracy.</p>

<p>Wille and Kaski are currently waiting in a computer lab to present a lab in a course. In total, there are $N$ groups waiting to present their lab. Group $i$ is going to present $m_i$ different labs, where lab $j$ takes $a_{i, j}$ minutes.</p>

<p>To be fair, all groups need to wait a really long time to present. There is only a single teacher taking presentations, and letting each group present all their labs in a single go would mean that they don&#39;t have to wait unnecessarily for other groups! Therefore, the teacher takes presentations in a seemingly arbitrary order...</p>

<p>Kashi has had enough. She wants to go home and play Pok&eacute;mon, and is complaining about the inefficiencies in the presentation scheme. To demonstrate how inefficient the system is, she&#39;ll compute the longest possible total waiting time, and show just how close the teacher&#39;s system is to this value.</p>

<p>Assume that a group starts presenting their first lab at time $a$, and completes their final lab at time $b$. Then its waiting time is $b - a$. The total waiting time is the sum of the waiting time over all groups.</p>

<p>The order in which a group must present its labs must be the same as the order they are given in the input.</p>

### 입력

<p>The first line contains a single integer $N \ge 1$.</p>

<p>Then follow $N$ lines, each containing first the number $m_i \ge 1$, and then $m_i$ integers $a_{i,j}$, all between 1 och 60.</p>

### 출력

<p>You should output a single number: the longest possible total waiting time for the students over all possible presentation orders.</p>

### 제한

<ul>
	<li>The sum of all the $m_i$ is at most $100\,000$.</li>
</ul>

### 힌트

<p>In the given sample, three groups need to present their labs: the first group has labs taking 5 and 15 minutes, the second group takes 10 and 20 minutes, and the third group has a single lab taking an entire hour.</p>

<p>If we choose the order $5, 10, 60, 20, 15$, the third group will wait only for 60 minutes. The second group will, besides their own labs, have to wait for the lab of the third group, and therefore take $10+60+20 = 90$ minutes. The first group will instead take $5 + 10 + 60 + 20 + 15 = 110$ minutes.</p>

<p>The sum of this is $60 + 90 + 110 = 260$ minutes.</p>

<p>Note that the order 10, 15, 60, 20, 5 would have resulted in a worse time of $265$, but this is not allowed: group 1 may not present their second lab before their first.</p>