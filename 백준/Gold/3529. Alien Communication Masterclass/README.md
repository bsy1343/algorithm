# [Gold IV] Alien Communication Masterclass - 3529

[문제 링크](https://www.acmicpc.net/problem/3529)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 53, 정답: 30, 맞힌 사람: 26, 정답 비율: 60.465%

### 분류

애드 혹, 해 구성하기, 수학, 정수론

### 문제 설명

<p>Andrea is a famous science fiction writer, who runs masterclasses for her beloved readers. The most popular one is the Alien Communication Masterclass (ACM), where she teaches how to behave if you encounter alien life forms or at least alien artifacts.</p>

<p>One of the lectures concerns retrieving useful information based on aliens&#39; writings. Andrea teaches that based on alien mathematical formulas, one could derive the base of the numeral system used by the aliens, which in turn might give some knowledge about aliens&#39; organisms. (For example, we use numeral system with base 10, due to the fact that we have ten fingers on our upper extremities).</p>

<p>Suppose for simplicity that aliens use the same digits as we do, and they understand and denote addition, subtraction, multiplication, parentheses and equality the same way as we do.</p>

<p>For her lecture, Andrea wants an example of a mathematical equality that holds in numeral systems with bases $a_1, a_2, \cdots, a_n$, but doesn&#39;t hold in numeral systems with bases $b_1, b_2, \cdots, b_m$. Provide her with one such formula.</p>

### 입력

<p>The first line of the input file contains two integer numbers, $n$ and $m$ ($1 \le n, m \le 8$). The second line contains $n$ numbers, $a_1, a_2, \cdots, a_n$. The third line contains $m$ numbers, $b_1, b_2, \cdots, b_m$.</p>

<p>All $a_i$ and $b_i$ are distinct and lie between 2 and 10, inclusive.</p>

### 출력

<p>Output any syntactically correct mathematical equality that holds in numeral systems with bases $a_1, a_2, \cdots, a_n$, but doesn&#39;t hold in numeral systems with bases $b_1, b_2, \cdots, b_m$. The equality can contain only digits 0 through 9, addition (<code>+</code>), subtraction and unary negation (<code>-</code>), multiplication (<code>*</code>), parentheses (<code>(</code> and <code>)</code>) and equality sign (<code>=</code>). There must be exactly one equality sign in the output.</p>

<p>Any whitespace characters in the output file will be ignored. The number of non-whitespace characters in the output file must not exceed $10\,000$.</p>