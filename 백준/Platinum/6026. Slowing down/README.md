# [Platinum III] Slowing down - 6026

[문제 링크](https://www.acmicpc.net/problem/6026)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 23, 맞힌 사람: 18, 정답 비율: 56.250%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 세그먼트 트리, 깊이 우선 탐색

### 문제 설명

<p>Every day each of Farmer John&#39;s N (1 &lt;= N &lt;= 100,000) cows conveniently numbered 1..N move from the barn to her private pasture. The pastures are organized as a tree, with the barn being on pasture 1. Exactly N-1 cow unidirectional paths connect the pastures; directly connected pastures have exactly one path. Path i connects pastures A_i and B_i (1 &lt;= A_i &lt;= N; 1 &lt;= B_i &lt;= N).</p>

<p>Cow i has a private pasture P_i (1 &lt;= P_i &lt;= N). The barn&#39;s small door lets only one cow exit at a time; and the patient cows wait until their predecessor arrives at her private pasture. First cow 1 exits and moves to pasture P_1. Then cow 2 exits and goes to pasture P_2, and so on.</p>

<p>While cow i walks to P_i she might or might not pass through a pasture that already contains an eating cow. When a cow is present in a pasture, cow i walks slower than usual to prevent annoying her friend.</p>

<p>Consider the following pasture network, where the number between parentheses indicates the pastures&#39; owner.</p>

<pre>
        1 (3)        
       / \
  (1) 4   3 (5)
     / \   
(2) 2   5 (4)</pre>

<p>First, cow 1 walks to her pasture:</p>

<pre>
        1 (3)        
       / \
  [1] 4*  3 (5)
     / \   
(2) 2   5 (4)</pre>

<p>When cow 2 moves to her pasture, she first passes into the barn&#39;s pasture, pasture 1. Then she sneaks around cow 1 in pasture 4 before arriving at her own pasture.</p>

<pre>
        1 (3)
       / \
  [1] 4*  3 (5)
     / \   
[2] 2*  5 (4)</pre>

<p>Cow 3 doesn&#39;t get far at all -- she lounges in the barn&#39;s pasture, #1.</p>

<pre>
        1* [3]
       / \
  [1] 4*  3 (5)
     / \   
[2] 2*  5 (4)</pre>

<p>Cow 4 must slow for pasture 1 and 4 on her way to pasture 5:</p>

<pre>
        1* [3]
       / \
  [1] 4*  3 (5)
     / \   
[2] 2*  5* [4]</pre>

<p>Cow 5 slows for cow 3 in pasture 1 and then enters her own private pasture:</p>

<pre>
        1* [3]
       / \
  [1] 4*  3*[5]
     / \   
[2] 2*  5* [4]</pre>

<p>FJ would like to know how many times each cow has to slow down.</p>

### 입력

<ul>
	<li>Line 1: Line 1 contains a single integer: N</li>
	<li>Lines 2..N: Line i+1 contains two space-separated integers: A_i and B_i</li>
	<li>Lines N+1..N+N: line N+i contains a single integer: P_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Line i contains the number of times cow i has to slow down.</li>
</ul>

<p>&nbsp;</p>