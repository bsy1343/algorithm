# [Platinum III] Map Labeling - 14752

[문제 링크](https://www.acmicpc.net/problem/14752)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 276, 정답: 85, 맞힌 사람: 67, 정답 비율: 36.413%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Map labeling is to place extra information, usually in the form of textual labels, next to features of interest within a map. The typical features depicted on a map are line features(e.g. roads, rivers, etc.), area features(countries, forests, lakes, etc.), and point features(villages, cities, etc.). In this problem, only the point features will be considered.</p>

<p>The basic requirements on the map labeling are that the labels do not overlap with each other and that they are close to the features they are associated with. However, this is not always possible to be achieved, for example, in the case where the labels are too large or the feature set is too dense. In this problem, the labels may be far from their features such that they are pairwise disjoint. But each feature should be connected to its associated label through a polygonal line including a straight line, called a <em>connector</em>. Clearly, the connectors should not intersect with each other. The connectors are only of two kinds. One consists of a single vertical line, called a <em>straight connector</em> and the other consists of three connected line segments, that is, vertical, horizontal, and vertical segments, called a <em>bended connector</em>. See Figure G.1.</p>

<p>Specifically, there is a straight line L, considered to be the x-axis, on which n points, corresponding to the point features, lie. The locations of the n points are strictly different. In this problem, the labels are considered as rectangular areas with height 1 on the plane. So each point p<sub>i</sub> is associated with an axis-parallel rectangular label l<sub>i</sub> of width w<sub>i</sub> and height 1. Note that the heights of all the labels are identical. These rectangular labels should be pairwise disjoint, but the boundaries of two labels can be touched. Consider a line U which is parallel to L, above L, and has a vertical distance 1 from L. The labels l<sub>i</sub> should be placed such that their lower sides are attached on U and they are above U as shown in Figure G.1.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14752/1.png" style="height:122px; width:417px" /></p>

<p style="text-align: center;">Figure G.1 Rectangular labels of point features</p>

<p>You write a program to find the placements of labels such that the number of bended connectors is minimized. For example, for the point features and the labels given in Figure G.1, the placement of labels shown in Figure G.2 minimizes the number of bended connectors.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14752/2.png" style="height:122px; width:412px" /></p>

<p style="text-align: center;">Figure G.2 Optimal placement of labels</p>

### 입력

<p>Your program is to read from standard input. The input starts with a line containing an integer, n (1 &le; n &le; 10,000), where n is the number of points on the line L, corresponding to the point features. In the i<sup>th</sup> line of the following n lines, the coordinate a<sub>i</sub> of the i<sup>th</sup> point of the n points is given, where a<sub>i</sub> is an integer and 0 &le; a<sub>i</sub> &le; 10<sup>8</sup>. The coordinates of the n points are strictly different, that is, a<sub>i</sub> &ne; a<sub>j</sub> if i &ne; j. In the i<sup>th</sup> line of the following n lines, the width w<sub>i</sub> of the associated label of the i<sup>th</sup> point is given, where w<sub>i</sub> is an integer and 1 &le; w<sub>i</sub> &le; 10<sup>5</sup>. Note that the heights of all the labels are 1.</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for the input. The line should contain the minimum number of bended connectors among all the valid placements of labels.</p>