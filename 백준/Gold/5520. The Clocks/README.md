# [Gold IV] The Clocks - 5520

[문제 링크](https://www.acmicpc.net/problem/5520)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 542, 정답: 211, 맞힌 사람: 146, 정답 비율: 38.830%

### 분류

브루트포스 알고리즘

### 문제 설명

<pre>
|-------|    |-------|    |-------|    
|       |    |       |    |   |   |    
|---O   |    |---O   |    |   O   |          
|       |    |       |    |       |           
|-------|    |-------|    |-------|    
    A            B            C

|-------|    |-------|    |-------|
|       |    |       |    |       |
|   O   |    |   O   |    |   O   |
|   |   |    |   |   |    |   |   |
|-------|    |-------|    |-------|
    D            E            F

|-------|    |-------|    |-------|
|       |    |       |    |       |
|   O   |    |   O---|    |   O   |
|   |   |    |       |    |   |   |
|-------|    |-------|    |-------|  (Figure 1)
    G            H            I</pre>

<p>There are nine clocks in a 3*3 array (figure 1). The goal is to return all the dials to 12 o&#39;clock with as few moves as possible. There are nine different allowed ways to turn the dials on the clocks. Each such way is called a move. Select for each move a number 1 to 9. That number will turn the dials 90&#39; (degrees) clockwise on those clocks which are affected according to figure 2 below.</p>

<pre>
Move   Affected clocks
 
 1         ABDE
 2         ABC
 3         BCEF
 4         ADG
 5         BDEFH
 6         CFI
 7         DEGH
 8         GHI
 9         EFHI    (Figure 2)</pre>

<p>&nbsp;</p>

### 입력

<p>Read nine numbers from the standard input. These numbers give the start positions of the dials. 0=12 o&#39;clock, 1=3 o&#39;clock, 2=6 o&#39;clock, 3=9 o&#39;clock. The example in figure 1 gives the following input data file:</p>

### 출력

<p>Write to the standard output a shortest sequence of moves (numbers) in increasing order, which returns all the dials to 12 o&#39;clock. In case there are many solutions, only one is required.</p>

### 힌트

<p>Each number represents a time accoring to following table:</p>

<pre>
0 = 12 o&#39;clock
1 = 3 o&#39;clock
2 = 6 o&#39;clock 
3 = 9 o&#39;clock
3 3 0         3 0 0         3 0 0          0 0 0         0 0 0 
2 2 2   5-&gt;   3 3 3   8-&gt;   3 3 3   4 -&gt;   0 3 3   9-&gt;   0 0 0 
2 1 2         2 2 2         3 3 3          0 3 3         0 0 0 </pre>