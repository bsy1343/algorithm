# [Silver II] Gears and Axles - 32502

[문제 링크](https://www.acmicpc.net/problem/32502)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 36, 맞힌 사람: 35, 정답 비율: 92.105%

### 분류

수학, 정렬

### 문제 설명

<p>You have an assortment of circular gears with varying numbers and sizes of teeth. You also have a motor that spins at one revolution per second, as well as an unlimited number of (identical, arbitrarily long) axles. The motor and all gears fit the axles, and everything attached to a particular axle rotates at the same angular speed. Two gears with the same size teeth can be enmeshed with each other. Gears with different size teeth cannot be enmeshed with each other (though they can be placed on the same axle).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/32502.%E2%80%85Gears%E2%80%85and%E2%80%85Axles/e82faf87.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32502-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>You can arrange the gears and axles in any order. What is the maximum rate at which the last gear/axle in sequence spins that you can achieve? Because this may be large, output the <em>natural log</em> of the value.</p>

### 입력

<p>The first line of input contains a single integer $n$ ($0≤n≤10^5$) denoting the number of gears.</p>

<p>Each of the next $n$ lines contains two integers $s$ ($1≤s≤10^5$) and $c$ ($3≤c≤10^5$), one for each gear in your collection, where $s$ is the size of the teeth of the gear and $c$ is the count of the number of teeth.</p>

### 출력

<p>Output a single line with a single number equal to the <em>natural log</em> of the maximum angular speed you can achieve with your motor and axles and gears in your collection. This output will be considered correct if it is within an absolute or relative error of $10^{-6}$ .</p>