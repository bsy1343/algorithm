# [Bronze I] ㄱ-트로미노 타일링 - 35454

[문제 링크](https://www.acmicpc.net/problem/35454)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 300, 정답: 195, 맞힌 사람: 169, 정답 비율: 67.331%

### 분류

수학, 조합론

### 문제 설명

<p>$2 \times N$ 크기의 직사각형을 ㄱ-트로미노 타일로 빈칸 없이 채우는 방법의 수를 구하는 프로그램을 작성하시오.</p>

<p>ㄱ-트로미노 타일은 $1 \times 1$ 블록 $3$개를 ㄱ 모양으로 이어서 붙인 도형이고 회전하여 사용할 수 있다. <a href="/problem/33675">L-트로미노 타일링</a>이랑 같은 것 같다고? 기분 탓이다. ㄱ-</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/35454.%E2%80%85%E3%84%B1-%ED%8A%B8%EB%A1%9C%EB%AF%B8%EB%85%B8%E2%80%85%ED%83%80%EC%9D%BC%EB%A7%81/17d2ee56.png" data-original-src="https://boja.mercury.kr/assets/problem/35454-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin: 0px auto; max-width: 100%; width: 300px; height: 96px;"></p>

<p style="text-align: center;">위 그림은 $2 \times 6$ 크기의 직사각형을 채운 한 가지 방법의 예이다.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다. $(1 \le T \le 100)$</p>

<p>테스트 케이스의 첫 번째 줄에 양의 정수 $N$이 주어진다. $(1 \le N \le 100)$</p>

### 출력

<p>테스트 케이스의 첫 번째 줄에 타일을 채우는 방법의 수를 출력한다.</p>

### 힌트

<p>방법의 수가 <code>int</code> 자료형의 범위를 초과할 수 있으므로 <code>long long</code> 자료형 등을 사용하는 것을 권장한다.</p>