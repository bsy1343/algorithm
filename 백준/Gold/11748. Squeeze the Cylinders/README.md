# [Gold III] Squeeze the Cylinders - 11748

[문제 링크](https://www.acmicpc.net/problem/11748)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 200, 정답: 118, 맞힌 사람: 95, 정답 비율: 65.972%

### 분류

수학, 기하학

### 문제 설명

<p>Laid on the flat ground in the stockyard are a number of heavy metal cylinders with (possibly) different diameters but with the same length. Their ends are aligned and their axes are oriented to exactly the same direction.</p>

<p>We&rsquo;d like to minimize the area occupied. The cylinders are too heavy to lift up, although rolling them is not too difficult. So, we decided to push the cylinders with two high walls from both sides.</p>

<p>Your task is to compute the minimum possible distance between the two walls when cylinders are squeezed as much as possible. Cylinders and walls may touch one another. They cannot be lifted up from the ground, and thus their order cannot be altered.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11748/1.png" style="height:199px; width:248px" /></p>

<p style="text-align: center;">Figure B.1. Cylinders between two walls</p>

### 입력

<p>The input consists of a single test case. The first line has an integer N (1 &le; N &le; 500), which is the number of cylinders. The second line has N positive integers at most 10,000. They are the radii of cylinders from one side to the other.</p>

### 출력

<p>Print the distance between the two walls when they fully squeeze up the cylinders. The number should not contain an error greater than 0.0001.</p>

### 힌트

<p>The following figures correspond to the Sample 1, 2, and 3.</p>

<table class="table">
	<tbody>
		<tr>
			<td style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11748/2.png" style="height:137px; width:255px" /></td>
			<td style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11748/3.png" style="height:151px; width:203px" /></td>
			<td style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11748/4.png" style="height:138px; width:255px" /></td>
		</tr>
		<tr>
			<td style="text-align: center;">Figure B.2. Sample 1</td>
			<td style="text-align: center;">Figure B.3. Sample 2</td>
			<td style="text-align: center;">Figure B.4. Sample 3</td>
		</tr>
	</tbody>
</table>