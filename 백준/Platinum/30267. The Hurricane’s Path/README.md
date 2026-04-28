# [Platinum V] The Hurricane’s Path - 30267

[문제 링크](https://www.acmicpc.net/problem/30267)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 구현, 시뮬레이션, 미적분학, 물리학

### 문제 설명

<p>When a hurricane strikes an area, such as Southern California, it is very important to predict its path. That makes it possible to predict how much total damage (in particular, rain) any particular point will be exposed to.</p>

<p>Here, you will analyze a simplified version of this process. We assume that the hurricane moves continuously along a straight line. For a number of waypoints, you will be given when the hurricane gets to that point; we assume that in between waypoints, the hurricane moves continuously at constant speed. The hurricane will appear at the first waypoint, and disappear at the last one. You will also be given several points of interest on the line (such as important buildings) for which you want to calculate the total rain they get. Rain is accumulated continuously: from the viewpoint of one of our points, initially, the hurricane may be further away, so the point gets just a little rain. As the hurricane moves closer, more rain hits the point (in addition to the rain from earlier). At some point, the hurricane may pass over the point and move away, but while it does, additional rain (though less than earlier) still hits the point, and contributes to the total rain there.</p>

<p>Specifically, the model here is that if the hurricane is at distance d from a point for one unit of time, that point collects rain 1/(1+d)<sup>2</sup>; if it is half as long, it is half the rain and so on. Recall that the hurricane moves continuously. The planners are most interested in which point will be the most flooded: so among all points of interest, they want the amount of rain that accumulated at the one that collected the most rain.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers 2 &le; p &le; 100, 1 &le; n &le; 1000. p is the number of waypoints on the hurricane&rsquo;s path, and n is the number of points of interest we care about.</p>

<p>This is followed by a single line with p pairs of floating point numbers x<sub>i</sub>, t<sub>i</sub> with &minus;10000.0 &le; x<sub>i</sub> &le; 10000.0 and 0 &le; t<sub>i</sub> &le; 10000.0. Here, x<sub>i</sub> is the location of the i-th waypoint, and t<sub>i</sub> the time when the hurricane gets there. The input will be sorted so that x<sub>1</sub> &lt; x<sub>2</sub> &lt; &middot; &middot; &middot; &lt; x<sub>p</sub> and t<sub>1</sub> &lt; t<sub>2</sub> &lt; &middot; &middot; &middot; &lt; t<sub>p</sub>.</p>

<p>Next comes a single line with n floating point numbers &minus;10000.0 &le; y<sub>j</sub> &le; 10000.0, giving the location of the point of interest j we care about.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the maximum amount of rain that any location collects, rounded to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>