# [Platinum I] Eleven Problems - 18487

[문제 링크](https://www.acmicpc.net/problem/18487)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 14, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You have prepared a very nice contest with n problems. This contest has already been used at two training camps. After each camp, you ran a quick poll asking the contestants which problem they liked the most. At the i-th camp, a<sub>i,j</sub> contestants voted for problem j.</p>

<p>You are going to build two pie charts based on this data, one for each training camp. Recall that a pie chart is a circular statistical graphic, which is divided into slices to illustrate numerical proportion. In a pie chart, the arc length of each slice (and consequently its central angle and area) is proportional to the quantity it represents.</p>

<p>Both pie charts must have the same radius and consist of exactly n slices, one for each problem, and each slice must be a single circular sector. The area of slice i must be proportional to the number of votes for problem i at the corresponding training camp. The rotation and the order of the slices can be arbitrary and different for the two pie charts.</p>

<p>You want the resulting pie charts to look as similar as possible. To have an objective criterion, you define the <em>similarity</em> of two pie charts as follows. Suppose that the slices corresponding to problem i are colored into color i. Place one pie chart over the other one so that their boundaries match. The similarity of the pie charts is the ratio of the area of the pie charts colored into the same color to the overall pie chart area. Note that the similarity of the pie charts is independent of their radius.</p>

<p>Find a way to draw the pie charts to maximize their similarity.</p>

### 입력

<p>The first line of the input contains an integer n (2 &le; n &le; 11), denoting the number of problems.</p>

<p>Each of the following n lines contains two integers a<sub>1,j</sub> and a<sub>2,j</sub> (1 &le; a<sub>i,j</sub> &le; 10<sup>6</sup>), denoting the number of votes for the j-th problem at the first and the second training camps.</p>

### 출력

<p>Display the maximum possible similarity of the pie charts. Your answer must be correct to within an absolute error of 10<sup>&minus;9</sup>.</p>