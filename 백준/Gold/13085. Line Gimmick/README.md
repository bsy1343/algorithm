# [Gold III] Line Gimmick - 13085

[문제 링크](https://www.acmicpc.net/problem/13085)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 57, 맞힌 사람: 44, 정답 비율: 57.143%

### 분류

애드 혹

### 문제 설명

<p>You are in front of a linear gimmick of a game. It consists of N panels in a row, and each of them displays a right or a left arrow.</p>

<p>You can step in this gimmick from any panel. Once you get on a panel, you are forced to move following the direction of the arrow shown on the panel and the panel will be removed immediately. You keep moving in the same direction until you get on another panel, and if you reach a panel, you turn in (or keep) the direction of the arrow on the panel. The panels you passed are also removed. You repeat this procedure, and when there is no panel in your current direction, you get out of the gimmick.</p>

<p>For example, when the gimmick is the following image and you first get on the 2nd panel from the left, your moves are as follows.</p>

<ul>
	<li>Move right and remove the 2nd panel.</li>
	<li>Move left and remove the 3rd panel.</li>
	<li>Move right and remove the 1st panel.</li>
	<li>Move right and remove the 4th panel.</li>
	<li>Move left and remove the 5th panel.</li>
	<li>Get out of the gimmick.</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13085.%E2%80%85Line%E2%80%85Gimmick/a217243b.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13085.%E2%80%85Line%E2%80%85Gimmick/a217243b.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13085/figD1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:93px; width:535px" /></p>

<p>You are given a gimmick with N panels. Compute the maximum number of removed panels after you get out of the gimmick.</p>

### 입력

<p>The input consists of two lines. The first line contains an integer N (1 &le; N &le; 100,000) which represents the number of the panels in the gimmick. The second line contains a character string S of length N, which consists of &#39;&gt;&#39; or &#39;&lt;&#39;. The i-th character of S corresponds to the direction of the arrow on the i-th panel from the left. &#39;&lt;&#39; and &#39;&gt;&#39; denote left and right directions respectively.</p>

### 출력

<p>Output the maximum number of removed panels after you get out of the gimmick.</p>