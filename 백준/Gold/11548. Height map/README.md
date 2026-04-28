# [Gold III] Height map - 11548

[문제 링크](https://www.acmicpc.net/problem/11548)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 106, 정답: 24, 맞힌 사람: 23, 정답 비율: 31.081%

### 분류

그래프 이론

### 문제 설명

<p>A height map is a two-dimensional matrix of positive integers that represents a polyhedron. Each cell of the matrix with value V represents a parallelepiped shaped column of 1 &times; 1 &times; V that is laid on one of its 1 &times; 1 faces onto the cell. This creates a polyhedron with a single face in the bottom made up of all the downwards facing 1&times;1 faces combined, and possibly several faces on the top and on the sides.</p>

<p>For instance, a 2 &times; 2 matrix with all values equal to 2 represents a cube of side 2. However, if one of the values is 1, the represented polyhedron is the same cube with one corner cut off. The following picture represents both alternatives.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11548.%E2%80%85Height%E2%80%85map/b6334340.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11548/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:77px; width:506px" /></p>

<p>While not every polyhedron can be represented in this fashion, there are several that can. Here are a couple of other examples.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/11548.%E2%80%85Height%E2%80%85map/56ec1257.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11548/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:98px; width:530px" /></p>

<p>Given a height map, you are asked to count the number of faces of the represented polyhedron. Notice that a face is defined as a simple polygon that describes a contiguous and maximal boundary of the polyhedron. As you can see in the last two examples, it is possible for two different coplanar faces to share a common vertex, or even a side, or portions of a side.</p>

### 입력

<p>The first line contains two integers R and C, representing respectively the number of rows and columns of the height map (1 &le; R, C &le; 100). Each of the next R lines contains C integers; the j-th integer in the i-th line is the value V<sub>i,j</sub> located in the i-th row and j-th column of the matrix (1 &le; V<sub>i,j</sub> &le; 10<sup>9</sup> for i = 1, 2, . . . , R and j = 1, 2, . . . , C).</p>

### 출력

<p>Output a line with an integer representing the number of faces of the polyhedron represented by the input height map.</p>