# [Platinum IV] 조화로운 사각형 - 34145

[문제 링크](https://www.acmicpc.net/problem/34145)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 168, 정답: 43, 맞힌 사람: 37, 정답 비율: 33.945%

### 분류

구현, 자료 구조

### 문제 설명

<p>섬을 지지하던 빛이 흔들리며, 섬의 만물을 이루는 네 개의 원소는 서로의 흐름을 방해하기 시작했다.</p>

<p>한때 완벽한 비율로 조화를 이루던 네 흐름은 이제 조금씩 어긋났고, 그 어긋남은 땅 곳곳에 흔적을 남겼다.</p>

<p>사람들은 균형을 되찾으려 했지만, 균형은 쉽게 깨졌고, 애써 복원된 구조마저 금세 흐트러지곤 했다.</p>

<p>원소의 균형을 위한 그들의 노력을 지켜보고, 그들이 마지막까지 지키려 했던 배열을 복원하여라.</p>

<hr>
<p>섬 곳곳에는 <strong>흙</strong>, <strong>물</strong>, <strong>불</strong>, <strong>공기</strong>의 네 가지 원소가 새겨진 격자가 존재한다.</p>

<p>이 격자는 $N\times M$ 크기로 이루어져 있으며, 각각의 칸에는 네 원소 중 하나가 배치되어 있다. 위에서부터 $r$번째 행, 왼쪽에서부터 $c$번째 열의 격자칸을 $(r,c)$로 표기한다.</p>

<p>네 가지 원소는 아래 표와 같이 온도와 습도 두 가지 속성으로 구분된다.</p>


<table class="table table-bordered" style="border-collapse: collapse; text-align: center;">
	<tbody>
		<tr>
			<th style="text-align: center;">원소</th>
			<th style="text-align: center;">온도 속성</th>
			<th style="text-align: center;">습도 속성</th>
		</tr>
		<tr>
			<td>흙</td>
			<td>추움</td>
			<td>마름</td>
		</tr>
		<tr>
			<td>물</td>
			<td>추움</td>
			<td>젖음</td>
		</tr>
		<tr>
			<td>불</td>
			<td>더움</td>
			<td>마름</td>
		</tr>
		<tr>
			<td>공기</td>
			<td>더움</td>
			<td>젖음</td>
		</tr>
	</tbody>
</table>

<p>격자 내부의 어떤 $2\times 2$ 크기의 사각형 안에 네 가지 원소가 모두 존재할 때, 원소들의 속성이 서로 균형을 이루게 된다. 이러한 사각형을 <strong>조화로운 사각형</strong>이라고 부른다. 예를 들어, 아래 원소의 격자에서 초록색으로 표시된 두 영역은 모두 조화로운 사각형이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34145.%E2%80%85%EC%A1%B0%ED%99%94%EB%A1%9C%EC%9A%B4%E2%80%85%EC%82%AC%EA%B0%81%ED%98%95/7d63699d.png" data-original-src="https://boja.mercury.kr/assets/problem/34145-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 295px; height: 300px;"></p>

<p>그러나 최근, 섬의 사람들은 원소의 흐름이 불안정해졌음을 발견했다. 특정한 직사각형 영역에 대해, 해당 영역의 원소들이 <strong>온도 속성</strong> 또는 <strong>습도 속성</strong>이 반대인 원소로 변하는 현상이 $Q$회 발생하였다.</p>

<p>예를 들어, 아래 원소의 격자에서 가운데 $3\times 3$ 영역의 원소들이 온도 속성이 반대인 원소로 바뀌면 다음과 같이 변한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34145.%E2%80%85%EC%A1%B0%ED%99%94%EB%A1%9C%EC%9A%B4%E2%80%85%EC%82%AC%EA%B0%81%ED%98%95/5b17eff8.png" data-original-src="https://boja.mercury.kr/assets/problem/34145-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 735px; height: 300px;"></p>

<p>섬의 사람들은 격자에 변동이 일어날 때마다 조화로운 사각형의 수를 알고자 한다.</p>

### 입력

<p>첫째 줄에 격자의 크기를 나타내는 정수 $N$, $M$, 그리고 격자가 변경되는 횟수 $Q$가 공백으로 구분되어 주어진다.</p>

<p>둘째 줄부터 $N$개의 줄에 걸쳐, 격자의 초기 상태가 주어진다. 각 줄에는 $M$개의 문자 $B_{i1},B_{i2},\cdots ,B_{iM}$이 주어진다. 각 문자는 <code>E</code>, <code>W</code>, <code>F</code>, <code>A</code> 중 하나이며, 이들은 각각 흙, 물, 불, 공기를 나타낸다.</p>

<p>이후 $Q$개의 줄에 걸쳐 격자의 변경에 대한 정보를 나타내는 정수 $t_i,r_{1i},c_{1i},r_{2i},c_{2i}$가 주어진다. $t_i$는 격자 변경의 종류를 나타내며, $t_i=1$인 경우 온도 속성의 변경, $t_i=2$인 경우 습도 속성의 변경을 의미한다. 나머지 네 정수는 원소의 변경이 $r_{1i}\le r\le r_{2i}$, $c_{1i}\le c\le c_{2i}$인 모든 칸 $(r,c)$에서 일어난다는 의미이다.</p>

### 출력

<p>첫째 줄에는 격자의 초기 상태에 존재하는 조화로운 사각형의 수를 출력한다.</p>

<p>이후 $Q$개의 줄에 걸쳐, 각 변경 후 격자에 존재하는 조화로운 사각형의 수를 차례로 출력한다.</p>

### 제한

<ul>
	<li>$2\le N\le 1000$</li>
	<li>$2\le M\le 1000$</li>
	<li>$0\le Q\le 10^4$</li>
	<li>$B_{ij}$는 <code>E</code>, <code>W</code>, <code>F</code>, <code>A</code> 중 하나이다. $(1\le i\le N,1\le j\le M)$</li>
	<li>$1\le t_i\le 2$ $(1\le i\le Q)$</li>
	<li>$1\le r_{1i}\le r_{2i}\le N$ $(1\le i\le Q)$</li>
	<li>$1\le c_{1i}\le c_{2i}\le M$ $(1\le i\le Q)$</li>
</ul>