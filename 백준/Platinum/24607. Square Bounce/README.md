# [Platinum V] Square Bounce - 24607

[문제 링크](https://www.acmicpc.net/problem/24607)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 15, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

수학, 구현, 기하학, 정수론, 시뮬레이션, 많은 조건 분기, 유클리드 호제법

### 문제 설명

<p>Given a square in the plane with corners at $(-1,-1)$, $(-1,1)$, $(1,1)$ and $(1,-1)$, we fire a ray from point $(-1,0)$ into the interior of the square on a path with a given slope. The ray bounces off of the sides of the square with an angle of reflection which is the same as the angle of incidence to the side at the point of intersection.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24607.%E2%80%85Square%E2%80%85Bounce/7de40044.png" data-original-src="https://upload.acmicpc.net/c174e305-7ab6-48ac-a73e-8ee06cd3fb7c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 77px;" /></p>

<p>After a number of bounces, the ray intersects one of the square&#39;s sides again at some point which has rational coordinates. Find those rational coordinates in reduced form.</p>

### 입력

<p>The single line of input contains three integers $a$, $b$ and $n$ ($1 \le a,b,n \le 10^6$, $\gcd(a,b)=1$), where the slope of the ray&#39;s initial path is $a/b$, and there are $n$ bounces. Note that $a$ and $b$ are relatively prime. The slope will be chosen so that the ray never bounces at a corner of the square.</p>

### 출력

<p>Output a single line with four space-separated integers $p$, $q$, $s$ and $t$, where $(p/q, s/t)$ is the final point where the ray hits a side of the square, $p/q$ and $s/t$ are in reduced form, and the denominators ($q$ and $t$) are positive. If one of the coordinates has value $0$, output it as <code>0 1</code>.</p>

### 힌트

<p>The following is a picture of the first sample:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24607.%E2%80%85Square%E2%80%85Bounce/8fe57ef0.png" data-original-src="https://upload.acmicpc.net/c186800b-043c-4faa-903a-f78c8e65aa9a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 447px;" /></p>