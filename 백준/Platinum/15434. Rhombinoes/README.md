# [Platinum III] Rhombinoes - 15434

[문제 링크](https://www.acmicpc.net/problem/15434)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 13, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

그래프 이론, 최대 유량, 이분 매칭, 격자 그래프

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15434/1.png" style="float:right; height:128px; width:177px" />In the game of&nbsp;<em>Rhombinoes</em>, you have a board made up entirely of equilateral trianges (see the image), some of which are&nbsp;<em>&quot;live&quot;</em>&nbsp;and some are&nbsp;<em>&quot;dead&quot;</em>. Your goal is to place down as many rhombinoes (&quot;rhombus&quot;-shaped pieces) as possible on the board. Each rhombino should exactly cover two &quot;adjacent&quot;&nbsp;<em>live</em>&nbsp;triangles that have a common side, and no two rhombinoes can use the same triangle.</p>

<p>Given the description of the&nbsp;<em>live</em>&nbsp;and&nbsp;<em>dead</em>&nbsp;triangles of a Rhombino board, what is the maximum number of rhombinoes you can simultaneously place down on the board?</p>

<p>Description of Board</p>

<p>Each triangle in the board has a pair of coordinates&nbsp;<em>(x, y)</em>. The bottom-left triangle has coordinates&nbsp;<em>(0, 0)</em>&nbsp;and will always be a triangle with its tip pointed upward. For any given triangle with coordinates&nbsp;<em>(x, y)</em>, the triangle adjacent to it on its right-side (if any) has coordinates&nbsp;<em>(x+1, y)</em>, and the triangle adjacent to it on its top-side (if any) has coordinates&nbsp;<em>(x, y+1)</em>. Left-side and bottom-side adjacency are defined similarly.</p>

<p>Each board has a width&nbsp;<em>W</em>&nbsp;and a height&nbsp;<em>H</em>. A board with width&nbsp;<em>W</em>&nbsp;and height&nbsp;<em>H</em>&nbsp;is the board which consists of all triangles with coordinates&nbsp;<em>(x, y)</em>&nbsp;such that&nbsp;<em>0 &le; x &lt; W</em>&nbsp;and&nbsp;<em>0 &le; y &lt; H</em>. For example, the game board in the image has width&nbsp;<em>6</em>&nbsp;and height&nbsp;<em>3</em>.</p>

<p><em>(See the image for clarification.)</em></p>

### 입력

<p>The first line of input contains three space-separated integers&nbsp;<em>W</em>,&nbsp;<em>H</em>, and&nbsp;<em>K</em>.</p>

<p><em>W</em>&nbsp;is the width of the board,&nbsp;<em>H</em>&nbsp;is the height, and&nbsp;<em>K</em>&nbsp;is the number of dead triangles on the board (<em>1 &le; W &le; 100</em>,&nbsp;<em>1 &le; H &le; 100</em>,&nbsp;<em>1 &le; K &le; W*H &le; 1000</em>).</p>

<p>Exactly&nbsp;<em>K</em>&nbsp;lines will follow. Each such line will contain a pair of space-separated integers&nbsp;<em>x</em>&nbsp;and&nbsp;<em>y</em>&nbsp;(<em>0 &le; x &lt; W, 0 &le; y &lt; H</em>), indicating that the triangle with coordinates&nbsp;<em>(x,y)</em>&nbsp;is a&nbsp;<em>dead</em>&nbsp;triangle. All other triangles are&nbsp;<em>live</em>.</p>

### 출력

<p>Output a line containing a single integer, the maximum number of rhombinoes you can simultaneously place down on the board.</p>

### 힌트

<p>This is the board in the image, with cells&nbsp;<em>(1, 1)</em>,&nbsp;<em>(2, 2)</em>,&nbsp;<em>(4, 1)</em>, and&nbsp;<em>(3, 0)</em>&nbsp;dead.</p>