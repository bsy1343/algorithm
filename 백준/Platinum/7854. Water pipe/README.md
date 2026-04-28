# [Platinum IV] Water pipe - 7854

[문제 링크](https://www.acmicpc.net/problem/7854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

중간에서 만나기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7854.%E2%80%85Water%E2%80%85pipe/32ab1513.png" data-original-src="https://upload.acmicpc.net/432cb349-f6f3-42b4-b568-45565f19550e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 306px; height: 268px; float: right;" />The Eastowner city is perpetually haunted with water supply shortages, so in order to remedy this problem a new water-pipe has been built. Builders started the pipe from both ends simultaneously, and after some hard work both halves were connected. Well, almost. First half of pipe ended at a point (x<sub>1</sub>, y<sub>1</sub>), and the second half &mdash; at (x<sub>2</sub>, y<sub>2</sub>). Unfortunately only few pipe segments of different length were left. Moreover, due to the peculiarities of local technology the pipes can only be put in either north-south or eastwest direction, and be connected to form a straight line or 90 degree turn. You program must, given L<sub>1</sub>, L<sub>2</sub>, &hellip; L<sub>k</sub> &mdash; lengths of pipe segments available and C<sub>1</sub>, C<sub>2</sub>, &hellip; C<sub>k</sub> &mdash; number of segments of each length, construct a water pipe connecting given points, or declare that it is impossible. Program must output the minimum required number of segments.&nbsp;</p>

### 입력

<p>Input file contains integers x<sub>1</sub> y<sub>1</sub> x<sub>2</sub> y<sub>2</sub> k followed by 2k integers L<sub>1</sub> L<sub>2</sub> &hellip; L<sub>k</sub> C<sub>1</sub> C<sub>2</sub> &hellip; C<sub>k</sub></p>

### 출력

<p>Output file must contain a single integer &mdash; the number of required segments, or &minus;1 if the connection is impossible.&nbsp;</p>

### 제한

<ul>
	<li>1 &le; k &le; 4,</li>
	<li>1 &le; x<sub>i</sub>, y<sub>i</sub>, L<sub>i</sub> &le; 1000</li>
	<li>1 &le; C<sub>i</sub> &le; 10&nbsp;</li>
</ul>