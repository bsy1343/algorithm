# [Platinum I] That Nice Euler Circuit - 5488

[문제 링크](https://www.acmicpc.net/problem/5488)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 6, 정답 비율: 25.000%

### 분류

기하학, 선분 교차 판정, 오일러 지표 (χ=V-E+F)

### 문제 설명

<p>Little Joey invented a scrabble machine that he called Euler, after the great mathematician. In his primary school Joey heard about the nice story of how Euler started the study about graphs. The problem in that story was - let me remind you - to draw a graph on a paper without lifting your pen, and finally return to the original position. Euler proved that you could do this if and only if the (planar) graph you created has the following two properties: (1) The graph is connected; and (2) Every vertex in the graph has even degree.&nbsp;</p>

<p>Joey&#39;s Euler machine works exactly like this. The device consists of a pencil touching the paper, and a control center issuing a sequence of instructions. The paper can be viewed as the infinite two-dimensional plane; that means you do not need to worry about if the pencil will ever go off the boundary.&nbsp;</p>

<p>In the beginning, the Euler machine will issue an instruction of the form (X0, Y0) which moves the pencil to some starting position (X0, Y0). Each subsequent instruction is also of the form (X&#39;, Y&#39;), which means to move the pencil from the previous position to the new position (X&#39;, Y&#39;), thus draw a line segment on the paper. You can be sure that the new position is different from the previous position for each instruction. At last, the Euler machine will always issue an instruction that move the pencil back to the starting position (X0, Y0). In addition, the Euler machine will definitely not draw any lines that overlay other lines already drawn. However, the lines may intersect.&nbsp;</p>

<p>After all the instructions are issued, there will be a nice picture on Joey&#39;s paper. You see, since the pencil is never lifted from the paper, the picture can be viewed as an Euler circuit.&nbsp;</p>

<p>Your job is to count how many pieces (connected areas) are created on the paper by those lines drawn by Euler.&nbsp;</p>

### 입력

<p>There are no more than 25 test cases. Ease case starts with a line containing an integer N &gt;= 4, which is the number of instructions in the test case. The following N pairs of integers give the instructions and appear on a single line separated by single spaces. The first pair is the first instruction that gives the coordinates of the starting position. You may assume there are no more than 300 instructions in each test case, and all the integer coordinates are in the range (-300, 300). The input is terminated when N is 0.</p>

### 출력

<p>For each test case there will be one output line in the format&nbsp;</p>

<p>Case x: There are w pieces.,&nbsp;</p>

<p>where x is the serial number starting from 1.&nbsp;</p>

<p>Note: The figures below illustrate the two sample input cases.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5488/1.png" style="height:74px; width:336px" /></p>