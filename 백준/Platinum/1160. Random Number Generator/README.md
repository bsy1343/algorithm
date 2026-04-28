# [Platinum V] Random Number Generator - 1160

[문제 링크](https://www.acmicpc.net/problem/1160)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 2124, 정답: 444, 맞힌 사람: 357, 정답 비율: 28.221%

### 분류

수학, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>홍준이는 통계학을 공부하다가 &lsquo;무작위 추출&rsquo;의 매력에 푹 빠졌고, 난수 발생기를 이용해 직접 &lsquo;무작위 추출&rsquo;을 한다. 홍준이는 일차 점화식으로 생성되는 수열을 이용한 난수 발생기가 적당하다고 생각했다. 수열을 만들기 위해서는 음이 아닌 정수 m, a, c, X<sub>0</sub>이 필요하다. 수열 &lt;X<sub>n</sub>&gt;의 점화식은 다음과 같다:</p>

<p>X<sub>n+1</sub> = (aX<sub>n</sub> + c) mod m</p>

<p>&quot;A mod m&quot;이라는 말은 A를 m으로 나눈 나머지를 뜻한다.</p>

<p>최종적으로, X<sub>n</sub>을 양의 정수 g로 나눈 나머지가 난수로 사용한다. 따라서 생성된 난수는 0, 1, &hellip;, g-1사이의 값을 가지게 될 것이다.</p>

<p>착한 명우는, 친구 홍준이의 속마음을 읽고, 난수 발생기를 만들어주려고 한다. 명우를 도와 홍준이에게 줄 난수 발생기 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 6개의 정수 m, a, c, X<sub>0</sub>, n, g (m, a, c, X<sub>0</sub>, n &le; 10<sup>18</sup>, g &le; 10<sup>8</sup>)가 차례대로 주어진다. a, c, X<sub>0</sub>는 음이 아닌 정수이고 m, n, g는 양의 정수이다.</p>

### 출력

<p>첫째 줄에 X<sub>n</sub> mod g의 값을 출력한다.</p>

### 힌트

<p>예제 입력으로 생성되는 수열 &lt;X<sub>n</sub>&gt;을 구해보면 아래와 같다.</p>

<table class="table table-bordered" style="width:35%">
	<thead>
		<tr>
			<th>k</th>
			<th>0</th>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>X<sub>k</sub></td>
			<td>1</td>
			<td>4</td>
			<td>6</td>
			<td>0</td>
			<td>7</td>
			<td>8</td>
		</tr>
	</tbody>
</table>

<p>따라서 답은 X<sub>5</sub> mod g = 8 mod 3 = 2이다.</p>