# [Bronze I] Olivander - 15366

[문제 링크](https://www.acmicpc.net/problem/15366)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 277, 정답: 239, 맞힌 사람: 218, 정답 비율: 88.980%

### 분류

구현, 그리디 알고리즘, 정렬

### 문제 설명

<p>Harry Potter has damaged his magic wand in a fight with Lord Voldemort. He has decided to get a new wand in Olivander&#39;s wand shop. On the floor of the shop, he saw N wands and N wand boxes. The lengths of the wands are, respectively, X<sub>1</sub>, X<sub>2</sub>,&nbsp;...X<sub>n</sub>, and the box sizes are Y<sub>1</sub>,Y<sub>2</sub>, ...Y<sub>n</sub>. A wand of length X can be placed in a box of size Y if X &le; Y. Harry wants to know if he can place all the wands in boxes so that each box contains exactly one wand. Help him solve this difficult problem.</p>

### 입력

<p>The first line of input contains the positive integer N (1 &le; N &le; 100), the number from the task.</p>

<p>The second line contains N positive integers X<sub>i</sub> (1 &le; X<sub>i</sub> &le; 10<sup>9</sup>), the numbers from the task.</p>

<p>The third line contains N positive integers Y<sub>i</sub> (1 &le; Y<sub>i</sub> &le; 10<sup>9</sup>), the numbers from the task.</p>

### 출력

<p>If Harry can place all the wands in boxes, output &ldquo;DA&rdquo; (Croatian for yes), otherwise output &ldquo;NE&rdquo; (Croatian for no).</p>

### 힌트

<p>Clarification of the first test case: Harry can place the wands in boxes. For example, he can place the wand of length 5 in a box of size 6, wand of length 7 in a box of size 13, and wand of length 9 in a box of size 10.</p>

<p>Clarification of the second test case: Harry can&rsquo;t place the wands in boxes because the box of size 2 can&rsquo;t fit any of the wands.</p>