# [Gold II] Game Sort: Part 1 - 29797

[문제 링크](https://www.acmicpc.net/problem/29797)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 23.529%

### 분류

브루트포스 알고리즘, 그리디 알고리즘

### 문제 설명

<p><i>Note: The main parts of the statements of the problems &quot;Game Sort: Part 1&quot; and &quot;Game Sort: Part 2&quot; are identical, except for the last paragraph. The problems can otherwise be solved independently.</i></p>

<p>Amir and Badari are playing a sorting game. The game starts with a string $\mathbf{S}$ and an integer $\mathbf{P}$ being chosen by an impartial judge. Then, Amir has to split $\mathbf{S}$ into exactly $\mathbf{P}$ contiguous non-empty parts (substrings). For example, if $\mathbf{S} = \vphantom{}$<code>CODEJAM</code> was the chosen string and $\mathbf{P} = 3$, Amir could split it up as [<code>COD</code>, <code>EJA</code>, <code>M</code>] or as [<code>CO</code>, <code>D</code>, <code>EJAM</code>], but not as [<code>COD</code>, <code>EJAM</code>], [<code>COD</code>, <code>JA</code>, <code>M</code>], [<code>EJA</code>, <code>COD</code>, <code>M</code>], nor as [<code>CODE</code>, <code>EJA</code>, <code>M</code>].</p>

<p>Then, Badari must rearrange the letters within each part to make the list of parts be sorted in non-decreasing <a href="https://en.wikipedia.org/wiki/Lexicographic_order" target="_blank">lexicographical order</a>. If she can, then she wins. Otherwise, Amir wins.</p>

<p>Given the partition Amir made, can you help Badari win the game, or say that it is not possible?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of two lines. The first line of a test case contains a single integer $\mathbf{P}$, the number of parts Amir made. The second line contains $\mathbf{P}$ strings $\mathbf{S_1}, \mathbf{S_2}, \dots, \mathbf{S_P}$, representing the $\mathbf{P}$ parts, in order.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is either <code>POSSIBLE</code> if Badari can win the game, or <code>IMPOSSIBLE</code> if she cannot. If she can win the game, output a second line containing $t_1\, t_2 \,\dots\, t_{\mathbf{P}}$ where $t_i$ is a rearrangement of the letters of $\mathbf{S_i}$, and $t_i$ is lexicographically earlier than or equal to $t_{i+1}$, for all $i$. If there are multiple solutions, you may output any one of them.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>Each character of $\mathbf{S_i}$ is an English uppercase letter <code>A</code> through <code>Z</code>, for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1, Badari could also win in $5$ other ways. Two of them are [<code>CO</code>, <code>JED</code>, <code>MA</code>] and [<code>CO</code>, <code>EJD</code>, <code>MA</code>].</p>

<p>In Sample Case #2, Badari can win simply by leaving all parts as Amir gave it to her, but other ways are also possible.</p>

<p>In Sample Case #3 Amir has guaranteed a win for himself leaving Badari no winning option.</p>