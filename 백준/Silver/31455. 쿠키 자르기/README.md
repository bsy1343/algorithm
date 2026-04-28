# [Silver I] 쿠키 자르기 - 31455

[문제 링크](https://www.acmicpc.net/problem/31455)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 163, 정답: 96, 맞힌 사람: 70, 정답 비율: 59.322%

### 분류

분할 정복, 재귀

### 문제 설명

<p>Albert는 $2^K \times 2^K$ 크기의 쿠키를 구워 각 칸에 0-9 사이의 숫자를 적어두었다 - 이 문제에서 편의상 $r$ 행 $c$열에 적힌 숫자는 $A[r, c]$로 나타내자 ($0 \le A[r, c] \le 9$).</p>

<p>예를 들어 아래 그림은 $K = 2$ 이고 $A = [ [1, 2, 3, 4], [2, 3, 4, 5], [3, 4, 5, 6], [0, 9, 8, 7]]$ 인 쿠키의 모습을 보여준다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31455.%E2%80%85%EC%BF%A0%ED%82%A4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/e025bbbe.png" data-original-src="https://upload.acmicpc.net/1f0e7622-dfd7-416e-873f-10719c3b6b4c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 194px; width: 200px;" /></p>

<p>구워진 쿠키를 감상하던 Bob은 Albert에게 아래와 같은 놀이를 제안했다.</p>

<ol>
	<li>크기가 $N \times N$인 쿠키를 $N/2 \times N/2$ 크기로  4등분 하여 그 중 한 조각을 둘이 나눠 먹는다.
	<ol>
		<li>우선 아래 그림의 좌측과 같이 쿠키의 중간을 상하로 한 번, 좌우로 한 번 잘라 같은 크기의 4조각 쿠기를 얻는다 - 편의상 우측 그림에 표시된 대로 0번, 1번, 2번, 3번 쿠키 조각을 얻었다 하자.</li>
		<li>이후, 자르기 전의 원래 쿠키에 적혀진 숫자 총합을 4로 나눈 나머지가 $x$ 라면 $x$번 쿠키를 나눠 먹는다.</li>
	</ol>
	</li>
	<li>남은 3조각의 크기가 $2 \times 2$ 이상이라면 각각에 대해 이 과정을 반복한다. 만약 각 조각의 크기가 $1 \times 1$ 이라면 이 과정은 끝난다.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31455.%E2%80%85%EC%BF%A0%ED%82%A4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/e079f295.png" data-original-src="https://upload.acmicpc.net/545c4a81-9f25-4c96-a697-d6adbbe68f71/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 120px; width: 300px;" /></p>

<p>위의 예제의 경우 우선 $4 \times 4$ 크기의 쿠키를 아래 왼쪽 그림과 같이 4등분 한다.</p>

<ul>
	<li>우선, 원래 쿠키에 적힌 숫자의 총합이 66 이므로 2번 조각을 나눠 먹는다 (이 때 2번 조각은 $[[3, 4], [0, 9]]$가 적힌 좌측 하단의 조각이다).</li>
	<li>곧이어 나머지 $2 \times 2$ 크기의 세 조각에 대해서도 마찬가지 규칙대로 놀이를 진행한다:
	<ul>
		<li>좌측 상단의 $[[1, 2], [2, 3]]$ 이 적힌 쿠키 조각의 숫자 총 합이 8이므로 0번 쿠키 조각 ($A[1, 1]$) 을 먹는다. 나머지 세 조각은 크기가 $1 \times 1$ 이므로 이 조각은 여기서 더 자를 수 없다.</li>
		<li>우측 상단의 $[[3, 4], [4, 5]]$가 적힌 쿠키 조각의 숫자 총 합이 16이므로 0번 쿠키 조각 ($A[1, 3]$) 을 먹는다. 나머지 세 조각은 크기가 $1 \times 1$ 이므로 이 조각은 여기서 더 자를 수 없다.</li>
		<li>우측 하단의 $[[5, 6], [8, 7]]$가 적힌 쿠키 조각의 숫자 총 합이 26이므로 2번 쿠키 조각 ($A[4, 3]$) 을 먹는다. 나머지 세 조각은 크기가 $1 \times 1$ 이므로 이 조각은 여기서 더 자를 수 없다.</li>
	</ul>
	</li>
	<li>이 때 두 어린이가 먹지않고 남은 쿠키 조각에 적힌 숫자의 총합은 38이다.</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/31455.%E2%80%85%EC%BF%A0%ED%82%A4%E2%80%85%EC%9E%90%EB%A5%B4%EA%B8%B0/c8223646.png" data-original-src="https://upload.acmicpc.net/9f43258e-0c41-411d-9d6d-0b23b1545131/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 167px; width: 400px;" /></p>

<p>입력으로 $N = 2^K$, 그리고 쿠키에 적힌 숫자를 나타내는 2차원 배열 $A$가 주어졌을 때, 두 어린이가 먹고 남은 쿠키 조각에 적힌 숫자의 총합을 구해보자.</p>

### 입력

<p>입력의 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스의 첫 줄에는 $N$이 주어진다. 다음 $N$줄에 걸쳐 각 줄에 $A$ 배열의 $i$ 번째 행의 $N$개의 숫자가 공백없이 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 10$</li>
	<li>$2 \le N \le 1024$ 이며 이 때 $N$은 2의 거듭제곱수이다 (즉, $N = 2^K$ 인 정수 $K$가 존재한다)</li>
	<li>$1 \le i, j \le N$ 인 $i, j$에 대하여: $0 \le A[i, j] \le 9$</li>
</ul>