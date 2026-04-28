# [Silver II] Block Adventure - 27482

[문제 링크](https://www.acmicpc.net/problem/27482)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 66, 정답: 42, 맞힌 사람: 40, 정답 비율: 62.500%

### 분류

그리디 알고리즘

### 문제 설명

<p>Gildong is playing a video game called <em>Block Adventure</em>. In Block Adventure, there are $n$ columns of blocks in a row, and the columns are numbered from $1$ to $n$. All blocks have equal heights. The height of the $i$-th column is represented as $h_i$, which is the number of blocks stacked in the $i$-th column.</p>

<p>Gildong plays the game as a character that can stand only on the top of the columns. At the beginning, the character is standing on the top of the $1$-st column. The goal of the game is to move the character to the top of the $n$-th column.</p>

<p>The character also has a bag that can hold infinitely many blocks. When the character is on the top of the $i$-th column, Gildong can take one of the following three actions as many times as he wants:</p>

<ul>
	<li>if there is at least one block on the column, remove one block from the top of the $i$-th column and put it in the bag;</li>
	<li>if there is at least one block in the bag, take one block out of the bag and place it on the top of the $i$-th column;</li>
	<li>if $i&lt;n$ and $|h_i-h_{i+1}|\le k$, move the character to the top of the $i+1$-st column. $k$ is a non-negative integer given at the beginning of the game. Note that it is only possible to move to the <strong>next</strong> column.</li>
</ul>

<p>In actions of the first two types the character remains in the $i$-th column, and the value $h_i$ changes.</p>

<p>The character initially has $m$ blocks in the bag. Gildong wants to know if it is possible to win the game. Help Gildong find the answer to his question.</p>

### 입력

<p>Each test contains one or more test cases. The first line contains the number of test cases $t$ ($1\le t\le 1000$). Description of the test cases follows.</p>

<p>The first line of each test case contains three integers $n$, $m$, and $k$ ($1\le n\le 100$, $0\le m\le 10^6$, $0\le k\le 10^6$) --- the number of columns in the game, the number of blocks in the character&rsquo;s bag at the beginning, and the non-negative integer $k$ described in the statement.</p>

<p>The second line of each test case contains $n$ integers. The $i$-th integer is $h_i$ ($0\le h_i\le 10^6$), the initial height of the $i$-th column.</p>

### 출력

<p>For each test case, print &ldquo;<code>YES</code>&rdquo; if it is possible to win the game. Otherwise, print &ldquo;<code>NO</code>&rdquo;.</p>

<p>You can print each letter in any case (upper or lower).</p>

### 힌트

<p>In the first case, Gildong can take one block from the $1$-st column, move to the $2$-nd column, put the block on the $2$-nd column, then move to the $3$-rd column.</p>

<p>In the second case, Gildong has to put the block in his bag on the $1$-st column to get to the $2$-nd column. But it is impossible to get to the $3$-rd column because $|h_2-h_3|=3&gt;k$ and there is no way to decrease the gap.</p>

<p>In the fifth case, the character is already on the $n$-th column from the start so the game is won instantly.</p>