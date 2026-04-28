# [Platinum II] Hyperrectangle - 16846

[문제 링크](https://www.acmicpc.net/problem/16846)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 39, 맞힌 사람: 30, 정답 비율: 49.180%

### 분류

수학, 다이나믹 프로그래밍, 기하학, 조합론, 배낭 문제, 포함 배제의 원리, 4차원 이상의 기하학

### 문제 설명

<p>Snuke received a d-dimensional hyperrectangle of size l<sub>1</sub> &times; &middot; &middot; &middot; &times; l<sub>d</sub> as a birthday present. Snuke placed it such that its i-th coordinate becomes between 0 and l<sub>i</sub>, and ate the part of the hyperrectangle that satisfies x<sub>1</sub> + &middot; &middot; &middot; + x<sub>d</sub> &le; s. (Here x<sub>i</sub> denotes the i-th coordinate). Let V be the volume of the part eaten by Snuke. We can prove that d!V (V times the factorial of d) is always an integer. Compute d!V modulo 10<sup>9</sup> + 7.</p>

### 입력

<p>First line of the input file contains one integer d (2 &le; d &le; 300). Then d lines follow; i-th of these lines contain one integer l<sub>i</sub> (1 &le; l<sub>i</sub> &le; 300). Last line contains one integer s (0 &le; s &le; &Sigma;l<sub>i</sub>).</p>

### 출력

<p>Print d!V modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>Illustration to Sample 1:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16846.%E2%80%85Hyperrectangle/5e496f53.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16846.%E2%80%85Hyperrectangle/5e496f53.png" data-original-src="https://upload.acmicpc.net/05ede7f7-e2be-41a4-a9b7-902222afde11/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 221px; height: 129px;" /></p>