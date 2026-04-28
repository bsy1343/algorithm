# [Platinum I] Width - 9892

[문제 링크](https://www.acmicpc.net/problem/9892)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 29, 맞힌 사람: 20, 정답 비율: 46.512%

### 분류

기하학, 볼록 껍질, 회전하는 캘리퍼스

### 문제 설명

<p>We consider a set \(S\) of \(n\) points in the plane. The <em>width</em>&nbsp;\(w\) of \(S\) is the minimum distance between two parallel lines that enclose \(S\). For instance, in Figure 1, the set</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/82909264-8ed8-44b2-b9eb-11c65d39537d/-/preview/" style="width: 313px; height: 228px;" /></p>

<p style="text-align: center;">Figure 1: The width \(w\) of a set of three points.</p>

<p>\(S\) consists of \(n = 3\) points&nbsp;\((0, 0)\), \((0, 3)\) and \((3, 0)\). The width is achieved by the two lines \(\ell\) and \(\ell&#39;\), their distance is \(w = 3\sqrt{2}/2 \simeq 2.12\). In this task, you are given a set of points in the input and you need to compute the integer part of \(w^2\) and write it in the output. For instance, in Figure 1, we have \(w&nbsp;= 3\sqrt{2}/2\), so \(w^2 = 4.5\), and thus you need to output the integer part of \(4.5\), which is \(4\).</p>

<p>We give you a useful formula to help you solve this problem. Let \(A = (x_a, y_a)\), \(B = (x_b , y_b)\) and \(C = (x_c, y_c)\) be three points. The height \(h\) (see Figure 2) of the triangle \(ABC\) is given by the following formula</p>

<p>\[h = \sigma \frac{(x_a - x_c)(y_b-y_c) - (x_b-x_c)(y_a-y_c)}{\sqrt{(x_a-x_b)^2+(y_a-y_b)^2}}\]</p>

<p>where \(\sigma = 1\) if \(ABC\) is counterclockwise (as in Figure 2) and \(\sigma = &minus;1\) if \(ABC\) is clockwise.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0aaf9da5-9a8c-44fe-95cc-06f868d1bc68/-/preview/" style="width: 186px; height: 84px;" /></p>

<p style="text-align: center;">Figure 2: Triangle \(ABC\).</p>

<p>Clearly, if all the points of \(S\) lie on a straight line, the width \(w\) is zero.</p>

### 입력

<p>The first input line contains the integer \(n\), the number of points in \(S\). Each of the next \(n\) lines contains the \(x\) coordinate and the \(y\) coordinate of an input point separated by a space.</p>

<p>Note that the coordinates of the points are integers ranging from 0 to 199 inclusively. There are at most 100000 input points. A point may appear several times in the input file.</p>

### 출력

<p>The output file should contain the integer part of \(w^2\).</p>