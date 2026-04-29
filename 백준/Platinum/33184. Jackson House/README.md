# [Platinum I] Jackson House - 33184

[문제 링크](https://www.acmicpc.net/problem/33184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 8, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

수학, 애드 혹, 조합론

### 문제 설명

<p>Jackson, after witnessing the advancements in the world of technology, decided to sell his small cozy house and enroll in the programming-and-algorithm micromaster. He came across an interesting algorithm that he needed to analyze and solve the problem related to it, in order to pass the exam at this stage of the course. The pseudocode of this algorithm is as follows:</p>

<blockquote>
<pre class="mathjax"><strong>input</strong>: a permutation $π = &lt;π_1, π_2, \dots , π_n&gt;$ of numbers $\{1, 2, \dots , n\}$
<strong>while</strong> $π$ is changing during this iteration:
    <strong>for</strong> $i := n$ <strong>downto</strong> $2$:
        <strong>if</strong> $π_i &lt; π_{\lfloor i/2 \rfloor}$:
            swap($π_i$, $π_{\lfloor i/2 \rfloor}$)</pre>
</blockquote>

<p>He wants to know for how many permutations $π$ of length $n$ from the possible $n!$ ones, the final permutation will be sorted after running this algorithm.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 100$), the number of test cases.</p>

<p>Each of the next $t$ lines contains an integer $n_i$ ($2 \le n_i \le 10^9$), representing the length of the permutation for the $i$<sup>th</sup> test case.</p>

### 출력

<p>Output $t$ lines. On the $i$<sup>th</sup> line, print the number of permutations of length $n_i$ which will be sorted after running the provided algorithm on it. Since the output could be very large, output the result modulo $10^9 + 7$.</p>