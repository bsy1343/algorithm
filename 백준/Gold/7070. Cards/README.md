# [Gold II] Cards - 7070

[문제 링크](https://www.acmicpc.net/problem/7070)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 11, 정답 비율: 78.571%

### 분류

수학, 그래프 이론, 순열 사이클 분할

### 문제 설명

<p>Alice and Bob have a set of N cards labelled with numbers 1 ... N (so that no two cards have the same label) and a shuffle machine. We assume that N is an odd integer.</p>

<p>The shuffle machine accepts the set of cards arranged in an arbitrary order and performs the following operation of double shuffle: for all positions i, 1&lt;=i&lt;=N, if the card at the position i is j and the card at the position j is k, then after the completion of the operation of double shuffle, position i will hold the card k.</p>

<p>Alice and Bob play a game. Alice first writes down all the numbers from 1 to N in some random order: a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub>. Then she arranges the cards so that the position ai holds the card numbe&quot;#008DDC&quot; a<sub>i+1</sub>, for every 1&lt;=i&lt;=N-1, while the position a<sub>N</sub> holds the card numbe&quot;#008DDC&quot; a<sub>1</sub>.</p>

<p>This way, cards are put in some order x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>N</sub>, where x<sub>i</sub> is the card at the ith position.</p>

<p>Now she sequentially performs S double shuffles using the shuffle machine described above. After that, the cards are arranged in some final order p<sub>1</sub>, p<sub>2</sub>, ..., p<sub>N</sub> which Alice reveals to Bob, together with the number S. Bob&#39;s task is to guess the order&nbsp;x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>N</sub> in which Alice originally put the cards just before giving them to the shuffle machine.</p>

<p>&nbsp;</p>

### 입력

<p>The first line of the standard input contains two integers separated by a single blank character: the odd integer N, 1&lt;=N&lt;=1000, the number of cards, and the integer S, 1&lt;=S&lt;=1000, the number of double shuffle operations.</p>

<p>The following N lines describe the final order of cards after all the double shuffles have been performed such that for each i, 1&lt;=i&lt;=N, the (i+1)st line of the input file contains pi (the card at the position i after all double shuffles).</p>

### 출력

<p>The standard output should contain N lines which describe the order of cards just before they were given to the shuffle machine.</p>

<p>For each i, 1&lt;=i&lt;=N, the ith line of the output file should contain xi (the card at the position i before the double shuffles).</p>