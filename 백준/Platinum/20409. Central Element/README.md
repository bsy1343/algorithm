# [Platinum II] Central Element - 20409

[문제 링크](https://www.acmicpc.net/problem/20409)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 11, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>There is a permutation P of numbers 1 through n, not known to you, P = &lt;P<sub>1</sub>, P<sub>2</sub>, ..., P<sub>n</sub>&gt;. You can ask the following type of questions: Given three distinct positions i, j and k, which of P<sub>i</sub>, P<sub>j</sub> and P<sub>k</sub> is central? Element is central if it is neither minimal nor maximal.</p>

<p>For example, if the permutation is &lt;2, 1, 4, 3&gt;, and you ask about positions 1, 2, and 3, you receive 2, because 2 is the central element of the set {P<sub>1</sub>, P<sub>2</sub>, P<sub>3</sub>} = {2, 1, 4}. Note that you don&rsquo;t get the information at which position among 1, 2, and 3 it is located.</p>

<p>Your task is to find the permutation P. Actually, for each permutation P there is a set S(P) of permutations that cannot be distinguished from P using the allowed questions. You must find any permutation from this set.</p>

### 입력

<p>The first line of the standard input contains n, the size of the permutation (3 &le; n &le; 200).</p>

<p>Each of the next lines of the standard input contains response to your question &mdash; the number that is central among the numbers at the asked positions.</p>

### 출력

<p>When you&rsquo;re asking questions, each line of the standard output should contain three different integers from the range of 1 to n, space-separated. You can ask at most 2 000 questions.</p>

<p>When you&rsquo;re stating the answer, the line of the standard output should contain the word &ldquo;<code>OK</code>&rdquo;, and the numbers P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>n</sub>, all space-separated. After printing this line your program must exit.</p>

<p>You must flush standard output after printing each line.</p>