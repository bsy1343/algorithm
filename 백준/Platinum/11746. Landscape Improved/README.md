# [Platinum II] Landscape Improved - 11746

[문제 링크](https://www.acmicpc.net/problem/11746)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 187, 정답: 56, 맞힌 사람: 51, 정답 비율: 31.875%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>Louis L Le Roi-Univers has ordered to improve the landscape that is seen from the royal palace. His Majesty prefers to see a high mountain.</p>

<p>The Chief Landscape Manager is going to raise a mountain for Louis. He represents a landscape as a flat picture on a grid of unit squares. Some of the squares are already filled with rock, while others are empty. This greatly simplifies the design. Unit squares are small enough, and the landscape seems to be smooth from the royal palace.</p>

<p>The Chief Landscape Manager has a plan of the landscape &mdash; the heights of all rock-filled columns for each unit of width. He is going to add at most n square units of stones atop of the existing landscape to make a mountain with as high peak as possible. Unfortunately, piles of stones are quite unstable. A unit square of stones may be placed only exactly on top of the other filled square of stones or rock, moreover the squares immediately to the bottom-left and to bottom-right of it should be already filled.</p>

<table class="table">
	<tbody>
		<tr>
			<td style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11746.%E2%80%85Landscape%E2%80%85Improved/0c0d768c.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11746.%E2%80%85Landscape%E2%80%85Improved/0c0d768c.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11746/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:94px; width:163px" /></td>
			<td style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11746.%E2%80%85Landscape%E2%80%85Improved/0e8df47e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11746.%E2%80%85Landscape%E2%80%85Improved/0e8df47e.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11746/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:107px; width:161px" /></td>
		</tr>
		<tr>
			<td style="text-align:center">Existing landscape</td>
			<td style="text-align:center">Improved landscape</td>
		</tr>
	</tbody>
</table>

<p>Your task is to help The Chief Landscape Manager to determine the maximum height of the highest mountain he can build.</p>

### 입력

<p>The first line of the input file contains two integers w &mdash; the width of the existing landscape and n &mdash; the maximum number of squares of stones to add (1 &le; w &le; 100 000, 0 &le; n &le; 10<sup>18</sup>).</p>

<p>Each of the following w lines contains a single integer h<sub>i</sub> &mdash; the height of the existing landscape column (1 &le; h<sub>i</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>The output file shall contain the single integer &mdash; the maximum possible landscape height after at most n unit squares of stones are added in a stable way.</p>