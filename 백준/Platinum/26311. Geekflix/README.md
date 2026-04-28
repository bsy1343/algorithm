# [Platinum IV] Geekflix - 26311

[문제 링크](https://www.acmicpc.net/problem/26311)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 33, 맞힌 사람: 29, 정답 비율: 61.702%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>George got COVID-19 in this morning. He must stay at home in the next seven days for quarantine. As a geek, George only watches Geekflix, the video streaming service for geeks, for recreation during his quarantine period. Geekflix provides $n$ video streams numbered from $1$ to $n$, and Geekflix also gives some geeky coins to the audiences in their quarantine periods. When George watches stream $i$ for the $k$-th time in his quarantine period, George gets $\max{(a_i - (k - 1)b_i , 0)}$ geeky coins.</p>

<p>The Geekflix app arranges the video streams on a circle. For $1 &lt; i &le; n$, the previous stream of stream $i$ is stream $i - 1$. The previous stream of stream $1$ is stream $n$. For $1 &le; i &lt; n$, the next stream of stream $i$ is stream $i + 1$. The next stream of stream $n$ is stream $1$. When George opens the Geekflix app on his TV, the Geekflix app points the cursor at stream $1$.</p>

<p>The remote controller has three buttons: previous, next, and play. When George presses the previous button, the Geekflix app points the cursor to the previous stream. When George presses the next button, the Geekflix app points the cursor to the next stream. When George presses the play button, the Geekflix app plays the stream pointed by the cursor. The cursor points to the same stream after playing.</p>

<p>George may press the buttons $m$ times during his quarantine period, and he wants to get as many geeky coins as possible. What is the maximum number of geeky coins that George can get during his quarantine period?</p>

### 입력

<p>The first line contains two positive integers $n$ and $m$. $n$ is the number of video streams, and George may press the buttons $m$ times. The second line contains $n$ positive integers $a_1, \dots , a_n$, and the third line contains $n$ non-negative integers $b_1, \dots , b_n$. These $2n$ integers define the number of geeky coins awarded to George when the Geekflix app plays video streams.</p>

### 출력

<p>Output the maximum number of geeky coins that George can get during his quarantine period.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 200$</li>
	<li>$1 &le; m &le; 1000$</li>
	<li>$0 &le; b_i &le; a_i &le; 5000$ for $1 &le; i &le; n$.</li>
</ul>