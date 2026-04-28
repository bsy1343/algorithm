# [Platinum IV] Big Circle - 10081

[문제 링크](https://www.acmicpc.net/problem/10081)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 16 MB

### 통계

제출: 93, 정답: 47, 맞힌 사람: 27, 정답 비율: 50.943%

### 분류

정렬, 기하학, 스위핑, 각도 정렬

### 문제 설명

<p>On the opening ceremony of World Cup there was a part where many kids from around the world was trying to make a big circle on the field which symbolized tolerance and multicultural friendship.</p>

<p>They succeed in making a perfect circle, but as they didn&#39;t practice very much, kids weren&#39;t uniformly distributed on circle. You spotted that very quickly, and you want to know what is the minimum distance between some two kids.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10081.%E2%80%85Big%E2%80%85Circle/8163aea0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10081/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:191px; width:201px" /></p>

### 입력

<p>First line of the input contains number N&nbsp;representing number of kids. Each of next N lines contains two real numbers rounded on two decimal places &ndash; coordinates of the each kid.</p>

<p>It is guaranteed that all points will be on circle.</p>

### 출력

<p>First and only line of output should contain one real number (rounded on two decimal places) &ndash; Euclidian distance between two nearest kids.&nbsp;</p>

### 제한

<ul>
	<li>2 &le; N &le; 10<sup>5</sup></li>
	<li>All coordinates will be in interval [&minus;10<sup>6</sup>, 10<sup>6</sup>]</li>
</ul>

### 힌트

<p>Kids at points (&minus;0.50, &minus;1.60) and (&minus;1.60, &minus;0.50) are nearest and distance between them is 1.56.</p>