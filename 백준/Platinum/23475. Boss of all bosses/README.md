# [Platinum III] Boss of all bosses - 23475

[문제 링크](https://www.acmicpc.net/problem/23475)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 21, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

그래프 이론, 애드 혹, 트리, 트리의 지름

### 문제 설명

<p>Krzysztof J. is a well-known and respected mafia boss from Szczecin. Next week, he is arranging a meeting with his associates. For simplicity let&#39;s denote them by numbers $1, 2, \dots, n$. They will go for sushi or bowling and then talk business over dinner. Organizing such event is not an easy task though, because the invited mafiosos have a rather fiery temper and they often disagree on many topics, which sometimes results in fights. That is why he asked for your help.</p>

<p>You know that exactly $n - 1$ pairs of mafiosos are friends and for every such pair you have determined the expected time of <em>reaching a direct agreement</em> between them. You have also built a graph defined by the relation of friendship. As it turns out, that graph is connected, so for the pairs of mafiosos that are not friends, the expected time of <em>reaching an agreement</em> is the minimum sum of times of <em>reaching direct agreements</em> between adjacent mafiosos on the path connecting them in the graph.</p>

<p>During the dinner mafiosos will seat on one side of a long table. The seats have numbers $1, 2, \dots, w+1$, where $w$ is the width of the table. Krzysztof doesn&#39;t want to provoke any fights during the dinner, so he decided that if there is a pair of mafiosos with seat numbers $i$ and $j$ and their expected time of <em>reaching an agreement</em> is $d$, then $d \leq |i - j|$ must hold. Because of that it can happen, that some seats remain empty. Your job is to determine the minimum width of the table, at which the guests can be seated.</p>

### 입력

<p>In the first line one integer $Z \le 10^6$ is given, denoting number of testcases described in following lines.</p>

<p>The first line of each test case contains single integer $n$, denoting the number of mafiosos. Each of the following $n - 1$ lines describes a pair of mafiosos that are friends. Pair $i$ is denoted by three positive integers $a_i$, $b_i$ and $c_i$ -- the labels of mafiosos and the expected time of <em>reaching a direct agreement</em> between them.</p>

### 출력

<p>For each test case your program should write the minimum width of the table.</p>

### 제한

<ul>
	<li>$n \geq 3$</li>
	<li>sum of $n$ over all test cases does not exceed $10^6$.</li>
</ul>