# [Gold II] Egor Has a Problem - 28194

[문제 링크](https://www.acmicpc.net/problem/28194)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 28, 맞힌 사람: 23, 정답 비율: 41.071%

### 분류

애드 혹, 비둘기집 원리

### 문제 설명

<p>Egor has come up with a hard problem for a training camp! Here it is:</p>

<p>Given an array $a$ of $n$ positive integers sorted in increasing order, find 4 indices $i &lt; j &lt; p &lt; q$ such that $a_i \cdot a_q = a_j \cdot a_p$.</p>

<p>He then wrote the checker to this problem:</p>

<pre>
// returns true if the solution is found,
// returns false if the solution is not found,
// makes the verdict Wrong Answer right away if the found solution is not valid
bool getAnswer(InStream &amp;stream, vector&lt;long long&gt; a) {
    string s = stream.readToken(&quot;NO|YES&quot;); // PE if the string is not NO or YES
    if (s == &quot;NO&quot;) return false;
    vector&lt;int&gt; b = stream.readInts(4, 1, (int)a.size()); // 4 indices between 1 and n
    int i = b[0] - 1, j = b[1] - 1, p = b[2] - 1, q = b[3] - 1;  // -1 to make 0-indexed
    stream.ensuref(i &lt; j &amp;&amp; j &lt; p &amp;&amp; p &lt; q, &quot;4 indices should be in increasing order&quot;);
    stream.ensuref(a[q] / a[p] == a[j] / a[i], &quot;the products are not equal&quot;);
    return true;
}
</pre>

<p>The multiplication will overflow <code>long long</code>, so Egor used division instead. How smart! Although now Egor might have another problem...</p>

### 입력

<p>The first line contains one integer $n$ ($4 \le n \le 500\,000$) --- the size of the array.</p>

<p>The second line contains the array $a_1, a_2, \ldots, a_n$ itself ($1 \le a_1 &lt; a_2 &lt; \ldots &lt; a_n \le 10^{18}$).</p>

### 출력

<p>On the first line print &quot;<code>YES</code>&quot; if there is a solution and print &quot;<code>NO</code>&quot; otherwise.</p>

<p>If a solution exists, print the 4 chosen indices in order $i, j, p, q$, separated by spaces. If there is more than one solution, you can print any one.</p>