# [Gold IV] Two Slicers - 23416

[문제 링크](https://www.acmicpc.net/problem/23416)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 21, 맞힌 사람: 19, 정답 비율: 76.000%

### 분류

수학, 브루트포스 알고리즘, 정수론

### 문제 설명

<p>Petya and his friends want to celebrate his birthday party! Petya has a round cake for the occassion. The only thing left is to divide it, and they will have tea.</p>

<p>In order to divide the cake, Petya is going to use slicers. Each slicer has a few blades: a $k$-slicer is a device which makes $k$ straight cuts from the center of the cake to its boundary, and thus divides the round cake into $k$ identical sectors.</p>

<p>Petya has a red $a$-slicer and a blue $b$-slicer. Fortunately, there are exactly $a + b$ friends at the party including Petya. So he decided to use each slicer once, so that the cake will be divided into exactly $a + b$ sectors.</p>

<p>After using the two slicers, the resulting $a + b$ sectors may have different sizes. Nevertheless, the cake should be divided as fairly as possible: the difference between the largest sector and the smallest sector should be the minimum possible.</p>

<p>Find out what is the minimum possible difference that Petya can achieve. Find the difference between the areas of the largest and the smallest sectors after the optimal division. Regard the area of the whole cake as $1$. Print the resulting area difference as an irreducible fraction.</p>

### 입력

<p>The first line of input contains two space-separated integers $a$ and $b$: the parameters of red and blue slicers ($2 \le a, b \le 100$).</p>

### 출력

<p>Print an irreducible fraction in the form <code>$a$ / $b$</code>: the difference between the areas of the largest and the smallest of the $a + b$ resulting sectors after the slicers are applied optimally.</p>

### 힌트

<p>The result of optimal use of slicers is shown to the below of the examples. The cuts made by the red $a$-slicer are shown as pale red thick lines. The cuts made by the blue $b$-slicer are shown as blue thin dotted lines.</p>