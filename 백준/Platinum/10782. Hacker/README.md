# [Platinum II] Hacker - 10782

[문제 링크](https://www.acmicpc.net/problem/10782)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 167, 정답: 69, 맞힌 사람: 56, 정답 비율: 47.863%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 누적 합, 덱

### 문제 설명

<p>Byteasar the hacker has qualified for this year&rsquo;s IHO, the International Hacking Olympiad. One of the tasks in the Olympiad involves competing against a system operator. There are n computers numbered from 1 to n, connected in a ring topology, i.e. computers i and i+ 1 are connected (for i = 1, . . . , n&minus;1), and also computers n and 1 are connected.</p>

<p>The competition is performed as a game between the hacker and the system operator:</p>

<ul>
	<li>Byteasar moves first. Afterwards, the operator and Byteasar move alternately.</li>
	<li>In his first move, Byteasar chooses any computer and hacks it (for instance, by exploiting some operating system vulnerabilities).</li>
	<li>In his first move, the operator chooses any non-hacked computer and protects it (for instance, by installing latest security upgrades).</li>
	<li>In all his following moves, Byteasar either (a) does nothing or (b) chooses any computer that is neither hacked nor protected and is directly linked to any hacked computer, and hacks it.</li>
	<li>In all his following moves, the operator either (a) does nothing or (b) chooses any computer that is neither hacked nor protected and is directly linked to any protected computer, and protects it.</li>
	<li>The game ends as soon as both have done nothing in two subsequent moves. At the beginning of the game none of the computers are hacked or protected.</li>
</ul>

<p>Every computer i has a certain value v<sub>i</sub> which specifies the value of the data which is stored on it. For each hacked computer i, Byteasar scores its value v<sub>i</sub>. Byteasar is quite a good hacker, but has no idea of algorithms. That is why he asks you to write a program that computes his maximum possible score, assuming that the operator plays optimally.</p>

### 입력

<p>The first line of input contains a positive integer n (n &ge; 2), specifying the number of computers. The second line contains a sequence of n integers v<sub>1</sub>, v<sub>2</sub>, . . . , v<sub>n</sub> (1 &le; v<sub>i</sub> &le; 2000); number v<sub>i</sub> specifies the value of the data stored on computer i.</p>

### 출력

<p>In the first and only line of output your program should write one integer: Byteasar&rsquo;s maximum possible score against an optimally playing operator.</p>

### 힌트

<p>In the first example, Byteasar in his first move should hack computer 2 (scoring 6). The operator&rsquo;s response will be protecting computer 3. In the next move Byteasar can hack computer 1 (scoring 7). Finally, the operator will protect computer 4.</p>