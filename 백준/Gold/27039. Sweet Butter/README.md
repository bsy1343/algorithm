# [Gold IV] Sweet Butter - 27039

[문제 링크](https://www.acmicpc.net/problem/27039)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 53, 맞힌 사람: 50, 정답 비율: 55.556%

### 분류

브루트포스 알고리즘, 데이크스트라, 플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>Farmer John has discovered the secret to making the sweetest butter in all of Wisconsin: sugar.  By placing a sugar cube out in the pastures, he knows the N (1 &le; N &le; 500) cows will lick it and thus will produce super-sweet butter which can be marketed at better prices.  Of course, he spends the extra money on luxuries for the cows.</p>

<p>FJ is a sly farmer.  Like Pavlov of old, he knows he can train the cows to go to a certain pasture when they hear a bell.  He intends to put the sugar there and then ring the bell in the middle of the afternoon so that the evening&#39;s milking produces perfect milk.</p>

<p>FJ knows each cow spends her time in a given pasture (not necessarily alone).  Given the pasture location of the cows and a description of the paths the connect the pastures, find the pasture in which to place the sugar cube so that the total distance walked by the cows when FJ rings the bell is minimized. FJ knows the fields are connected well enough that some solution is always possible.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: the number of cows: N, the number of pastures: P (2 &le; P &le; 800), and the number of connecting paths: C (1 &le; C &le; 1,450).  Cows are uniquely numbered 1..N. Pastures are uniquely  numbered 1..P.</li>
	<li>Lines 2..N+1: Each line contains a single integer that is the pasture number in which a cow is grazing.  Cow i&#39;s pasture is listed on line i+1.</li>
	<li>Lines N+2..N+C+1: Each line contains three space-separated integers that describe a single path that connects a pair of pastures and its length.  Paths may be traversed in either direction.  No pair of pastures is directly connected by more than one path.  The first two integers are in the range 1..P; the third integer is in the range (1..225).</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the minimum distance the cows must walk to a pasture with a sugar cube.</li>
</ul>

### 힌트

<p>This diagram shows the connections geometrically:</p>

<pre>
          P2  
 P1 @--1--@ C1
     \    |\
      \   | \
       5  7  3
        \ |   \
         \|    \ C3
       C2 @--5--@
          P3    P4</pre>

<p>Putting the cube in pasture 4 means: cow 1 walks 3 units; cow 2 walks 5 units; cow 3 walks 0 units -- a total of 8.</p>