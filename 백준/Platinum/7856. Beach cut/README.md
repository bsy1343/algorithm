# [Platinum IV] Beach cut - 7856

[문제 링크](https://www.acmicpc.net/problem/7856)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 29, 정답: 1, 맞힌 사람: 1, 정답 비율: 9.091%

### 분류

브루트포스 알고리즘, 기하학, 누적 합, 볼록 껍질, 피타고라스 정리, 다각형의 넓이

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7856.%E2%80%85Beach%E2%80%85cut/ed89877d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7856.%E2%80%85Beach%E2%80%85cut/ed89877d.png" data-original-src="https://upload.acmicpc.net/2cbbc785-4ede-4b11-959e-958d0d1ef2aa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 235px; height: 248px; float: right;" />The seashore is represented by a polyline without self-intersections, described by a sequence of vertices (x<sub>1</sub>, y<sub>1</sub>), &hellip; (x<sub>N</sub>, y<sub>N</sub>). It also has a property that x<sub>i</sub> &lt; x<sub>i + 1</sub>. The sea is above the line, and the beach &mdash; below.</p>

<p>Your program must connect two vertices with a straight line not longer than L chosen so as to maximize the beach area enclosed between that line and the shore. The line must not intersect with the sea and may only touch, not intersect, the shore polyline.&nbsp;</p>

### 입력

<p>Input file contains integer numbers N L, followed by N pairs of integers x<sub>1</sub> y<sub>1</sub> &hellip; x<sub>N</sub> y<sub>N</sub>.&nbsp;</p>

### 출력

<p>Output file must contain a single floating point value &mdash; the maximum area that can be cut (it may be zero). The area must be output exactly, i.e. without any rounding at all.</p>

### 제한

<ul>
	<li>3 &le; N &le; 5000</li>
	<li>0 &le; x<sub>i</sub>, y<sub>i</sub>, L &le; 1000000&nbsp;</li>
</ul>