# [Platinum I] New White-Black Tree - 24651

[문제 링크](https://www.acmicpc.net/problem/24651)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

해 구성하기, 그리디 알고리즘, 구현, 트리

### 문제 설명

<p>Naomi has learnt about Red-Black trees, now it&#39;s time to learn about White-Black trees. She is reading an algorithms book. Some pages contain pictures of trees, but the edges of the trees faded out through all these years. According to the text, each of these edges should be either white or black.</p>

<p>Naomi noticed that each vertex has two integers written beside it. She guessed that the first integer is the number of white edges incident to the vertex, and the second is the number of black edges incident to the vertex.</p>

<p>Naomi recreated all the pictures. Can you do that?</p>

### 입력

<p>The first line contains an integer $t$ --- the number of pictures to recreate ($1 \le t \le 3 \cdot 10^5$).</p>

<p>The following lines describe $t$ pictures. Each description starts with a line containing an integer $n$ --- the number of vertices in the tree ($1 \le n \le 3 \cdot 10^5$).</p>

<p>The $i$-th of the following $n$ lines of the picture description contains two integers $w_i$ and $b_i$ --- two integers written beside the $i$-th vertex of the tree: the number of white and black edges incident to the $i$-th vertex ($0 \le w_i, b_i \le n - 1$).</p>

<p>It is guaranteed that the sum of $n$ over all the pictures does not exceed $3 \cdot 10^5$.</p>

### 출력

<p>Print $t$ blocks of output, the $i$-th of which should contain the information about recreating picture $i$.</p>

<p>In the first line of each block print &quot;<code>No</code>&quot; if there is no way, and &quot;<code>Yes</code>&quot; if there is at least one way to recreate the picture. If there is a way to recreate the picture of the tree, print additional $n - 1$ lines, each of them containing two integers and a letter &#39;<code>W</code>&#39; for white or &#39;<code>B</code>&#39; for black: $v_i$, $u_i$ and $c_i$, defining an edge between vertices $v_i$ and $u_i$ of color $c_i$ ($1 \le v_i, u_i \le n$; $c_i$ is either &#39;<code>W</code>&#39; or &#39;<code>B</code>&#39;).</p>

<p>If there are multiple ways to recreate a picture, you can print any of them. The edges of the tree can be printed in any order.</p>