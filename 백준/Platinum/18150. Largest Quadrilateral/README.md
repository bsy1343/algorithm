# [Platinum I] Largest Quadrilateral - 18150

[문제 링크](https://www.acmicpc.net/problem/18150)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 44, 맞힌 사람: 32, 정답 비율: 42.667%

### 분류

기하학, 두 포인터, 볼록 껍질

### 문제 설명

<p>Given some points on a 2D Euclidean plane, please calculate the maximum area of quadrilaterals with vertices in given points. For example, points A(0, 0), B(1, 0), C(3, 1), D(1, 2), E(0, 1) are given. These points form 5 simple quadrilaterals ABCD, ABCE, ABDE, ACDE, BCDE with areas 3, 2, 1.5, 3, 3 respectively and 10 complex quadrilaterals ABDC, ABEC, ABED, ACED, BCED, ACBD, ACBE, ADBE, ADCE, BDCE with smaller areas. So the maximum area is 3.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/18150.%E2%80%85Largest%E2%80%85Quadrilateral/b3bd1cbe.png" data-original-src="https://upload.acmicpc.net/058bc1c9-1694-4b12-bef8-28686ee4fa21/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 219px; height: 173px;" /></p>

<p style="text-align: center;">Figure 4: BCDE has the maximum area 3 among all quadrilaterals.</p>

<p>Please notice that duplicated points may appear in the given points. All the degenerate cases are also taken as quadrilaterals such as quadrilateral ABCD with A(0, 0), B(0, 0), C(0, 0), D(0, 0).</p>

### 입력

<p>The first line is an integer T indicating the number of test cases. The first line of each test case contains an integer N followed by N lines. Each line of the following N lines contains two integers X and Y representing a point (X, Y ).</p>

### 출력

<p>For each test case, please output the maximum area among all quadrilaterals with vertices in given points.</p>

### 제한

<ul>
	<li>1 &le; T &le; 3</li>
	<li>4 &le; N &le; 4096</li>
	<li>0 &le; X &le; 10<sup>9</sup></li>
	<li>0 &le; Y &le; 10<sup>9</sup></li>
	<li>You may not output numbers with scientific notaions. I.e., outputting 3E8 for 300000000 is not allowed.</li>
	<li>The area must be outputted without any redundant characters. I.e., outputting 3.0 for 3 is incorrect.</li>
</ul>