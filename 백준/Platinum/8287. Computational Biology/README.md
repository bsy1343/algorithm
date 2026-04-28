# [Platinum II] Computational Biology - 8287

[문제 링크](https://www.acmicpc.net/problem/8287)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 103, 정답: 18, 맞힌 사람: 16, 정답 비율: 19.277%

### 분류

그래프 이론, 해싱, 문자열

### 문제 설명

<p>Byteasar works in Byteland Centre for Computational Biology. He has just received a long sequence of n genomes. His task is to find frequently occurring cyclic fragments of this sequence.</p>

<p>Byteasar&#39;s sequence can be represented as a word s = s<sub>1</sub> ... s<sub>n</sub> of capital English letters. A cyclic fragment of s is a word t such that all its cyclic rotations<sup>1</sup> are subwords of s.</p>

<p>Byteasar is interested in cyclic fragments of a given length m. For a given cyclic fragment t of s, we define the number of cyclic occurrences of t in s as the total number of occurrences of distinct cyclic rotations of t within s. Byteasar wants to find a cyclic fragment of length m of the word s that has the largest number of cyclic occurrences. Please, write a program to help him.</p>

<p><sup>1</sup>A cyclic rotation of a word is constructed by moving its last letter to its beginning (possibly multiple times). For example, there are three different cyclic rotations of ABAABA, namely ABAABA, BAABAA and AABAAB. A word u is a subword of v, if u is a subsequence of v consisting of several consecutive letters of v.</p>

### 입력

<p>The first line of the input contains two integers n and q (2 &le; n &le; 500,000, 1 &le; q &le; 8) which denote the length of the sequence of genomes and the number of queries to answer. The second line contains a word s composed of n capital letters of the English alphabet. The following q lines contain numbers m<sub>i</sub> (2 &le; m<sub>i</sub> &le; n) defining the length of the cyclic fragments to consider.</p>

### 출력

<p>Your program should output q lines. The i-th line should contain one integer denoting the maximal number of cyclic occurrences of any m<sub>i</sub>-letter cyclic fragment of s.</p>

### 힌트

<p>The cyclic fragment AABAAB occurs in the given word 4 times: once as AABAAB, twice as ABAABA and once as BAABAA. The cyclic fragment AAB occurs in this word 10 times.</p>