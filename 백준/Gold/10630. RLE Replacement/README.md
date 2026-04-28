# [Gold II] RLE Replacement - 10630

[문제 링크](https://www.acmicpc.net/problem/10630)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 216, 정답: 44, 맞힌 사람: 32, 정답 비율: 22.378%

### 분류

브루트포스 알고리즘, 구현, 문자열

### 문제 설명

<p>In JAG Kingdom, ICPC (Intentionally Compressible Programming Code) is one of the common programming languages. Programs in this language only contain uppercase English letters and the same letters often appear repeatedly in ICPC programs. Thus, programmers in JAG Kingdom prefer to compress ICPC programs by <em>Run Length Encoding</em> in order to manage very large-scale ICPC programs.</p>

<p>Run Length Encoding (RLE) is a string compression method such that each maximal sequence of the same letters is encoded by a pair of the letter and the length. For example, the string &quot;RRRRLEEE&quot; is represented as &quot;R4L1E3&quot; in RLE.</p>

<p>Now, you manage many ICPC programs encoded by RLE. You are developing an editor for ICPC programs encoded by RLE, and now you would like to implement a replacement function. Given three strings \(A\), \(B\), and \(C\) that are encoded by RLE, your task is to implement a function replacing the first occurrence of the substring \(B\) in \(A\) with \(C\), and outputting the edited string encoded by RLE. If \(B\) does not occur in \(A\), you must output \(A\) encoded by RLE without changes.</p>

### 입력

<p>The input consists of three lines.</p>

<pre>
A
B
C
</pre>

<p>The lines represent strings \(A\), \(B\), and \(C\) that are encoded by RLE, respectively. Each of the lines has the following format:</p>

<pre>
c<sub>1</sub> l<sub>1</sub> c<sub>2</sub> l<sub>2</sub> ... c<sub>n</sub> l<sub>n</sub> $</pre>

<p>Each \(c_i\) (\(1 \leq i \leq n\)) is an uppercase English letter (<code>A</code>-<code>Z</code>) and \(l_i\) (\(1 \leq i \leq n\), \(1 \leq l_i \leq 10^8\)) is an integer which represents the length of the repetition of \(c_i\). The number \(n\) of the pairs of a letter and an integer satisfies \(1 \leq n \leq 10^3\). A terminal symbol <code>$</code> indicates the end of a string encoded by RLE. The letters and the integers are separated by a single space. It is guaranteed that \(c_i \neq c_{i+1}\) holds for any \(1 \leq i \leq n-1\).</p>

### 출력

<p>Replace the first occurrence of the substring \(B\) in \(A\) with \(C\) if \(B\) occurs in \(A\), and output the string encoded by RLE. The output must have the following format:</p>

<pre>
c<sub>1</sub> l<sub>1</sub> c<sub>2</sub> l<sub>2</sub> ... c<sub>m</sub> l<sub>m</sub> $</pre>

<p>Here, \(c_i \neq c_{i+1}\) for \(1 \leq i \leq m-1\) and \(l_i \gt 0\) for \(1 \leq i \leq m\) must hold.</p>