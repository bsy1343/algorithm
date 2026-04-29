# [Gold I] IZ*ONE Sequence - 33581

[문제 링크](https://www.acmicpc.net/problem/33581)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 241, 정답: 78, 맞힌 사람: 63, 정답 비율: 32.642%

### 분류

많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<blockquote>
<p><em>Eyes on me! <strong><span style="background: linear-gradient(to left top, #252c4c, #ff509f);color: transparent;-webkit-background-clip: text;font-size:16px">하나가 되는 순간 </span></strong> 모두가 주목해!</em></p>
</blockquote>

<p>길이가 $N$인 순열은 $1$부터 $N$까지의 정수가 정확히 한 번씩 등장하는 수열이다. 수열과 아이즈원을 사랑하는 ian0704를 위해 다음의 조건을 모두 만족하는 길이가 $N$인 순열 $A$를 구해주자.</p>

<p>$A$에 다음 시행을 $N-1$번 반복하여 수열 $A$의 원소 개수가 <em><span style="background: linear-gradient(to left top, #252c4c, #ff509f);color: transparent;-webkit-background-clip: text;"><strong>하나가 되는 순간 </strong></span></em> 마지막으로 남은 수가 $K$가 되어야 한다.</p>

<ul>
	<li>수열 $A$의 첫 번째 원소와 마지막 원소의 평균을 정수로 내림한 값 $t$가 $A$의 원소이면 $t$를, 아니면 마지막 원소를 삭제한다.</li>
	<li>수열의 중간 원소를 삭제했다면 빈 공간이 없도록 남은 원소들을 이어 붙인다.</li>
</ul>

### 입력

<p>첫 번째 줄에 두 정수 $N$, $K$가 공백으로 구분하여 주어진다. $(1 \leq K \leq N \leq 2 \times 10^5)$</p>

### 출력

<p>첫 번째 줄에 조건을 만족하는 순열 $A_1, A_2, \cdots , A_{N}$을 공백으로 구분하여 출력한다. 조건을 만족하는 순열 $A$가 존재하지 않는 경우 대신 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다. 가능한 순열이 여러 가지라면 아무거나 출력한다.</p>

### 힌트

<p></p>

<p>'Sequence'는 IZ*ONE의 마지막 앨범 One-reeler/ActIV의 수록곡이다.</p>