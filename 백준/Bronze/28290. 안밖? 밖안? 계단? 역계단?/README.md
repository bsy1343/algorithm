# [Bronze IV] 안밖? 밖안? 계단? 역계단? - 28290

[문제 링크](https://www.acmicpc.net/problem/28290)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3393, 정답: 2179, 맞힌 사람: 2041, 정답 비율: 65.459%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>평소 리듬게임을 즐겨하는 대소고 친구들은 서로 다른 타법을 가지고 있다.</p>

<p>타법은 안밖, 밖안, 계단, 역계단이 있다.</p>

<table class="table table-bordered">
	<caption>문자열 항목은 각 타법에서 나올 수 있는 문자열을 의미한다.</caption>
	<tbody>
		<tr>
			<td><strong>타법</strong></td>
			<td><strong>설명</strong></td>
			<td><strong>문자열</strong></td>
		</tr>
		<tr>
			<td><strong>안밖</strong></td>
			<td>검지 손가락에서 새끼손가락 순서대로 키보드를 치는 방법.</td>
			<td>&quot;<code>fdsajkl;</code>&quot; 또는 &quot;<code>jkl;fdsa</code>&quot;</td>
		</tr>
		<tr>
			<td><strong>밖안</strong></td>
			<td>새끼손가락에서 검지 손가락 순서대로 키보드를 치는 방법.</td>
			<td>&quot;<code>asdf;lkj</code>&quot; 또는 &quot;<code>;lkjasdf</code>&quot;</td>
		</tr>
		<tr>
			<td><strong>계단</strong></td>
			<td>왼쪽 새끼손가락에서 오른쪽 새끼손가락 순서대로 키보드를 치는 방법.</td>
			<td>&quot;<code>asdfjkl;</code>&quot;</td>
		</tr>
		<tr>
			<td><strong>역계단</strong></td>
			<td>오른쪽 새끼손가락에서 왼쪽 새끼손가락 순서대로 키보드를 치는 방법.</td>
			<td>&quot;<code>;lkjfdsa</code>&quot;</td>
		</tr>
	</tbody>
</table>

<p>하루는 대소고 친구가 찾아와 컴퓨터를 켠 뒤 메모장에 어떤 문자를 남겨 놓았다.</p>

<pre>
asdfjkl;</pre>

<p>평소 리듬게임을 자주 하던 changwook987은 메모장에 문자를 쓴 친구가 <strong>계단 </strong>타법임을 눈치챘다.</p>

<p>친구의 타법을 알아보는 것이 재밌어진 changwook987은 다른 친구를 불러 메모장에 자신의 타법대로 입력해 보라고 했다.</p>

<p>다른 친구가 입력한 문자를 보고 무슨 타법으로 쳤는지 알아보자.</p>

### 입력

<p>길이가 8인 문자열 $S$가 주어진다. 문자열 $S$는 각 문자 <code>a</code>, <code>s</code>, <code>d</code>, <code>f</code>, <code>j</code>, <code>k</code>, <code>l</code>, <code>;</code>가 정확히 한 번씩 등장한다.</p>

### 출력

<p>출력은 입력에 따라 &quot;<code>in-out</code>&quot;, &quot;<code>out-in</code>&quot;, &quot;<code>stairs</code>&quot;, &quot;<code>reverse</code>&quot; 중 하나를 출력한다.</p>

<ul>
	<li>입력이 <strong>안밖</strong>인 경우: <code>&quot;in-out</code>&quot;</li>
	<li>입력이 <strong>밖안</strong>인 경우: <code>&quot;out-in</code>&quot;</li>
	<li>입력이 <strong>계단</strong>인 경우: <code>&quot;stairs</code>&quot;</li>
	<li>입력이 <strong>역계단</strong>인 경우: &quot;<code>reverse</code>&quot;</li>
</ul>

<p>만약 입력이 안밖, 밖안, 계단, 역계단 중 하나도 아니라면 <code>&quot;molu&quot;</code>를 출력한다.</p>