# [Platinum I] 고창영 비밀번호의 비밀 - 3807

[문제 링크](https://www.acmicpc.net/problem/3807)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 128 MB

### 통계

제출: 300, 정답: 72, 맞힌 사람: 56, 정답 비율: 41.481%

### 분류

수학, 정수론

### 문제 설명

<p>
	창영이는 비밀번호를 만드는 함수가 있다.</p>

<p>
	<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3807.%E2%80%85%EA%B3%A0%EC%B0%BD%EC%98%81%E2%80%85%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%EC%9D%98%E2%80%85%EB%B9%84%EB%B0%80/cfe48d2f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3807.%E2%80%85%EA%B3%A0%EC%B0%BD%EC%98%81%E2%80%85%EB%B9%84%EB%B0%80%EB%B2%88%ED%98%B8%EC%9D%98%E2%80%85%EB%B9%84%EB%B0%80/cfe48d2f.png" data-original-src="https://www.acmicpc.net/upload/images/daum_equation_1357760328214.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>
	이 함수의 뜻은 최소공배수가 n인 모든 쌍을 찾아, 그 합을 구하는 것이다.</p>

<p>
	예를 들어, 최소공배수가 6인 쌍은 5가지가 있다. (1, 6), (2, 6), (2, 3), (3, 6), (6, 6)</p>

<p>
	따라서 f(6)은 f(6) = (1+6) + (2+6) + (2+3) + (3+6) + (6+6) = 7+8+5+9+12 = 41 이 된다.</p>

<p>
	창영이의 온라인 저지 비밀번호를 만든 n이 주어졌을 때, 비밀번호를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>
	첫째 줄에 테스트 케이스의 개수 T가 주어진다. (T &le; 500)</p>

<p>
	각 테스트 케이스의 첫째 줄에는 C가 주어진다. (C &le; 15) C는 n의 소인수의 개수이다.</p>

<p>
	다음 C개 줄에는 소인수 P<sub>i</sub>와 그것의 개수 a<sub>i</sub>가 주어진다. (2 &le; P<sub>i</sub> &le; 1000, P<sub>i</sub>는 소수, 1 &le; a<sub>i</sub> &le; 50) 입력으로 주어지는 소수는 모두 서로 다르다.</p>

### 출력

<p>
	각 테스트 케이스에 대해서, 한 줄에 하나씩 f(n)값을 1000000007으로 나눈 나머지를 출력한다.</p>