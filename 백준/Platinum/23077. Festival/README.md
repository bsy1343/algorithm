# [Platinum V] Festival - 23077

[문제 링크](https://www.acmicpc.net/problem/23077)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 146, 정답: 45, 맞힌 사람: 37, 정답 비율: 31.092%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 스위핑

### 문제 설명

<p>You have just heard about a wonderful festival that will last for&nbsp;$D$ days, numbered from&nbsp;$1$&nbsp;to&nbsp;$D$. There will be&nbsp;$N$&nbsp;attractions at the festival. The&nbsp;$i$-th attraction has a&nbsp;<i>happiness rating</i>&nbsp;of $h_i$&nbsp;and will be available from day&nbsp;$s_i$&nbsp;until day&nbsp;$e_i$, inclusive.</p>

<p>You plan to choose one of the days to attend the festival. On that day, you will choose up to&nbsp;$K$&nbsp;attractions to ride. Your&nbsp;<i>total happiness</i>&nbsp;will be the sum of happiness ratings of the attractions you chose to ride.</p>

<p>What is the maximum total happiness you could achieve?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;$T$.&nbsp;$T$&nbsp;test cases follow.</p>

<p>The first line of each test case contains the three integers,&nbsp;$D$,&nbsp;$N$&nbsp;and&nbsp;$K$. The next&nbsp;$N$&nbsp;lines describe the attractions. The&nbsp;$i$-th line contains&nbsp;hihi,&nbsp;$s_i$&nbsp;and&nbsp;$e_i$.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the maximum total happiness you could achieve.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$.</li>
	<li>$1 \le K \le N$.</li>
	<li>$1 \le s_i \le e_i \le D$, for all&nbsp;$i$.</li>
	<li>$1 \le h_i \le 3 \times 10^5$, for all&nbsp;$i$.</li>
</ul>

### 힌트

<p>In sample test case 1, the festival lasts $D=10$&nbsp;days, there are&nbsp;$N=4$&nbsp;attractions, and you can ride up to&nbsp;$K=2$&nbsp;attractions.</p>

<p>If you choose to attend the festival on the 6th day, you could ride the first and second attractions for a total happiness of&nbsp;$800+1500=2300$. Note that you cannot also ride the third attraction, since you may only ride up to&nbsp;$K=2$&nbsp;attractions. This is the maximum total happiness you could achieve, so the answer is&nbsp;$2300$.</p>

<p>In sample test case 2, the festival lasts&nbsp;$D=5$&nbsp;days, there are&nbsp;$N=3$&nbsp;attractions, and you can ride up to&nbsp;$K=3$&nbsp;attractions.</p>

<p>If you choose to attend the festival on the 3rd day, you could ride the first and third attractions for a total happiness of&nbsp;$400+300=700$. This is the maximum total happiness you could achieve, so the answer is&nbsp;$700$.</p>