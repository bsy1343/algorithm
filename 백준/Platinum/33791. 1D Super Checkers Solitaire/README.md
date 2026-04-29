# [Platinum V] 1D Super Checkers Solitaire - 33791

[문제 링크](https://www.acmicpc.net/problem/33791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 8, 맞힌 사람: 8, 정답 비율: 47.059%

### 분류

그리디 알고리즘, 수학, 애드 혹

### 문제 설명

<p>You are playing the new hit computer game, "1D Super Checkers Solitaire"!</p>

<p>The game is played on a number line. Initially, a white token is placed at position $-1$, and $n$ black tokens are placed at <strong>distinct</strong> positions $x_1, x_2, \dots, x_n$ (with $1 \le x_i \le 10^9$). Note that position $0$ will never initially contain a token of either color. There is also a score counter, $s$, which is initially $0$.</p>

<p>On each turn, you move a black token one step to the left, under the restriction that tokens cannot overlap.</p>

<p>After each of your moves, the computer, playing the white token, repeats the following process while there is a black token immediately to the right of the white token:</p>

<ul>
	<li>Let $i$ be the current position of the white token, and let $k$ be the number of contiguous black tokens starting at position $i+1$ (i.e., tokens at positions $i+1, i+2, \dots, i+k$, with position $i+k+1$ empty).</li>
	<li>The white token jumps over and removes these $k$ black tokens, landing at position $i+k+1$.</li>
	<li>The score counter is updated to $s = s \oplus k$ (where $\oplus$ denotes the <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">bitwise XOR operation</a>).</li>
</ul>

<p>Finally, you regain control, and can take another turn if there are black tokens remaining.</p>

<p>Here is an example turn. The board could initially look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/852e17fe.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 73px;"></p>

<p>You could choose to move a black token from position $1$ to position $0$, resulting in this configuration:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/60e14a42.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-2.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 48px;"></p>

<p>The computer would then repeatedly jump over the ranges of black tokens next to it, ending up at position $6$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/8490d872.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-3.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 83px;"></p>

<p>After these moves, the score would become $0 \oplus 1 \oplus 2 \oplus 1 = 2$, and the game would continue, since there are more black tokens remaining.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/cfd78740.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-4.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 48px;"></p>

<p>The game ends when there are no more black tokens.</p>

<p>At the end of the game, you win only if and only if $s$ is equal to $0$. Determine whether you can win if you play optimally.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$ ($1 \le n \le 2 \cdot 10^5$) --- the number of black tokens.</p>

<p>The second line of each test case contains $n$ integers $x_1 &lt; x_2 &lt; \cdots, x_n$ ($1 \le x_i \le 10^9$) --- the initial positions of the black tokens, in strictly increasing order.</p>

### 출력

<p>For each test case, print "<code>YES</code>" if you can win if you play optimally, or "<code>NO</code>" otherwise.</p>

### 힌트

<p>In the first sample case, one winning move you can make is moving a black piece from position $1$ to position $0$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/067a1ffa.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-5.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 140px;"></p>

<p>The computer will then jump over all $4$ consecutive groups of your pieces, and the score will be set to $0 \oplus 1 \oplus 1 \oplus 1 \oplus 2 \oplus 2 = 0$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33791.%E2%80%851D%E2%80%85Super%E2%80%85Checkers%E2%80%85Solitaire/f5a36052.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33791-6.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 95px;"></p>

<p>Since there are no remaining black tokens, the game ends, and since $s = 0$, you win.</p>

<p>In the second sample case, since $n=1$, the score will always be $s = 1$ at the end of the game, and you will lose.</p>