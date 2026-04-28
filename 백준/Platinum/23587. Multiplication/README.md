# [Platinum II] Multiplication - 23587

[문제 링크](https://www.acmicpc.net/problem/23587)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 11, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

수학, 정수론, 해 구성하기, 무작위화, 모듈로 곱셈 역원

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>Jury has chosen a secret odd number $x$ between $1$ and $2^{31}-1$ inclusive. Your task is to guess it. In order to do that, jury gives you an even number $n$. Then you should output <strong>exactly</strong> $n$ distinct integers between $0$ and $2^{31}-1$ inclusive. After that, jury will multiply each of these numbers by $x$ and take the results modulo $2^{31}$. Then jury will equiprobably choose some random subset of these new numbers of size $n/2$ and give this subset back to you in random order. After that, you should output the correct value of $x$.</p>

<p>In each test, $x$ is chosen in advance and does not change.</p>

### 입력



### 출력

