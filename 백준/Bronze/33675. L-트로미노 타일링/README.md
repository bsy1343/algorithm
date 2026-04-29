# [Bronze I] L-트로미노 타일링 - 33675

[문제 링크](https://www.acmicpc.net/problem/33675)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 745, 정답: 397, 맞힌 사람: 368, 정답 비율: 58.044%

### 분류

수학, 조합론, 홀짝성

### 문제 설명

<p>$3 \times N$ 크기의 직사각형을 L-트로미노 타일로 빈칸 없이 채우는 방법의 수를 구하는 프로그램을 작성하자.</p>

<p>L-트로미노 타일은 $1 \times 1$ 블록 $3$개를 L 모양으로 이어서 붙인 도형이고 회전하여 사용할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/33675.%E2%80%85L-%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8%E2%80%85%ED%83%80%EC%9D%BC%EB%A7%81/b5f26158.png" data-original-src="https://boja.mercury.kr/assets/problem/33675-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 286px; width: 400px;"></p>

<p style="text-align: center;">위 그림은 $3 \times 4$ 크기의 직사각형을 채운 한 가지 방법이다.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다.</p>

<p>두 번째 줄부터 각 테스트 케이스마다 하나의 줄에 양의 정수 $N$이 주어진다.</p>

### 출력

<p>각 테스트 케이스마다 $3 \times N$ 크기의 직사각형을 채우는 경우의 수를 한 줄에 하나씩 순서대로 출력한다.</p>

### 제한

<ul>
	<li>$1 \le T \le 100$</li>
	<li>$1 \le N \le 100$</li>
</ul>

### 힌트

<p>방법의 수가 <code>int</code> 자료형의 범위를 초과할 수 있으므로 <code>long long</code> 자료형 등을 사용하는 것을 권장한다.</p>