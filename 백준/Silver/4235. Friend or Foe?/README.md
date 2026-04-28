# [Silver I] Friend or Foe? - 4235

[문제 링크](https://www.acmicpc.net/problem/4235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 22, 맞힌 사람: 11, 정답 비율: 33.333%

### 분류

애드 혹, 구현, 수학, 수치해석, 무작위화

### 문제 설명

<p>Luke has a bit of trouble telling the difference between star systems in the Rebel Alliance and those in the Empire. He has a list of the x,y,z coordinates of each system in the Empire and each in the Alliance, but at warp speed he simply has insufficient time to look up systems in his lists.</p>

<p>After destroying the friendly planet Endor, Luke has had to admit he needs the help of his targeting computer. His computer, being an early model, can only compute the truth value of the inequality</p>

<pre style="text-align: center;">
ax + by + cz + d &gt; 0
</pre>

<p>Where x,y,z are the coordinates of the system, and a,b,c,d are real-valued coefficients. You are to compute a,b,c,d so that the inequality holds for all systems in the Empire, and for no systems in the Alliance.</p>

### 입력

<p>Input consists of several test cases followed by -1 -1. Each test case first gives the number of Alliance systems, followed by a line for each system giving the integer coordinates&nbsp;<i>-100 &le; x,y,z &le; 100</i>&nbsp;of the system in 3-dimensional space. The number of Empire systems, and the coordinates of each, follow. The Empire and Alliance combined have at least one and no more than 200 systems. All systems have distinct coordinates.</p>

### 출력

<p>For each test case, output a single line containing a,b,c,d as real numbers separated by spaces. Use enough precision to ensure that your solution is correct. You may assume that a solution exists; if there is more than one solution, any one will do.</p>