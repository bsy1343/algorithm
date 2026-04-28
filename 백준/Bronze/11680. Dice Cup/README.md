# [Bronze II] Dice Cup - 11680

[문제 링크](https://www.acmicpc.net/problem/11680)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 312, 정답: 288, 맞힌 사람: 264, 정답 비율: 91.986%

### 분류

수학, 구현, 브루트포스 알고리즘

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/11680.%E2%80%85Dice%E2%80%85Cup/14c5fe96.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/11680.%E2%80%85Dice%E2%80%85Cup/14c5fe96.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11680/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:106px; width:439px" /></p>

<p>In many table-top games it is common to use different dice to simulate random events. A &ldquo;d&rdquo; or &ldquo;D&rdquo; is used to indicate a die with a specific number of faces, d4 indicating a foursided die, for example. If several dice of the same type are to be rolled, this is indicated by a leading number specifying the number of dice. Hence, 2d6 means the player should roll two six-sided dice and sum the result face values.</p>

<p>Write a program to compute the most likely outcomes for the sum of two dice rolls. Assume each die has numbered faces starting at 1 and that each face has equal roll probability.</p>

### 입력

<p>The input consists of a single line with two integer numbers, N, M, specifying the number of faces of the two dice.</p>

### 출력

<p>A line with the most likely outcome for the sum; in case of several outcomes with the same probability, they must be listed from lowest to highest value in separate lines.</p>

### 제한

<ul>
	<li>4 &le; N, M &le; 20 Number of faces.</li>
</ul>