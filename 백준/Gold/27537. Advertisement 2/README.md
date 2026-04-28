# [Gold I] Advertisement 2 - 27537

[문제 링크](https://www.acmicpc.net/problem/27537)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 141, 정답: 92, 맞힌 사람: 84, 정답 비율: 64.122%

### 분류

자료 구조, 그리디 알고리즘, 정렬

### 문제 설명

<p>There are $N$ residents in JOI Kingdom, numbered from $1$ to $N$. Resident $i$ ($1 &le; i &le; N$) lives at the coordinate $X_i$ on the real line, and its <strong>power of influence</strong> is $E_i$. It may be the case that more than one residents live at the same coordinate. A resident with a large power of influence has a high advertising potential. But such a resident is careful in buying books.</p>

<p>Rie published a book on informatics. In order to encourage many people to buy copies of the book, she can donate copies of the book to some residents. If she donates a copy of the book to Resident $i$ ($1 &le; i &le; N$), Resident $i$ will get a copy of Rie&rsquo;s book. Moreover, among the residents who did not yet get copies of the book, every resident $j$ ($1 &le; j &le; N$) satisfying the following condition will buy a copy of the book and get it.</p>

<blockquote>
<p>The distance between Resident $i$ and Resident $j$ on the real line is less than or equal to $E_i - E_j$. In other words, $|X_i - X_j| &le; E_i - E_j$ is satisfied.</p>
</blockquote>

<p>If all the residents read Rie&rsquo;s book, the Olympiads in Informatics will be greatly recognized. Write a program which calculates the minimum number of residents who will be donated copies of Rie&rsquo;s book so that all the residents in JOI Kingdom will get copies of Rie&rsquo;s book.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$</p>

<p>$X_1$ $E_1$</p>

<p>$X_2$ $E_2$</p>

<p>$\vdots$</p>

<p>$X_N$ $E_N$</p>
</blockquote>

### 출력

<p>Write one line to the standard output. The output should contain the minimum number of residents who will be donated copies of Rie&rsquo;s book.</p>

### 제한

<ul>
	<li>$1 &le; N &le; 500\,000$.</li>
	<li>$1 &le; X_i &le; 10^9$ ($1 &le; i &le; N$).</li>
	<li>$1 &le; E_i &le; 10^9$ ($1 &le; i &le; N$).</li>
	<li>Given values are all integers.</li>
</ul>