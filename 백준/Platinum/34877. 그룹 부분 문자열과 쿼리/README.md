# [Platinum III] 그룹 부분 문자열과 쿼리 - 34877

[문제 링크](https://www.acmicpc.net/problem/34877)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 65, 정답: 12, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>'<code>0</code>'과 '<code>1</code>'만으로 이루어진 <strong>길이 $1$ 이상의</strong> 문자열 $A$가 다음 조건 중 하나를 만족하는 경우, 이러한 $A$를 <strong>그룹 문자열</strong>이라고 부릅니다.</p>

<ul>
<li>$A$에 '<code>0</code>'이 등장하지 않거나 '<code>1</code>'이 등장하지 않습니다.</li>
<li>$A$에서 모든 '<code>0</code>'은 모든 '<code>1</code>'보다 먼저 등장합니다.</li>
<li>$A$에서 모든 '<code>1</code>'은 모든 '<code>0</code>'보다 먼저 등장합니다.</li>
</ul>

<p>예를 들어, "<code>000</code>", "<code>11</code>", "<code>00111</code>", "<code>110</code>"은 그룹 문자열이지만, "<code>1011</code>"이나 "<code>00100</code>"은 그룹 문자열이 아닙니다.</p>

<p>'<code>0</code>'과 '<code>1</code>'만으로 이루어진 문자열 $S$에 대해, $S$의 처음과 끝에서 문자를 원하는 만큼 지워 만들 수 있는 <strong>서로 다른 그룹 문자열의 개수</strong>를 $f(S)$라고 정의합니다. 예를 들어, $S$가 "<code>10110</code>"일 때 만들 수 있는 그룹 문자열은 "<code>0</code>", "<code>01</code>", "<code>011</code>", "<code>1</code>", "<code>10</code>", "<code>11</code>", "<code>110</code>"이 있습니다. 그러므로 $S$가 "<code>10110</code>"일 때 $f(S)$의 값은 $7$입니다. 이때 "<code>10</code>"이 $S$에 <strong>여러 번 등장하지만</strong> $f(S)$를 구하는 데는 <strong>한 번만 세는 것</strong>에 유의하세요.</p>

<p>여러분에게 문자열 $X$에 대한 $Q$번의 질문이 주어집니다. 초기에 문자열 $X$는 빈 문자열입니다. 각 질문은 다음과 같은 형태입니다.</p>

<ul>
<li>$c$ $k$: 문자열 $X$의 끝에 문자 $c$를 $k$개 붙입니다. 그후 $f(X)$의 값을 구합니다.</li>
</ul>

<p>이때 질문으로 문자열 $X$에 추가된 문자는 그다음 질문이 주어질 때에도 문자열 $X$에서 지워지지 않고 남아있습니다.</p>

<p>여러분은 각 질문에 대해 충분히 빨리 대답할 수 있을까요?</p>

### 입력

<p>첫 번째 줄에 정수 $Q$가 주어집니다.</p>

<p>두 번째 줄부터 $Q$개의 줄에 걸쳐 각 줄에 질문에 대응되는 문자 $c_i$와 양의 정수 $k_i$가 주어집니다.</p>

### 출력

<p>$Q$개의 줄에 걸쳐 각 줄에 질문에 대한 정답을 출력합니다.</p>

### 제한

<ul>
<li>$1 \le Q \le 200\,000$</li>
<li>각 $1 \le i \le Q$에 대해 $c_i$는 '<code>0</code>' 또는 '<code>1</code>'</li>
<li>각 $1 \le i \le Q$에 대한 $k_i$의 합은 $1\,000\,000\,000$ 이하</li>
</ul>

### 힌트

<p>예제의 각 질문에 대해 새로운 문자열 $X$의 내용, 새롭게 만들 수 있는 그룹 문자열, 그리고 $f(X)$의 값은 다음과 같습니다.</p>

<table class="table table-bordered">
<tbody>
<tr>
<th><strong>질문</strong></th>
<th><strong>문자열 $X$</strong></th>
<th><strong>새롭게 만들 수 있는 그룹 문자열</strong></th>
<th>$f(X)$</th>
</tr>
<tr>
<td><code>1</code> $1$</td>
<td>"<code>1</code>"</td>
<td>"<code>1</code>"</td>
<td>$1$</td>
</tr>
<tr>
<td><code>0</code> $1$</td>
<td>"<code>10</code>"</td>
<td>"<code>0</code>", "<code>10</code>"</td>
<td>$3$</td>
</tr>
<tr>
<td><code>1</code> $2$</td>
<td>"<code>1011</code>"</td>
<td>"<code>01</code>", "<code>011</code>", "<code>11</code>"</td>
<td>$6$</td>
</tr>
<tr>
<td><code>0</code> $1$</td>
<td>"<code>10110</code>"</td>
<td>"<code>110</code>"</td>
<td>$7$</td>
</tr>
<tr>
<td><code>1</code> $2$</td>
<td>"<code>1011011</code>"</td>
<td>없음</td>
<td>$7$</td>
</tr>
<tr>
<td><code>1</code> $2$</td>
<td>"<code>101101111</code>"</td>
<td>"<code>0111</code>", "<code>01111</code>", "<code>111</code>", "<code>1111</code>"</td>
<td>$11$</td>
</tr>
</tbody>
</table>