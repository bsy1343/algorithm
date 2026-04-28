# [Gold V] Goofy Converter - 22689

[문제 링크](https://www.acmicpc.net/problem/22689)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 24, 맞힌 사람: 22, 정답 비율: 46.809%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Nathan O. Davis is a student at the department of integrated systems. He is now taking a class in in- tegrated curcuits. He is an idiot. One day, he got an assignment as follows: design a logic circuit that takes a sequence of positive integers as input, and that outputs a sequence of 1-bit integers from which the original input sequence can be restored uniquely.</p>

<p>Nathan has no idea. So he searched for hints on the Internet, and found several pages that describe the 1-bit DAC. This is a type of digital-analog converter which takes a sequence of positive integers as input, and outputs a sequence of 1-bit integers.</p>

<p>Seeing how 1-bit DAC works on these pages, Nathan came up with a new idea for the desired converter. His converter takes a sequence L of positive integers, and a positive integer&nbsp;<i>M</i>&nbsp;aside from the sequence, and outputs a sequence&nbsp;<i>K</i>&nbsp;of 1-bit integers such that:</p>

<p>$$L_j = \sum_{i=j}^{j+M-1}{K_i}\text{.}$$</p>

<p>He is not so smart, however. It is clear that his converter does not work for some sequences. Your task is to write a program in order to show the new converter cannot satisfy the requirements of his assignment, even though it would make Nathan in despair.</p>

### 입력

<p>The input consists of a series of data sets. Each data set is given in the following format:</p>

<pre>
<i>N M</i>
<i>L</i><sub>0</sub> <i>L</i><sub>1</sub> . . . <i>L</i><sub><i>N</i>-1</sub>
</pre>

<p><i>N</i>&nbsp;is the length of the sequence&nbsp;<i>L</i>.&nbsp;<i>M</i>&nbsp;and&nbsp;<i>L</i>&nbsp;are the input to Nathan&rsquo;s converter as described above. You may assume the followings: 1 &le;&nbsp;<i>N</i>&nbsp;&le; 1000, 1 &le;&nbsp;<i>M</i>&nbsp;&le; 12, and 0 &le;&nbsp;<i>L<sub>j</sub></i>&nbsp;&le;&nbsp;<i>M</i>&nbsp;for&nbsp;<i>j</i>&nbsp;= 0, . . . ,&nbsp;<i>N</i>&nbsp;- 1.</p>

<p>The input is terminated by&nbsp;<i>N</i>&nbsp;=&nbsp;<i>M</i>&nbsp;= 0.</p>

### 출력

<p>For each data set, output a binary sequence&nbsp;<i>K</i>&nbsp;of the length (<i>N</i>&nbsp;+&nbsp;<i>M</i>&nbsp;- 1) if there exists a sequence which holds the equation mentioned above, or &ldquo;Goofy&rdquo; (without quotes) otherwise. If more than one sequence is possible, output any one of them.</p>