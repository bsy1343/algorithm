# [Gold V] Loopy transit - 10496

[문제 링크](https://www.acmicpc.net/problem/10496)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 46, 정답: 37, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>Luke likes to ride on public transit in different cities he visits, just for fun. He tries to find unique ways to travel in loops: leaving from one transit station, traveling along the transit connections to at least one other station, and returning to the station where he started. He is finding lots of loops, and he wants to know just how many there are in different transit systems. There may be so many he won&rsquo;t ever have time to try them all, but he&rsquo;ll find some satisfaction in knowing they are there.</p>

<p>He&rsquo;s particularly interested in counting simple loops. A simple loop is a sequence of unique transit stations t<sub>1</sub>, t<sub>2</sub>, . . . , t<sub>j</sub> , where there&rsquo;s a way to connect directly from t<sub>i</sub> to t<sub>i+1</sub> for 1 &le; i &lt; j and also from t<sub>j</sub> to t<sub>1</sub>. Of course, we can write down a simple loop starting with any of the stations in the loop, therefore we consider any cyclic shift of such a sequence to be the same simple loop. However, two simple loops which visit the same set of transit stations in a different order are considered distinct.</p>

<p>Help Luke by writing a program to count how many unique simple loops there are in each transit system. The following figures illustrate the transit stations (numbered ovals) and one-way connections (arrows) of the sample input.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/10496.%E2%80%85Loopy%E2%80%85transit/64d7a2ca.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/10496.%E2%80%85Loopy%E2%80%85transit/64d7a2ca.png" data-original-src="https://www.acmicpc.net/upload/images2/loopy.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:236px; width:645px" /></p>

### 입력

<p>Input contains a description of one transit system. The description begins with a line containing an integer 3 &le; m &le; 9 indicating the number of transit stations in the system. Stations are numbered 0 to m &minus; 1. The next line contains an integer 1 &le; n &le; m(m&minus;1) indicating the number of connections that follow, one connection per line. Each connection is a pair of integers s t (0 &le; s &lt; m, 0 &le; t &lt; m, s &ne; t), indicating that there is a one-way connection from station s to station t.</p>

### 출력

<p>Print the number of unique simple loops in the transit system.</p>