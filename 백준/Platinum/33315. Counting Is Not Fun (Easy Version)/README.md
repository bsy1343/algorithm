# [Platinum V] Counting Is Not Fun (Easy Version) - 33315

[문제 링크](https://www.acmicpc.net/problem/33315)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 19, 맞힌 사람: 18, 정답 비율: 94.737%

### 분류

수학, 스택, 자료 구조, 조합론

### 문제 설명

<p><strong>This is the easy version of the problem. The difference between the versions is that in this version, the limits on $t$ and $n$ are smaller. You can hack only if you solved all versions of this problem.</strong></p>

<p style="text-align: center;"><em><small>Now Little John is rich, and so he finally buys a house big enough to fit himself and his favorite bracket sequence. But somehow, he ended up with a lot of brackets! Frustrated, he penetrates through the ceiling with the "buddha palm".</small></em></p>

<p>A bracket sequence is called <em>balanced</em> if it can be constructed by the following formal grammar.</p>

<ol>
	<li>The empty sequence $\varnothing$ is balanced.</li>
	<li>If the bracket sequence $A$ is balanced, then $\mathtt{(}A\mathtt{)}$ is also balanced.</li>
	<li>If the bracket sequences $A$ and $B$ are balanced, then the concatenated sequence $A B$ is also balanced.</li>
</ol>

<p>For example, the sequences "<code>(())()</code>", "<code>()</code>", "<code>(()(()))</code>", and the empty sequence are balanced, while "<code>(()</code>" and "<code>(()))(</code>" are not.</p>

<p>Given a balanced bracket sequence $s$, a pair of indices $(i,j)$ ($i&lt;j$) is called a <em>good pair</em> if $s_i$ is '<code>(</code>', $s_j$ is '<code>)</code>', and the two brackets are added simultaneously with respect to Rule 2 while constructing the sequence $s$. For example, the sequence "<code>(())()</code>" has three different good pairs, which are $(1,4)$, $(2,3)$, and $(5,6)$. One can show that any balanced bracket sequence of $2n$ brackets contains exactly $n$ different good pairs, and using any order of rules to construct the same bracket sequence will yield the same set of good pairs.</p>

<p>Emily will play a bracket guessing game with John. The game is played as follows.</p>

<p>Initially, John has a balanced bracket sequence $s$ containing $n$ different good pairs, which is not known to Emily. John tells Emily the value of $n$ and asks Emily to guess the sequence.</p>

<p>Throughout $n$ turns, John gives Emily the following kind of clue on each turn.</p>

<ul>
	<li>$l\,r$: The sequence $s$ contains a good pair $(l,r)$.</li>
</ul>

<p>The clues that John gives Emily are pairwise distinct and do not contradict each other.</p>

<p>At a certain point, Emily can be certain that the balanced bracket sequence satisfying the clues given so far is unique. For example, assume Emily knows that $s$ has $3$ good pairs, and it contains the good pair $(2,5)$. Out of $5$ balanced bracket sequences with $3$ good pairs, there exists only one such sequence "<code>((()))</code>" with the good pair $(2,5)$. Therefore, one can see that Emily does not always need $n$ turns to guess $s$.</p>

<p>To find out the content of $s$ as early as possible, Emily wants to know the number of different balanced bracket sequences that match the clues after each turn. Surely, this is not an easy job for Emily, especially when she is given so many good pairs. Now it is your turn to help Emily. Given the clues, you must find the answer before and after each turn. As the answers may be huge, you need to find them modulo $998\,244\,353$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^3$). The description of the test cases follows.</p>

<p>The first line of each test case contains one integer $n$ ($2 \le n \le 5000$) --- the number of good pairs.</p>

<p>Then, each of the $n$ following lines contains two integers $l_i$ and $r_i$ representing the $i$-th clue ($1 \le l_i &lt; r_i \le 2n$).</p>

<p>The clues in one test case are pairwise distinct and do not contradict each other.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $5000$.</p>

### 출력

<p>For each test case, output $n+1$ integers on a separate line:</p>

<ul>
	<li>The first integer is the answer before all clues, modulo $998\,244\,353$.</li>
	<li>For all $i \ge 1$, the $i+1$-th integer is the answer after the $i$-th clue, modulo $998\,244\,353$.</li>
</ul>

### 힌트

<p>The first test case of the example is explained in the problem description.</p>

<p>The third test case of the example is explained as follows. It can be shown that there are $132$ balanced bracket sequences with $6$ good pairs. The answers after each clue are given as follows:</p>

<ol>
	<li>You are given the good pair $(2,3)$. There are $42$ balanced bracket sequences having the good pair $(2,3)$.</li>
	<li>You are given the good pair $(1,6)$. There are $5$ balanced bracket sequences having good pairs $(2,3)$, $(1,6)$.</li>
	<li>You are given the good pair $(7,8)$. There are $2$ balanced bracket sequences having the three good pairs. The strings are "\tt{(()())()(())}" and "\tt{(()())()()()}", respectively.</li>
	<li>You are given the good pair $(9,12)$. There is only one balanced bracket sequence having the four good pairs. The content of $s$ is therefore the only string, which is "\tt{(()())()(())}".</li>
</ol>

<p>Then, the number of bracket sequences after the fifth and the sixth clue are both $1$ as you already know the content of $s$.</p>