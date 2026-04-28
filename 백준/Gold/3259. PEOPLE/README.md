# [Gold V] PEOPLE - 3259

[문제 링크](https://www.acmicpc.net/problem/3259)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 45, 맞힌 사람: 38, 정답 비율: 67.857%

### 분류

구현, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>A group of N people is given. These people can be classified into two subgroups: those who always tell the truth and those who lie.</p>

<p>We interviewed all of them. Each person named several members of the group and said whether they belong to the first subgroup or to the second.</p>

<p>Your task is to write a program that will use these statements to determine who tells a lie and who doesn&rsquo;t.&nbsp;</p>

### 입력

<p>First line of the input file consists of an integer N, 2 &le; N &le; 20, a number of people in the group.</p>

<p>Next 2N lines contain statements of each person in the following form (j-th person&rsquo;s statement is placed in lines 2j and 2j+1):</p>

<pre>
K A<sub>1</sub> A<sub>2</sub> ... A<sub>K</sub>
L B<sub>1</sub> B<sub>2</sub> ... B<sub>L</sub></pre>

<p>This means that j-th person said that A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>K</sub> tell the truth and that B<sub>1</sub>, B<sub>2</sub>, ..., B<sub>L</sub> lie.</p>

<p>People are numbered 1 to N. Each person made a statement about at least one other, did not make any statements about herself and did not say that someone tells the truth and lies at the same time.</p>

<p>If a person tells the truth then each of her statements must be true and if she lies then at least one of her statements must be false.&nbsp;</p>

### 출력

<p>The output file should have N lines, j-th line telling whether j-th person tells the truth or lies. If a person tells the truth, word &#39;true&#39; should be printed and word &#39;false&#39; otherwise.</p>

<p>Test data will be such that the solution will always exist, although it may not be necessarily unique.</p>