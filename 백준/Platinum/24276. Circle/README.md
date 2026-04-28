# [Platinum II] Circle - 24276

[문제 링크](https://www.acmicpc.net/problem/24276)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 29, 맞힌 사람: 26, 정답 비율: 32.099%

### 분류

그래프 이론, 애드 혹, 해 구성하기

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24276.%E2%80%85Circle/70ba35d6.png" data-original-src="https://upload.acmicpc.net/50375d0a-4a39-4f2f-bcc8-9e03a171ecd7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 184px; height: 171px; float: right;" />In Olympia, there is a circular village with N houses. They are numbered from 1 to N in the clockwise order. For example, if N = 8, the village would look like on the picture (the circle is the border line of the village):</p>

<p>There are М streets inside the circle, each connecting two different houses. There is at most one street between each pair of houses. Also, no two streets intersect, however they can share a common endpoint. As a festival is coming soon, the villagers want to paint their houses. Unfortunately, this isn&#39;t so simple as they don&#39;t want to have bad streets in their village. They consider a street to be bad when the houses at both of its endpoints are painted in the same color.</p>

<p>Now it&#39;s your turn! As the paint is expensive, the villagers need your help to use the least number of colors possible. Write a program circle that finds the minimum number of colors, which are needed, and gives one appropriate way to paint the houses.</p>

### 입력

<p>The first line of the standard input contains N and M &ndash; the number of houses and the number of streets in the village. Each of the next M lines contains two numbers u and v &ndash; this means that there is a street between houses with numbers u and v.</p>

### 출력

<p>On the first line of the standard output, you should print К &ndash; the minimum number of colors. On the second line, you should print N numbers &ndash; the colors in which you will paint every house. The colors are numbered from 1 to K. If there are multiple solutions, you can print any of them.</p>

### 제한

<ul>
	<li>2 &le; N &le; 5∙10<sup>5</sup></li>
	<li>1 &le; M &le; 5∙10<sup>5</sup></li>
</ul>