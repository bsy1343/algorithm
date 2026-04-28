# [Platinum III] 메시지 변환기 - 2724

[문제 링크](https://www.acmicpc.net/problem/2724)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 2, 맞힌 사람: 2, 정답 비율: 15.385%

### 분류

자료 구조, 구현, 파싱, 스택, 문자열

### 문제 설명

<p>NTCIP(National Transportation Communications for ITS Protocol)는 고속 통신을 하기 위해 메시지를 MULTI(Markup Language for Transportation Information)을 사용한다. MULTI 문자열은 텍스트의 포맷 등을 묘사하는 내장된 태그와 함께 구성되어있다. 태그는 &#39;[&#39;,&#39;]&#39;로 열고 닫으며, 문자에 &#39;[&#39;를 사용하기 위해서는 &#39;[[&#39;를 이용하여 표시한다. (닫는 괄호도 마찬가지로 &#39;]]&#39;) 각 문자는 배열의 한 칸씩 차지한다.</p>

<p>다음은 태그와 설명이다.</p>

<table class="table table-bordered" style="width:70%;">
	<thead>
		<tr>
			<th style="width:10%;">태그</th>
			<th style="width:60%;">설명</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>[nl]</td>
			<td>새로운 행을 시작한다.</td>
		</tr>
		<tr>
			<td>[sc&lt;digit&gt;]</td>
			<td>각 문자마다 &lt;digit&gt;개의 공백을 추가한다.</td>
		</tr>
		<tr>
			<td>[/sc]</td>
			<td>[sc0]과 같다. 공백을 추가하지 않는다.</td>
		</tr>
		<tr>
			<td>[jl2]</td>
			<td>왼쪽 정렬(left justified text), 첫 번째 문자가 줄의 제일 왼쪽에 등장한다.</td>
		</tr>
		<tr>
			<td>[jl3]</td>
			<td>가운데 정렬(center justified text), 양쪽 공백의 수가 같거나 뒤쪽 공백의 수가 하나 더 많도록 한다.</td>
		</tr>
		<tr>
			<td>[jl4]</td>
			<td>오른쪽 정렬(right justified text), 마지막 문자가 줄의 가장 마지막에 등장한다.</td>
		</tr>
		<tr>
			<td>[jl5]</td>
			<td>양쪽 정렬(줄에 가득차도록 각 문자 사이 공백을 일정하게 최대로 많이 추가한다. 가운데 정렬한다.)</td>
		</tr>
	</tbody>
</table>

<p>한 줄에 24글자가 있을 때의 예이다. (□는 빈 칸을 나타낸다)</p>

<table class="table table-bordered" style="width:70%;">
	<thead>
		<tr>
			<th style="width: 25%;">MULTI 문자열</th>
			<th style="width: 45%;">출력</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>[jl2]MESSAGE</td>
			<td>MESSAGE□□□□□□□□□□□□□□□□□</td>
		</tr>
		<tr>
			<td>[jl3]MESSAGE</td>
			<td>□□□□□□□□MESSAGE□□□□□□□□</td>
		</tr>
		<tr>
			<td>[jl4]MESSAGE</td>
			<td>□□□□□□□□□□□□□□□□□MESSAGE</td>
		</tr>
		<tr>
			<td>[jl2][sc2]MESSAGE</td>
			<td>M□□E□□S□□S□□A□□G□□E□□□□□</td>
		</tr>
		<tr>
			<td>[jl5]MESSAGE</td>
			<td>□□M□□E□□S□□S□□A□□G□□E□□□</td>
		</tr>
		<tr>
			<td>[jl2]THIS[jl3]IS A[jl4]MESSAGE</td>
			<td>THIS□□□□□□IS A□□□MESSAGE</td>
		</tr>
	</tbody>
</table>

<p>태그는 대소문자를 구분하지 않는다. [nl]=[NL]=[Nl]=[nL]</p>

<p>기본은 왼쪽 정렬, 공백숫자는 0이다.</p>

<p>정렬과 공백추가 태그는 [nl]태그 다음에도 유지된다.</p>

<p>[jl2]와 [l5] 태그는 줄에 다른 문자가 출력되지 않았을 때만 사용할 수 있다. 그렇지 않으면 에러 (TAG CONFLICT)</p>

<p>[jl5]가 사용되면, 다른 정렬 태그는 사용할 수 없다. 그렇지 않으면 에러 (TAG CONFLICT)</p>

<p>[jl3] 태그는 [jl4] 태그 다음에 사용할 수 없다. (TAG CONFLICT)</p>

<p>[jl?] 태그는 같은 정렬을 또 사용하더라도 TAG CONFLICT가 일어나지 않는다.</p>

<p>양쪽 정렬에서는 [sc]태그가 무시된다.</p>

<p>한 줄에 너무 많은 문자가 필요하거나 메시지에 너무 많은 줄이 필요하면 TOO BIG 에러가 발생한다.</p>

<p>[nl]태그는 다음 문자가 출력되기 전까지 작동하지 않는다.</p>

<p>왼쪽 정렬과 가운데 정렬이 한 줄에 동시에 등장하면, 왼쪽 정렬된 문자의 맨 뒤에 적어도 하나의 공백이 있어야 한다. 그렇지 않을 경우 TOO BIG 에러가 발생한다.</p>

<p>가운데 정렬과 오른쪽 정렬이 한 줄에 동시에 등장하면, 가운데 정렬된 문자의 맨 뒤에 적어도 하나의 공백이 있어야 한다. 그렇지 않을 경우 TOO BIG 에러가 발생한다.</p>

<p>왼쪽 정렬과 오른쪽 정렬이 한 줄에 동시에 등장하면, 왼쪽 정렬된 문자의 맨 뒤에 적어도 하나의 공백이 있어야 한다. 그렇지 않을 경우 TOO BIG 에러가 발생한다.</p>

<p>허용되는 태그는 위의 7개만 가능하다. 그렇지 않으면 BAD TAG 에러가 발생한다.</p>

<p>잘못된 태그 사용이나 괄호 쌍이 맞지 않은 경우도 BAD TAG 에러가 발생한다.</p>

<p>MULTI 문자열을 입력받아서 올바른 메시지 또는 에러 메시지를 출력하는 프로그램을 작성하시오</p>

### 입력

<p>첫째 줄은 데이터 세트의 수 N(1 &le; N &le; 100)이 입력으로 들어온다.각 데이터 세트의 첫 줄은 R(1 &le; R &le; 25)과 C(1 &le; C &le; 80)가 공백으로 구분되어 들어온다. (R은 행 수, C는 열 수) 다음 R개의 줄에 MULTI 문자열이 들어온다.</p>

### 출력

<p>각 데이터 세트에 대해 데이터 세트 번호를 출력하고, 다음줄부터&nbsp;R개의 줄에 에러 메시지 또는 메시지를 출력한다. (C개의 문자열을 정확히 출력해야 한다) 각 데이터 세트의 마지막 줄은 공백으로 구분한다. (채점의 편의를 위해, 에러가 있는 데이터 세트는 한 가지 타입의 에러만 가지고 있다)</p>