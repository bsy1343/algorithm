# [Platinum I] November Rain - 3455

[문제 링크](https://www.acmicpc.net/problem/3455)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

스위핑

### 문제 설명

<p>Contemporary buildings can have very complicated roofs. If we take a vertical section of such a roof it results in a number of sloping segments. When it is raining the drops are falling down on the roof straight from the sky above. Some segments are completely exposed to the rain but there may be some segments partially or even completely shielded by other segments. All the water falling onto a segment as a stream straight down from the lower end of the segment on the ground or possibly onto some other segment. In particular, if a stream of water is falling on an end of a segment then we consider it to be collected by this segment.&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3455/1.png" style="height:394px; width:574px" /></p>

<p>For the purpose of designing a piping system it is desired to compute how much water is down from each segment of the roof. To be prepared for a heavy November rain you should count one liter of rain water falling on a meter of the horizontal plane during one second.&nbsp;</p>

<p>Write a program that:&nbsp;</p>

<ul>
	<li>reads the description of a roof,&nbsp;</li>
	<li>computes the amount of water down in one second from each segment of the roof,&nbsp;</li>
	<li>writes the results.&nbsp;</li>
</ul>

### 입력

<p>The first line of the input contains one integer n (1 &le; n &le; 40000) being the number of segments of the roof. Each of the next n lines describes one segment of the roof and contains four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> (0 &le; x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub> &le; 1000000, x<sub>1</sub> &lt; x<sub>2</sub>, y<sub>1</sub> &ne;&nbsp;y<sub>2</sub>) separated by single spaces. Integers x<sub>1</sub>, y<sub>1</sub> are respectively the horizontal position and the height of the left end of the segment. Integers x<sub>2</sub>, y<sub>2</sub> are respectively the horizontal position and the height of the right end of the segment. The segments don&#39;t have common points and there are no horizontal segments. You can also assume that there are at most 25 segments placed above any point on the ground level.&nbsp;</p>

<p>&nbsp;</p>

### 출력

<p>The output consists of n lines. The i-th line should contain the amount of water (in liters) down from the i-th segment of the roof in one second.</p>