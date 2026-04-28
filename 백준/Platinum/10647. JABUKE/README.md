# [Platinum V] JABUKE - 10647

[문제 링크](https://www.acmicpc.net/problem/10647)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 83, 정답: 32, 맞힌 사람: 28, 정답 비율: 41.176%

### 분류

이분 탐색, 브루트포스 알고리즘, 구현

### 문제 설명

<p>It is often heard that the apple doesn&rsquo;t fall far from the tree. But is that really so?</p>

<p>The National Statistics Department has tracked the falling of apples in a fruit garden for \(G\) consecutive years. The fruit garden can be represented as a matrix with dimensions \(R \cdot S\). Each field of the matrix can contain more than one apple tree.</p>

<p>Interestingly enough, each year there was exactly one apple fall, so the Department decided to write down \(G\) pairs of numbers \((r_i, s_i)\) that denote the row and column of the location where the apple fell during the \(i\)th year. Moreover, by next year, a new tree grew at that location.</p>

<p>Your task is to determine the squared distance between the nearest tree and the apple that fell, measured in unit fields of the matrix (we assume it is that tree from which the apple fell).</p>

<p>The distance between fields \((r_1, s_1)\) and \((r_2, s_2)\) in the matrix are calculated as:</p>

<p>\[d((r_1, s_1), (r_2, s_2)) = \sqrt{(r_1-r_2)^2 + (s_1-s_2)^2}\]</p>

### 입력

<p>The first line of input contains two integers, \(R\) and \(S\) (1 &le; \(R\), \(S\) &le; 500), the number of rows and columns of the matrix.</p>

<p>Each of the following \(R\) lines contains \(S\) characters &rsquo;x&rsquo; or &rsquo;.&rsquo;. The character &rsquo;.&rsquo; denotes an empty field, and the character &rsquo;x&rsquo; denotes a field with at least one tree.</p>

<p>The fruit garden will initially contain at least one tree.</p>

<p>After that, an integer \(G\) (1 &le; \(G\) &le; 10<sup>5</sup>) follows, the number of years the fruit garden has been under observation.</p>

<p>Each of the following \(G\) lines describes the falls of the apples. Each line contains a pair of integers \((r_i, s_i)\) that denote the row and column of the location where the apple fell in the \(i\)th year.</p>

### 출력

<p>Output \(G\) numbers, the required squared distances from the task, each in its own line.</p>

### 힌트

<p>Clarification of the first example: The closest apple to the one that fell in the first year is the apple in the field (1,1). The apple that fell in the second year fell on the exact field where the tree is located, so the squared distance is 0. The apple that fell in the third year is equally distant to all three existing trees in the fruit garden.</p>