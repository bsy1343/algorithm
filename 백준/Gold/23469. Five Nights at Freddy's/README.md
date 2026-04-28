# [Gold III] Five Nights at Freddy's - 23469

[문제 링크](https://www.acmicpc.net/problem/23469)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 12, 맞힌 사람: 12, 정답 비율: 42.857%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>Maria has finally got her dream job! She became a professional night guard in a Sky Tower. One of her responsibilities is reporting about unwanted activity in the building. Fortunately for her, she can do her job without even leaving her cozy chair. All she has to do is keep track of cameras that are placed in the skyscraper. To do so she must handle $n$ different cameras (enumerated from $1$ to $n$). She wants to create the cycle of transmitting in which she will process information from the cameras. She will look at transition from some camera for one minute and then switch to the next camera on the cycle. Each camera should appear at least once on the cycle. There are some additional constraints. No two neighboring occurrences of the camera $i$ on the cycle can be more than $a_i$ places apart. Fortunately for Maria, for each $1 \le i &lt; j \le n$ at least one of $a_i$ and $a_j$ is multiple of the other.&nbsp;</p>

<p>If it is possible, help Maria to create such cycle with length not exceeding $10^6$.</p>

### 입력

<p>In the first line one integer $Z \le 50$ is given, denoting number of testcases described in following lines.&nbsp;</p>

<p>The first line of each test case contains one integer $n$, denoting the number cameras in the Sky Tower.</p>

<p>Following line contains a description of cameras. $i$-th number denotes the parameter $a_i$ of the $i$-th camera.</p>

### 출력

<p>For each test case:</p>

<p>If it is impossible to construct such cycle, the first (and only) line of the output should consist of single word &quot;<code>NIE</code>&quot;.</p>

<p>If it is possible to construct such cycle, in the first line output single word &quot;<code>TAK</code>&quot;. The following line should contain description of a transition cycle. First number $m$ denotes the length of the cycle. Next $m$ numbers are numbers of the cameras on the cycle in order they appear on the cycle.</p>

<p>If there are several possible answers, print any of them.&nbsp;</p>

### 제한

<ul>
	<li>$n \in [1,10^5]$</li>
	<li>$a_i \in [1,10^5]$</li>
</ul>