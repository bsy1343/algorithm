# [Platinum III] GUMA - 9667

[문제 링크](https://www.acmicpc.net/problem/9667)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 44, 맞힌 사람: 36, 정답 비율: 52.941%

### 분류

포함 배제의 원리, 수학, 정수론

### 문제 설명

<p>A factory called Gumi-Gumi is dedicated to making tires. Their carving machine is responsible for carving fillisters into the tire. The tire has N vertical fillisters which divide the rubber into N+1 vertical parts. Horizontal cuts are made on each vertical part so that all parts comprising the vertical part are of equal size. The machine can make fillisters on one or more not necessarily continuous vertical sections in one cut, but it can only cut in a straight line.&nbsp;</p>

<p>An example of a tire cutting strategy, corresponding to the third sample test.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9667.%E2%80%85GUMA/61fdcd66.png" data-original-src="https://upload.acmicpc.net/c099ca0a-1e7e-404c-b231-a250be27fee2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 388px; height: 275px;" /></p>

<p>The topmost and the lowest lines represent a full horizontal cut, whereas the first and the last vertical lines are the ends of the tire.&nbsp;</p>

<p>You are given the shape of the tire. Your task is to calculate the minimal possible number of cuts necessary in order to obtain such shape.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 100 000).&nbsp;</p>

<p>Each of the following N+1 lines contains an integer a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 100 000), representing the number of parts which the i<sup>th</sup> vertical section should consist of.&nbsp;</p>

### 출력

<p>The first and only line of output must consist of the minimal number of cuts required.&nbsp;</p>