# [Platinum V] Chain Reactions - 25091

[문제 링크](https://www.acmicpc.net/problem/25091)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 98, 맞힌 사람: 86, 정답 비율: 67.717%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그리디 알고리즘, 트리

### 문제 설명

<p>Wile lives alone in the desert, so he entertains himself by building complicated machines that run on chain reactions. Each machine consists of $N$ modules indexed $1,2,\dots,N$. Each module may point at one other module with a lower index. If not, it points at the abyss.</p>

<p>Modules that are not pointed at by any others are called <i>initiators</i>. Wile can manually trigger initiators. When a module is triggered, it triggers the module it is pointing at (if any) which in turn may trigger a third module (if it points at one), and so on, until the chain would hit the abyss or an already triggered module. This is called a <i>chain reaction</i>.</p>

<p>Each of the $N$ modules has a fun factor $F_i$. The fun Wile gets from a chain reaction is the largest fun factor of all modules that triggered in that chain reaction. Wile is going to trigger each initiator module once, in some order. The overall fun Wile gets from the session is the sum of the fun he gets from each chain reaction.</p>

<p>For example, suppose Wile has $4$ modules with fun factors $F_1=60$, $F_2=20$, $F_3=40$, and $F_4=50$ and module $1$ points at the abyss, modules $2$ and $3$ at module $1$, and module $4$ at module $2$. There are two initiators ($3$ and $4$) that Wile must trigger, in some order.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25091.%E2%80%85Chain%E2%80%85Reactions/9a51323e.gif" data-original-src="https://upload.acmicpc.net/73323397-2995-460a-98cf-cf1993842498/example_1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 462px; height: 195px;" /></p>

<p>As seen above, if Wile manually triggers module $4$ first, modules $4$, $2$, and $1$ will get triggered in the same chain reaction, for a fun of $\max{(50,20,60)}=60$. Then, when Wile triggers module $3$, module $3$ will get triggered alone (module $1$ cannot get triggered again), for a fun of $40$, and an overall fun for the session of $60+40=100$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25091.%E2%80%85Chain%E2%80%85Reactions/b836b2ba.gif" data-original-src="https://upload.acmicpc.net/20603977-c4dc-4d1c-b38d-97dfb849472b/example_2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 462px; height: 195px;" /></p>

<p>However, if Wile manually triggers module $3$ first, modules $3$ and $1$ will get triggered in the same chain reaction, for a fun of $\max{(40,60)}=60$. Then, when Wile triggers module $4$, modules $4$ and $2$ will get triggered in the same chain reaction, for a fun of $\max{(50,20)}=50$, and an overall fun for the session of $60+50=110$.</p>

<p>Given the fun factors and the setup of the modules, compute the maximum fun Wile can get if he triggers the initiators in the best possible order.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow, each described using 3 lines. Each test case starts with a line with a single integer $N$, the number of modules Wile has. The second line contains $N$ integers $F_1,F_2,\dots,F_N$ where $F_i$ is the fun factor of the $i$-th module. The third line contains $N$ integers $P_1,P_2,\dots,P_N$. If $P_i=0$, that means module $i$ points at the abyss. Otherwise, module $i$ points at module $P_i$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the maximum fun Wile can have by manually triggering the initiators in the best possible order.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;F_i&le;10^9$.</li>
	<li>$0&le;P_i&le;i-1$, for all $i$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the one explained in the problem statement.</p>

<p>In Sample Case #2, there are $4$ initiators (modules $2$ through $5$), so there are $4$ chain reactions. Activating them in order $3$, $5$, $4$, $2$ yields chains of fun $3$, $5$, $4$, $2$ for an overall fun of $14$. Notice that we are summing the four highest fun numbers in the input, so there is no way to get more than that.</p>

<p>In Sample Case #3, an optimal activation order of the $5$ initiators is $4$, $5$, $7$, $6$, $8$.</p>