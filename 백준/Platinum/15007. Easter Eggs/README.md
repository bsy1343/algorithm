# [Platinum II] Easter Eggs - 15007

[문제 링크](https://www.acmicpc.net/problem/15007)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 86, 맞힌 사람: 69, 정답 비율: 63.889%

### 분류

이분 탐색, 매개 변수 탐색, 이분 매칭

### 문제 설명

<p>Easter is coming and the Easter Bunny decided to organise a chocolate egg hunt for the children. He will hide two types of eggs: blue milk chocolate and red dark chocolate. In the field there are some redberry and some blueberry plants where the Easter Bunny could hide the eggs. Red eggs should be hidden in a redberry plant and blue eggs in a blueberry plant.</p>

<p>The local government has issued a permit for the event, under the condition that exactly N eggs are hidden. As they do not pay for the dental care plans of the local children, the Easter Bunny gets to decide himself how many eggs to hide of each colour.</p>

<p>According to the yearly tradition, there is a big reward for the first child to find both a red and a blue egg. In order to make the hunt as challenging as possible, the Easter Bunny wants to maximise the minimum distance between a red and a blue egg. To keep things fair, he will hide at most one egg in each plant. Your task is to write a program to help him accomplish his goal.</p>

### 입력

<p>The input consists of the following:</p>

<ul>
	<li>one line containing three integers N, B, R, the number of eggs to hide N &le; 250, the number of blueberry plants B &lt; N and the number of redberry plants R &lt; N;</li>
	<li>B lines, each containing two integers &minus;10<sup>4</sup> &le; x, y &le; 10<sup>4</sup>, indicating the coordinates (x, y) of a blueberry plant;</li>
	<li>R&nbsp;lines, each containing two integers &minus;10<sup>4</sup> &le; x, y &le; 10<sup>4</sup> , indicating the coordinates (x, y) of a redberry plant.</li>
</ul>

<p>The B + R plants are guaranteed to have distinct coordinates. Moreover, N is guaranteed to satisfy N &le; B + R.</p>

### 출력

<p>Output a single line containing a floating point number, D, the largest minimum distance between a red and a blue egg that can be achieved. You are required to output D with absolute precision 10<sup>&minus;6</sup>, i.e. with at least 6 decimal places.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15007.%E2%80%85Easter%E2%80%85Eggs/f15d8926.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15007.%E2%80%85Easter%E2%80%85Eggs/f15d8926.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15007/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:279px; width:200px" /></p>

<p style="text-align:center">Figure 3: Illustration of the second example input. The eggs are hidden in the four filled bushes.</p>