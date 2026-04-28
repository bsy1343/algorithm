# [Silver I] Third Group Exam - 24851

[문제 링크](https://www.acmicpc.net/problem/24851)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 27, 맞힌 사람: 23, 정답 비율: 85.185%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>One teacher came up with a new format for an exam.</p>

<ul>
	<li>The exam consists of $n$ blocks, each corresponding to one of the topics; a student receives a grade $c_i$ for the $i$-th block for all $i$ from $1$ to $n$, all grades are independent;</li>
	<li>A grade for each block is an integer value from $0$ to $100$ both inclusive. A student chooses one way to get the grade for a block: to answer a <em>theoretical question</em> or to solve a <em>practical problem</em>;</li>
	<li>An exam is successfully passed if at least $a$ blocks were graded by answering a theoretical question and at least $b$ blocks were graded by solving a practical problem;</li>
	<li>If the previous condition is satisfied, the final grade for the exam $C$ is calculated as the sum of grades for all blocks, that is $C = \sum\limits_{i=1}^n c_i$.</li>
</ul>

<p>Ilya is about to take the exam. He has a pretty good idea of his knowledge for each topic, and he is sure that passing the $i$-th block by theory will get him a grade of $x_i$, and passing it by practice --- a grade of $y_i$. Help him determine which blocks (at least $a$ of them) he should pass by theory and which blocks (at least $b$) he should pass by practice, to get the maximum possible total score for the exam.</p>

### 입력

<p>The first line of input contains three integers $n$, $a$ and $b$ --- the total number of topics, the minimum number of topics to pass by theory, and the minimum number of topics to pass by practice, respectively ($1 \leqslant n \leqslant 2 \cdot 10^5$; $0 \leqslant a, b \leqslant n$). It is guaranteed that $a + b \leqslant n$.</p>

<p>The second line consists of $n$ space-separated integers $x_i$ --- the grades Ilya will get if he passes the blocks by answering the theory questions ($0 \leqslant x_i \leqslant 100$).</p>

<p>The third line consists $n$ of integers $y_i$ in the same format --- the grades he will get by solving practice problems ($0 \leqslant y_i \leqslant 100$).</p>

### 출력

<p>The first line of output must contain a single integer $C$ --- the maximum total grade that Ilya can get for the exam.</p>

<p>The second line must contain $n$ space-separated characters, the $i$-th of which is &#39;<code>T</code>&#39; if Ilya should answer theory in the $i$-th block, and &#39;<code>P</code>&#39; if he should solve practice. At least $a$ of the characters must be equal to &#39;<code>T</code>&#39;, and at least $b$ of them must be equal to &#39;<code>P</code>&#39;.</p>